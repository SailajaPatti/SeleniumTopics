import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().driverVersion("110.0.5481").setup();

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		//need to pass the arguement driver to tell selenium or to build Actions interface in selenium
		Actions a = new Actions(driver);
		WebElement name = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		//after specifying the locator where to mouseover need to build the statement for readiness of the whole statemwnt and then need to 
		//pass perform() method to perform the whole statement
		//these to methods r mandatory to execute the statement
		a.moveToElement(name).build().perform();
		//for composite expressions
		//to enter the text in search box in capital letters and need to select see how we achieve that by using methods in a single statements
	   a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("sailaja").doubleClick().build().perform();
		//keydown method is to select any key in keyboard and double click is a method to select in selenium and if we clich shift along with the keys it will enter Capital letters
		a.moveToElement(name).contextClick().build().perform();
		
}}
