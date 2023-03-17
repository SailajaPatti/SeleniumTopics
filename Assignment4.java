import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		String name=driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		Select a=new Select(driver.findElement(By.id("dropdown-class-example")));
		a.selectByVisibleText(name);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String txt=driver.switchTo().alert().getText();
		if(txt.contains("Opt"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
//1.select checkbox
//2.grab label
//3.the one whcih u selected on check the needs to select in dropdown from 2
//4.enetr step 2 text in edit box(do not hard drive the optin and placein step 4)
//5.clcik alert and check whether step 2 step will be on the pop up
