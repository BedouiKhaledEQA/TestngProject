package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    ChromeOptions chromeOptions=new ChromeOptions();
    FirefoxOptions firefoxOptions=new FirefoxOptions();
    public static Properties props =new Properties();
    public Base(){
        try {


            File file;
            String environment = System.getProperty("env", "local");
            if ("local".equalsIgnoreCase(environment)) {
                file = new File("src/test/java/Properties/local_Config.Properties");
            } else if ("prod".equalsIgnoreCase(environment)) {
                file = new File("src/test/java/Properties/prod_Config.Properties");

            } else throw new RuntimeException("environment n'est pas pris en charge !");
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
        }catch (IOException e){
            e.printStackTrace();
        }



    }
    public WebDriver luncher(String browser){
        //String Browser =System.getProperty("Browser","Chrome");
        switch (browser){
            case "chrome"->{
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();

            }case "firefox"->{
                //WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();


            }case "Edge"->{
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();


            }
            default -> throw new IllegalArgumentException("Navigateur non pris en charge: " + browser);

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(props.getProperty("url"));
        return driver;

    }
}
