package com.mk.herorpg.DAO;

import com.mk.herorpg.hero.Action;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MysqlActionDAO implements ActionDAO {
    @Getter
    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("dataSource")
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void writeToDB(Action action) {
        String arg = action.toString();
        this.jdbcTemplate.update("insert into Actions (Act) value (?)", arg);
    }

    @Override
    public List<String> readFromDB() {
        return this.jdbcTemplate.query("select * from actions", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                String str = resultSet.getString("act");
                return str;
            }
        });
    }
}
