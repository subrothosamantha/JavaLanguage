package ExceptionHandling;

public class MyException extends RuntimeException {

    public MyException(){
        super();
    }


    public MyException(String s){
        super(s);
    }
}
