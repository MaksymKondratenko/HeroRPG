import hero.Hero;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnnotationConfig {

    @Bean
    @Scope("prototype")
    public Hero hero(){
        return new Hero();
    }
}
