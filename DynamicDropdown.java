import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000L);
		// with index driver.findElement(By.xpath("//a[@value='GOI'][1]")).click();
		// without index also we can achieve by using parent to child traverse
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[text()=' Goa (GOI)']"))
				.click();

		// After selection from --> to then need to select today date like below
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	}
}
