package SelDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class colsort {

	public static void main(String[] args) {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\SELENIUM\\Misc\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
	//inserting elements in first array list
	
	List<WebElement> app_list=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td[2]"));
	ArrayList<String> original_list= new ArrayList<String>();
	for(int i=0;i<app_list.size();i++)
	{
		WebElement ele=app_list.get(i);
		String col_txt=ele.getText();
		original_list.add(col_txt);
	}
	//inserting elements in second array list
	ArrayList<String> copied_list= new ArrayList<String>();
	for(int i=0;i<original_list.size();i++)
	{
		String captured_value=original_list.get(i);
		copied_list.add(captured_value);
	}
	
	//Collections.sort(copied_list);
	Collections.sort(copied_list,Collections.reverseOrder());
	System.out.println("Printing values present in List as present in Application");
	System.out.println(original_list);
	System.out.println("Printing values after sorting");
	System.out.println(copied_list);
	
	

	}

}
