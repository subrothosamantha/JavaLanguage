package innerClass;

public class Example {
    String name;
    int age;

     static class Acadamic{
       static private int id;
        public void setId(int id){
            this.id = id;
            new Example().age = 23;

        }
        public int getId(){
            return id;
        }
    }

   // Acadamic.
    
    public Example() {

    }

    public Example(String name, int age) {
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

    public static void main(String[] args){

       /* Example e = new Example("Sushant",35);

        Example.Acadamic a = e.new Acadamic();

        a.setId(22);*/


        Example.Acadamic ea = new Example.Acadamic();
        System.out.println(ea.getId());
    }


}
