import java.awt.List;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		
		//String[] Products = {"iphone X","Blackberry"}
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		driver.switchTo().alert().dismiss();
		WebElement Static=driver.findElement(By.xpath("//div[@class='form-group']//select"));
		Select dropdown = new Select(Static);
		dropdown.selectByIndex(3);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
      // List	Items = (List) driver.findElements(By.cssSelector("h4.card-title"));
   
     // for (int i = 0; i<Items.size(); i++) {
	 //  String name = ((java.util.List<WebElement>) Items).get(i).getText();
	   
	  // List A1=(List) Arrays.asList(Products);
	  // if(Products.)
	   
	   
   }
	   
   {
	   
   }
		
		
		

	}


