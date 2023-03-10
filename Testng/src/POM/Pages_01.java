package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages_01 {
      
    	 @FindBy(xpath="input[@class='username']")
    	 private WebElement USERNAME;
    	 
    	 @FindBy(xpath="input[@class='pwd']")
    	 private WebElement PWD;
     
    	 @FindBy(xpath="div[text()='Login']")
    	 private WebElement LOGIN;
    	 
    	 public Pages_01(WebElement d) {
    		 PageFactory.initElements(d,this);
    		 
    	 }
    	 
    	 public WebElement getUserName() {
    		 return USERNAME;
    	 }
    	 public WebElement getUserPwd() {
    		 return PWD;
    	 }
    	 public WebElement getUserLogin() {
    		 return LOGIN;
    	 }
 
    	 public void login(String Uname,String pwd) {
    		 getUserName().sendKeys("admin");
    		 getUserPwd().sendKeys("manager");
    		 getUserLogin().click();
    	 }
     
    	 
    	 
    	 
    	 
    	 
    	 
    	 
}
