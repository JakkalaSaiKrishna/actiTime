package ScenarioActi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ActiTIMETestNG.BaseClass;

public class Reports extends BaseClass {

	@Test(groups= {"smoke"})
	public void reports() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		System.out.println("reports");
	}
}
