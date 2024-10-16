package Pages;

import locators.locators_performInspectElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class performInspectElementPage extends locators_performInspectElement{
    public performInspectElementPage(){
        PageFactory.initElements(driver,this);
    }
    public static performInspectElementPage instance;
    public static performInspectElementPage getInstance(){
        if(instance ==null){
            instance =new performInspectElementPage();
        }return instance;
    }

    public void performInspect1(){
        cPliersButton.click();
    }
    public void performIspec2(){
        PliersButton.click();

    }
}
