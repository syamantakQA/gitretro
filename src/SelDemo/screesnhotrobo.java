package SelDemo;


import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class screesnhotrobo {

	public static void main(String[] args) throws Exception {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	ImageIO.write(image, "png", new File("./Screenshots/redbus.png"));
	}

}
