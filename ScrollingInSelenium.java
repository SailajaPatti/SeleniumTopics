import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//here we will talk about how to scroll table ,page etc
		//Headless Browser-The browser which won't open the execution will done based upon chrome service chrome provides the chrome service to all operatins without opening broswe
		//how to scroll in selenium it won't by default rt so we need to write the javascript since all browsers made with javascript
		//there is a class in Java script JavaScriptExecutor which provides the methods to excute java script
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		//so to scroll down in the page
		JavascriptExecutor js = (JavascriptExecutor) driver; //here ur casting ur driver to javascript executor
		//so driver has knowledge that javascript execution
		js.executeScript("window.scrollBy(0,500)");
		//here 2 arguments 2nd one is optional
		//in first arg, u need to write script which needs to execute also that script u can bring from console.
		//in console, windows.scroll method will be there and specify the length how much need to scroll
		//what if we want to scroll specific element on the webpage there will be a seperate method for that
		//go to console document.queryselector("css seelector")---query selector is ntg but a css selector in javascript after we needto use methods like scrollleft,scroll right etc
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//now the task is to sum 4th column elements
		
		java.util.List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-Child(4)"));
		int sum=0;
		for(int i= 0;i<values.size();i++) 
		{
			sum=sum+ Integer.parseInt(values.get(i).getText());
			
		}
		
		
		System.out.println(sum);
	    int Actual= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	    Assert.assertEquals(Actual, sum);
		
	}

}
