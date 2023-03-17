import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	
	public static void main(String args[]) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 driver.findElement(By.xpath("//div[@class='form-group'][1]/input")).sendKeys("Sailaja");
		 driver.findElement(By.name("email")).sendKeys("sailajapattti@gmail.com");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lishika@2020");
		 WebElement Static = driver.findElement(By.id("exampleFormControlSelect1"));
		 Select dropdown = new Select(Static);
		 dropdown.selectByIndex(1);
		 driver.findElement(By.id("inlineRadio1")).click();
		
		 driver.findElement(By.name("bday")).sendKeys("10/19/2022");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 System.out.println(driver.findElement(By.className("alert-success")).getText());
		 
		

}}
