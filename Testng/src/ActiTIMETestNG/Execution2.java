package ActiTIMETestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Execution2 extends BaseClass {
	@Test
	public void tc_02() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		Thread.sleep(3000);
		List<WebElement> w=driver.findElements(By.xpath("//div[@class='name']"));
		for(int i=0;i<10;i++) {
			System.out.println(w.get(i).getText());
		}
		System.out.println("tc2 passed");
	}
}
