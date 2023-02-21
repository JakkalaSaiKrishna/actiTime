package ActiTIMETestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import Data.DataFromExelANDProperties;

public class BaseClass {
	DataFromExelANDProperties d=new DataFromExelANDProperties();
	public WebDriver driver;
	
	@BeforeSuite(alwaysRun=true)
	public void dbConnection() {
		System.out.println("connected successfully");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(String browser) throws Exception {
	String URL=(d.propertiesdata("url"));	
	 
	 if(browser.equalsIgnoreCase("fifefox")) {
			System.setProperty("webdriver.gecko.driver" ,"C:\\Users\\saija\\Documents\\properties\\geckodriver.exe");	
			driver=new FirefoxDriver();
	 }
	 if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver" ,"chromedriver.exe");	
			driver=new ChromeDriver();
			 }
	 
	driver.get(URL);
	driver.manage().window().maximize();
	System.out.println("browser lanched");
	}
	@BeforeMethod(alwaysRun=true)
	public void login() throws Exception {
		String USERNAME=(d.propertiesdata("username"));
		String PASSWORD=(d.propertiesdata("password"));
		
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		System.out.println("login successfull");
	}
	@AfterMethod(alwaysRun=true)
	public void logOut() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser closed");
	}
	
	@AfterSuite(alwaysRun=true)
	public void dbClose() {
		System.out.println("db closed");
	}
	

}
