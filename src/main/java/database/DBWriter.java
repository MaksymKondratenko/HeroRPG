package database;

import hero.Action;

import java.sql.*;

public class DBWriter {

    public void write(Action action){

        Connection conn = null;
        PreparedStatement state = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/HeroDB?useSSL=false&serverTimezone=UTC";
        String user = "student";
        String password = "student";

        String act = action.toString();

        try {
            conn = DriverManager.getConnection(dbUrl, user, password);
            state = conn.prepareStatement("insert into actions (act) value (?)");
            state.setString(1, act);
            state.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
                if (state != null)
                    state.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
