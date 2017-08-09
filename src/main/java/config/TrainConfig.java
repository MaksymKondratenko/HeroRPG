package config;

import body.*;
import org.springframework.context.annotation.*;

@Configuration
@Lazy
public class TrainConfig {
    @Bean(initMethod = "showTrainList")
    @Scope("prototype")
    public TrainLister trainLister(){
        return new TrainLister();
    }

    @Bean
    @DependsOn("trainLister")
    @Scope("prototype")
    public Body body(){
        return new Body();
    }

    @Bean
    public Bicep bicep(){
        return new Bicep();
    }

    @Bean
    public Back back(){
        return new Back();
    }

    @Bean
    public Legs legs(){
        return new Legs();
    }

    @Bean
    public Neck neck(){
        return new Neck();
    }

    @Bean
    public Press press(){
        return new Press();
    }
}
