package hrm.HRhead;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Estron.HRM.GenericUtility.BaseClass;
import com.Estron.HRM.GenericUtility.ExcelUtility;
import com.Estron.HRM.GenericUtility.PropertyFileUtility;
import com.Estron.HRM.GenericUtility.WebDriverUtility;
import com.Estron.HRM.ObjectRepository.EstronAddCorporateNamePage;
import com.Estron.HRM.ObjectRepository.EstronCorporateDashboardPage;
import com.Estron.HRM.ObjectRepository.EstronDashboardPage;
import com.Estron.HRM.ObjectRepository.EstronLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CorporateTest extends BaseClass
{
	@Test(groups="RegionalRegressionSuite")
	public void corporateTest() throws Throwable {
		
		WebDriverUtility wUtil=new WebDriverUtility();
		ExcelUtility eUtil=new ExcelUtility();
       

		
		wUtil.waitForPageLoad(driver);
		//Login To application
		
		
		//Corporate Page
		EstronDashboardPage ecp= new EstronDashboardPage(driver);
		ecp.addCorporate();
		//Add CorporateNamePage
		String CORPORATE_NAME=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx", "Corporate", "TC_01", "CorporateName");	
		EstronAddCorporateNamePage acnp=new EstronAddCorporateNamePage(driver);
		acnp.addCorporateName(CORPORATE_NAME);
		wUtil.swithToAlertWindowAndAccept(driver);
		//SearchForCorporateName,Edit
		EstronCorporateDashboardPage cdp=new EstronCorporateDashboardPage(driver);
		Thread.sleep(3000);
		cdp.addCorporateEdit(CORPORATE_NAME);
		wUtil.swithToAlertWindowAndAccept(driver );
		//LogOut From App
		





	}

}
