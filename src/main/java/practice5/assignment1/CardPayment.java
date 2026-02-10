package practice5.assignment1;

public class CardPayment implements PaymentMethod {

    @Override
    public String name() {
        return "Card";
    }

    @Override
    public void pay(int amount) {
        System.out.println("paying with card");
    }
}
