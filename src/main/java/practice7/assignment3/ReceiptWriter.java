package practice7.assignment3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReceiptWriter implements AutoCloseable {
    private final BufferedWriter bw;

    ReceiptWriter(String filename) throws IOException {
        this.bw = new BufferedWriter(new FileWriter(filename));
    }

    public void writeReceipt(String receipt) throws IOException {
        bw.write(receipt);
        bw.newLine();
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed receipt writer auto");

        if (bw != null) {
            bw.close();
        }
    }
}
