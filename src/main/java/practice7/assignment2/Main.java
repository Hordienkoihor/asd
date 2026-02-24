package practice7.assignment2;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
//        orderService.checkOut(1, "email@ukr.net", -10);
        orderService.checkOut(1, "email@ukr.net", 10);
    }
}
