package practice7.assignment3;

public class Main {

    public static void main(String[] args) {
        ReceiptService service = new ReceiptService();

        try {
            service.generate("receipt.txt", "Чек #1042: 500.00 UAH");

            service.generate("/des/neTut/receipt.txt", "ne check");

        } catch (ReceiptGenerationException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.println("Cause: " + e.getCause());
        }
    }
}
