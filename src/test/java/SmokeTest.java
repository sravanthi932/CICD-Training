import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Map;

public class SmokeTest {
    WebDriver driver;
    @BeforeTest
    public void setUpTest() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        Map<String, String> env = System.getenv();
        String chromeBin = env.get("CHROME_BIN");
        options.setBinary(chromeBin);
        driver = new ChromeDriver(options);
    }


    @Test(groups = "regression")
    public void googleSearch(){
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("lord shiva");
    }
//    public class Main{
//        public static void main(String args[]){
//            ChromeOptions options = new ChromeOptions();
//            Map<String, String> env = System.getenv();
//            String chromeBin = env.get("CHROME_BIN");
//            options.setBinary(chromeBin);
//            ChromeDriver driver = new ChromeDriver(options);
//        }
//    }
}
