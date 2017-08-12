package config;

import activities.Date;
import activities.Dream;
import activities.Study;
import activities.Work;
import hero.Girl;
import org.springframework.context.annotation.*;

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

    @Bean(initMethod = "date")
    @Scope("prototype")
    @DependsOn("girl")
    public Date date(){
        return new Date(girl());
    }

    @Bean
    @Scope("prototype")
    public Girl girl() {
        return new Girl();
    }
}
