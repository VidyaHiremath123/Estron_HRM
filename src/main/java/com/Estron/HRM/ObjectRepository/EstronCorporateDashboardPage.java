package com.Estron.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EstronCorporateDashboardPage {
@FindBy(xpath="//input[@class='form-control form-control-sm']")
private WebElement SearchTxtFieldEdt;

@FindBy(xpath="//tr[3][@class='odd']//button[.='Edit']")
private WebElement Editbtn;

@FindBy(xpath="//div[@class='modal fade show']//input[@name='corporate_name']")
private WebElement EditCorpTxtFldEdt;

@FindBy(xpath="//div[@class='modal fade show']//button[.='Update']")
private WebElement UpdateBtn;



public EstronCorporateDashboardPage(WebDriver driver )
{
	PageFactory.initElements(driver,this);
}
public void addCorporateEdit(String CORPORATE_NAME) {
	SearchTxtFieldEdt.sendKeys(CORPORATE_NAME);
	Editbtn.click();
	 EditCorpTxtFldEdt.click();
	 EditCorpTxtFldEdt.clear();
	 EditCorpTxtFldEdt.sendKeys(CORPORATE_NAME);
	 UpdateBtn.click();
}

	
	


}
