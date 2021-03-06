package com.mk.herorpg.actionimpl.books;

import com.mk.herorpg.hero.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@AllArgsConstructor
public class BookLister {

    @Getter @Setter
    private ArrayList<Action> bookList;

    @PostConstruct
    protected void showBookList(){
        getBookList();
        System.out.println("Choose and type, what a book of what topic you want to read:");
        bookList.forEach(x -> System.out.println(x + ", "));
        System.out.println("\n");
    }
}