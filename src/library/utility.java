package library;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public  class utility 
{
	
	public static void  capturescreenshots(WebDriver driver, String screenshotname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname+".png"));
		} catch (Exception e) {
		
		System.out.println("Error message is"+e.getMessage());
		}
	}
		
		
		public static void  robotcapturescreenshots(String screenshotname) throws Exception, Exception
		{
			
			
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		    ImageIO.write(image, "png", new File("C:\\Selenium Screenshots\\"+screenshotname+ ".png"));
			
}
		
		
		public static void highLightElement(WebDriver driver, WebElement element)
		{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
		try 
		{
		Thread.sleep(500);
		} 
		catch (InterruptedException e) {
		
		System.out.println(e.getMessage());
		} 
		
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
		
		}	
		
		
		
public static ArrayList<String> getdata(String testcasename) throws IOException
		{
			
			
		// get access of the sheet within the workbook where test data is placed
		FileInputStream fis= new FileInputStream("H:\\SELENIUM\\Framework Components\\APACHE POI API\\demosheet.xlsx");
		XSSFWorkbook wkbook= new XSSFWorkbook(fis);
		int sheet_count=wkbook.getNumberOfSheets();
		DataFormatter formatter = new DataFormatter(); 
		ArrayList<String> al=new ArrayList<String>();
							
		for (int i=0;i<sheet_count;i++)
			{
				if (wkbook.getSheetName(i).equalsIgnoreCase("demo3"))
								{
									XSSFSheet working_sheet=wkbook.getSheetAt(i);//access to sheet is achieved
									
									// trying to get hold of the column which has heading as TestCase.
									
									Iterator<Row> rows=working_sheet.rowIterator();
									Row first_row=rows.next();//access to first row is achieved
									
									//iterating all cells of first row to identify which column is having detail as TestCase.
									int counter=0,column=0;
									Iterator<Cell> cells=first_row.cellIterator();
									while(cells.hasNext())
									{
										Cell value=cells.next();
										if (value.getStringCellValue().equalsIgnoreCase("TestCase"))
										{
											column=counter;
										}
										counter++;
									}
									//iterating all rows within the desired column
									while(rows.hasNext())
									{
										Row rw =rows.next();
										if (rw.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
										{
											Iterator<Cell> cl=rw.cellIterator();
											while(cl.hasNext())
											{
												Cell cls=cl.next();
												//System.out.println(formatter.formatCellValue(cls));
												al.add(formatter.formatCellValue(cls));
												
											}
										}
										
									}
									
								}
							}
							
		return al;
						}


					}
					

						
				
                


		
	
		



