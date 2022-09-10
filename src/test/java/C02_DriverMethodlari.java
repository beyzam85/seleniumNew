import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Kaynak kodlarınıniçinde "Gateway "kelimesinin oldugunu test ediniz
        //System.out.println(driver.getPageSource());
        String istenenKelime = "Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi PASSED");
        }else System.out.println("PageSourse testi FAILED");

        driver.close();//sayfayi kaptır
       //driver.quit();//birden fazla sayfa varsa hepsinikapatır
    }
}
