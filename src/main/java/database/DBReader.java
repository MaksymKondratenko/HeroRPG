package database;

import hero.Action;

import java.sql.*;

public class DBReader extends Action {

    Connection conn = null;
    Statement state = null;
    ResultSet rs = null;
    PropertyAgent pa = new PropertyAgent();

    public void read(){
        pa.getProperties();;

        try {
            conn = DriverManager.getConnection("" + pa.getDbUrl() + pa.getDbName() + pa.getConnectionArgs(), pa.getUser(), pa.getPassword());
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
