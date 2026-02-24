package practice7.assignment4;

public class Main {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SimpleLogger logger = LoggerFactory.getLogger(Main.class);

        logger.info("Hello World");
        logger.warn("Hello World");
        logger.error("Hello World");
        logger.trace("Hello World");
        logger.debug("Hello World");

        logger.info("blaBLApassword");
    }
}
