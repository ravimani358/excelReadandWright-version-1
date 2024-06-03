import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_write {

	public static void write(String file_path, String sheet_name) throws IOException {
		File fileName = new File(file_path);
		FileInputStream file = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(sheet_name);
		int rowCount = sheet.getLastRowNum();
	}
	
	public static void main(String[] args) throws IOException {
		String file_path = "C:\\Users\\RavishankarN\\eclips_respace\\Excel_action_read_right\\datafile\\excel.xlsx";
		String sheet_name = "Sheet1";
		write(file_path, sheet_name);

	}

}
