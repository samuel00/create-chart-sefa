package br.gov.pa.sefa.configuracao;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class InicializadorDaAplicacao implements WebApplicationInitializer {

    final Logger logger = LoggerFactory.getLogger(InicializadorDaAplicacao.class);

    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(ConfiguracaoDaAplicacao.class);
        rootContext.register(ConfiguracaoDataSourceDesenvolvimento.class);
        rootContext.register(ConfiguracaoDataSource.class);

        servletContext.addListener(new ContextLoaderListener(rootContext));
        servletContext.addListener(RequestContextListener.class);

        servletContext.setInitParameter(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "desenvolvimento");
        String profileAtivo = PropriedadesCore.obterPropriedade("configuracao.ambiente");
        logger.info("Definindo profile ativo: {}", profileAtivo);
        servletContext.setInitParameter(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, profileAtivo);

        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();

        ServletRegistration.Dynamic dispatcher =
                servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

}
