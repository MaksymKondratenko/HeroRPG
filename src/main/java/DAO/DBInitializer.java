package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DBInitializer {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("dataSource")
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void init() {
        String sql = "CREATE TABLE `actions` (\n" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `act` varchar(64) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1";
        jdbcTemplate.execute("create database if not exists HeroDB");
        jdbcTemplate.execute("use HeroDB");
        jdbcTemplate.execute("drop table if exists actions");
        jdbcTemplate.execute(sql);
    }
}
