package SelDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class dropdown {
	
	public static void main(String[] args)
	{
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\Automation Profile\\SELENIUM\\Misc\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    driver.manage().window().maximize();;
	   WebElement dropdown_month =  driver.findElement(By.xpath(".//*[@id='month']"));
	   
	   Select month=new Select(dropdown_month);
	    
	   WebElement default_selection=month.getFirstSelectedOption();
	   
	   String default_value=default_selection.getText();
	   
	   System.out.println("Default selection in Month Drop Down is "+default_value);
	   
	   month.selectByVisibleText("May");
	   
	   List <WebElement> selected_option = month.getAllSelectedOptions();
	   for (int i=0;i<selected_option.size();i++)
	   {
		   String all_selected=selected_option.get(i).getText();
		   System.out.println("Selected Month is " + all_selected);
	   }
	   
	   List <WebElement> all_option = month.getOptions();
	   System.out.println("All lised down options are : ");
	   int j;
	   for ( j=1;j<all_option.size();j++)
	   {
		   String listed_options=all_option.get(j).getText();
		   System.out.println( listed_options);
	   }
	   System.out.println( "Total no of values present in MONTH dropdown is " +(j-1));
	   driver.close();
	   }
	  
	}


