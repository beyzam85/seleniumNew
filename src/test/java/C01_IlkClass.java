import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Actual Title : " + driver.getTitle());
        System.out.println("Actual Url : " + driver.getCurrentUrl());

    }
}
