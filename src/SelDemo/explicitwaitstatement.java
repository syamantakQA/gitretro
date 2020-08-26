package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitstatement {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
		ele.click();
		WebDriverWait waitmin =new WebDriverWait(driver, 20);
		WebElement ele2=waitmin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        Boolean ele3= ele2.isDisplayed();
		if(ele3)
        {
			System.out.println("Element is Displayed");
        }
	
        else
        	
        {
        	System.out.println("Element is NOT Displayed");
        }
        
        }

}
