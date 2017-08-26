package com.mk.herorpg.utils;

import com.mk.herorpg.config.AnnotationConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AnnotationConfig.class})
public class TimeTest {
    private int d, h, m, date;
    @Autowired
            @Qualifier("time")
    private Time time;

    @Before
    public void setUp() throws Exception {
        time.setDate(1201);
    }

    @After
    public void tearDown() {
        time.setDate(0);
    }

    @Test
    public void addTimeTest() {
        assertEquals(1205, time.addTime(4));
    }

    @Test
    public void getMTest() {
        assertEquals(1, time.getM());
    }

    @Test
    public void getHTest() {
        assertEquals(20, time.getH());
    }

    @Test
    public void getDTest() {
        time.setDate(1440);
        assertEquals(1, time.getD());
    }

}