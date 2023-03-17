import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentOnWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		
		//String Child1= It.next();
		//above all are variables which are storing windows which needs to pass methods to where it performs
		
		driver.findElement(By.cssSelector("a[href$='/windows/new']")).click();
		Set <String>Windows=driver.getWindowHandles();
		Iterator <String> It=Windows.iterator();
		String Parent=It.next();
		String Child= It.next();
		driver.switchTo().window(Child);
		//driver.switchTo().window(It.next());
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(Parent);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		

	}

}
