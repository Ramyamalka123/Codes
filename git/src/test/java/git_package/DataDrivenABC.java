package git_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenABC {
	public static void main(String[] args) throws IOException {
		
	
	FileInputStream file=new FileInputStream("C:\\Users\\Malka Ramya\\OneDrive\\Documents\\testing tutorials\\Practice_datadriven_excel.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	int countrow =sheet.getLastRowNum();
	System.out.println("The numvber of row's:"+countrow);
	int cellcount=sheet.getRow(countrow).getLastCellNum();
	System.out.println("The cell numbers is:"+cellcount);
	for(int i=0;i<countrow;i++)
	{
		XSSFRow count=sheet.getRow(i);
		for(int j=0;j<cellcount;j++)
		{
			String data=count.getCell(j).toString();
			System.out.println(" | "+data);
		}
		System.out.println();
		///
	}
}

}
