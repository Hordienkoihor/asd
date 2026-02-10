package practice5.assignment1;

public class PayPalPayment implements PaymentMethod{
    @Override
    public String name() {
        return "PayPal";
    }

    @Override
    public void pay(int amount) {
        System.out.println("paying with paypal");
    }
}
