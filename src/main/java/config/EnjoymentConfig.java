package config;

import enjoyment.*;
import org.springframework.context.annotation.*;

@Configuration
@Lazy
public class EnjoymentConfig {
    @Bean
    @Scope("prototype")
    public EnjoymentLister enjoymentLister() {
        return new EnjoymentLister();

    }

    @Bean
    @DependsOn("enjoymentLister")
    @Scope("prototype")
    public Enjoyment enjoy() {
        return new Enjoyment();
    }

    @Bean
    public Cinema cinema() {
        return new Cinema();
    }

    @Bean
    public Dance dance() {
        return new Dance();
    }

    @Bean
    public Skate skate() {
        return new Skate();
    }

    @Bean
    public Theater theater(){
        return new Theater();
    }

    @Bean
    public TV tv(){
        return new TV();
    }
}
