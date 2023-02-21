package Project1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_02 extends BaseClasss {
 @Test
 public void reports() throws InterruptedException {
	 Thread.sleep(3000);
	 d.findElement(By.id("container_reports")).click();
 }
}
