package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DataFromExelANDProperties {
public String propertiesdata(String name) throws Exception {
	FileInputStream f=new FileInputStream("C:\\Users\\saija\\Documents\\properties\\data.properties.txt");
	Properties p=new Properties();
	p.load(f);
	String dataName=p.getProperty(name);
	return dataName;
}

}
