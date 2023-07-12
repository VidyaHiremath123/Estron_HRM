package com.Estron.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Estron.HRM.GenericUtility.WebDriverUtility;

public class EstronLoginPage {
	//Declaration
@FindBy(xpath="//input[@class='form-control']")
private WebElement UserNameEdt;

@FindBy(xpath="//input[@name='hr_password']")
private WebElement PasswordEdt;

@FindBy(xpath="//select[@id='hr_type']")
private WebElement SelecttypeEdt;

@FindBy(xpath="//button[.='Sign In']")
private WebElement SignInbtnEdt;


public EstronLoginPage(WebDriver driver)
{
	PageFactory.initElements( driver,this);
}


//Initialization

public WebElement getUserNameEdt() {
	return UserNameEdt;
}

public WebElement getPasswordEdt() {
	return PasswordEdt;
}

public WebElement getSelecttypeEdt() {
	return SelecttypeEdt;
}
public WebElement getSignInbtnEdt() {
	return SignInbtnEdt;
}
//Business Library
public void loginTOApp(String USERNAME,String PASSWORD)
{ 
	WebDriverUtility wUtil=new WebDriverUtility();
	UserNameEdt.sendKeys(USERNAME);
	PasswordEdt.sendKeys(PASSWORD);
	wUtil.HandleDropDownByValue(SelecttypeEdt,"HR Head");
	SignInbtnEdt.click();
}
	





}
