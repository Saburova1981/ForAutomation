import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Swetik\\Study\\QA\\Automation\\Install\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Search']"));
        input.click();

    }

}
