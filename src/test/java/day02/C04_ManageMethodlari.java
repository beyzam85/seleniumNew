package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementleri {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://techproeducation.com");
        //driver.close();
        driver.quit();


        /*
        ileride wait konusunu daha geniş olarak ele alacagız
        Bir sayfa açilirken ilk basta sayfanın içerisinde bulunan elementlee gore bir
        yükleme süresine ihtiyac vardır veya bir web elementin kullanılabilmesi için zamana ihtiyac olabilir
        implisitlyWait bize sayfanın yuklenmesi. ve syfadaki elementlere ulsılması için beklenecek
        MAXIMUM sureyi belirleme olanagı tanır.
         */

    }
}
