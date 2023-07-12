package com.Estron.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Estron.HRM.GenericUtility.WebDriverUtility;

public class EmployeeDashboardPage {
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement SearchBtn;
	
	@FindBy(xpath="//tbody/tr/td[9]/i[1][@class='fa fa-edit']")
	private WebElement EdtimgBtn;
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_firstname']")
	private WebElement NameBtn;
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_file201']")
	private WebElement FileuploadBtn;
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_image']")
	private WebElement ImguploadBtn;
	
	@FindBy(xpath="//div[@class='modal fade show']//button[.='Update']")
	private WebElement UploadBtn;
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/i[2]")
	private WebElement DeleteimgBtn;
	
	@FindBy(xpath="//div[@class='modal fade show']//button[.='Delete']")
	private WebElement DeleteBtn;
	public EmployeeDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	public WebElement getEdtimgBtn() {
		return EdtimgBtn;
	}
	public WebElement getNameBtn() {
		return NameBtn;
	}
	public WebElement getFileuploadBtn() {
		return FileuploadBtn;
	}
	public WebElement getImguploadBtn() {
		return ImguploadBtn;
	}
	public WebElement getUploadBtn() {
		return UploadBtn;
	}
	public WebElement getDeleteimgBtn() {
		return DeleteimgBtn;
	}
	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
	public void editEmp(String FIRSTNAME,WebDriverUtility wUtil)
	{
		SearchBtn.sendKeys(FIRSTNAME);
		EdtimgBtn.click();
		NameBtn.click();
		NameBtn.clear();
		NameBtn.sendKeys(FIRSTNAME);
		wUtil.fileUpload("./src/test/resources/Demo.java",FileuploadBtn);
    	wUtil.fileUpload("./src/test/resources/Qspiders.PNG",ImguploadBtn);
    	UploadBtn.click();
		
	}
	public void deleteEmp(String FIRSTNAME) throws Throwable
	{
		SearchBtn.sendKeys(FIRSTNAME);
		Thread.sleep(3000);
		DeleteimgBtn.click();
		DeleteBtn.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
