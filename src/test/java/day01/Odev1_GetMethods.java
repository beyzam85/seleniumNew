import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1_GetMethods {
    public static void main(String[] args) {

           /*
        Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver surucu = new ChromeDriver();
        //1)-Amazon sayfasina gidelim. https://www.amazon.com/
        surucu.get("https://amazon.com");
        surucu.manage().window().maximize();

        //2)-Sayfa basligini(title) yazdirin
        String baslik = surucu.getTitle();
        System.out.println("sayfanın baslıgı : " + baslik);

        //3)-Sayfanın basliginin “Amazon” icerdigini test edin
        String baslikArananKelime = "Amazon";

        if (baslik.contains(baslikArananKelime)) {
            System.out.println("Baslik testi PASSED");
        } else System.out.println("Baslik testi FAILED");

        //4)-Sayfa adresini(url) yazdirin
        String url = surucu.getCurrentUrl();
        System.out.println("Sayfanın URL değeri : " + url);

        //5)-Sayfa url’inin “amazon” icerdigini test edin.
        String urlAranankelime = "amazon";
        if (url.contains(urlAranankelime)){
            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAİLED");

        //6)-Sayfa handle degerini yazdirin
        System.out.println("Sayfanin Handle degeri : "+ surucu.getWindowHandle());

        //7)-Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String kaynakKodlari = surucu.getPageSource();
        String kaynakKodlariArananKelime = "Gateway";
        if (kaynakKodlari.contains(kaynakKodlariArananKelime)){
            System.out.println("Kaynak kodu testi PASSED");
        }else System.out.println("Kaynak kodu testi FAİLED");

        //8)-sayfayı kapatın
        surucu.close();
    }
}