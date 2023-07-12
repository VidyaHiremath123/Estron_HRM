package practiceObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyEmployeePage {
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link active']")
	private WebElement DashboardBtn;

	@FindBy(xpath="//div[@class='info-box']/div[@class='info-box-content']/span[2]")
	private WebElement DashboardEmpdata;

	public VerifyEmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

public WebElement getDashboardBtn() {
	return DashboardBtn;}

public WebElement getDashboarddata() {
	return DashboardEmpdata;
}


public String verifyDataIsReflecting() throws Throwable
{
	DashboardBtn.click();
	//Thread.sleep(3000);
	String data =DashboardEmpdata.getText();
	return data;
}
}
