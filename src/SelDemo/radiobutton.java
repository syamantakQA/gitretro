package SelDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {
	
	public static void main(String[] args)
	{
       WebDriver driver = new FirefoxDriver();
       //driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	   WebElement radio_button =  driver.findElement(By.xpath(".//*[@id='u_0_i']"));
	   boolean display=radio_button.isDisplayed();
	   System.out.println("Is button getting displayed?"+display);
	   boolean status =radio_button.isEnabled();
	   System.out.println("Is button in enabled status?"+status);
	   boolean selected=radio_button.isSelected();
	   System.out.println("Is button is in selected status?"+selected);
	   radio_button.click();
	   boolean selected_after=radio_button.isSelected();
	   System.out.println("Is button is in selected status?"+selected_after);
	   //driver.close();
	   
}

}
