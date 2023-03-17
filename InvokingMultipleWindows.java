import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//sce is after opening url need to open new tab and grab the text from there and put in the name field
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW); //TO OPEN NEW TAB BUT the driver scope is not in this newly opened tab
		Set<String> handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
	Object ParentWindowid=	it.next();
	
	Object ChildWindowid=it.next();
	driver.switchTo().window((String) ChildWindowid);
	driver.get("https://ultimateqa.com/dummy-automation-websites/");
	String RequiredText=driver.findElement(By.xpath("//a[text()='SauceDemo.com']")).getText();
	driver.switchTo().window((String) ParentWindowid);
	WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
			name.sendKeys(RequiredText);
	//taking partial ss
	File file=name.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("logo.png"));
	//hight and width of webElement
	
	System.out.println(name.getRect().getDimension().getHeight()); //height of webelement
	System.out.println(name.getRect().getDimension().getWidth()); //width of webelement
	
	
	
		
	}

}
