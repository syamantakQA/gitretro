package SelDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import library.utility;



public class Exceltc {

	public static void main(String[] args) throws IOException  {
		
		
		ArrayList excel_data=utility.getdata("Add Profile");
		int counter=excel_data.size();
		for (int i=0;i<counter;i++)
		{
			System.out.println(excel_data.get(i));
			
		}
	}
	
}



