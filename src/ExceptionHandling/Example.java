package ExceptionHandling;
import java.io.*;
import java.util.*;

import java.io.FileNotFoundException;

public class Example {
    public static void print(int x){
        if(x < 0){
            throw new NumberFormatException();
        }else{
            System.out.println("Your Transaction is successful");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
       try {
           print(Integer.parseInt("Satish"));
       }catch (NumberFormatException e){
           System.out.println("please enter valid input");
           print(sc.nextInt());

       }finally{
           System.out.println("Hum free of cost hai");
       }
    }
}
