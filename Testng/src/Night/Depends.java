package Night;

import org.testng.annotations.Test;

public class Depends {
/*@Test(enabled=false)
public void moneyDeposit() {
	System.out.println("money deposited");
}
@Test(dependsOnMethods="moneyDeposit")
public void checkBalance() {
	System.out.println("balance checked");
}
@Test
public void withdraw() {
	System.out.println("money withdraw");
}*/
	@Test(invocationCount=10)
	public void add() {
		System.out.println("fghj");
	}
	@Test
	public void sum() {
		System.out.println("hjkl");
	}


}
