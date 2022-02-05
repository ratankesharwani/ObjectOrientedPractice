package p002;

public class MainClass {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        AnimalUtility.eat(d);
        AnimalUtility.eat(c);
        AnimalUtility.noise(c);
    }
}
