package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.google.co.in/");
		WebElement tab= driver.findElement(By.xpath(".//*[@id='_eEe']/a[2]"));
		tab.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement ele= driver.findElement(By.linkText("English"));
		act.contextClick(ele).perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
