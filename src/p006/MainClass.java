package p006;

public class MainClass {
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderStatus(OrderStatus.DELIVERED);

        Gender gender = Gender.FEMALE;

        System.out.println(gender);
    }
}
