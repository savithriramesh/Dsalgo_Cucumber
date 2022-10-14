package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Getdata_excel {

	public static HashMap<String, String> storeValues = new HashMap<String, String>();

	public static List<HashMap<String, String>> readExcelDatafromFile(String filePath, String sheetName) {

		List<HashMap<String, String>> excelData = new ArrayList<HashMap<String, String>>();

		try {
			FileInputStream fs = new FileInputStream(filePath);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheet(sheetName);

			Row HeaderRow = sheet.getRow(0);

			for (int r = 1; r < sheet.getPhysicalNumberOfRows(); r++) {
				Row CurrentRow = sheet.getRow(r);
				HashMap<String, String> currentRowMap = new HashMap<String, String>();

				for (int c = 0; c < CurrentRow.getPhysicalNumberOfCells(); c++) {
					org.apache.poi.ss.usermodel.Cell CurrentCell = CurrentRow.getCell(c);
					System.out.print(CurrentCell.getStringCellValue() + "\t");
					currentRowMap.put(HeaderRow.getCell(c).getStringCellValue(), CurrentCell.getStringCellValue());
				}
				excelData.add(currentRowMap);
			}
			wb.close();
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return excelData;

	}

}
