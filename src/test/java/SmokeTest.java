import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmokeTest {
    WebDriver driver = null;
    @BeforeTest
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(groups = "regression")
    public void googleSearch(){
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("lord shiva");
    }
}
