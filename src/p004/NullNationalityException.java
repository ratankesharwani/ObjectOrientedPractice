package p004;

public class NullNationalityException extends Exception{
    public NullNationalityException() {
        super("Nationality Can not be Null , Please provide proper nationality.");
    }
}
