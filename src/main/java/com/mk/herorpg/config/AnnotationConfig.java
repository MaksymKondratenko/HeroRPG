package com.mk.herorpg.config;

import com.mk.herorpg.hero.Adventure;
import com.mk.herorpg.hero.Hero;
import com.mk.herorpg.hero.Level;
import com.mk.herorpg.logic.ActionProcessor;
import org.springframework.context.annotation.*;
import com.mk.herorpg.utils.Exit;
import com.mk.herorpg.utils.Help;
import com.mk.herorpg.utils.Printer;
import com.mk.herorpg.utils.Time;

@Configuration
@EnableAspectJAutoProxy
@Lazy
@Import({ActivitiesConfig.class, BookConfig.class, EnjoymentConfig.class, FoodConfig.class, TrainConfig.class, WashingConfig.class, DatabaseConfig.class})
//@ImportResource("classpath:com/mk/herorpg/config/context.xml")
public class AnnotationConfig {

    @Bean
    @DependsOn("level")
    public Hero hero(){
        return new Hero();
    }

    @Bean(initMethod = "start")
    @DependsOn("hero")
    public Adventure adventure() {
        return new Adventure();
    }

    @Bean
    public Level level(){
        return new Level();
    }

    @Bean
    public Printer printer(){
        return new Printer();
    }

    @Bean
    public Time time(){
        return new Time();
    }

    @Bean(initMethod = "showInfo")
    @Scope("prototype")
    public Help help() {
        return new Help();
    }

    @Bean
    public Exit end() {
        return new Exit();
    }

    @Bean
    public ActionProcessor actionProcessor() {
        return new ActionProcessor();
    }

}
