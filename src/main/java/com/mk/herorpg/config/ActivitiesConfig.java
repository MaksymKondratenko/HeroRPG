package com.mk.herorpg.config;

import com.mk.herorpg.actionImpl.activities.Date;
import com.mk.herorpg.actionImpl.activities.Dream;
import com.mk.herorpg.actionImpl.activities.Study;
import com.mk.herorpg.actionImpl.activities.Work;
import com.mk.herorpg.hero.Girl;
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
