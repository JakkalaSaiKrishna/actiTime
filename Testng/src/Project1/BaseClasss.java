package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClasss {

		PropertiesDAta p=new PropertiesDAta();
		WebDriver d;
		@BeforeSuite
		public void dbConnect() {
			System.out.println("db connected");
		}
		@BeforeClass
		public void OpenBrowser() throws Exception {
			d=new ChromeDriver();
			String URL=p.data("url");
			d.get(URL);
			System.out.println("browser opened");
			
		}
		@BeforeMethod
		public void loginCredential() throws Exception {
			String USERNAME=(p.data("username"));
			String PASSWORD=(p.data("password"));
			
			/*d.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME);
			d.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PASSWORD);
			d.findElement(By.linkText("Login")).click();
			System.out.println("login success");*/
			LoginPageOM1 l=new LoginPageOM1(d);
			Thread.sleep(2000);
			l.login(USERNAME,PASSWORD);
			System.out.println("login completed");			
			Thread.sleep(5000);
		}
		@AfterMethod
		public void logOut() throws Exception {
			Thread.sleep(5000);
			d.findElement(By.linkText("Logout")).click();
			System.out.println("logout successful");
		}
		@AfterClass
		public void quitBrowser() {
			d.quit();
			System.out.println("quit browswer");
		}
		@AfterSuite
		public void dbClose() {
			System.out.println("db closed");
		}

	}


