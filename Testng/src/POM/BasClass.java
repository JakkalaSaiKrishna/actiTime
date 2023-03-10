package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import Data.DataFromExelANDProperties;

public class BasClass {
	DataFromExelANDProperties d=new DataFromExelANDProperties();
	public WebDriver driver;
	
	@BeforeSuite
	public void dbConnection() {
		System.out.println("connected successfully");
	}
	
	@BeforeClass
	public void launchBrowser(String browser) throws Exception {
	String URL=(d.propertiesdata("url"));
			System.setProperty("webdriver.chrome.driver" ,"chromedriver.exe");	
			driver=new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	System.out.println("browser lanched");
	}
	@BeforeMethod
	public void login() throws Exception {
		String USERNAME=(d.propertiesdata("username"));
		String PASSWORD=(d.propertiesdata("password"));
		
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		System.out.println("login successfull");
	}
	@AfterMethod
	public void logOut() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser closed");
	}
	
	@AfterSuite
	public void dbClose() {
		System.out.println("db closed");
	}
	

}
