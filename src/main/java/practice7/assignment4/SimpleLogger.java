package practice7.assignment4;

public class SimpleLogger implements Logger {
    private final String className;

    public SimpleLogger(Class<?> clazz) {
        this.className = clazz.getName();
    }

    @Override
    public void trace(String message, Object... args) {
        log("TRACE", message, args);
    }

    @Override
    public void debug(String message, Object... args) {
        log("DEBUG", message, args);
    }

    @Override
    public void info(String message, Object... args) {
        log("INFO", message, args);
    }

    @Override
    public void warn(String message, Object... args) {
        log("WARN", message, args);
    }

    @Override
    public void error(String message, Object... args) {
        log("ERROR", message, args);
    }

    private void log(String level, String message, Object... args) {
        if (
                message.toLowerCase().contains("password") ||
                message.toLowerCase().contains("token")
        ) {
            message = "[SECURED]";
        }
        System.out.printf("[%s] [%s]: %s%n", level, className, message);
    }
}
