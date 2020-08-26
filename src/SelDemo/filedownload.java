package SelDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import library.utility;

public class filedownload {

	public static void main(String[] args) throws InterruptedException, Throwable {
	Runtime.getRuntime().exec("D:\\AutoIT Scripts\\FileDownload_parameter2.exe"+" "+ "https://selenium-release.storage.googleapis.com/3.141/selenium-server-standalone-3.141.59.jar"+" "+ "C:\\Users\\Syamantak\\Downloads\\Syamantak.jar");
	}

}
