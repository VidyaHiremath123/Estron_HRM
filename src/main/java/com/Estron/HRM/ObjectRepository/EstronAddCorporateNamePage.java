package com.Estron.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EstronAddCorporateNamePage {
	@FindBy(xpath="//div[@class='modal-content']/form[@action='process/addcorporate_process.php']//input[@name='corporate_name']")
	private WebElement AddCorpTextFieldBtnEdt;
	
	@FindBy(xpath="//form[@action='process/addcorporate_process.php']//button[@class='btn btn-primary']")
    private WebElement SaveBtnEdt;
	
	public EstronAddCorporateNamePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getAddCorpTextFieldBtnEdt() {
		return AddCorpTextFieldBtnEdt;
	}

	public WebElement getSaveBtnEdt() {
		return SaveBtnEdt;
	}
	public void addCorporateName(String CORPORATE_NAME) {
		AddCorpTextFieldBtnEdt.sendKeys(CORPORATE_NAME);
		 SaveBtnEdt.click();
		
		
		
	}
}
