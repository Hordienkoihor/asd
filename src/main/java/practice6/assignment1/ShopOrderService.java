package practice6.assignment1;

/*
 *
 * за srp кожен клас має відповідати за одну логічну задачу.
 * Цей відповідає за роботу з замовленнями
 * */
public class ShopOrderService {
    private void payOrder(long orderId) {
        System.out.println("Paying order " + orderId);
    }

    public void createOrder(String userEmail, String productName) {
        System.out.println("Creating order " + userEmail + " " + productName);
    }
}
