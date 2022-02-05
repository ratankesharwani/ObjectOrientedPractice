package p002;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat roti.");
    }

    @Override
    public void noise() {
        System.out.println("Dog -> Bhow Bhow");
    }
}
