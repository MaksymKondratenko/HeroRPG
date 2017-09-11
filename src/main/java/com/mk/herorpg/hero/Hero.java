package com.mk.herorpg.hero;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Maksym on 14.02.2017.
 */

@Getter @Setter //lombok framework annotations
@XmlRootElement
@XmlType(propOrder = {"name", "xp", "level", "hunger", "rest", "excitement",
        "money", "appeal", "fitness", "studyingProcess"})
public class Hero {

    @JsonProperty("Hero's name")
    @Value("Sir Lancelot")
    private String name;

    @JsonProperty("Experience")
    @Value("0")
    private int xp;

    @JsonProperty("Hunger")
    @Value("100")
    private int hunger;

    @JsonProperty("Rest")
    @Value("100")
    private int rest;

    @JsonProperty("Excitement")
    @Value("100")
    private int excitement;

    @JsonProperty("Appeal")
    @Value("0")
    private int appeal;

    @JsonProperty("Money")
    @Value("10")
    private int money;

    @JsonProperty("Studying Process")
    @Value("0.0f")
    private float studyingProcess;

    @JsonProperty("Fitness")
    @Value("0.0f")
    private float fitness;

    @JsonIgnore
    private Level level = new Level();

    public String toString(){
        return "Hero { xp : " + xp + "; hunger : " + hunger + "; rest : " + rest + "; excitement : " + excitement +
                "; appeal : " + appeal + "; money : " + money + "; studyingProcess : " + studyingProcess +
                "; fitness : " + fitness + ";";
    }
}