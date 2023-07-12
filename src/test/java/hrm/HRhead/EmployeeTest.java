package hrm.HRhead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Estron.HRM.GenericUtility.BaseClass;
import com.Estron.HRM.GenericUtility.ExcelUtility;
import com.Estron.HRM.GenericUtility.WebDriverUtility;
import com.Estron.HRM.ObjectRepository.AddEmployeePage;
import com.Estron.HRM.ObjectRepository.EmployeeDashboardPage;
import com.Estron.HRM.ObjectRepository.EstronCorporateDashboardPage;
import com.Estron.HRM.ObjectRepository.EstronDashboardPage;
import com.Estron.HRM.ObjectRepository.EstronLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class EmployeeTest extends BaseClass{
	@Test(groups="SmokeSuite")
	public void  employeeTest() throws Throwable {

        WebDriverUtility wUtil=new WebDriverUtility();
		ExcelUtility eUtil=new ExcelUtility();
		wUtil.waitForPageLoad(driver);
		
		
		
		//Navigate to AddEmployee Page
		AddEmployeePage emp=new AddEmployeePage(driver);
		Thread.sleep(4000);
		emp.AddEmpPageNavigation();
		String COMPANYID=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","CompanyId");

		String FIRSTNAME=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","FirstName");

		String LASTNAME=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","LastName");

		String MIDDLENAME=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","MiddleName");

		String BRANCHESDATEFROM=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","BranchesDateFrom");

		String BRANCHESRECENTDATE=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","BranchesRecentDate");


		String POSITION=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","Position");

		String CONTACTNUMBER=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","ContactNumber");



		String SSS1=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","SSS");

		String TIN1=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","TIN");


		String HDMFPAGIBIG =eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","HDMF/Pag-ibig");


		String GSIS1=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_03","GSIS");
		emp.addEmp(wUtil,COMPANYID,FIRSTNAME,LASTNAME, MIDDLENAME, BRANCHESDATEFROM, BRANCHESRECENTDATE, POSITION, CONTACTNUMBER, SSS1, TIN1, HDMFPAGIBIG, GSIS1);
		Thread.sleep(3000);
		wUtil.swithToAlertWindowAndAccept(driver);
		Thread.sleep(3000);
		EmployeeDashboardPage edp=new EmployeeDashboardPage(driver);
		edp.editEmp(FIRSTNAME, wUtil);
		wUtil.swithToAlertWindowAndAccept(driver);
		edp.deleteEmp(FIRSTNAME);
		wUtil.swithToAlertWindowAndAccept(driver);
		

		//different xpath for Employee
		//		@FindBy(xpath="//p[contains(text(),'Employee')]")
		//		private WebElement Empbtn;
		//		
		//		
		//		@FindBy(xpath="//p[normalize-space()='Add Employee']")
		//		private WebElement EmpRadiobtn;
		//		
		//		@FindBy(xpath="//button[(contains(text(),'Add'))]")
		//		private WebElement AddEmpbtn;
		//		













	}

}
