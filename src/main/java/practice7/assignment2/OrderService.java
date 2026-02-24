package practice7.assignment2;

import java.util.logging.Logger;

public class OrderService {
    private static final Logger LOGGER = Logger.getLogger(OrderService.class.getName());

    public void checkOut(int orderId, String userEmail, int totalCents) {
        try {
            processPayment(totalCents);

        } catch (PaymentGatewayException e) {
            String errorMessage =  "Failed to process checkout for Order ID: " + orderId +" User: " + userEmail;
            LOGGER.severe(errorMessage);

            throw new OrderProcessingException(errorMessage, e);
        }
    }

    private void processPayment(int totalCents) throws PaymentGatewayException {
        if (totalCents <= 0) {
            throw new PaymentGatewayException("total cents cant be negative");
        }
        LOGGER.info("Payment processed");
    }
}
