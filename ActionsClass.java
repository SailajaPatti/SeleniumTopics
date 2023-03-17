import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		capability.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(capability);
		driver.get("https://dev.hobs.celcom.com.my/nms/#/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("nmsuser");
		driver.findElement(By.id("password")).sendKeys("nmsuser");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//div[@class='div1']//div[@class='d-flex']//button[text()='Search']")).click();
		Thread.sleep(2000);
		
		Select drop = new Select(driver.findElement(By.id("specification")));
	   drop.selectByValue("CreationOfCelcomNumberPool");
	   Thread.sleep(1000);
	Select drop1 = new Select(driver.findElement(By.id("numberService")));
 drop1.selectByValue("PREPAID");
	}

	
}
