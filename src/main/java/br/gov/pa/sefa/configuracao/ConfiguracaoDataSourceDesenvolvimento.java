package br.gov.pa.sefa.configuracao;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class ConfiguracaoDataSourceDesenvolvimento {
	
	final Logger logger = LoggerFactory.getLogger(ConfiguracaoDataSourceDesenvolvimento.class);
     
    @Bean
    @Profile("desenvolvimento")
    public DataSource dataSource(Environment environment) {
    	logger.info("Criando datasource para o ambiente: {} ", environment.toString());
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(PropriedadesCore.obterPropriedade("jdbc.driverClassName"));
        dataSource.setUrl(PropriedadesCore.obterPropriedade("jdbc.url"));
        dataSource.setUsername(PropriedadesCore.obterPropriedade("jdbc.username"));
        dataSource.setPassword(PropriedadesCore.obterPropriedade("jdbc.password"));
        return dataSource;
    }
    
}