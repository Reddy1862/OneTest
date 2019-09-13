import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputsFromExcel {

	
	 static String pathExcel = "D:\\Softwears\\Workspace Practice Selenium\\InputData.xlsx";
	 
	public String getData(int sheetNo , int rowNo , int columnNo) throws IOException{
		
		File file = new File(pathExcel);
		FileInputStream fileInputS = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fileInputS);
		XSSFSheet sheetExcel =  wb.getSheetAt(sheetNo);
		String getExcelData = sheetExcel.getRow(rowNo).getCell(columnNo).getStringCellValue().trim();
		return getExcelData;
					
	}	
}
