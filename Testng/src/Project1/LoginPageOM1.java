package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageOM1 {
	
		@FindBy(xpath="//input[@name='username']")
		private WebElement userName;
	
		@FindBy(xpath="//input[@name='pwd']")
		private WebElement passWord;
		
		@FindBy(id="loginButton")
		private WebElement loginBtn;
		
		public LoginPageOM1(WebDriver d) {
			PageFactory.initElements(d,this);
			
		}

		public WebElement getUserName() {
			return userName;
		}

		public WebElement getPassWord() {
			return passWord;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		public  void login(String username,String password) throws Exception {
			getUserName().sendKeys(username);
			getPassWord().sendKeys(password);
			Thread.sleep(3000);
			getLoginBtn().click();
		}
		
	}


