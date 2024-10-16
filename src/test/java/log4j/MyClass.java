package log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
    public static final Logger logger = LogManager.getLogger(MyClass.class);

    public void myMethod() {
        logger.debug("Message de débogage");
        logger.info("Message informatif");
        logger.warn("Message d'avertissement");
        logger.error("Message d'erreur");
        logger.fatal("Message d'erreur fatale");
    }
}
