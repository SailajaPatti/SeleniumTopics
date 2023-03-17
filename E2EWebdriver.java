import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2EWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. in this, first step is to find all links on a html page
		//remember 1 thing that any link should contain a anchor tag that is the HTML way defining or html property.
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2. need to get the links only on footer section how to acheive that shown below
		//so we need to keep the scope of selenium only on footer section
		//so that driver has the scope of all entire page rt since in that URL so we need to create mini driver which is scope of only footer section
		//so 1st find out generic xpath for footer section and put on a variable so that variable will act as a mini driver to be in scope of footer section
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3.I want to get only links in first column of footer section how to do check below 
		//the footerdriver is in driver so the required mini friver definately will inside the footer driver rt
		
		WebElement Columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(Columndriver.findElements(By.tagName("a")).size());
		
		//4.click on each link and find whether the tabs r working fine or not
		//for this we can write xpath of each link and click since the control is in that scope only rt but this is not good practice if the table is dynamic in future may be s
		//one more link will add rt so better to use loop concept here
		
		for(int i=1;i<Columndriver.findElements(By.tagName("a")).size();i++)
		{
			String KeepClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			Columndriver.findElements(By.tagName("a")).get(i).sendKeys(KeepClick); //till now clciking on each link is done after need to grab the title of each page
			
			// r u thinking it is going to work no bcz if it's clicked on first link then it will navigate to another tab there selenium will serach to clcik 2nd link which is not 
			//present in the 2nd tab it was there the actual link rt so u need to go back to page and need to click
			//we have a method navigat().back(); butit will take more time rt bcz need to click on link and again need to go back to click again it will take more time
			//so to achieve this if we click ctrl key and click on the link then it will open new tab but it will still stay same page only so we use keys method to click by holding Ctrl
		}
			Set <String> All=driver.getWindowHandles();//4 tabs-this is for to get titles of all windows
			Iterator<String> It=All.iterator();
			while(It.hasNext())  //checks if there is next window of current if yes will continue the loop if no it will exit from while loop.
				
			{
			
				System.out.println(driver.switchTo().window(It.next()).getTitle());
			}
		}
		
			

	}


