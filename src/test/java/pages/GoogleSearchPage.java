package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    WebDriver driver=null;
    public GoogleSearchPage(WebDriver driver)
    {
    	this.driver=driver;
    }
	By search_textbox=By.name("q");
	public By search_button= By.name("btnK");
	By butn=By.name("bbadhg");
	
	public void search_textbox_entervalue(String text)
	{
		driver.findElement(search_textbox).sendKeys(text);
	}

	public void  click_search_button()
	{
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
}
