package com.Estron.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EstronDashboardPage {
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link']")
	private WebElement CoporateBtnEdt;
	
	@FindBy(xpath="//p[.='Add Corporate']")
	private WebElement AddCorporateRadioBtnEdt;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement AddCorporateBtnEdt;
	
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li[3][@class='nav-item has-treeview']")
	private WebElement BranchBtn;
	
	@FindBy(xpath="//p[.='Add Braches']")
	private WebElement AddBranchRadioBtn;
	
	@FindBy(xpath="//div[@class='card-header']//button[1][@class='btn btn-primary']")
	private WebElement AddBranchBtn;
	
	@FindBy(xpath="//div[@class='modal-content']//form[@action='process/addbranches_process.php']//input[@name='branches_name']")
	private WebElement AddBranchTextFieldEdt;
	
	@FindBy(xpath="//form[@action='process/addbranches_process.php']//button[@class='btn btn-primary']")
	private WebElement SaveAddBranchBtn;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement SearchBranchNameEdt;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/button[1]")
	private WebElement BranchNameEditButton;
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@name='branches_name']")
	private WebElement EditBranchNameTxtField;
	
	@FindBy(xpath="//div[@class='modal fade show']//button[.='Update']")
	private WebElement BranchUpdateBtn;
	
	@FindBy (xpath="(//tbody/tr/td[4]/button[2])[last()]")
	private WebElement Deleteimgbtn;
	
	@FindBy (xpath="//div[@class='modal fade show']//button[.='Delete']")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//li[@class='nav-item dropdown']")
	private WebElement LogoutDrpDwn;

	@FindBy(xpath="//div[@class='dropdown-menu dropdown-menu-md dropdown-menu-right show']//a[2][@class='dropdown-item']")
	private WebElement LogOutOptionSelect;



	
	
	

	

	

	

	public EstronDashboardPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	

	public WebElement getAddBranchRadioBtn() {
		return AddBranchRadioBtn;
	}


	public WebElement getAddBranchBtn() {
		return AddBranchBtn;
	}


	public WebElement getAddBranchTextFieldEdt() {
		return AddBranchTextFieldEdt;
	}


	public WebElement getSaveAddBranchBtn() {
		return SaveAddBranchBtn;
	}


	public WebElement getCoporateBtnEdt() {
		return CoporateBtnEdt;
	}

	public WebElement getAddCorporateRadioBtnEdt() {
		return AddCorporateRadioBtnEdt;
	}

	public WebElement getAddCorporateBtnEdt() {
		return AddCorporateBtnEdt;
	}
	public WebElement getBranchBtn() {
		return BranchBtn;
	}
	public WebElement getSearchBranchNameEdt() {
		return SearchBranchNameEdt;
	}
	public WebElement getBranchNameEditButton() {
		return BranchNameEditButton;
	}

	public WebElement getEditBranchNameTxtField() {
		return EditBranchNameTxtField;
	}


	public WebElement getBranchUpdateBtn() {
		return BranchUpdateBtn;
	}
	public WebElement getDeleteimgbtn() {
		return Deleteimgbtn;
	}
	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}




	//Business Library 

       public void addCorporate() {
		CoporateBtnEdt.click();
		AddCorporateRadioBtnEdt.click();
		AddCorporateBtnEdt.click();
	}
	public void addBranch(String BRANCH_NAME) throws Throwable {
		BranchBtn.click();
		AddBranchRadioBtn.click();
		AddBranchBtn.click();
		Thread.sleep(3000);
		AddBranchTextFieldEdt.sendKeys(BRANCH_NAME);
		SaveAddBranchBtn.click();
		
	}
	public void editBranchName(String BRANCH_NAME) throws Throwable {
		SearchBranchNameEdt.sendKeys (BRANCH_NAME);
		BranchNameEditButton.click();
		EditBranchNameTxtField.click();
		EditBranchNameTxtField.clear();
		Thread.sleep(3000);
		EditBranchNameTxtField.sendKeys(BRANCH_NAME+"2");
		Thread.sleep(3000);
		BranchUpdateBtn.click();
	}
	public void deleteBranchName(String BRANCH_NAME ) throws Throwable {
//		SearchBranchNameEdt.sendKeys (BRANCH_NAME+"2");
		Thread.sleep(3000);
		
		Deleteimgbtn.click();
	
		DeleteBtn.click();
		
	}
	public void logOutFromApp() {
		LogoutDrpDwn.click();
		LogOutOptionSelect.click();
	}


	
	
		
		

}