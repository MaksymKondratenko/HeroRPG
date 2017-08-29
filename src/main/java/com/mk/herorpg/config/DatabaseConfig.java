package com.mk.herorpg.config;

import com.mk.herorpg.DAO.*;
import com.mk.herorpg.aspect.Aspector;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.*;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;
import java.util.logging.Level;

@Configuration
@ImportResource("com/mk/herorpg/DAO/PersistentAction.hbm.xml")
public class DatabaseConfig {

@Bean(initMethod = "read")
@Scope("prototype")
public DBReader actions() {
    return new DBReader();
}

@Bean
@Scope("prototype")
public Aspector aspector(){
    return new Aspector();
    }

    @Bean
    public MysqlActionDAO mysqlDAO() {return new MysqlActionDAO();}

    @Bean(initMethod = "getProperties")
    @Scope
    public PropertyAgent propertyAgent() {
    return new PropertyAgent();
    }

    @Bean
    @Lazy(false)
    @DependsOn("dataSource")
    public  DBInitializer dbInitializer() {
    return new DBInitializer();
    }

   @Bean
   @Lazy(false)
   @DependsOn("propertyAgent")
    public DataSource dataSource(){
    BasicDataSource dataSource = new BasicDataSource();
    PropertyAgent pa = propertyAgent();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl(pa.getFullUrl());
    dataSource.setUsername(pa.getUser());
    dataSource.setPassword(pa.getPassword());
    return dataSource;
    }

    @Bean
    public PersistentAction persistentAction() {
        return new PersistentAction();
    }

    @Bean
    @Scope
    public SessionFactory sessionFactory(){
        Properties props = new Properties();
        props.setProperty("hibernate.dialect","org.hibernate.dialect.HSQLDialect");
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        //sessionFactoryBean.setMappingResources("com" + System.lineSeparator() + "mk" + System.lineSeparator() + "herorpg" + System.lineSeparator() + "DAO" + System.lineSeparator() + "PersistentAction.hbm.xml");
        sessionFactoryBean.setHibernateProperties(props);
        return sessionFactoryBean.getObject();
    }


    @Bean(initMethod = "initConnection")
    @Lazy(false)
    @Scope
    public HibernateConnector hibernateConnector() {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        HibernateConnector connector = new HibernateConnector();
        connector.setSessionFactory(sessionFactory());
        return new HibernateConnector();
    }
}