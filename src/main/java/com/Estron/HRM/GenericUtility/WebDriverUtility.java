package com.Estron.HRM.GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import practiceObjectRepository.BranchPage;

public class WebDriverUtility {
	
	 public String takeScreenShot(WebDriver driver,String screenShotName) throws IOException
	    
	    { 
	    	
		 TakesScreenshot ts =(TakesScreenshot)driver;
	    	File src=ts.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("./ScreenShot/"+screenShotName+".png");
	        FileUtils.copyFile(src, dest);//common io dependency
	    	return dest.getAbsolutePath();//used in extent Report
	    }
	
	public void fileUpload(String path,WebElement ele) {
	File f = new File(path);
	String abPath=f.getAbsolutePath();
	ele.sendKeys(abPath);
	}
	
	
	public void handleDropDownBySelectingReqName(String Name,WebElement ele)
	{
	Select sel=new Select(ele);
	List<WebElement> drop = sel.getOptions();
	for (WebElement dro : drop) {
		if(dro.getText().equals(Name))
		{
			dro.click();
			break;
		}
		
	}
	}
	
	public void scroll(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		for(int i=1;i<100;i++){
			js.executeScript("window.scrollBy(0,3000)");
		}
	}

		public void scrolltoEnd(WebDriver driver) throws InterruptedException
		{
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			}
	
	
		public void waitForPageLoad(WebDriver driver)
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		public void waitForElementToBeClickable(WebDriver driver,WebElement ele)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		}
	/**
	 * used to Switch to Any Window based on Window Title
	 * @param driver
	 * @param partialWindowTitle
	 */

	public void switchToWindow(WebDriver driver,String partialWindowTitle)
	{
		Set<String>windows=driver.getWindowHandles();
	Iterator<String>it=windows.iterator();
		while(it.hasNext())
		{
			String winIds=it.next();
			driver.switchTo().window(winIds);
			String currentWindowTittle=driver.getTitle();
			System.out.println(partialWindowTitle + "Switch to window is passed");
			break;
		}


	}
	public void switchTOWindow(WebDriver driver,String partialWindowURL) 
	{
		Set<String>windows=driver.getWindowHandles();
	Iterator<String>it=windows.iterator();
	while(it.hasNext()) {
	String winIds=it.next();
	driver.switchTo().window(winIds);
	String currentWindowUrl=driver.getCurrentUrl();
	System.out.println(partialWindowURL + "Switch to Window is passed--!");
	  break;
	}
		
	}
	public void swithToAlertWindowAndAccept(WebDriver driver ) {
		Alert alt = driver.switchTo().alert();
//		 if(alt.getText().trim().equalsIgnoreCase(expectedMsg.trim())) {
//			 System.out.println("Alert Message is verified");
//		 }else {
//			 System.out.println("Alert Message is not verified");
//		 }
		alt.accept();
	}
	/**
	 * used to Switch to Frame Window based on index
	 * @param driver
	 * @param index
	 */
	public void swithToFrame(WebDriver driver , int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * used to Switch to Frame Window based on id or name attribute
	 * @param driver
	 * @param id_name_attribute
	 */
	public void swithToFrame(WebDriver driver , String id_name_attribute) {
		driver.switchTo().frame(id_name_attribute);
	

}
	/**
	 * used to select the value from the dropDwon  based on index
	 * @param driver
	 * @param index
	 */
	public void handleDropDownByIndex(WebElement element , int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * used to select the value from the dropDwon  based on value / option avlaible in GUI
	 * @param element
	 * @param value
	 */
	public void HandleDropDownByVisibleText(WebElement element , String text) {
		Select sel1 = new Select(element);
		sel1.selectByVisibleText(text);
	}
	/**
	 * used to place mouse cursor on specified element
	 * @param driver
	 * @param elemnet
	 */
	public void mouseOverOnElement(WebDriver driver , WebElement elemnet)
	{
		Actions act = new Actions(driver);
		act.moveToElement(elemnet).perform();
	}
	public void HandleDropDownByValue(WebElement element , String value) {
		Select sel2 = new Select(element);
		sel2.selectByValue(value);
	}
	
}
