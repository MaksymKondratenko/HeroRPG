package config;

import aspect.Aspector;
import database.DBReader;
import database.MysqlDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

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

   /* @Bean
    public DataSource dataSource(){
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("");
    }*/

}