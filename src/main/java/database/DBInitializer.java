package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInitializer {

    Connection conn = null;
    Statement state = null;
    PropertyAgent pa = new PropertyAgent();
    String sql = null;

    public void init(){
        pa.getProperties();

        try {
            conn = DriverManager.getConnection("" + pa.getDbUrl() + pa.getConnectionArgs(), pa.getUser(), pa.getPassword());
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
