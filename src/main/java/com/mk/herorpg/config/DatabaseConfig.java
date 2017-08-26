package com.mk.herorpg.config;

import com.mk.herorpg.DAO.DBInitializer;
import com.mk.herorpg.aspect.Aspector;
import com.mk.herorpg.DAO.DBReader;
import com.mk.herorpg.DAO.MysqlDAO;
import com.mk.herorpg.DAO.PropertyAgent;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@Lazy
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
    public MysqlDAO mysqlDAO() {return new MysqlDAO();}

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
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    PropertyAgent pa = propertyAgent();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl(pa.getFullUrl());
    dataSource.setUsername(pa.getUser());
    dataSource.setPassword(pa.getPassword());
    return dataSource;
    }

}