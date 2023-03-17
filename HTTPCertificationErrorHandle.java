import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPCertificationErrorHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//The URL which is not in HTTP scope which the ui which are internal to project or specific conditions then we get Advanced button rt so we can achieve those for automation
		//without clicking manually
		
		//there is a class to set Chrome behaviour by using ChromeOptions class 
		//so it tells the browser that whenever there is any certification errors in ChromeBrowser pls accept those 
		
		ChromeOptions options= new ChromeOptions();
		 options.setAcceptInsecureCerts(true);
		 
		 //also we need to pass the that options object as a paramater into chromedriver class then only chromedriver has knowledge what u set on top
		//also if we want to set proxy to our browser we can set it by using Proxy class in java
		 //so if company came across the proxy server requirement u need to set proxy to browser rt
		 Proxy proxy=new Proxy(); //import the pkg which selenium supports
		 proxy.setHttpProxy("HTTP ADRESS-PORT NO");//U need to pass the sting which company provides which means ip address and port no
		 //setHTTP is method to set which type of proxy it is whether it http or ftp etc
		 //finally u need to access through options object for selenium to understand
		 
		 options.setCapability("proxy", proxy);
		 //so u need to pass the proxy object as a sting in the setCapability method so that extract address as a object 
		 
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://expired.badssl.com/");
		 System.out.println(driver.getTitle());
		 
		 //same way we can do for other browsers also FirefoxOptions and EdgeOptions() classes etc
		 //2.whenever we want plugins for Automated browsers which means it opens freshly rt but might required plugin which r in out actual browser then also we can achieve
		 //we need to download the file and need to give the path of the file in the method
		 //so finally we read all capabilities of chrome by the ChromeOptions Class can read on https://chromedriver.chromium.org/capabilities 
		 //there is a possibility to block all pop ups sometimes it will ask allow pop ups rt also if there is any file download need and if u want to keep that in a specific 
		 //directory u can also achieve by providing some code and path to where it needs to download
		
	}

}
