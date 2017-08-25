package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInitializer {

    private DataSource dataSource;
    Connection conn = null;
    Statement state = null;

    @Autowired
    @Qualifier("dataSource")
    public void setDataSource(DataSource dataSource){this.dataSource = dataSource;}

    public void init() {
        String sql = "CREATE TABLE `actions` (\n" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `act` varchar(64) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1";
        try {
            conn = dataSource.getConnection();
            state = conn.createStatement();
            state.execute("create database if not exists HeroDB");
            state.execute("use HeroDB");
            state.execute("drop table if exists actions");
            state.execute(sql);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(state != null)
                    state.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
