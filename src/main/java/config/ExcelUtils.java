package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtils {

	private static WebDriver driver;
	private static Workbook wb=null;
	private static Sheet sh;
	private static Row row;
	private static Cell cell;
	private static FileInputStream is;

	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {

			String fileType = Path.substring(Path.indexOf("."));
			File f = new File(Path);
			is = new FileInputStream(f);
			if (fileType.equals(".xls"))
				wb = new HSSFWorkbook(is);
			else if (fileType.equals(".xlsx"))
				wb = new XSSFWorkbook(is);

			sh = wb.getSheet(SheetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void setCellData(String Path, String Result, int RowNum, int ColNum) throws Exception {

		try {
			row = sh.getRow(RowNum);
			cell = row.getCell(ColNum);

			if (cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(Result);

			} else {
				// Cell = Row.createCell(ColNum+2);
				cell.setCellValue(Result);
			}

			FileOutputStream fileOut = new FileOutputStream(Path);

			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String getCellData(int intRowNum, int intCellNum) throws IOException {

		try {
			cell = sh.getRow(intRowNum).getCell(intCellNum);
			String CellData = cell.getStringCellValue(); // getStringCellValue() method : To read String value

			return CellData;
		} catch (Exception e) {
			
			int CellIntData =(int)cell.getNumericCellValue();
			String CellStrData =String.valueOf(CellIntData);
			return CellStrData;
			
		}
	}
	public static int getRowCount(String sheetName) {
		int index = wb.getSheetIndex(sheetName);
		sh = wb.getSheetAt(index);
		int number = sh.getLastRowNum() + 1;

		return number;
	}
	public static int getColumnCount(String sheetName) {

		sh = wb.getSheet(sheetName);
		row = sh.getRow(0);

		return row.getLastCellNum();

	}
}
