package p002;

public class Cow implements Animal{
    @Override
    public void eat() {
        System.out.println("Cow eat grass");
    }

    @Override
    public void noise() {
        System.out.println("Cow -> vow  vow");
    }
}
