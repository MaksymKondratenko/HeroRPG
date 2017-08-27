package com.mk.herorpg.DAO;

import com.mk.herorpg.config.DatabaseConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DatabaseConfig.class})
public class DBInitializerTest {
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @Autowired
    @Qualifier("mysqlDAO")
    private MysqlActionDAO dao;

    private List<String> dbContent;

    @Autowired
    @Qualifier("dbInitializer")
    private DBInitializer initializer;

    @Before
    public void setUp() {
        //database content is saved before initializing our database
        dao.setDataSource(dataSource);
        dbContent = dao.readFromDB();

        initializer.setDataSource(dataSource);
    }

    @After
    public void tearDown() {
        //inserting the content of our database back into it
        for(String record : dbContent) {
            dao.getJdbcTemplate().update("insert into Actions (Act) value (?)", record);
        }
    }

    //new table was initialized, so it has no records, hence list of records has the size of 0
    @Test
    public void initTest() {

        initializer.init();
        List<String> ls = dao.readFromDB();
        assertEquals(0, ls.size());
    }

}