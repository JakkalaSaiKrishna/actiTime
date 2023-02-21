package Project1;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDAta {

	public String data(String input) throws Exception {
		FileInputStream f=new FileInputStream("C:\\Users\\saija\\Documents\\properties\\keys.properties.txt");
		Properties p=new Properties();
		p.load(f);
		String info=p.getProperty(input);
		return info;

	}

}
