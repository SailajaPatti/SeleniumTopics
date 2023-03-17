import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class BrokenLinks1 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        capability.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(capability);
		 
		 
	        
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 String Link = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		 
		 HttpURLConnection	conn= (HttpURLConnection) new URL(Link).openConnection();
		 
		 conn.setRequestMethod("HEAD");
		 conn.connect();
		int RespCode= conn.getResponseCode();
		System.out.println(RespCode);
	}

}
