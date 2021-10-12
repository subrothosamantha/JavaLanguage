package collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Book{
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
    @Override
    public int hashCode(){
        return title.hashCode();
    }
}


public class ArrayListDemo {

    public static void main(String[] args) {
       /* Map<String,Integer> map1 = new HashMap<>();
        map1.put("John",33);
        map1.put("anita",23);
        map1.put("lita",35);
        map1.put("suresh",35);

        Set<String> names = map1.keySet();

        for(String name : names){ //keySet gonna return keys which means name is key
            System.out.println(name + " " +map1.get(name));
        }*/

       assert 1 > 2 : "This is good";
        System.out.println("passed");
    }
}
