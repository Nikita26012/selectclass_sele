package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.automationtesting.in/Register.html");
		
		WebElement Day=dr.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select sel=new Select(Day);
		sel.selectByIndex(6);
		Thread.sleep(1000);
		
		Select sel1=new Select(dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		sel1.selectByValue("March");
		List<WebElement> a1=sel1.getOptions();
		for(WebElement x: a1)
		{
			String g=x.getText();
			System.out.println(g);
		}
		Thread.sleep(1000);
		
		Select sel2=new Select(dr.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		sel2.selectByIndex(6);
		List<WebElement> a2=dr.findElements(By.xpath("//*[@id=\"yearbox\"]"));
		for(WebElement s: a2)
		{
			String p=s.getText();
			System.out.println(p);
		}
		
		
		
	}
}