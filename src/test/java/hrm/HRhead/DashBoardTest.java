package hrm.HRhead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Estron.HRM.GenericUtility.BaseClass;
import com.Estron.HRM.ObjectRepository.AddEmployeePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashBoardTest extends BaseClass{
	@Test
	public void dashboardtest() throws Throwable {
		
		
		
		
	
		
		//click on dashbord
		driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link active']")).click();
		Thread.sleep(3000);
		
		WebElement num=driver.findElement(By.xpath("//div[@class='info-box']/div[@class='info-box-content']/span[2]"));
        String value=num.getText();
        
        System.out.println(value);
          int intValue=Integer.parseInt(value);
        
	
	
		
		//Add Employee
				//xpath for Employee
				driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column']//li[4][@class='nav-item has-treeview']")).click();
				//xpath for addemployee radio button
				Thread.sleep(3000);
				driver.findElement(By.xpath("//p[.='Add Employee']")).click();
				//xpath for Add Employee button
				driver.findElement(By.xpath("//div[@class='card-header']//button[1][@class='btn btn-primary']")).click();
				Thread.sleep(3000);
				
				//company id
				driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_companyid']")).sendKeys("123");
				//first name
				driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_firstname']")).sendKeys("Sam");
				//Last Name
				driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_lastname']")).sendKeys("Desouza");
				//Middle Name
				driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_middlename']")).sendKeys("M");
				//Branches Date From
				driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='branches_datefrom']")).sendKeys("04/29/2023");
				//Branches recent Date
				driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='branches_recentdate']")).sendKeys("06/29/2023");
				//Department drop down
				WebElement Dept=driver.findElement(By.xpath("//div[@class='modal fade show']//select[@name='employee_department']"));
				Select sel=new Select(Dept);
					List<WebElement> drop = sel.getOptions();
					for (WebElement dro : drop) {
						if(dro.getText().equals("Complience Department"))
						{
							dro.click();
							break;
						}
						
					}
			    
				
				//Branches
					WebElement bran=driver.findElement(By.xpath("//div[@class='modal fade show']//select[@name='employee_branches']"));
					Select sel1=new Select(bran);
						List<WebElement> drop1 = sel1.getOptions();
						for (WebElement dro1 : drop1) {
							if(dro1.getText().equals("Mysore"))
							{
								dro1.click();
								break;
							}
							
						}
				//Position
						driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_position']")).sendKeys("Senior manager");
						
				//Contact number
						driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_contact']")).sendKeys("91876543210");
						
						
				//sss
						driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_sss']")).sendKeys("91876");
						
						
				//TIN
						driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_tin']")).sendKeys("3210");
						
				//HDMF
						driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_hdmf_pagibig']")).sendKeys("76543");
						
						
				//GSIS
						driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_gsis']")).sendKeys("210");
						
						
						
				//File 201
						File f = new File("./src/test/resources/Demo.java");
						String abPath=f.getAbsolutePath();
						WebElement ele = driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_file201']"));
						ele.sendKeys(abPath);
						Thread.sleep(3000);
						
				//emp picture
						File f1 = new File("./src/test/resources/Qspiders.PNG");
						String abPath1=f1.getAbsolutePath();
						WebElement ele1 = driver.findElement(By.xpath("//div[@class='modal fade show']//input[@name='employee_image']"));
						ele1.sendKeys(abPath1);
						Thread.sleep(3000);
						
						//save button
					driver.findElement(By.xpath("//div[@class='modal fade show']//button[@class='btn btn-primary']")).click();
					Thread.sleep(3000);
				    Alert g=driver.switchTo().alert();
					g.accept();
					
					//click on dashbord
					//driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link active']")).click();
					Thread.sleep(3000);
					
					//WebElement num1=driver.findElement(By.xpath("//div[@class='info-box']/div[@class='info-box-content']/span[2]"));
			        //String value1=data.getText();
					AddEmployeePage aep=new AddEmployeePage(driver);
					value=aep.verifyDataIsReflecting();
					
			        System.out.println(value);
			        int intValue1=Integer.parseInt(value);
			        //SoftAssert art=new SoftAssert();
			        Assert.assertEquals(intValue1, (intValue+1),"failed");
			        //Reporter.log("passed");
			        
			        
//			        if(intValue1==(intValue+1))
//			        
//			        {
//			        	System.out.println("PASSED");
//			        }else {
//			        	System.out.println("FAILED");
//			        }
//	
//	}

	}}
