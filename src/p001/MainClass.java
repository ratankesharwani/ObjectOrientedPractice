package p001;

public class MainClass {
    public static void main(String[] args) {
        RatanInterface ratanInterface = new RatanInterfaceImplementation();

        ratanInterface.display();
        ratanInterface.show();
        RatanInterfaceImplementation ratanInterfaceImplementation = new RatanInterfaceImplementation();
        ratanInterfaceImplementation.display();
        ratanInterfaceImplementation.show();


        RatanInterface tt = new RatanInterface() {
            @Override
            public void show() {
                System.out.println("My New Implementation");
            }

            @Override
            public void display() {
                System.out.println("My display");
            }
        };

        tt.show();
        tt.display();

    }
}
