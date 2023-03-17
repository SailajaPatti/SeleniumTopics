import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		//u need to specify the frame address where need to be drag
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions a = new Actions(driver);
		WebElement Source= driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(Source, Target).build().perform();
		
		//if u done all work on frame u need to come back of frame content to perform another actions by following methods
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//a[text()='Accept']")).getText());
		
		
			

	}

}
