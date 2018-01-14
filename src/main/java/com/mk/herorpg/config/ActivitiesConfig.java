package com.mk.herorpg.config;

import com.mk.herorpg.actionimpl.activities.Date;
import com.mk.herorpg.actionimpl.activities.Dream;
import com.mk.herorpg.actionimpl.activities.Study;
import com.mk.herorpg.actionimpl.activities.Work;
import com.mk.herorpg.hero.Girl;
import org.springframework.context.annotation.*;

@Configuration
@Lazy
public class ActivitiesConfig {
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
