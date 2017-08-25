package database;

import hero.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlDAO implements ActionDAO {

    private DataSource dataSource;
    Connection con = null;
    PreparedStatement ps = null;


    @Autowired
    @Qualifier("dataSource")
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public void writeToDB(Action action) {
        String sql = "insert into Actions (Act) value (?)";
        String arg = action.toString();
        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, arg);
            int out = ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<String> readFromDB() {
        String sql = "select * from actions";
        Statement state = null;
        ResultSet rs = null;
        List<String> ls = new ArrayList<>();
        try {
            con = dataSource.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next())
                ls.add(rs.getString("act"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
                if (state != null)
                    state.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            return ls;
    }

}
