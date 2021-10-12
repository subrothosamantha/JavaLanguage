package Inheritance;

import javax.jws.soap.SOAPBinding;



class User {
   public void printUserType(){
       System.out.println("insdie User");
   }

   public void ss(){
       System.out.println("ss");
   }
}

class Staff extends User{
    public void printUserType(){
        super.printUserType();
        System.out.println("insdie Staff");
    }
}

class Editor extends Staff{
    public void printUserType(){
        System.out.println("insdie Editor");
    }

    public void thingsToBeDone(){
        System.out.println("Things-to-be-done");
    }
}

public class Activation{
    public void UserTest(User user){
        ((Editor)user).thingsToBeDone();
    }

    public static void main(String[] args){
       User u = new Editor(); //polymorphism

        u.ss();

        //System.out.println(user instanceof User);
    }
}