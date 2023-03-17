import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		//ChromeOptions options= new ChromeOptions();
		 //options.setAcceptInsecureCerts(true);
		
		ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 capability.setAcceptInsecureCerts(false);
		 capability.addArguments("--remote-allow-origins=*");
		 System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(capability);
		 //How to automate the Broken URL's in webpage by using java methods+selenium
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 String Link = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		 
		 
		 
	HttpURLConnection	conn= (HttpURLConnection) new URL(Link).openConnection();//URL is a class in java to get the method openconnection
		 //calling the method openconnection() and casting that method to httpURL class which is parent class
		
		conn.setRequestMethod("HEAD");
		conn.connect();
		int ResCode=conn.getResponseCode();
		System.out.println(ResCode);
		
		
	}

}
