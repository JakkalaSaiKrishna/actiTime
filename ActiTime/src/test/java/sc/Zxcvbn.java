package sc;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Zxcvbn {

	public static void main(String[] args) throws Exception {
		String name="sai";
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\saija\\Downloads\\chromedriver_win32109\\chromedriver.exe");
	     WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("sa");
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Eclipse\\Real_Project\\ActiTime\\Screenshots\\"+name+".png");
		Files.copy(src, dest);
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("sdfghj");
		d.findElement(By.xpath("//div[text()='Login']")).click();
	}

}
