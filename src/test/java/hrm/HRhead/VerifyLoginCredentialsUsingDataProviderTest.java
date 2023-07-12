package hrm.HRhead;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Estron.HRM.GenericUtility.BaseClass;
import com.Estron.HRM.GenericUtility.ExcelUtility;
import com.Estron.HRM.GenericUtility.PropertyFileUtility;
import com.Estron.HRM.GenericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginCredentialsUsingDataProviderTest extends BaseClass{
	
	@Test(dataProvider = "getdata")
	public void verifyLoginCredentials(String username, String password) throws Throwable {
	
	 PropertyFileUtility pUtil=new PropertyFileUtility();
		
WebDriverUtility wUtil=new WebDriverUtility();
	
	String  URL =pUtil.readDataFromPropertyFile("url");
	String BROWSER=pUtil.readDataFromPropertyFile("browser");
	
	
	System.out.println(username);
	System.out.println(password);
	// Step 3: Launch the Browser - RUNTIME POLYMORPHISM
	if (BROWSER.equalsIgnoreCase("chrome")) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if (BROWSER.equalsIgnoreCase("firefox")) 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	} 
	else if (BROWSER.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else 
	{

		System.out.println("invalid browser name");
	}
	driver.manage().window().maximize();
	driver.get(URL);
	 driver.findElement(By.xpath("//input[@name='hr_email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='hr_password']")).sendKeys(password);
	WebElement a=driver.findElement(By.xpath("//select[@id='hr_type']"));
	wUtil.HandleDropDownByValue(a,"HR Head");
	driver.findElement(By.xpath("//button[.='Sign In']"));
	}
	@DataProvider
	public Object[][] getdata() throws Throwable, Throwable
	{
		ExcelUtility eUtil=new ExcelUtility();
		Object[][] obj=new Object[3][2];
		obj[0][0]=eUtil.getDataFromExcelBasedTestId("./TestData/LoginDataprovider.xlsx","a1","1","username");
		obj[0][1]=eUtil.getDataFromExcelBasedTestId("./TestData/LoginDataprovider.xlsx","a1","1","password");
		
		obj[1][0]=eUtil.getDataFromExcelBasedTestId("./TestData/LoginDataprovider.xlsx","a1","2","username");
		obj[1][1]=eUtil.getDataFromExcelBasedTestId("./TestData/LoginDataprovider.xlsx","a1","2","password");
		
		obj[2][0]=eUtil.getDataFromExcelBasedTestId("./TestData/LoginDataprovider.xlsx","a1","3","username");
		obj[2][1]=eUtil.getDataFromExcelBasedTestId("./TestData/LoginDataprovider.xlsx","a1","3","password");
		return obj;
		
	}

}
