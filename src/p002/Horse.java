package p002;

public class Horse implements Animal{
    @Override
    public void eat() {
        System.out.println("Horse eat gram");
    }

    @Override
    public void noise() {
        System.out.println("Horse -> Rinkinya ke papa");
    }
}
