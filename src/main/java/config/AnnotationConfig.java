package config;

import adventure.Adventure;
import hero.Hero;
import hero.Level;
import logic.ActionProcessor;
import org.springframework.context.annotation.*;
import utils.Exit;
import utils.Help;
import utils.Printer;
import utils.Time;

@Configuration
@EnableAspectJAutoProxy
@Lazy
@Import({ActivitiesConfig.class, BookConfig.class, EnjoymentConfig.class, FoodConfig.class, TrainConfig.class, WashingConfig.class, DatabaseConfig.class})
@ImportResource("classpath:config/context.xml")
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
