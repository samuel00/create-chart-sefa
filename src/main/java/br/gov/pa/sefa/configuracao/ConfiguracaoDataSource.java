package br.gov.pa.sefa.configuracao;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Classe de configuracao da camada de persistencia. Algumas propriedades vem do
 * arquivo de configuracao: core.properties.
 * 
 * Atencao para o profile do Spring utilizado para criar o DataSource, nos casos
 * de homologacao e producao, o dataSource vira do servidor de aplicacao.
 */
@Configuration
@EnableTransactionManagement
public class ConfiguracaoDataSource {
	
	final Logger logger = LoggerFactory.getLogger(ConfiguracaoDataSource.class);
 
    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan(new String[] { "br.gov.pa.sefa" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
     }
     
    @Bean
	@Profile({ "homologacao", "producao" })
    public DataSource dataSource(Environment environment) {
        JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
		dataSourceLookup.setResourceRef(true);
		String nomeDataSource = PropriedadesCore.obterPropriedade("configuracao.persistence.dataSource");
		logger.info("Obtendo do datasource: {} no ambiente:", nomeDataSource, environment.getActiveProfiles());
		return dataSourceLookup.getDataSource(nomeDataSource);
    }
     
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", PropriedadesCore.obterPropriedade("hibernate.dialect"));
        properties.put("hibernate.show_sql", PropriedadesCore.obterPropriedade("hibernate.show_sql"));
        properties.put("hibernate.format_sql", PropriedadesCore.obterPropriedade("hibernate.format_sql"));
        return properties;        
    }
     
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
	
}