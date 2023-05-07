import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TestAutomation {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://google.com/");

        By langChange = By.xpath("//a[normalize-space()='English']");
        driver.findElement(langChange).click();

        By searchBtn = By.id("APjFqb");
        driver.findElement(searchBtn).sendKeys("Dhaka University");

        By searchItem = By.xpath("//span[normalize-space()='Dhaka University']");
        driver.findElement(searchItem).click();

        By duUrl = By.xpath("//h3[normalize-space()='Dhaka University: Home']");
        driver.findElement(duUrl).click();

        driver.close();


    }
}
