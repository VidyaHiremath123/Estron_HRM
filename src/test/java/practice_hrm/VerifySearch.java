package practice_hrm;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Estron.HRM.GenericUtility.BaseClass;
import com.Estron.HRM.GenericUtility.ExcelUtility;
import com.Estron.HRM.GenericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
import practiceObjectRepository.BranchPage;
import practiceObjectRepository.HomePage;
import practiceObjectRepository.VerifyBranchPage;

public class VerifySearch extends BaseClass{
	@Test
	public void verifySearch() throws Throwable, Throwable {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		WebDriverUtility wUtil=new WebDriverUtility();
		ExcelUtility eUtil=new ExcelUtility();
		 
       BranchPage bp=new BranchPage(driver);
	        HomePage hp=new HomePage(driver);
//			String value=vp.verifyBranch();
			
			wUtil.waitForPageLoad(driver);
			
			// System.out.println(value);
		       // int intValue=Integer.parseInt(value);
		    	String BRANCH_NAME=eUtil.getDataFromExcelBasedTestId("./src/test/resources/ScriptData/HRM_SCRIPT_DATA.xlsx","Corporate","TC_02","BranchName");
		        hp.navigateToBranch();
				bp.addBranch(BRANCH_NAME);

		
		
		
		 List<WebElement> a= driver.findElements(By.xpath("//tbody/tr[1]/td[2]"));
	    int rowCount=a.size();
		
		
	}

}
