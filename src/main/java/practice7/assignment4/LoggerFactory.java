package practice7.assignment4;

public final class LoggerFactory {
    private LoggerFactory() {
    }

    public static SimpleLogger getLogger(Class<?> type) {
        return new SimpleLogger(type);
    }
}
