import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        Thread.sleep(3000);
        WebElement userName = driver.findElement(By.name("login"));
        if (userName.isDisplayed()){
            if (userName.isEnabled()){
                userName.sendKeys("sravanthi");
                userName.getAttribute("value");
                Thread.sleep(3000);

            }
            else
                System.err.println("The username text box is not enabled");
        }
        else
            System.err.println("The username text box is not displayed");

    }
}
