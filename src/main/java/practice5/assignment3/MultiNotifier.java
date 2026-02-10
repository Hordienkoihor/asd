package practice5.assignment3;

public class MultiNotifier implements EmailNotifier, SmsNotifier {
    @Override
    public void send(String message) {
        System.out.println("Calling super methods: ");
        EmailNotifier.super.send(message);
        SmsNotifier.super.send(message);
    }
}
