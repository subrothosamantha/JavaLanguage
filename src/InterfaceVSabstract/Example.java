package InterfaceVSabstract;

import java.util.*;

import java.awt.peer.ListPeer;

interface Book{
    //int bookId;  //by default this is public static final

    /*Book(){         //cannot have constructor here

    }*/

    default void Fun(){  //can have default method

    }
}

abstract class Dikin{
    int bikinId;          // can have this
    Dikin(int bikin){          //only extended class can access
        this. bikinId = bikin;
    }
}



public class Example {
    public static void main(String[] args){

    List<Integer> list = new ArrayList<>();

        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int value = iterator.next();

            System.out.println(value);
            if(value == 24){
                iterator.remove();
                iterator.next();
            }

        }
        System.out.println(list);
    }
}

