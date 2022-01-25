package Test;

import org.apache.log4j.Logger;

import java.io.File;

public class MyLogger {
    private static Logger logger = Logger.getLogger(MyLogger.class);

    public static void error(String message) {
        logger.error(message);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
    public static void attach(File file) {
        logger.info(file);
    }
}
