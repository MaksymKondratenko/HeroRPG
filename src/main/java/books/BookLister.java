package books;

import hero.Action;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
@Component
public class BookLister {
    public BookLister() {
    }
    public BookLister(ArrayList<Action> list){
        bookList = list;
    }
    private ArrayList<Action> bookList;

    protected ArrayList<Action> getBookList (){
        return bookList;
    }

    @PostConstruct
    protected void showBookList(){
        getBookList();
        System.out.println("Choose and type, what a book of what topic you want to read:");
        for (Action x : bookList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }

    public void setBookList(ArrayList<Action> bookList) {
        this.bookList = bookList;
    }
}
