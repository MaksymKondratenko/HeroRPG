package database;

import hero.Action;

import java.sql.*;

public class DBReader extends Action {

    public void read(){

        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/HeroDB?useSSL=false&serverTimezone=UTC";
        String user = "student";
        String password = "student";

        try {
            conn = DriverManager.getConnection(dbUrl, user, password);
            state = conn.createStatement();
            rs = state.executeQuery("select * from actions");
            System.out.println("#    Actions");
            while (rs.next())
                System.out.println(rs.getInt("id") + ":  " + rs.getString("act"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(state != null)
                    state.close();
                if(rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString(){
        return "Database reader";
    }
}
