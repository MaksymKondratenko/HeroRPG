package database;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInitializer {
    public void init(){
        Connection conn = null;
        Statement state = null;

        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        String sql = null;


        String dbString = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC";
        String user = "student";
        String pass = "student";

        try {
            conn = DriverManager.getConnection(dbString, user, pass);
            //sql = sb.toString();
            sql = "CREATE TABLE `actions` (\n" +
                    "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `act` varchar(64) DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`id`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1";
            state = conn.createStatement();
            state.execute("create database if not exists HeroDB");
            state.execute("use HeroDB");
            state.execute("drop table if exists actions");
            state.execute(sql);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
