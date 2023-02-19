package utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import baseClass.Base_Utilities;

public class ScreenShot {
public void screenShots() throws Exception {
	TakesScreenshot ts=(TakesScreenshot)Base_Utilities.d;
	File src=ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Eclipse\\Real_Project\\ActiTime\\Screenshots\\sai.png");
	Files.copy(src, dest);
	
}
}
