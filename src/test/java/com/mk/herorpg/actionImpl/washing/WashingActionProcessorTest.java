package com.mk.herorpg.actionImpl.washing;

import com.mk.herorpg.config.AnnotationConfig;
import com.mk.herorpg.hero.Action;
import com.mk.herorpg.hero.Hero;
import com.mk.herorpg.logic.ActionProcessor;
import com.mk.herorpg.utils.Time;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AnnotationConfig.class})
public class WashingActionProcessorTest {
    @Autowired
    @Qualifier("hero")
    private Hero hero;

    @Autowired
    @Qualifier("bath")
    private Action action;

    @Autowired
    @Qualifier("time")
    private Time time;

    @Autowired
    @Qualifier("actionProcessor")
    private ActionProcessor processor;

    @After
    public void tearDown() throws Exception {
        hero.setAppeal(0);
        time.setDate(0);
    }

    @Test
    public void appealProcessing() {
        int init = hero.getAppeal();
        processor.process(action, hero);
        assertEquals(3, hero.getAppeal() - init);
    }

    @Test
    public void timeProcessing() {
        assertNotNull("Oups!", time.getDate());
    }

}