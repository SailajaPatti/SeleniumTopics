import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//To select desired date from calender mainly for travel websites
		
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(5);
		driver.manage().window().maximize();
		Thread.sleep(10);
		//WebDriverWait wait=new WebDriverWait(driver);
		WebDriverWait w = new WebDriverWait(driver, null);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form-field-travel_comp_date")));
		//w.until(ExpectedConditions.
		
		//driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		//now first we need to select month-year which are on same statement on html code which means april-2018 like that
		//when it found it will stay on the page rt so need to get all date in list of webelements and use for loop to select desired date
		//1.April-2022-need to select
		while(!driver.findElement(By.cssSelector("div.flatpickr-current-month")).getText().contains("April"));
		{
		driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg")).click();	
		}
		
		List<WebElement> Alldate=driver.findElements(By.cssSelector(".dayContainer"));
		int Size=driver.findElements(By.cssSelector(".dayContainer")).size();
		for(int i=0;i<Size;i++)
		{
			String Required = driver.findElements(By.cssSelector(".dayContainer")).get(i).getText();
			if(Required.equalsIgnoreCase("8")) //to select 8
			{
				driver.findElements(By.cssSelector(".dayContainer")).get(i).click();
			    break;
	}
			
	

}}}

//getting element intercepted need to check with someone who knows
