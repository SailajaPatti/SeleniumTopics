import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    String RE="IPHONE 13 PRO";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("sailaja@tcs.com");
		driver.findElement(By.id("userPassword")).sendKeys("Lishika@2020");
		driver.findElement(By.id("login")).click();
		java.util.List<WebElement> Products=driver.findElements(By.className("col-lg-4"));
		WebElement Prod=Products.stream().filter(Product->
		Product.findElement(By.cssSelector("b")).getText().equals(RE)).findFirst().orElse(null);
				
	    Prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#toast-container"))));
		driver.findElement(By.xpath("//ul//li[4]")).click();
		List<WebElement> CartItems =driver.findElements(By.cssSelector(".cart h3"));
		boolean match=CartItems.stream().anyMatch(Item -> Item.getText().equalsIgnoreCase(RE));
		Assert.assertTrue(match);
		driver.findElement(By.cssSelector(".subtotal button")).click();
	}



	



	}


