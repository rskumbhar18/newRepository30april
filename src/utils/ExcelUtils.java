package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static void main(String[] args) {
		//getRowCount();
		getCellData(0, 0);
		getCellDataNumber(1, 1);
	}

	public ExcelUtils(){
		
	}	
	
	public static void getRowCount() {
		
		
		try{
		
			String projectpath = System.getProperty("user.dir");
			//XSSFWorkbook wb = new XSSFWorkbook(projectpath+"\\Excel\\data.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\com\\Reshma_Automation_Workspace\\ReshmaSeleniumProject\\Excel\\data.xlsx");
			XSSFSheet sheet = wb.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows :"+rowCount);
		
		}catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		}
		public static void getCellData(int rowNum, int colNum){
			try{
			String projectpath = System.getProperty("user.dir");
			//XSSFWorkbook wb = new XSSFWorkbook(projectpath+"\\Excel\\data.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\com\\Reshma_Automation_Workspace\\ReshmaSeleniumProject\\Excel\\data.xlsx");
			XSSFSheet sheet = wb.getSheet("Sheet1");
			
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell Data :"+cellData);
			
			}catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
		}
		
		public static void getCellDataNumber(int rowNum, int colNum){
			try{
			String projectpath = System.getProperty("user.dir");
			//XSSFWorkbook wb = new XSSFWorkbook(projectpath+"\\Excel\\data.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\com\\Reshma_Automation_Workspace\\ReshmaSeleniumProject\\Excel\\data.xlsx");
			XSSFSheet sheet = wb.getSheet("Sheet1");
			
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell Data :"+cellData);
			
			}catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
		}
}

