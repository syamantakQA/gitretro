package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class popup {

	public static void main(String[] args) throws Exception {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "H:\\SELENIUM\\Misc\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@id='get_sign_up']")).click();
		Thread.sleep(15000);
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("29637415");
		driver.findElement(By.xpath("//button[@id='mobileSubmitBtn']")).click();
		String error_msg=driver.findElement(By.xpath("//span[@id='authMobileErrorMsg']")).getText();
		if(error_msg.equalsIgnoreCase("Please enter a valid mobile"))
		{
			System.out.println("Our Test case is passed");
		}
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		

	}

}
