package practice5.assignment1;

public interface PaymentMethod {
    String name();

    void pay(int amount);

    default void payWithFee(int amount, int fee) {
        System.out.println("paying with fee ");
        pay(amount + fee);
    }
}
