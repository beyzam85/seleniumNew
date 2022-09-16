import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu sayfada ileri geri yapıcaksak kullanlır
        // driver.get()methodu bizi istediğimiz Url e götürür

        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasına donelim
        Thread.sleep(3000);
        driver.navigate().back();
        // Tekrar techproed sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //techproed sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        //son olarak sayfayı kapatınız
        driver.close();


    }
}
