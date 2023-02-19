package baseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utilities.Data_Utilities;
import utilities.ScreenShot;

public class Base_Utilities {
	 public static WebDriver d;
	 Data_Utilities da=new Data_Utilities();
	 ScreenShot sc=new ScreenShot();
   @BeforeSuite
   public void dataBaseConn() {
	   System.out.println("db connected");
   }
  
   @BeforeClass
   public void browserLaunch() throws Exception {
	   String URL=da.dataFromProperties("url");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\saija\\Downloads\\chromedriver_win32109\\chromedriver.exe");
       d=new ChromeDriver();
       d.get(URL);
       System.out.println("url");
       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
   }
   
   @BeforeMethod
   public void login() throws Exception {
	   d.findElement(By.xpath("//input[@name='username']")).sendKeys(da.dataFromProperties("username"));
	  // sc.screenShots();
	   d.findElement(By.xpath("//input[@name='pwd']")).sendKeys(da.dataFromProperties("password"));
	   d.findElement(By.linkText("Login")).click();
	   Thread.sleep(3000);
	   System.out.println("login");
   }
   @AfterMethod
   public void logOut() {
	   d.findElement(By.xpath("//a[text()='Logout']")).click();
	   System.out.println("logout");
   }
   
   @AfterClass
   public void quitBrowser() {
	   d.quit();
	   System.out.println("quit");
   }
   
   @AfterSuite
   public void dataBaseClose() {
	   System.out.println("db closed");
   }
}
