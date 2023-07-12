package practice_hrm;

import org.testng.annotations.Test;

import com.Estron.HRM.GenericUtility.ExcelUtility;

public class Dataproviderexcel {
	@Test
	public void dataprovider1() throws Throwable, Throwable{
		ExcelUtility ed=new ExcelUtility();
		String data1=ed.getDataFromExcel("./TestData/dataprovider.xlsx", "dp", 1, 0);
		String data2=ed.getDataFromExcel("./TestData/dataprovider.xlsx", "dp", 1, 1);
		String data3=ed.getDataFromExcel("./TestData/dataprovider.xlsx", "dp", 1, 2);
		String data4=ed.getDataFromExcel("./TestData/dataprovider.xlsx", "dp", 1, 3);
		System.out.println(data2);
		
		
	}
	

}
