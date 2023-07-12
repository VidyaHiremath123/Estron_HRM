package practiceObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link']")
	private WebElement CoporateBtn;
	
	@FindBy(xpath="//p[.='Add Corporate']")
	private WebElement AddCorporateRadioBtnEdt;
	
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li[3][@class='nav-item has-treeview']")
	private WebElement BranchBtn;
	
	@FindBy(xpath="//p[.='Add Braches']")
	private WebElement AddBranchRadioBtn;
	
	@FindBy(xpath="//li[@class='nav-item dropdown']")
	private WebElement LogoutDrpDwn;

	@FindBy(xpath="//div[@class='dropdown-menu dropdown-menu-md dropdown-menu-right show']//a[2][@class='dropdown-item']")
	private WebElement LogOutOptionSelect;
	
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li[4][@class='nav-item has-treeview']")
	private WebElement Empbtn;


	@FindBy(xpath="//p[.='Add Employee']")
	private WebElement EmpRadiobtn;
	
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link active']")
	private WebElement DashboardBtn;

	@FindBy(xpath="//div[@class='info-box']/div[@class='info-box-content']/span[2]")
	private WebElement DashboardEmpdata;
	

	@FindBy(xpath="//span[.='Braches']/../span[@class='info-box-number']")
	private WebElement DashboardBranchdata;
	
	@FindBy(xpath="//span[.='Admin Account']/../span[@class='info-box-number']")
	private WebElement DashboardAdminAccDAta;
	
	@FindBy(xpath="//span[.='Corporate']/../span[@class='info-box-number']")
	private WebElement DshboardCorporateData;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getCoporateBtnEdt() {
		return CoporateBtn;
	}

	public WebElement getAddCorporateRadioBtnEdt() {
		return AddCorporateRadioBtnEdt;
	}

	public WebElement getBranchBtn() {
		return BranchBtn;
	}

	public WebElement getAddBranchRadioBtn() {
		return AddBranchRadioBtn;
	}

	public WebElement getLogoutDrpDwn() {
		return LogoutDrpDwn;
	}

	public WebElement getLogOutOptionSelect() {
		return LogOutOptionSelect;
	}

	public WebElement getEmpbtn() {
		return Empbtn;
	}

	public WebElement getEmpRadiobtn() {
		return EmpRadiobtn;
	}

	public WebElement getDashboardBtn() {
		return DashboardBtn;
	}

	public WebElement getDashboardEmpdata() {
		return DashboardEmpdata;
	}

	public WebElement getDashboardBranchdata() {
		return DashboardBranchdata;
	}

	public WebElement getDashboardAdminAccDAta() {
		return DashboardAdminAccDAta;
	}

	public WebElement getDshboardCorporateData() {
		return DshboardCorporateData;
	}
	 //Business Library
	
	public void navigateToBranch() {
		BranchBtn.click();
		AddBranchRadioBtn.click();
		
		
	}
	public void navigateToCorporate() {
		CoporateBtn.click();
		AddCorporateRadioBtnEdt.click();
		
		
	}
	public void navigateToEmployee() {
		Empbtn.click();
		EmpRadiobtn.click();
		
		
	}
	public void navigateToDashboard()
	{
		DashboardBtn.click();
	}

	

	



}
