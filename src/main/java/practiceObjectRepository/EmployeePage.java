package practiceObjectRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.Estron.HRM.GenericUtility.WebDriverUtility;

	public class EmployeePage {
		@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li[4][@class='nav-item has-treeview']")
		private WebElement Empbtn;


		@FindBy(xpath="//p[.='Add Employee']")
		private WebElement EmpRadiobtn;

		@FindBy(xpath="//div[@class='card-header']//button[1][@class='btn btn-primary']")
		private WebElement AddEmpbtn;


		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_companyid']")
		private WebElement CompanyIdEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_firstname']")
		private WebElement EmpFirstNameEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_lastname']")
		private WebElement EmpLastNameEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_middlename']")
		private WebElement EmpMiddlenameNameEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='branches_datefrom']")
		private WebElement BranchesDateFromEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='branches_recentdate']")
		private WebElement BranchesRecentDateEdt;

		@FindBy(xpath="//div[@class='modal fade show']//select[@name='employee_department']")
		private WebElement EmpDeptEdt;

		@FindBy(xpath="//div[@class='modal fade show']//select[@name='employee_branches']")
		private WebElement EmpBranchEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_position']")
		private WebElement EmpPositionEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_contact']")
		private WebElement EmpContactEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_sss']")
		private WebElement EmpSSSEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_tin']")
		private WebElement EmpTinEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_hdmf_pagibig']")
		private WebElement EmpHdmfEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_gsis']")
		private WebElement EmpGsisEdt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_file201']")
		private WebElement EmpFile201Edt;

		@FindBy(xpath="//div[@class='modal fade show']//input[@name='employee_image']")
		private WebElement EmpImgEdt;

		@FindBy(xpath="//div[@class='modal fade show']//button[@class='btn btn-primary']")
		private WebElement EmpSavebtn;

		@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@class='nav-link active']")
		private WebElement DashboardBtn;

		@FindBy(xpath="//div[@class='info-box']/div[@class='info-box-content']/span[2]")
		private WebElement Dashboarddata;





		public EmployeePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getCompanyIdEdt() {
			return CompanyIdEdt;
		}

		public WebElement getEmpFirstNameEdt() {
			return EmpFirstNameEdt;
		}

		public WebElement getEmpLastNameEdt() {
			return EmpLastNameEdt;
		}

		public WebElement getEmpMiddlenameNameEdt() {
			return EmpMiddlenameNameEdt;
		}

		public WebElement getBranchesDateFromEdt() {
			return BranchesDateFromEdt;
		}

		public WebElement getBranchesRecentDateEdt() {
			return BranchesRecentDateEdt;
		}

		public WebElement getEmpDeptEdt() {
			return EmpDeptEdt;
		}

		public WebElement getEmpBranchEdt() {
			return EmpBranchEdt;
		}

		public WebElement getEmpPositionEdt() {
			return EmpPositionEdt;
		}

		public WebElement getEmpContactEdt() {
			return EmpContactEdt;
		}

		public WebElement getEmpSSSEdt() {
			return EmpSSSEdt;
		}

		public WebElement getEmpTinEdt() {
			return EmpTinEdt;
		}

		public WebElement getEmpHdmfEdt() {
			return EmpHdmfEdt;
		}

		public WebElement getEmpGsisEdt() {
			return EmpGsisEdt;
		}

		public WebElement getEmpFile201Edt() {
			return EmpFile201Edt;
		}

		public WebElement getEmpImgEdt() {
			return EmpImgEdt;
		}

		public WebElement getEmpSavebtn() {
			return EmpSavebtn;
		}
		public WebElement getDashboardBtn() {
			return DashboardBtn;}

		public WebElement getDashboarddata() {
			return Dashboarddata;
		}
		public WebElement getEmpbtn() {
			return Empbtn;
		}

		public WebElement getEmpRadiobtn() {
			return EmpRadiobtn;
		}

		public WebElement getAddEmpbtn() {
			return AddEmpbtn;
		}
		//Business Library
		public void AddEmpPageNavigation() throws Throwable
		{
			Empbtn.click();
			Thread.sleep(3000);
			EmpRadiobtn.click();
			Thread.sleep(3000);
			AddEmpbtn.click();

		}
		public void addEmp(WebDriverUtility wUtil,String COMPANYID , String FIRSTNAME,  String LASTNAME, String MIDDLENAME, String BRANCHESDATEFROM,String BRANCHESRECENTDATE , String  POSITION, String CONTACTNUMBER, String SSS1, String  TIN1, String HDMFPAGIBIG, String GSIS1 ) throws Throwable
		{ 

			CompanyIdEdt.sendKeys(COMPANYID);

			EmpFirstNameEdt.sendKeys(FIRSTNAME);
			EmpLastNameEdt.sendKeys(LASTNAME);
			EmpMiddlenameNameEdt.sendKeys(MIDDLENAME);
			BranchesDateFromEdt.sendKeys(BRANCHESDATEFROM);
			Thread.sleep(3000);
			BranchesRecentDateEdt.sendKeys(BRANCHESRECENTDATE);
			Thread.sleep(3000);
			wUtil.handleDropDownBySelectingReqName("Complience Department",EmpDeptEdt);
			Thread.sleep(3000);
			wUtil.handleDropDownBySelectingReqName("Hebbal",EmpBranchEdt);
			EmpPositionEdt.sendKeys(POSITION);
			EmpContactEdt.sendKeys(CONTACTNUMBER);
			EmpSSSEdt.sendKeys(SSS1);
			EmpTinEdt.sendKeys(TIN1);
			EmpHdmfEdt.sendKeys(HDMFPAGIBIG);
			EmpGsisEdt.sendKeys(GSIS1);
			wUtil.fileUpload("./src/test/resources/Demo.java",EmpFile201Edt);
			wUtil.fileUpload("./src/test/resources/Qspiders.PNG",EmpImgEdt);
			EmpSavebtn.click();

		}
		public String verifyDataIsReflecting() throws Throwable
		{
			DashboardBtn.click();
			//Thread.sleep(3000);
			String data =Dashboarddata.getText();
			return data;
		}













	}



