package SelDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshotsample {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/redbus.png"));
		System.out.println("done");
		driver.close();
		
	}

}
