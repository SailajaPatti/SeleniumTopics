import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe --remote-debugging-port=9222");//used to run commnad on cmd
		//getRuntime()--this method returns the object which is currently associated with java program
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver(options);
		
	   // ChromeOptions options = new ChromeOptions();
	    //options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222"); 

	    WebDriver driver = new ChromeDriver();

		
		//1.no of rows on the table
		
	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    List<WebElement> Rows=driver.findElements(By.cssSelector(".table-display tr"));
	    System.out.println(Rows.size());
	    
	  //2.no of columns on the table
	    
	  List <WebElement> Columns=  driver.findElements(By.cssSelector(".table-display tr th"));
	  System.out.println(Columns.size());
	  
	//3.get the 2nd row content
	  
	 WebElement Content= driver.findElement(By.xpath("//table[@class='table-display']//tr[3]"));
	 System.out.println(Content.findElements(By.tagName("td")).get(0).getText());
	 System.out.println(Content.findElements(By.tagName("td")).get(1).getText());
	 System.out.println(Content.findElements(By.tagName("td")).get(2).getText());
	 
	  
	  
	    
	}

}
