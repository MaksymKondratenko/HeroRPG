package com.mk.herorpg.XmlBinding;

import com.mk.herorpg.hero.Hero;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class JaxbParserImplTest {

    private JaxbParser parser;
    private File file;

    @Before
    public void setUp() throws Exception {
        parser = new JaxbParserImpl();
        file = new File("src\\main\\resources\\com\\mk\\herorpg\\XmlBinding\\hero.xml");
    }

    @Test
    public void testGetObject() throws Exception {
        Hero hero = (Hero) parser.getObject(file, Hero.class);
        System.out.println(hero);
    }

    @Test
    public void testSaveObject() throws Exception {
        Hero hero = new Hero();
        hero.setName("Sir Lance");
        hero.setAppeal(3);
        hero.setFitness(0.5f);
        hero.setMoney(20);
        hero.setExcitement(120);
        hero.setHunger(80);
        hero.setXp(25);
        hero.setRest(90);
        hero.setStudyingProcess(0.7f);
        parser.saveObject(file, hero);
    }

}