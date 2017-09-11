package com.mk.herorpg.utils;

import com.mk.herorpg.hero.Hero;
import org.junit.Test;

public class JsonConverterTest {

    @Test
    public void testToJSON() throws Exception {
        Hero hero = new Hero();
        JsonConverter.toJSON(hero);
    }

    @Test
    public void testToPOJO() throws Exception {
        Hero hero = JsonConverter.toPOJO();
        System.out.println(hero);
    }
}