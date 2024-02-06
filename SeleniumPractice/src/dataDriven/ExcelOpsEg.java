package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionDriven.OrgHRMMethods;

public class ExcelOpsEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String xlPath = "D:\\BarghavaRecordings\\Workspace1\\SeleniumPractice\\src\\inputFiles\\TestData.xlsx";
		String xlOut = "D:\\BarghavaRecordings\\Workspace1\\SeleniumPractice\\src\\results\\EmpRes.xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(6);
//		XSSFCell c = r.getCell(2);
//		
//		String eid = c.getStringCellValue();
//		System.out.println(c);

		int rc = ws.getLastRowNum();
		System.out.println(rc);
		
		OrgHRMMethods om = new OrgHRMMethods();
		om.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		om.orgLogin("Admin", "Qedge123!@#");
		
		for(int i = 1; i <= rc; i++){
			XSSFRow r = ws.getRow(i);
			
			XSSFCell c = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			XSSFCell c2 = r.getCell(2);
			XSSFCell c3 = r.createCell(3);
			
			String f = c.getStringCellValue();
			String l = c1.getStringCellValue();
			String eid = c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"----"+eid);
			
			String res = om.orgEmpReg(f, l, eid);
			
			c3.setCellValue(res);
		}
		
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();
		
		om.orgLogout();
		om.orgClose();
		
		
	}

}
