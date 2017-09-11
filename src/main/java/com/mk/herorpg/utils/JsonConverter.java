package com.mk.herorpg.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mk.herorpg.hero.Hero;
import lombok.Getter;

import java.io.File;
import java.io.IOException;

@Getter
public class JsonConverter {
    private final static String destFile = "src\\main\\resources\\com\\mk\\herorpg\\utils\\hero.json";

    public static void toJSON(Hero hero) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(destFile), hero);
    }

    public static Hero toPOJO() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(destFile), Hero.class);
    }
}
