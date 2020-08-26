package SelDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		List<WebElement> run_col= driver.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
		for(int i=0;i<run_col.size()-2;i++)
		{
			WebElement ele=run_col.get(i);
			String run=ele.getText();
			System.out.println(run);
		}

	}

}
