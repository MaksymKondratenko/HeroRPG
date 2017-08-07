package config;

import books.*;
import org.springframework.context.annotation.*;

@Configuration
@Lazy
public class BookConfig {
    @Bean(initMethod = "showBookList")
    @Scope("prototype")
    public BookLister bookLister(){
        return new BookLister();
    }

    @Bean
    @DependsOn("bookLister")
    @Scope("prototype")
    public Book book(){
        return new Book();
    }

    @Bean
    public Arts arts(){
        return new Arts();
    }

    @Bean
    public Business business(){
        return new Business();
    }

    @Bean
    public Economics economics(){
        return new Economics();
    }

    @Bean
    public Law law(){
        return new Law();
    }

    @Bean
    public Literature literature(){
        return new Literature();
    }

    @Bean
    public Programming programming(){
        return new Programming();
    }

    @Bean
    public Psychology psychology(){
        return new Psychology();
    }
}
