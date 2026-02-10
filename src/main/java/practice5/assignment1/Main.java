package practice5.assignment1;

import javax.smartcardio.Card;

public class Main {
    public static void main(String[] args) {
        PaymentMethod card = new CardPayment();
        PaymentMethod payPal = new PayPalPayment();

        card.name();
        card.pay(100);

        payPal.name();
        payPal.pay(100);

        card.payWithFee(10, 2);
        payPal.payWithFee(10, 2);


    }
}
