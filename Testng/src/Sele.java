import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sele {
  @Test
public void run() {
	  System.out.println("testcase");
}
  @BeforeTest
  public void walk() {
	  System.out.println("befor test");
  }
  @AfterTest
  public void left() {
	  System.out.println("after test");
  }
}
