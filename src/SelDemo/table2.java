package SelDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.espncricinfo.com/series/14396/scorecard/282688/bangladesh-vs-india-1st-odi-india-tour-of-bangladesh-2007");
		List<WebElement> run_col= driver.findElements(By.xpath("//div[@class='match-scorecard-page']/div/div[1]/div[@class='Collapsible']/div/div[@class='Collapsible__contentInner']/div/table[@class='table batsman']/tbody/tr/td[3]"));
		int total_run=0;
		for(int i=0;i<run_col.size();i++)
		{
			WebElement ele=run_col.get(i);
			String run=ele.getText();
			int run_int=Integer.parseInt(run);
			total_run=total_run+run_int;
		}
		System.out.println("Total run scored by First batting team is "+total_run);
       
       List<WebElement> run_col_secondinng= driver.findElements(By.xpath("//div[@class='match-scorecard-page']/div/div[2]/div[@class='Collapsible']/div/div[@class='Collapsible__contentInner']/div/table[@class='table batsman']/tbody/tr/td[3]"));
       int total_run_seconding=0;
		for(int i=0;i<run_col_secondinng.size();i++)
		{
			WebElement ele=run_col_secondinng.get(i);
			String run_secondinning=ele.getText();
			int run_int_seocndinning=Integer.parseInt(run_secondinning);
			total_run_seconding=total_run_seconding+run_int_seocndinning;
		}
		
      System.out.println("Total run scored by Second batting team is "+total_run_seconding);
	}

}
