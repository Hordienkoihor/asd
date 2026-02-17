package practice6.assignment2;

public class CheckoutService {
    private final LoggerService loggerService;

    public CheckoutService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public String checkout(String orderId) {
        loggerService.logCheckoutStart();
        loggerService.logCheckoutEnd();
        return "OK:" + orderId;

    }
}

