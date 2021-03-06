package com.mk.herorpg.hero;

import com.mk.herorpg.utils.Printer;
import com.mk.herorpg.utils.Time;

import java.io.IOException;

public class Adventure {

    private Time time = new Time();

    public void start() throws IOException {
        Printer printer = new Printer();
        printer.printLogo();
        System.out.print("Hi, Hero! Let it be your new adventure!\nYou can read, sleep, eat, work, study, enjoy, wash, train yourself and go date a girl.\n");
    }
    public void welcome(){
        System.out.print("What you are going to do next? (just type a word! Type \"help\" for help.)\n-> ");
    }

    @Override
    public String toString(){
        return "Adventure";
    }
}
