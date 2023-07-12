package practiceObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Estron.HRM.GenericUtility.BaseClass;
import com.Estron.HRM.GenericUtility.WebDriverUtility;

public class BranchPage{
	
	@FindBy(xpath="//div[@class='card-header']//button[1][@class='btn btn-primary']")
	private WebElement AddBranchBtn;
	
	@FindBy(xpath="//div[@class='modal-content']//form[@action='process/addbranches_process.php']//input[@name='branches_name']")
	private WebElement AddBranchTextFieldEdt;
	
	@FindBy(xpath="//form[@action='process/addbranches_process.php']//button[@class='btn btn-primary']")
	private WebElement SaveAddBranchBtn;
	
	@FindBy(xpath="//div[@class='col-sm-12 col-md-6']//input[@class='form-control form-control-sm']")
	private WebElement SearchBranchNameEdt;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/button[1]")
	private WebElement BranchNameEditButton;
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@name='branches_name']")
	private WebElement EditBranchNameTxtField;
	
	@FindBy(xpath="//div[@class='modal fade show']//button[.='Update']")
	private WebElement BranchUpdateBtn;
	
	@FindBy (xpath="//tbody/tr[10]/td[4]/button[2]")
	private WebElement Deleteimgbtn;
	
	@FindBy (xpath="//div[@class='modal fade show']//button[.='Delete']")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li[3][@class='nav-item has-treeview']")
	private WebElement BranchBtn;
	
	@FindBy(xpath="//p[.='Add Braches']")
	private WebElement AddBranchRadioBtn;
	
	public BranchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddBranchBtn() {
		return AddBranchBtn;
	}
	public void setAddBranchBtn(WebElement addBranchBtn) {
		AddBranchBtn = addBranchBtn;
	}
	public WebElement getAddBranchTextFieldEdt() {
		return AddBranchTextFieldEdt;
	}
	public void setAddBranchTextFieldEdt(WebElement addBranchTextFieldEdt) {
		AddBranchTextFieldEdt = addBranchTextFieldEdt;
	}
	public WebElement getSaveAddBranchBtn() {
		return SaveAddBranchBtn;
	}
	public void setSaveAddBranchBtn(WebElement saveAddBranchBtn) {
		SaveAddBranchBtn = saveAddBranchBtn;
	}
	public WebElement getSearchBranchNameEdt() {
		return SearchBranchNameEdt;
	}
	public void setSearchBranchNameEdt(WebElement searchBranchNameEdt) {
		SearchBranchNameEdt = searchBranchNameEdt;
	}
	public WebElement getBranchNameEditButton() {
		return BranchNameEditButton;
	}
	public void setBranchNameEditButton(WebElement branchNameEditButton) {
		BranchNameEditButton = branchNameEditButton;
	}
	public WebElement getEditBranchNameTxtField() {
		return EditBranchNameTxtField;
	}
	public void setEditBranchNameTxtField(WebElement editBranchNameTxtField) {
		EditBranchNameTxtField = editBranchNameTxtField;
	}
	public WebElement getBranchUpdateBtn() {
		return BranchUpdateBtn;
	}
	public void setBranchUpdateBtn(WebElement branchUpdateBtn) {
		BranchUpdateBtn = branchUpdateBtn;
	}
	public WebElement getDeleteimgbtn() {
		return Deleteimgbtn;
	}
	public void setDeleteimgbtn(WebElement deleteimgbtn) {
		Deleteimgbtn = deleteimgbtn;
	}
	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	public void setDeleteBtn(WebElement deleteBtn) {
		DeleteBtn = deleteBtn;
	}
	public WebElement getBranchBtn() {
		return BranchBtn;
	}
	public void setBranchBtn(WebElement branchBtn) {
		BranchBtn = branchBtn;
	}
	public WebElement getAddBranchRadioBtn() {
		return AddBranchRadioBtn;
	}
	public void setAddBranchRadioBtn(WebElement addBranchRadioBtn) {
		AddBranchRadioBtn = addBranchRadioBtn;
	}
	
	public void addBranch(String BRANCH_NAME1) throws Throwable {
		BranchBtn.click();
		AddBranchRadioBtn.click();
		AddBranchBtn.click();
		AddBranchTextFieldEdt.sendKeys(BRANCH_NAME1);
		SaveAddBranchBtn.click();
		
	}
	public void editBranchName(String BRANCH_NAME2) throws Throwable {
		SearchBranchNameEdt.sendKeys (BRANCH_NAME2);
		BranchNameEditButton.click();
		EditBranchNameTxtField.clear();
		EditBranchNameTxtField.sendKeys(BRANCH_NAME2+"2");
		BranchUpdateBtn.click();
	}
	
	public void search(String BRANCH_NAME3) {
		SearchBranchNameEdt.sendKeys (BRANCH_NAME3);
	}
	
	public void deleteBranchName() throws Throwable {
		Deleteimgbtn.click();
		DeleteBtn.click();
	}
	public void navigateToSearch(String BRANCH_NAME4 )
	{
		SearchBranchNameEdt.sendKeys(BRANCH_NAME4);
	}


	
}
