import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class WebTablesSortingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//1.click on the column to sort--sorting happens if u click on header
		driver.findElement(By.xpath("//tr//th[1]")).click();
		//2.capture all webelemnets 
		List<WebElement> WebElementlist=driver.findElements(By.xpath("//tr/td[1]"));
		//3.get the text of all webElemts for this needs for loop for each but we can achieve by using streams conecept
		
		/*
		for(int i=0;i<driver.findElements(By.xpath("//tr/td[1]")).size();i++)
		{
			String Text = driver.findElements(By.xpath("//tr/td[1]")).get(i).getText();
			System.out.println(Text); 
		}*/
		
		//like above
		//but we can achieve by using streams
	   List	<String> ListOfText=WebElementlist.stream().map(s->s.getText()).collect(Collectors.toList());
	   //4.now we can sort by using stream() concept and check whether it sorted or not
	   
	  List<String>  SortedList=ListOfText.stream().sorted().collect(Collectors.toList());
	  
	  //5.Assert whether both are correct or not
	  
	  Assert.assertTrue(ListOfText.equals(SortedList));
	  
	  //2nd sce-get the price of vegtable of specified--we can achieve by using customized methods
	  List<Object> PriceValue;
	 do
	 {
		 List<WebElement> Elementlist=driver.findElements(By.xpath("//tr/td[1]"));
	 PriceValue=  Elementlist.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
	  PriceValue.forEach(s->System.out.println(s));
	  if(PriceValue.size()<1) {
		  driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	  }
	  }while(PriceValue.size()<1); //it will exit when the condition becomes true
	 
}
	

	private static Object getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String Price= s.findElement(By.xpath("following-sibling::td[1]")).getText(); //since s has access till beans by above statement
		return Price;
		
	}}

