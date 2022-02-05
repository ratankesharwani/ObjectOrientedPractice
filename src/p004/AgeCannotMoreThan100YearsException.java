package p004;

public class AgeCannotMoreThan100YearsException extends Exception{
    public AgeCannotMoreThan100YearsException() {
        super("Age can not more than 100 Years, Please provide proper age.");
    }
}
