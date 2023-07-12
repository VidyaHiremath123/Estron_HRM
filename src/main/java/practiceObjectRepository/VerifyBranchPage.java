package practiceObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyBranchPage {
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link active']")
	private WebElement DashboardBtn;
	@FindBy(xpath="//span[.='Braches']/../span[@class='info-box-number']")
	private WebElement DashboardBranchdata;
	
	public VerifyBranchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getDashboardBtn() {
		return DashboardBtn;
	}
	public WebElement getDashboardBranchdata() {
		return DashboardBranchdata;
	}
	
	//Business Library
	
	public String verifyBranch() {
		DashboardBtn.click();
		//Thread.sleep(3000);
		String data =DashboardBranchdata.getText();
		return data;
	}



}
