package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class FTAManagement {
	WebDriver driver;
	public static String FTARequestNo;

	@FindBy(xpath = "//*[@id='signin-link']/strong")
	static WebElement liLogin;
	@FindBy(xpath = "//*[@id='sUserId']")
	static WebElement txtLoginId;

	@FindBy(xpath = "//*[@id='sUserPassword']")
	static WebElement txtPassword;
	@FindBy(xpath = "//*[@id='signin-dropdown']/form/table/tbody/tr[6]/td/input")
	static WebElement btnLoginInUcustoms;
	@FindBy(xpath = "/html/body/div[3]/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a") //// *[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a

	static WebElement liSignOut;
	// ---------------------------------------Menu-------
	@FindBy(xpath = "//*[@id=\"mb_Admin\"]/a")
	static WebElement menuAdmin;
	@FindBy(partialLinkText = "FTA / Exemptions")
	static WebElement subMenuFTA;
	@FindBy(partialLinkText = "FTA Management")
	static WebElement nestedSubMenuFTAManagement;
	// ---------------------------------------New-------

	@FindBy(id = "btnnew")
	static WebElement btnNew;

	// -------------Create FTA MANAGEMENT Web Elements-----
	@FindBy(id = "txtAgreementName")
	static WebElement txtAgreementName;

	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li[1]/a")
	static WebElement autocompleteAgreementName; // Agreement Name

	@FindBy(id = "ddlDeMinimisCondition")
	static WebElement ddlDeMinimisCondition; // De Minimis Condition

	@FindBy(id = "txtMinimisValue")
	static WebElement txtMinimisValue; // COO/DOO De Minimis Value (USD)

	@FindBy(id = "txtstartdateDatePicker")
	static WebElement txtstartdateDatePicker; // Start Date
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]")
	static WebElement btnToday;

	@FindBy(id = "chkInDate")
	static WebElement chkInDate; // End Date Infinite Date

	// COO/DOO DETAILS
	@FindBy(id = "ddlPCOType")
	static WebElement ddlPCOType; // Select PCO Type

	@FindBy(id = "txtCOOValidityDays")
	static WebElement txtCOOValidityDays; // COO validity (in days)

	@FindBy(id = "createbttn")
	static WebElement createbttn; // Click on Create button
	@FindBy(xpath = "//*[@id=\"text1\"]")
	static WebElement lblRequestNo; // Click on Create button

	@FindBy(id = "cancelBttn")
	static WebElement btnBack; // Click on Back button
	// *[@id=""]

	@FindBy(id = "RequestNumber")
	static WebElement txtRequestNumber; // Click on Create button

	@FindBy(id = "AgreementName")
	static WebElement txtAgreementNamesearch; // Click on Create button

	@FindBy(xpath = "//*[@id=\"Status\"]")
	static WebElement ddlStatus; // Click on Create button

	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[14]/td/div/input[1]")
	static WebElement btnMainSearch; // Click on Create button
	
	
	@FindBy(xpath = "//*[@id=\"btnrestSearch\"]")
	static WebElement btnMainResetSearch; // Click on Create button

	@FindBy(xpath = "//*[@id=\"List_FTAManagementsLs_0_ID0EAABAAA\"]/a/i")
	static WebElement lnkOpen; // Click on Create button

	// -------------Associate COUNTRIES LIST

	@FindBy(xpath = "//*[@id=\"btnCountryAssociate\"]")
	static WebElement btnAssociateCountry; // Click on Create button

	@FindBy(id = "frame_TariffIItemAssLocationsLsPg")
	static WebElement frame_TariffIItemAssLocationsLsPg; // switch iFrame

	@FindBy(name = "CountryName")
	static WebElement txtCountryName; // Country Name

	@FindBy(name = "CountryCode")
	static WebElement txtCountryCode; // Country Code

	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[6]/td/div/input[1]")
	static WebElement btnCountrySearch; // Click on Search button

	@FindBy(xpath = "//*[@id=\"chkallID0EAAAABA\"]")
	static WebElement chkAll; // Click on Search buttonSelect All

	@FindBy(xpath = "//*[@id=\"buttonID0EAAAABA\"]")
	static WebElement btnSaveSelection; // Click on Save Selection

	// TARIFF LINE LIST

	@FindBy(xpath = "//*[@id=\"normalbutton1\"]")
	static WebElement btnAddTariffLine; // Add

	@FindBy(xpath = "//*[@id=\"ddlyear\"]")
	static WebElement ddlyear; // Year 2017

	@FindBy(xpath = "//*[@id=\"txtTariffCode\"]")
	static WebElement txtTariffCode; // Item HS Code 2020.10.1005    //*[@id="autocompletediv"]/li/a
	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li/a")
	static WebElement autocompletediv; // Item HS Code 2020.10.1005    

	@FindBy(xpath = "//*[@id=\"txtstartdateDatePicker\"]")
	static WebElement txtstartdateDatePickerTariffLine;// Start Date

	@FindBy(xpath = "//*[@id=\"chkInDate\"]")
	static WebElement chkInfiniteDateTariffLine; // End Date Infinite Date

	@FindBy(xpath = "// *[@id=\"ddlRateBasis\"]")
	static WebElement ddlRateBasis; // Rate Basis AD-VALOREM

	@FindBy(xpath = "// *[@id=\"txtAdValDutyRate\"]")
	static WebElement txtAdValDutyRate; // Ad Valorem Duty Rate 5

	@FindBy(xpath = "//*[@id=\"createbttn\"]")
	static WebElement btnCreateTariffLine;// Click on Create button

	@FindBy(xpath = "//*[@id=\"cancelBttn\"]")
	static WebElement btnBackTariffLine; // Click on Back button

	// INSPECTION INSTRUCTIONS LIST

	@FindBy(xpath = "// *[@id=\"btnInspectionAssociate\"]")
	static WebElement btnInspectionAssociate;// Associate INSPECTION INSTRUCTIONS

	@FindBy(xpath = "//*[@id=\"frame_FTAMgmtInspectionInstructionsPopUpLsPg\"]")
	static WebElement frame_FTAMgmtInspectionInstructionsPopUpLsPg;

	@FindBy(xpath = "//*[@id=\"txtInstructionCode\"]")
	static WebElement txtInstructionCode;// Search Inspection Instruction Code CIDB

	@FindBy(xpath = "//*[@id=\"txtDescriptions\"]")
	static WebElement txtDescriptions;// Search Inspection Instruction INSPECTION INSTRUCTION FOR CIDB

	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[6]/td/div/input[1]")
	static WebElement btnSearchInspection;// Click on Search button

	@FindBy(xpath = "//*[@id=\"chkallID0EAAAABA\"]")
	static WebElement chkAllInspection;// Select all INSPECTION INSTRUCTIONS

	@FindBy(xpath = "//*[@id=\"buttonID0EAAAABA\"]")
	static WebElement btnSaveInspection;// Click on Save button

	// SUPPORTING DOCUMENTS LIST

	@FindBy(xpath = "//*[@id=\"btnAssociateSDoc\"]")
	static WebElement btnAssociateSDoc;// Associate SUPPORTING DOCUMENTS

	@FindBy(xpath = "//*[@id=\"frame_FTAMgmtSupportingDocumentsPopUpLsPg\"]")
	static WebElement frame_FTAMgmtSupportingDocumentsPopUpLsPg;

	@FindBy(xpath = "//*[@name=\"Code\"]")
	static WebElement txtDocCode;// Search Document Code ABC

	@FindBy(xpath = "//*[@name=\"Name\"]")
	static WebElement txtDocName;// Search Document Name ABC
	
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[6]/td/div/input[1]")
	static WebElement btnSearchSupDoc;

	@FindBy(xpath = "//*[@id=\"chkallID0EAAAABA\"]")
	static WebElement chkAllDoc;// Select all SUPPORTING DOCUMENTS

	@FindBy(xpath = "//*[@id=\"buttonID0EAAAABA\"]")
	static WebElement btnSaveDoc;// Click on Save button

	// CERTIFICATE TYPE

	@FindBy(xpath = "// *[@id=\"bttnAssCertificate\"]")
	static WebElement bttnAssCertificate;// Associate CERTIFICATE TYPE

	@FindBy(xpath = "// *[@id=\"frame_AssociateFTACertificateTypeLsPg\"]")
	static WebElement frame_AssociateFTACertificateTypeLsPg;

	@FindBy(xpath = "//*[@id=\"chk_ID1EAAAABA_0\"]")
	static WebElement chkAllCertificate;// Select CERTIFICATE scroll

	@FindBy(xpath = "//*[@id=\"buttonID1EAAAABA\"]")
	static WebElement btnSaveCertificate;// Click on Save Selectionbutton

	// Activate FTA Management

	@FindBy(xpath = "//*[@id=\"btnActivate\"]")
	static WebElement btnActivate;

	public FTAManagement(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // This initElements method will create all WebElements

	}

	public static void switchParentFrame(String testData) {

		try {
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void navigateToURL(String testData) {

		try {
			OR.driver.get(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	@FindBy(id = "userNameInput")
	static WebElement txtUserName;
	@FindBy(id = "passwordInput")
	static WebElement txtpasswordInput;
	@FindBy(id = "submitButton")
	static WebElement btnsubmitButton;

	public static void setLoginId(String testData) {
		try {
			// liLogin.click();
			// // txtLoginId.clear();
			// txtLoginId.sendKeys(testData);

			// UAT
			txtUserName.clear();
			txtUserName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPassword(String testData) {
		try {
			Thread.sleep(500);
			// txtPassword.clear();
			// txtPassword.sendKeys(testData);
			txtpasswordInput.clear();
			txtpasswordInput.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickLoginBtn(String testData) {
		try {
			// btnLoginInUcustoms.click();
			// UAT
			btnsubmitButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSignOut(String testData) {
		try {

			OR.driver.switchTo().defaultContent();
			liSignOut.click();
			// OR.driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ----------------------------Menu -------------------------
	public static void clickAdminMenu(String testData) {
		try {
			menuAdmin.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSubMenuFTA(String testData) {
		try {
			subMenuFTA.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickNestedSubMenuFTAManagement(String testData) {
		try {

			nestedSubMenuFTAManagement.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// ----------------------------FTA Management create -------------------------

	public static void clickNewFTAManagement(String testData) throws Exception {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");

			btnNew.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setAgreementName(String testData) {
		try {
			txtAgreementName.sendKeys(testData);
			autocompleteAgreementName.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectDeMinimisCondition(String testData) {
		try {
			Select DeMinimisCondition = new Select(ddlDeMinimisCondition);
			DeMinimisCondition.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setMinimisValue(String testData) {
		try {
			txtMinimisValue.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setstartdateDatePicker(String testData) {
		try {
			txtstartdateDatePicker.click();
			btnToday.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickchkInDate(String testData) {
		try {
			chkInDate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectPCOType(String testData) {
		try {
			Select PCOType = new Select(ddlPCOType);
			PCOType.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCOOValidityDays(String testData) {
		try {
			txtCOOValidityDays.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCreatebttn(String testData) {
		try {
			createbttn.click();

//			WebElement requestNo = lblRequestNo;
//			FTARequestNo = requestNo.getText();
//			System.out.println("Request Number from FTA MANAGEMENT: " + requestNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickBackbttn(String testData) {
		try {
			btnBack.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// Search

	public static void setRequestNo(String testData) {
		try {
			txtRequestNumber.sendKeys(FTARequestNo);
			// txtRequestNumber.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	// Mcm admin-->Admin-->General-->Types-->Module Types-->
	// TARIFFTYPES-Open->AGREEMENTNAMETYPES >> Open

	public static void setAgreementNamesearch(String testData) {
		try {
			txtAgreementNamesearch.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectStatus(String testData) {
		try {
			Select status = new Select(ddlStatus);
			status.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSearch(String testData) {
		try {
			btnMainSearch.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	
	public static void clickResetSearch(String testData) {
		try {
			btnMainResetSearch.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	
	public static void clickOpen(String testData) {
		try {
			lnkOpen.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// -------------Associate COUNTRIES LIST

	public static void clickAssociateCountry(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");
			
			btnAssociateCountry.click();

			OR.driver.switchTo().frame(frame_TariffIItemAssLocationsLsPg); // COUNTRY LIST Frame

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCountryName(String testData) {
		try {
			txtCountryName.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCountryCode(String testData) {
		try {
			txtCountryCode.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void ClickCountrySearchbtn(String testData) {
		try {
			btnCountrySearch.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void ClickAllSaveSelectionbtn(String testData) {
		try {
			chkAll.click();
			btnSaveSelection.click();

			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// TARIFF LINE LIST

	public static void ClickAddTariffLine(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,700)");
			
			btnAddTariffLine.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectddlyear(String testData) {
		try {
			Select year = new Select(ddlyear);
			year.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setTariffCode(String testData) {
		try {
			txtTariffCode.sendKeys(testData); // Item HS Code 2020.10.1005 
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setstartdateDatePickerTariffLine(String testData) {
		try {
			txtstartdateDatePickerTariffLine.click();
			btnToday.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickInfiniteDateTariffLine(String testData) {
		try {
			chkInfiniteDateTariffLine.click();// End Date Infinite Date
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectRateBasis(String testData) {
		try {
			Select RateBasis = new Select(ddlRateBasis);
			RateBasis.selectByVisibleText(testData); // Rate Basis AD-VALOREM
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setAdValDutyRate(String testData) {
		try {
			txtAdValDutyRate.sendKeys(testData); // Ad Valorem Duty Rate 5
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCreateTariffLinebtn(String testData) {
		try {
			btnCreateTariffLine.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickBackTariffLinebtn(String testData) {
		try {
			btnBackTariffLine.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// INSPECTION INSTRUCTIONS LIST

	public static void clickInspectionAssociatebtn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,800)");
			
			btnInspectionAssociate.click();
			OR.driver.switchTo().frame(frame_FTAMgmtInspectionInstructionsPopUpLsPg);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setInstructionCode(String testData) {
		try {
			txtInstructionCode.sendKeys(testData);// Search Inspection Instruction Code CIDB
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDescriptions(String testData) {
		try {
			txtDescriptions.sendKeys(testData);// Search Inspection Instruction INSPECTION INSTRUCTION FOR CIDB
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSearchInspection(String testData) {
		try {
			btnSearchInspection.click();// Click on Search button
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickAllInspectionSave(String testData) {
		try {
			chkAllInspection.click();
			btnSaveInspection.click();

			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// Associate SUPPORTING DOCUMENTS LIST

	public static void clickAssociateSDoc(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1100)");
			
			btnAssociateSDoc.click();
			OR.driver.switchTo().frame(frame_FTAMgmtSupportingDocumentsPopUpLsPg);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDocCode(String testData) {
		try {
			txtDocCode.sendKeys(testData);// Search Document Code ABC
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDocName(String testData) {
		try {
			txtDocName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	
	public static void clickSearchSupDoc(String testData) {
		try {
			btnSearchSupDoc.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickAllDocSave(String testData) {
		try {
			chkAllDoc.click();
			btnSaveDoc.click();

			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// CERTIFICATE TYPE

	public static void clickAssCertificate(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1500)");
			
			bttnAssCertificate.click();
			OR.driver.switchTo().frame(frame_AssociateFTACertificateTypeLsPg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickAllSave(String testData) {
		try {
			chkAllCertificate.click();// Select CERTIFICATE scroll

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");

			btnSaveCertificate.click();// Click on Save Selection button

			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// Activate FTA Management

	public static void clickActivatebtn(String testData) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");

			btnActivate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

}
