package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// refer maven project - jame
public class ReadingData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("/Users/kishoremv/Downloads/test/testSpecificData.xlsx");
		Workbook WorkBook = WorkbookFactory.create(fis);
		Sheet sheet= WorkBook.getSheet("Data");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		}
}
