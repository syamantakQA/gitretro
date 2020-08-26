package SelDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggestivedrpdwn {

	public static void main(String[] args) throws Exception {
		
		/*System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("BENG");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.UP);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String executor="return document.getElementById(\"src\").value;";
		String origin_city=(String) js.executeScript(executor);
		System.out.println(origin_city);
		int counter=0;
		while (!origin_city.equalsIgnoreCase("Cooch Behar (West Bengal)"))
		{   
			counter++;
			driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
			origin_city=(String) js.executeScript(executor);
			System.out.println(origin_city);
			if (counter>=100)
			{
				break;
			}
			
		}
		


	}

}
