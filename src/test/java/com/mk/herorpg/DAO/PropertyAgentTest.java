package com.mk.herorpg.DAO;

import com.mk.herorpg.config.DatabaseConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DatabaseConfig.class})
public class PropertyAgentTest {
    @Autowired
    @Qualifier("propertyAgent")
    private PropertyAgent pa;

    @Before
    public void setUp() {
        pa.getProperties();
    }

    @Test
    public void getFullUrlTest() {
        assertNotNull("No Url.", pa.getFullUrl());
    }

    @Test
    public void getUserTest() {
        assertNotNull("No user.", pa.getUser());
    }

    @Test
    public void getPasswordTest() {
        assertNotNull("No password.", pa.getPassword());
    }

}