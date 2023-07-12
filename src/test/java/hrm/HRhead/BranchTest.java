package hrm.HRhead;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Estron.HRM.GenericUtility.BaseClass;
import com.Estron.HRM.GenericUtility.ExcelUtility;
import com.Estron.HRM.GenericUtility.PropertyFileUtility;
import com.Estron.HRM.GenericUtility.WebDriverUtility;
import com.Estron.HRM.ObjectRepository.EstronCorporateDashboardPage;
import com.Estron.HRM.ObjectRepository.EstronDashboardPage;
import com.Estron.HRM.ObjectRepository.EstronLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import practiceObjectRepository.BranchPage;
import practiceObjectRepository.HomePage;
import practiceObjectRepository.VerifyBranchPage;


@Listeners(com.Estron.HRM.GenericUtility.ListenersImplementation.class)
public class BranchTest extends BaseClass{
	
	@Test
	
	
	public void branchtest() throws Throwable {
		
		ExcelUtility eUtil=new ExcelUtility();
	    WebDriverUtility wUtil=new WebDriverUtility();
	    
        VerifyBranchPage vp=new VerifyBranchPage(driver);
        BranchPage bp=new BranchPage(driver);
        HomePage hp=new HomePage(driver);
		String value=vp.verifyBranch();
		
		wUtil.waitForPageLoad(driver);
		
		 System.out.println(value);
	        int intValue=Integer.parseInt(value);

		String BRANCH_NAME=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_02","BranchName");
		
		hp.navigateToBranch();
		//Assert.fail();
		bp.addBranch(BRANCH_NAME);
		wUtil.swithToAlertWindowAndAccept(driver);
		bp.editBranchName(BRANCH_NAME);
		wUtil.swithToAlertWindowAndAccept(driver);
	
		String value1=vp.verifyBranch();
		 System.out.println(value1);
	        int intValue1=Integer.parseInt(value1);
	        
	        Assert.assertEquals(intValue1==(intValue+1),"Failed");
	        
	        
	     
	         hp.navigateToBranch();
	        
	         bp.search(BRANCH_NAME);
	         
	         wUtil.scroll(driver);
	         bp.deleteBranchName();
			wUtil.swithToAlertWindowAndAccept(driver);
			
			

	         
	        //BranchPage bp=new BranchPage();
	        //bp.navigateToSearch(BRANCH_NAME);
	        

}
	public void demo(){
		System.out.println("demo is printing");
	}


}
