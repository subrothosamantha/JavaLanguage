package FileHandling;

import java.io.*;

import java.io.Serializable;

class Person implements Serializable {
    String name;
    transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SerializableDemo {

    public static void main(String[] args){

        Person p = new Person("Satish", 19);

       try( ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Berson.scr"));
       ObjectInputStream oin = new ObjectInputStream(new FileInputStream("Berson.scr")))
       {
             obj.writeObject(p);

             Person person = (Person)oin.readObject();
           System.out.println(person.name+" "+person.age);
       }catch (IOException e){
           e.printStackTrace();
       }catch (ClassNotFoundException e){
           e.printStackTrace();
       }

    }


}
