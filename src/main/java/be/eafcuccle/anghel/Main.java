package be.eafcuccle.anghel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        logger.trace("Message TRACE");
        logger.debug("Message DEBUG");
        logger.info("Message INFO");
        logger.warn("Message WARN");
        logger.error("Message ERROR");

    }
}