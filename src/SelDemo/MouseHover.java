package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import library.utility;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cartrade.com/");
		WebElement Parent1=driver.findElement(By.xpath(".//*[@id='ct_menunew']/div[3]/ul/li[2]/a"));
		//utility.highLightElement(driver, Parent1);
		Actions act = new Actions(driver);
		act.moveToElement(Parent1).build().perform();
		Thread.sleep(2000);
		WebElement Parent2=driver.findElement(By.xpath(".//*[@id='ct_menunew']/div[3]/ul/li[2]/div/ul/li[1]/a"));
		//utility.highLightElement(driver, Parent2);
		act.moveToElement(Parent2).build().perform();
		Thread.sleep(2000);
		WebElement Child=driver.findElement(By.xpath(".//*[@id='ct_menunew']/div[3]/ul/li[2]/div/ul/li[1]/div/ul/li[1]/a"));
		//utility.highLightElement(driver, Child);
		act.moveToElement(Child).build().perform();
		act.moveToElement(Child).click().perform();

	}

}
