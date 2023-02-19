package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Utilities {

 public String dataFromProperties(String name) throws Exception {
	  FileInputStream f=new FileInputStream("C:\\Users\\saija\\Documents\\properties\\data.properties.txt");
	  Properties p=new Properties();
	  p.load(f);
	  String z=p.getProperty(name);
	return z;
}
  public String dataFromExcel(String Sheet,int row,int cell) throws Exception {
	  FileInputStream f=new FileInputStream("C:\\Users\\saija\\Downloads\\reg.xlsx");
	  Workbook b=WorkbookFactory.create(f);
	  Sheet s=b.getSheet("Sheet1");
	  DataFormatter df=new DataFormatter();
	  String z=df.formatCellValue(s.getRow(row).getCell(cell));
	  return z;
  }
 
}
