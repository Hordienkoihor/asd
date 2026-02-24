package practice7.assignment3;

import java.io.IOException;

public class ReceiptService {
    public void generate(String fileName, String data) {
        try (ReceiptWriter writer = new ReceiptWriter(fileName)) {
            writer.writeReceipt(data);
            System.out.println("receipt generated");

        } catch (IOException e) {
            throw new ReceiptGenerationException("error generating receipt: " + fileName, e);
        }
    }
}
