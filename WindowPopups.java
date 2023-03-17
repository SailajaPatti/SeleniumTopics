package WindowAuthenticatorPopup.HandlingWindowPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WindowPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("");
		WebDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com//");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		//so after clicking on the link selenium will automatically enter username and password and click on sign in
		
	}

}
