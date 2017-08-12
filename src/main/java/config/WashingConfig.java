package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import washing.*;

@Configuration
@Lazy
public class WashingConfig {
    @Bean
    @DependsOn("washLister")
    public Washing wash() {
        return new Washing();
    }

    @Bean
    public Bath bath(){
        return new Bath();
    }

    @Bean
    public Nails nails(){
        return new Nails();
    }

    @Bean
    public Shower shower(){
        return new Shower();
    }

    @Bean
    public Teeth teeth(){
        return new Teeth();
    }

    @Bean(initMethod = "showWashList")
    public WashLister washLister(){
        return new WashLister();
    }
}
