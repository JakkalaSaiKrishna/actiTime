package Project1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_01 extends BaseClasss {
	@Test
	public void tasks() {
		d.findElement(By.id("container_tasks")).click();
	}
  
}
