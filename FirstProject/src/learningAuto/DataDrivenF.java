package learningAuto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenF {
	
	
	public void readExcel() throws IOException {
		FileInputStream excel=new FileInputStream("E:\\Automation\\TestData.xlsx");
		Workbook workbook = new XSSFWorkbook(excel);
		Sheet sheet= workbook.getSheet("Sheet1");
		Iterator<Row> rowiterator= sheet.iterator();
		while (rowiterator.hasNext()) {
			Row row =  rowiterator.next();
			
			Iterator<Cell> columnIterator =row.iterator();
			while (columnIterator.hasNext()) {
				Cell cell = columnIterator.next();
				System.out.println(cell);
			}
			
		}
	}

	public static void main(String[] args) throws IOException {
		DataDrivenF usingPOI=new DataDrivenF();
		usingPOI.readExcel();
		ExtendExample abc=new ExtendExample();
		abc.examplechk();

	}

}
