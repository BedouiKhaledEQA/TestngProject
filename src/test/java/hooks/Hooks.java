package hooks;

import factory.Base;;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class Hooks extends Base {


    @Parameters("browser")
    @BeforeMethod
    public void beforeALlMethode(@Optional("Chrome")String Browser){
        luncher(Browser);
    }

    @AfterMethod
    public void afterAllMethode(){
        driver.quit();


    }
}
