import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1.Maximize the browser and delete all cookies
		//so all the browser related handles can be done by manage() method rt
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		// driver.manage().deleteAllCookies(); //to delete all cookies
		 //driver.manage().deleteCookieNamed("asd"); //if u want to delete specific cookie by giving cookie name
		 
		 //if we have a scenerio, like tere is a cookie session expired so after it will loss secure connection and navigate to the home page rt so how to automate that
		 //so for this we need to delete the cookie after need to clcik on any link to get url or credential page verify login
		 
		// driver.manage().deleteCookieNamed("session cookie name ");
		// driver.get("https://google.com");
		 
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("C:\\Users\\1685453\\screenshot.png"));
		 
		
		
		 
	}

}
