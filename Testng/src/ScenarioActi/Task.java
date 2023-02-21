package ScenarioActi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ActiTIMETestNG.BaseClass;

public class Task extends BaseClass {
   @Test(groups= {"smoke","regression"})
   public void Task1() throws Exception {
	   Thread.sleep(5000);
   driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		   System.out.println("task");
}
}
