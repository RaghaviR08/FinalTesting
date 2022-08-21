package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAction {

	public static void main(String[] args) throws IOException {
		ExcelAction excel = new ExcelAction();
		excel.readExcel();
	}
	
	public void readExcel() throws IOException {
		//FileInputStream excel=new FileInputStream();
		try {
			FileInputStream excel = new FileInputStream("E:\\Automation\\RunManager.xlsx");
			Workbook workbook = new XSSFWorkbook(excel);			
			Sheet sheet = (Sheet) workbook.getSheet("Sheet1");
			Iterator<Row> rowiterator = sheet.iterator();
			while (rowiterator.hasNext()) {
				Row rowVal = rowiterator.next();
				Iterator<Cell> columnIterator = rowVal.iterator();
				while (columnIterator.hasNext()) {
					Cell cellVal = columnIterator.next();
					System.out.println(cellVal);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
