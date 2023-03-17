import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
	

public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://st.hobs.celcom.com.my/dms/#/");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("details-button")).click();
	driver.findElement(By.linkText("Proceed to st.hobs.celcom.com.my (unsafe)")).click();
	driver.findElement(By.className("required")).sendKeys("user2_DMHQ");
    driver.findElement(By.id("password")).sendKeys("user2@DMHQ");
    driver.findElement(By.className("btn-submit")).click();
    System.out.println(driver.findElement(By.cssSelector("div.alert-danger")).getText());
    driver.findElement(By.xpath("//body/div[1]/div/div[2]/header/div/button/span")).click();
    
    
    
    
    
    
    
    
    
}
}
