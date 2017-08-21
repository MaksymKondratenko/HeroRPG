package database;

import hero.Action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBWriter {

    Connection conn = null;
    PreparedStatement state = null;
    PropertyAgent pa = new PropertyAgent();

    public void write(Action action){
        String act = action.toString();
        pa.getProperties();

        try {
            conn = DriverManager.getConnection("" + pa.getDbUrl() + pa.getDbName() + pa.getConnectionArgs(), pa.getUser(), pa.getPassword());
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
