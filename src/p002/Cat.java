package p002;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eat rat.");
    }

    @Override
    public void noise() {
        System.out.println("Cat -> Mau Mau");
    }
}
