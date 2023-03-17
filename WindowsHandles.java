import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//so it will navigate another page rt as part of this automation projectt so u need to tell seelmiun
		//how many windows are opened and which window u r there to perform anything need to tell that by 
		//some methods using in selenium
		
		Set <String> AllSet = driver.getWindowHandles();
		//this AllSET variable contains the parent and child windows which is going to open as part of this automation
		//after u need to iterate the windows rt to go into parent or child like that so there is a iterate method for that
		
		Iterator <String> It=AllSet.iterator();
		
		//so that variable It can go and search extract the values or windows from set data structure which is stored all windows
		
		String Parent = It.next();
		//this method go to the first index of the set if u use one more method next then it will go to the next index which means child
		
		String Child = It.next();
		//now it is child window
	 
		//so now we need to switch to another window by passing child string in a method to get in the child window
		
		driver.switchTo().window(Child);
		//finally it is in child window
		//so now u need to grab that maild id and goto the parent and put in username rt follow the steps
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String Emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(Parent);
		driver.findElement(By.id("username")).sendKeys(Emailid);
		//Program to get desired window
		String WindowTitle="";
		ArrayList<String> list=new ArrayList<String>(AllSet);
		for(String e: list) {
			driver.switchTo().window(e).getTitle().equals(WindowTitle);
			System.out.println("found window");
			
		}
		Set<String> windows=driver.getWindowHandles();   //to get all windows
		ArrayList<String> list1=new ArrayList<>(windows);
		driver.switchTo().window(list1.get(0));   //so u can use ur required number by providing as index no to go into that window
		//or if u want to go through the as per the title
		String ReqTitle="";
		for(String window:windows) {
			driver.switchTo().window(window).getTitle().equalsIgnoreCase(ReqTitle);
			break; //we will reach required page
			
		}
		
		
		//driver.getWindowHandle  //this is to get parent window
		String reqwindow=driver.getWindowHandle();
		
		}

}
