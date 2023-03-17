import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Accept insecure certificates
		//if there is any third party sites from client side for those we need to click advanced and Proceed link rt so to go
		//directly to login page we use Desired Capapbilities  class for these SSL Certificates to accept insecure cert
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
		//By.id("specification");
		Select drop = new Select(driver.findElement(By.id("specification")));
	   drop.selectByValue("CreationOfCelcomNumberPool");
	   Thread.sleep(1000);
	Select drop1 = new Select(driver.findElement(By.id("numberService")));
 drop1.selectByValue("PREPAID");
	}
//Actions is a class and Action is an interface
	
}
