import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

	public static void main(String args[]) {
		
		//to invoke browser
		//Selenium wants to automate in browser unable to open directly from selenium core so it reached
		//chrome team to provide solution then then chrome team will provide chromedriver.exe file to open chrome browser
		//the middile man proxy(chrome driver is interoriting the code and executing on browser
		//chromedriver is heart of exec code
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
		
		//object creation for accessing all methodes which r there in chrome driver
		// Every browser has it's own driver and contains same methods of all webdriver methods
		//eg. close(),get() etc. also seperate webdriver like chrome or IE may have extra own methods also along with webdriver methods
		//eg. chrome driver= webdriver methods(which applicable to all)+extra chrome methods(accessable to only chrome driver
		//ideal way is better to use WebDriver driver=new WebDriver to run on any browser
		
//how to run in chrome
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
//how to run in edge
	 //    System.setProperty("webdriver.edge.driver","C:\\BrowserDriver\\msedgedriver.exe");
	  //   WebDriver driver=new EdgeDriver();
				
		
		driver.get("https://www.w3schools.com/java/default.asp");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//practicicng tips
		WebDriver frame=driver.switchTo().frame(0); //going into frame with index also can by the webElement,string
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
