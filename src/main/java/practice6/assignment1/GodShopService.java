package practice6.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GodShopService {
    private final List<String> users = new ArrayList<>();
    private final Map<String, Double> products = new HashMap<>();

    private int fridayDiscount = 10;

    private void registerUser(String email) {
        if (!users.contains(email)) {
            users.add(email);
        }
    }

    private void addProduct(String name, double price) {
        products.put(name, price);
    }

    public void createOrder(String userEmail, String productName) {
        System.out.println("Creating order " + userEmail + " " + productName);
    }

    private void payOrder(long orderId) {
        System.out.println("Paying order " + orderId);
    }

    private void sendEmail(String email, String message) {
        System.out.println(message);
    }

    public void exportReport(String fromDate, String toDate) {
        System.out.println("Exporting report from " + fromDate + " to " + toDate);
    }
}
