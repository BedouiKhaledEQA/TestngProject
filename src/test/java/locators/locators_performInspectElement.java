package locators;

import factory.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locators_performInspectElement extends Base {
    public locators_performInspectElement(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//h5[@data-test='product-name']")
    protected WebElement cPliersButton;
    @FindBy(xpath ="//body[1]/app-root[1]/div[1]/app-overview[1]/div[3]/div[2]/div[1]/a[2]/div[2]/h5[1]")
    protected WebElement PliersButton;
}
