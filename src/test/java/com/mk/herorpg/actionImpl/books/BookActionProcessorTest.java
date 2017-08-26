package com.mk.herorpg.actionImpl.books;

import com.mk.herorpg.config.AnnotationConfig;
import com.mk.herorpg.hero.Action;
import com.mk.herorpg.hero.Hero;
import com.mk.herorpg.logic.ActionProcessor;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.mk.herorpg.utils.Time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AnnotationConfig.class})
public class BookActionProcessorTest {
    @Autowired
    @Qualifier("programming")
    private Action action;

    @Autowired
    @Qualifier("hero")
    private Hero hero;

    @Autowired
    @Qualifier("actionProcessor")
    private ActionProcessor processor;

    @Autowired
    @Qualifier("time")
    private Time time;

    @After
    public void tearDown() {
        hero.setRest(0);
        hero.setHunger(0);
        hero.setExcitement(0);
        hero.setXp(0);
        time.setTime(0);
    }

    @Test
    public void xpProcessing() {
        int init = hero.getXp();
        processor.process(action, hero);
        assertEquals(2, hero.getXp() - init);
    }

    @Test
    public void hungerProcessing() {
        int init = hero.getHunger();
        processor.process(action, hero);
        assertEquals(-2, hero.getHunger() - init);
    }

    @Test
    public void excitementProcessing() {
        int init = hero.getExcitement();
        processor.process(action, hero);
        assertEquals(-2, hero.getExcitement() - init);
    }

    @Test
    public void restProcessing() {
        int init = hero.getRest();
        processor.process(action, hero);
        assertEquals(-3, hero.getRest() - init);
    }

    @Test
    public void timeProcessing() {
        assertNotNull("Oups!", time.getDate());
    }
}