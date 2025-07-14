package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookSiteTest {
    //public static void main(String[] args) {
    	
    	public static void norequired() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", ChromeDriverManager.getInstance().getDriverPath());
        //-Dplatform=Chrome -Denvironment=siam168_OnCloud_Gvnfm
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://books.toscrape.com/");
            String bookTitle = driver.findElement(By.cssSelector("h3 > a")).getAttribute("title");
            System.out.println("Book found: " + bookTitle);
        } catch (Exception e) {
            System.out.println("Test Failed");
            System.exit(1);
        } finally {
            driver.quit();
        }
    }
}
