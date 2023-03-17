import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FiltersWithStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Tomato");
		List<WebElement> Listed=driver.findElements(By.xpath("//tr/td[1]"));//after search will display one element
		List<WebElement> Contain=Listed.stream().filter(s->s.getText().contains("Tomato")).collect(Collectors.toList());//here also tomato text contains on one element
		Assert.assertEquals(Listed.size(), Contain.size());
		
	}

}
