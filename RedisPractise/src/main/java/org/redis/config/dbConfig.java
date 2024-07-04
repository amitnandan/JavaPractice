package org.redis.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(basePackages = {"org.redis.repository"},
        entityManagerFactoryRef = "dbEntityManagerFactory",
        transactionManagerRef = "dbTransactionManager")
public class dbConfig {


    @Bean(name = "dbDataSource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().url("jdbc:mysql://localhost:3306/db2").username("root").password("Amit3819$").driverClassName("com.mysql.cj.jdbc.Driver").build();
    }

    @Bean(name = "dbEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Qualifier("dbDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("org.redis.model");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setPersistenceUnitName("dbPersistenceUnit");
        em.setJpaProperties(hibernateProperties());
        return em;
    }

    @Bean(name = "dbTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("dbEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        //properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect"); // Adjust dialect as per your MySQL version
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.show_sql", "true");
        // Add any other Hibernate properties you need
        return properties;
    }
}

