package practiceObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporatePage {
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@name='corporate_name']")
	private WebElement EditCorpTxtFldEdt;
	

	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement SearchTxtFieldEdt;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement AddCorporateBtn;
	
	@FindBy(xpath="//tr[3][@class='odd']//button[.='Edit']")
	private WebElement Editbtn;
	
	@FindBy(xpath="//div[@class='modal-content']/form[@action='process/addcorporate_process.php']//input[@name='corporate_name']")
	private WebElement AddCorpTextFieldBtnEdt;
	
	@FindBy(xpath="//form[@action='process/addcorporate_process.php']//button[@class='btn btn-primary']")
    private WebElement SaveBtnEdt;
	
	@FindBy(xpath="//div[@class='modal fade show']//button[.='Update']")
	private WebElement UpdateBtn;
	
	public CorporatePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getSearchTxtFieldEdt() {
		return SearchTxtFieldEdt;
	}

	public WebElement getAddCorporateBtn() {
		return AddCorporateBtn;
	}

	public WebElement getEditbtn() {
		return Editbtn;
	}

	public WebElement getAddCorpTextFieldBtnEdt() {
		return AddCorpTextFieldBtnEdt;
	}

	public WebElement getSaveBtnEdt() {
		return SaveBtnEdt;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	//Business Library
	public void addCorporateName(String CORPORATE_NAME) {
		AddCorpTextFieldBtnEdt.sendKeys(CORPORATE_NAME);
		 SaveBtnEdt.click();
	}
	public void EditCorporateName(String CORPORATE_NAME) {
		SearchTxtFieldEdt.sendKeys(CORPORATE_NAME);
		Editbtn.click();
		 EditCorpTxtFldEdt.click();
		 EditCorpTxtFldEdt.clear();
		 EditCorpTxtFldEdt.sendKeys(CORPORATE_NAME);
		 UpdateBtn.click();

	

}
}
