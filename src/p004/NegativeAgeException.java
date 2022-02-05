package p004;

public class NegativeAgeException extends Exception{
    public NegativeAgeException() {
        super("Age can not be Negative , Please provide proper data.");
    }
}
