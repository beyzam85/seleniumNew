import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle());//CDwindow-9202B8CB10699698C4382329EBB36D66 her yeni pencerede yeni handle hash kodu verir
        //farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullnırız

    }
}
