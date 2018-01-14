package com.mk.herorpg.config;

import com.mk.herorpg.actionimpl.books.*;
import com.mk.herorpg.hero.Action;
import org.springframework.context.annotation.*;

import java.util.ArrayList;

@Configuration
@Lazy
public class BookConfig {
    @Bean
    @DependsOn("bookList")
    @Scope("prototype")
    public BookLister bookLister(){
        return new BookLister(bookList());
    }

    @Bean
    @DependsOn("bookLister")
    @Scope("prototype")
    public Book read(){
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

    @Bean
    public ArrayList<Action> bookList(){
        ArrayList<Action> list = new ArrayList<>();
        list.add(arts());
        list.add(business());
        list.add(economics());
        list.add(law());
        list.add(literature());
        list.add(programming());
        list.add(psychology());
        return list;
    }
}
