import java.awt.List;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe --remote-debugging-port=9222");//used to run commnad on cmd
		//getRuntime()--this method returns the object which is currently associated with java program
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
	    //ChromeOptions options = new ChromeOptions();
	  //  options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222"); 

	   // WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//explicit wait
	     // WebDriverWait w = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] Items = { "Cucumber", "Beans", "Carrot","Capsicum" };
		addItems(driver,Items);//calling the method
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated("input.promoCode"));
				
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
		
				
		public static  void addItems(WebDriver driver, String[] Items)
		
		{
			
			int j = 0;
		java.util.List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");

			String farmattedname = name[0].trim();

			java.util.List<String> Itemsneed = Arrays.asList(Items);

			if (Itemsneed.contains(farmattedname)) {
				// need to click on the add to cart on cucmber index
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();


				if (j == Items.length)
	{
					break;

				}
			}

			}

		}}
//here name[0]=Cucumber but there is a spac after cucmber so that we need to
//trim
//name[1]=1kg
//first we need to check whether that name is present on the Items or not
//we need to convert Array into Array list for easy search
//now we r extracting - 1kg also but we need to extract actual vegatable name
//which is same as in array rt
//for that we need to split and trim to get exact vegetable
//if we use normal break here then it exit enire for block if won't give it
//will execute 30 times which is not
//correct even 3 items sekected also what we need to do we need to provide
//logic how many times
//this if block needs to execute
//bcz 3 items r there in array list which need to add so definately 3 times
//need to add rt
			