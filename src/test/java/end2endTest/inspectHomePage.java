package end2endTest;

import Pages.performInspectElementPage;
import hooks.Hooks;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class inspectHomePage extends Hooks {
    public static final Logger logger = LogManager.getLogger(inspectHomePage.class);

    performInspectElementPage pe;

    @Test(description = "Test1")

    public void performInspectElement( ){
        logger.info("Début du test performInspectElement");
        logger.debug("Avant d'initialiser performInspectElementPage");
        pe =new performInspectElementPage();
        pe.performInspect1();
        logger.debug("Après l'exécution de pe.performInspect1()");
        logger.info("Fin du test performInspectElement");
    }


    @Test(description = "Test2")
    public void performElement2( ){
        pe =new performInspectElementPage();
        pe.performIspec2();
    }

    }



