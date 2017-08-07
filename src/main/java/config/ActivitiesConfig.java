package config;

import activities.Dream;
import activities.Study;
import activities.Work;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class ActivitiesConfig {
    @Bean
    public Dream sleep(){
        return new Dream();
    }

    @Bean
    public Work work(){
        return new Work();
    }

    @Bean
    public Study study(){
        return new Study();
    }
}
