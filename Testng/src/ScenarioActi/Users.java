package ScenarioActi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ActiTIMETestNG.BaseClass;

public class Users extends BaseClass {
  @Test(groups= {"regression"})
  public void users() throws Exception {
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//div[@id='container_users']")).click(); 
	 System.out.println("users completed");
  }
}
