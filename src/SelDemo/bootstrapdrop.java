package SelDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bootstrapdrop {

	public static void main(String[] args) throws Exception {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "H:\\SELENIUM\\Misc\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
	    WebElement lang =  driver.findElement(By.xpath("//*[@id='lang-chooser']/div[1]/div[2]/div"));
	    lang.click();
	    Thread.sleep(5000);
	    List<WebElement> app_dd=driver.findElements(By.xpath("//div[@jsname='V68bde']//div/span"));
	    System.out.println("No of available languages are  "+app_dd.size());
	    for (int i=0;i<=app_dd.size();i++)
	    {
	    	WebElement ele=app_dd.get(i);
	    	String avail_lang=ele.getAttribute("innerHTML");
	    	System.out.println(avail_lang);
	    	
	    	if(avail_lang.contains("Afrikaans"))
	    	{
	    		ele.click();
	    		
	    		break;
	    		
	    	}
	    
	    }

	}
}

