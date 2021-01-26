import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class BrowserTest {
	public static void main(String[] args ) throws InterruptedException
	{
		
		//		 System.out.println(projectPath);
		//		 System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
		//		 WebDriver firefoxdriver= new FirefoxDriver();
		//		 firefoxdriver.get("https://www.amazon.in/");
		//		 System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//	     WebDriver iedriver=new InternetExplorerDriver();
		//	     iedriver.get("https://www.amazon.in/"); 
		
		System.out.println("hello selenium");
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		GoogleSearchPage gp=new GoogleSearchPage(driver);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		gp.search_textbox_entervalue("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		List<WebElement> textboxs= driver.findElements(By.xpath("//input"));
		System.out.println(textboxs.size());
		
		
	}

}
