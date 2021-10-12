package bookmarkfolder;



import java.awt.*;

interface InterfaceExample{
    public void mobilePhone();

    default void tab(){
        System.out.println("This is not tab");
    }

}

class Laptop{
    public void open(){
        System.out.println("Inside Laptop");
    }
}

abstract class Computer extends Laptop{
    @Override
    public abstract void open() ;
}

public class Bookmark implements InterfaceExample{
    String title, director, author, cast;
    private final String BookmarkType;

    Bookmark(String title, String author){
        this.title = title;
        this.author = author;
        this.BookmarkType  = "book";
    }

    public void mobilePhone(){

    }

    Bookmark(String title, String director, String cast){
        this.title = title;
        this.director = director;
        this.cast = cast;

        this.BookmarkType = "movie";
    }

    public void isKidFriendly(){
        if(BookmarkType.equals("book")){

        }else if(BookmarkType.equals("movie")){

        }
    }

    public static void main(String[] args){
        InterfaceExample in = new Bookmark("book","tussi");
    }

}
