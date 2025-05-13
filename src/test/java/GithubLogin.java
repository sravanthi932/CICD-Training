import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GithubLogin {
    public static void main(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        WebElement userName = driver.findElement(By.name("login"));
        if (userName.isDisplayed()){
            if (userName.isEnabled()){
                userName.sendKeys("sravanthi");
                userName.getAttribute("value");
            }
            else
                System.err.println("The username text box is not enabled");
        }
        else
            System.err.println("The username text box is not displayed");

    }
}
