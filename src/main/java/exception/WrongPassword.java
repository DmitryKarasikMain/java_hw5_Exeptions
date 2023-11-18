package exception;

public class WrongPassword extends Exception{


    public WrongPassword(String a, String b, String c) {
        super(a + " " + b + " " + c);
    }
}
