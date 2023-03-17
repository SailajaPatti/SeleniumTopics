

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestedDropdown {
	
	public static void main(String args[]) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(options);
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("autosuggest")).sendKeys("ind");
		 Thread.sleep(3000);
		 //Providing generic xpath for 2 elements which r listed . also use find elements
		 List<WebElement> Options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		 
        for(WebElement option: Options) {
        	
        	if(option.getText().equalsIgnoreCase("India"));
        	{
        	Thread.sleep(2000);
        	option.click();
        	
        		break;
        	}
        		
        		
        	 }
}}
