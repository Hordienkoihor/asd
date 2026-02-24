package practice7.assignment1;

public record Order(int id, String userEmail, int totalCents) {
    public Order {
        if (id < 0) {
            throw new IllegalArgumentException("Order id cannot be negative");
        }

        if (!userEmail.contains("@")) {
            throw new IllegalArgumentException("User email must contain @");
        }

        if (totalCents < 0) {
            throw new IllegalArgumentException("Total cents cannot be negative");
        }
    }
}
