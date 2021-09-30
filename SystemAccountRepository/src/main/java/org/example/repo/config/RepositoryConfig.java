//package org.example.repo.config;
//
//import com.zaxxer.hikari.util.DriverDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.Properties;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories("org.example.repo.persistence")
//@EntityScan("org.example.domain.persistence")
//@PropertySource(value = "classpath:application-db.properties")
//public class RepositoryConfig {
//
////    private static final String[] ENTITY_PACKAGES_TO_SCAN = {"org.example.domain.persistence"};
////    private static final String PERSISTENCE_UNIT_NAME = "system.account.persistence";
////
////    @Value("${spring.datasource.url}")
////    private String datasourceurl;
////
////    @Value("${spring.datasource.username}")
////    private String username;
////
////    @Value("${spring.datasource.password}")
////    private String password;
////
////    @Bean
////    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
////        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
////        entityManagerFactoryBean.setDataSource(dataSource());
////        entityManagerFactoryBean.setPackagesToScan(ENTITY_PACKAGES_TO_SCAN);
////        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
////        entityManagerFactoryBean.setJpaProperties(buildJpaProperties());
////        entityManagerFactoryBean.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);
////
////        return entityManagerFactoryBean;
////    }
////
////    @Bean
////    public PlatformTransactionManager transactionManager(){
////        JpaTransactionManager transactionManager =new JpaTransactionManager();
////        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
////
////        return transactionManager;
////    }
////
////    @Bean
////    public JdbcTemplate getJdbcTemplate(){
////        return JdbcTemplate(dataSource());
////    }
////
////    @Bean
////    public DataSource dataSource(){
////        DriverManagerDataSource dataSource = new DriverManagerDataSource();
////        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
////
////        try{
////                OracleDataSource dataSource = new OracleDataSource();
////                dataSource.setUser(username);
////                dataSource.setPassword(password);
////                dataSource.setURL(datasourceurl);
////                dataSource.setImplicitCachingEnabled(true);
////                dataSource.setFastConnectionFailoverEnabled(true);
////                return dataSource;
////
////        }catch (SQLException e){
////            //TODO:Log out that Repository Configured
////            throw new RuntimeException("Unable to connect to the DB", e);
////
////        }
////    }
////
////    private Properties buildJpaProperties() {
////        Properties properties = new Properties();
////        properties.setProperty("javax.persistence.transationType", "jta");
////        properties.setProperty("hibernate.IntegerCode.use_reflection_optimizer", "true");
////        properties.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JTATransactionFactory");
////        properties.setProperty("hibernate.query.factory_class", "org.hibernate.hql.internal.classic.ClassicQueryTranslatorFactory");
////        properties.setProperty("hibernate.transaction.jta.platform", "org.hibernate.service.jta.platform.internal.SunOneJtaPlatform");
////        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle1OgDialect");
////        properties.setProperty("hibernate.generate_statistics", "false");
////        properties.setProperty("hibernate.use_sql_comments", "false");
////        properties.setProperty("hibernate.show_sql", "true");
////        properties.setProperty("hibernate.format_sql", "true");
////        properties.setProperty("hibernate.jdbc.batch_size", "500");
////        properties.setProperty("hibernate.order_inserts", "true");
////        properties.setProperty("hibernate.order_updates", "true");
////        properties.setProperty("hibernate.batch_versioned_data", "true");
////
////        return properties;
////    }
//}
