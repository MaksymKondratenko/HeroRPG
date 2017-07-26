package books;

import hero.Action;

import java.util.ArrayList;

public class BookLister {
    public BookLister() {
    }
    private ArrayList<Action> bookList = new ArrayList<>();

    protected ArrayList<Action> getBookList (){
        return bookList;
    }

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
