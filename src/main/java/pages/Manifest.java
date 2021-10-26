package pages;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class Manifest {
	WebDriver driver;

	public static String impJourneyNo;
	public static String houseBLNo;
	// ------------------------------------------Login------------------------------------
	@FindBy(xpath = "//*[@id='signin-link']/strong")
	static WebElement liLogin;
	@FindBy(xpath = "//*[@id='sUserId']")
	static WebElement txtLoginId;
	@FindBy(xpath = "//*[@id='sUserPassword']")
	static WebElement txtPassword;
	@FindBy(xpath = "//*[@id='signin-dropdown']/form/table/tbody/tr[6]/td/input")
	static WebElement btnLoginInUcustoms;
	@FindBy(xpath = "//*[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a")
	static WebElement liSignOut;
	// --------------------------------Open Import
	// Journey---------------------------------------------------------------
	@FindBy(xpath = "//*[@id='mb_ShipCargo']/a")
	static WebElement menuShipCargo;
	@FindBy(linkText = "Journey and Manifest")
	static WebElement subMenuJourneyAndManifest;
	@FindBy(linkText = "Import Journey")
	static WebElement nestedSubMenuImportJourney;
	@FindBy(name = "StateId") // *[@id="4"]
	static WebElement ddlStatus;
	@FindBy(xpath = "//*[@id='ID0EABBA']/td/table/tbody/tr/td/table/tbody/tr[14]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id='List_JourneyLs_0_ID0EBABAAA']/a/i")
	static WebElement List_JourneyLs_0;

	// ---------------------------------------------------------------------------------------------
	@FindBy(xpath = "//*[@id='btnGetNewManifests']")
	static WebElement btnNewManifests;

	@FindBy(xpath = "//*[@id='cbNilCargo']")
	static WebElement chkNilCargo;
	@FindBy(xpath = "//*[@id='CustomStation']")
	static WebElement txtCustomStation;
	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li/a")
	static WebElement listAutocompletediv;

	@FindBy(xpath = "//*[@id='ddlStorageType']")
	static WebElement ddlStorageType;
	@FindBy(xpath = "//*[@id='txtPort']")
	static WebElement txtPort;
	@FindBy(xpath = "//*[@id='txtWHCode']")
	static WebElement txtWHCode;
	@FindBy(xpath = "//*[@id='ddlManifestFor']")
	static WebElement ddlManifestFor;
	@FindBy(xpath = "//*[@id='ddlStorageTypeManifestType']")
	static WebElement ddlStorageTypeManifestType;
	@FindBy(xpath = "//*[@id='txtRemarks']")
	static WebElement txtRemarks;
	@FindBy(xpath = "//*[@id='chktranship']")
	static WebElement chktranship;
	@FindBy(xpath = "//*[@id=\"chkallID2EWD\"]")
	static WebElement chkAllCreatedManfest;
	@FindBy(xpath = "//*[@id=\"btnDeleteManifests\"]")
	static WebElement btnDeleteManifests;
	@FindBy(xpath = "//*[@id=\"Container\"]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[2]/center[2]/a")
	static WebElement btnAlertBack;
	@FindBy(xpath = "//*[@id=\"Container\"]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[1]")
	static WebElement lblAlert;
//	=======================BL===========
	@FindBy(linkText = "Manifest")
	static WebElement nestedSubMenuManifest;
	
	@FindBy(xpath = "//*[@id='ManifestNumber']")
	static WebElement txtManifestNumber;
//	@FindBy(xpath = "//*[@id=\"4\"]")
//	static WebElement ddlStatus;
//	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[10]/td/div/input[1]")
//	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id=\"List_ManifestLs_0_ID0ECABAAA\"]/a/i")
	static WebElement List_ManifestLs;
	@FindBy(xpath = "//button[text()='Create']")
	static WebElement btnCreate;		
	@FindBy(xpath = "//*[@id='txtremarks']")
	static WebElement txtremarks;
	@FindBy(xpath = "//*[@id='txtPortofLanding']")
	static WebElement txtPortofLanding;
	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li[1]/a")
	static WebElement autoComplete;
	@FindBy(xpath = "//*[@id='UnitQtyLanded']")
	static WebElement txtUnitQtyLanded;
	@FindBy(xpath = "//*[@id='BOlQuantity']")
	static WebElement txtBOlQuantity;
	@FindBy(xpath = ".//*[@id='quantitymanifested']")
	static WebElement txtQuantityManifested;
	@FindBy(xpath = "//*[@id='ddlGrossWeightUOM']")
	static WebElement txtGrossWeightUOM;
	@FindBy(xpath = "//*[@id='gweight']")
	static WebElement txtGrossWeight;
	@FindBy(xpath = "//*[@id='txtMarks']")
	static WebElement txtMarks;
	@FindBy(xpath = "//*[@id='description']")
	static WebElement txtDescription;
	@FindBy(xpath = "//*[@id='txtHouseBillNumber']")
	static WebElement txtHouseBillNumber;
	@FindBy(xpath = "//*[@id='btnHBNew']")
	static WebElement btnHBNew;

//	===================HB Parties

	@FindBy(xpath = "//*[@id='HouseBillsFr_Links_icon']/i")//*[@id="HouseBillsFr_Links_icon"]/i
	static WebElement HouseBillsFr_Links_icon;
	@FindBy(linkText = "HB Parties")
	static WebElement linkHBParties;
	@FindBy(xpath = "//iframe[@id='frame_HBPartiesFrPg']")
	static WebElement frame_HBPartiesFrPg;
	@FindBy(xpath = "//*[@id='txtConsignee']")
	static WebElement txtConsignor;
	@FindBy(xpath = "//*[@id='autocompletediv']/li/a")
	static WebElement AutoCompleted;
	@FindBy(xpath = "//*[@id='txtSHBPartyName']")
	static WebElement txtSHBPartyName;
	@FindBy(xpath = "//*[@id='StextAddress1']")
	static WebElement StextAddress1;
	@FindBy(xpath = "//*[@id='country']")
	static WebElement txtCountry;
	@FindBy(xpath = "//*[@id='Createbttn']")
	static WebElement btnCreate_HBP;
	@FindBy(xpath = "//*[@id='submitbutton1']")
	static WebElement btnClose;
	@FindBy(id="SNMtxtState")
	static WebElement txtState;
	@FindBy(id="SNMtxtCity")
	static WebElement txtCity;
	@FindBy(id="SNMtxtPostalCode")
	static WebElement txtPostalCode;
	@FindBy(id="IsNPAsCon")
	static WebElement chkIsNPAsCon;

	@FindBy(xpath = "//*[@id='btnSaveNewHBItem']")
	static WebElement btnSaveNewHBItem;
	@FindBy(xpath = "//*[@id='btnHBItemNew']")
	static WebElement btnHBItemNew;
	@FindBy(xpath = "//*[@id='txtHS6code']")
	static WebElement txtHS6code;
	@FindBy(xpath = "//*[@id='txtCountryOfOrigin']")
	static WebElement txtCountryOfOrigin;
	@FindBy(xpath = "//*[@id='CargoClass']")
	static WebElement ddlCargoClass;
	@FindBy(xpath = "//*[@id='txtQuantity']")
	static WebElement txtQuantity;
	@FindBy(xpath = "//*[@id='txtQantityUOM']")
	static WebElement txtQantityUOM;
	@FindBy(xpath = "//*[@id='txtGrossWeight']")
	static WebElement txtGrossWeight_Item;
	@FindBy(xpath = "//*[@id='txtGrossWeightUOM']")
	static WebElement txtGrossWeightUOM_Item;
	@FindBy(xpath = "//*[@id='txtDesc']")
	static WebElement txtDesc;
	@FindBy(xpath = "//*[@id='chkManifestsDisclaimer']")
	static WebElement chkManifestsDisclaimer;
	@FindBy(xpath = "//*[text()='Submit Manifest']")
	static WebElement btnSubmitManifest;
	
	@FindBy(xpath = "//*[@id=\"List_ManifestHouseBillLs_0_ID1EAABCAA\"]/a/i")
	static WebElement chkList_ManifestHouseBillLs;
	@FindBy(xpath = "//button[text()='Create/View D.O.']")
	static WebElement btnCreateViewDO;
	@FindBy(xpath = "//button[text()='Issue D.O.']")
	static WebElement btnIssueDO;
	// buttons================================================

	@FindBy(xpath = "//*[text()='Create Manifest ']")
	static WebElement btnCreateManifest;
	@FindBy(xpath = "//*[text()='OK']")
	static WebElement btnOK;
	@FindBy(xpath = "//*[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = "//*[text()='Cancel Manifest']")
	static WebElement btnCancelManifest;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;

	public Manifest(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // This initElements method will create all WebElements

	}

	public static void navigateToURL(String testData) {

		try {
			OR.driver.get(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLoginId(String testData) {
		try {
			liLogin.click();
			// txtLoginId.clear();
			txtLoginId.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPassword(String testData) {
		try {
			Thread.sleep(500);
			// txtPassword.clear();
			txtPassword.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickLoginBtn(String testData) {
		try {

			btnLoginInUcustoms.click();
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

	// -----------------------------Import Journey-------------------------
	public static void clickShipCargoMenu(String testData) {
		try {
			menuShipCargo.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickJourneyAndManifestSubMenu(String testData) {
		try {
			subMenuJourneyAndManifest.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickImportJourneyNestedSubMenu(String testData) {
		try {
			nestedSubMenuImportJourney.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectStatus(String testData) {
		try {
			// ----------Switch to main iframe--------------
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

			Select status = new Select(ddlStatus);
			status.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSearch_btn(String testData) {
		try {
			btnSearch.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickList_JourneyLs_0(String testData) {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			List_JourneyLs_0.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// --------------------------------Manifest--------------------------------------
	public static void clickNew(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			btnNewManifests.click(); // Click on New button
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickNilCargo_chk(String testData) {
		try {
			WebElement checkbox = chkNilCargo;
			if (!checkbox.isSelected())
				checkbox.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setCustoms_Station(String testData) {
		try {
			txtCustomStation.clear();
			txtCustomStation.sendKeys(testData);
			listAutocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectStorageType(String testData) {
		try {
			Select storageType = new Select(ddlStorageType); // Storage Type
			storageType.selectByVisibleText(testData);

			// if(testData == "Warehouse") {
			// txtWHCode.sendKeys("%%");
			// listAutocompletediv.click();
			// }else {
			// txtPort.sendKeys("%%");
			// listAutocompletediv.click();
			//
			// }
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setStorage_Location(String testData) {
		try {

			// txtWHCode.sendKeys(testData);
			// listAutocompletediv.click();
			txtPort.sendKeys(testData);
			listAutocompletediv.click();
			//

		} catch (Exception e) {

			txtWHCode.sendKeys(testData);
			listAutocompletediv.click();

			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectManifestFor(String testData) {
		try {

			if (testData == "Outward") {
				
			} else if (testData == "Inward") {
				Select manifestFor = new Select(ddlManifestFor); // Manifest for
				manifestFor.selectByVisibleText(testData);
			} else {
				Select manifestFor = new Select(ddlManifestFor); // Manifest for
				manifestFor.selectByVisibleText(testData);
				txtPort.sendKeys("%%");
				listAutocompletediv.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectType(String testData) {
		try {
			Select storageType = new Select(ddlStorageTypeManifestType); // Storage Type
			storageType.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setRemarks(String testData) {
		try {
			txtRemarks.sendKeys(testData);// Remarks
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickTransshipment_chk(String testData) {
		try {
			WebElement checkbox = chktranship;
			if (!checkbox.isSelected())
				checkbox.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickCreateManifest_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");

			btnCreateManifest.click();// Create Manifest

		} catch (Exception e) {

			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickOK_btn(String testData) {
		try {

			btnOK.click();
		} catch (Exception e) {

			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickAlert_btn(String testData) {
		try {

			System.out.println(lblAlert.getText());
			btnAlertBack.click();
			btnBack.click();

		} catch (Exception e) {

			btnOK.click();
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCancelManifest_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnCancelManifest.click();
			OR.driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickBack_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnBack.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSave_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnSave.click();
			btnOK.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickAllCreatedManfest_chk(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");

			WebElement checkbox = chkAllCreatedManfest;
			if (!checkbox.isSelected())
				checkbox.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickDelete_btn(String testData) {
		try {

			btnDeleteManifests.click();
			OR.driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

//	======================HBill==============================
	public static void clickManifestNestedSubMenu(String testData) {
		try {
			nestedSubMenuManifest.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
//	public static void setManifestNumber(String testData) {
//		try {
//			txtManifestNumber.sendKeys(testData);
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//
//		}
//	}
//	public static void selectStatus(String testData) {
//		try {
//			Select select =new Select (ddlStatus);
//			select.selectByVisibleText(testData);
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//
//		}
//	}
//	public static void clickSearch_btn(String testData) {
//		try {
//			btnSearch.click(); // Bill of Lading No.
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//
//		}
//	}
	public static void clickList_ManifestLs(String testData) {
		try {
			List_ManifestLs.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickHBNew_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnHBNew.click(); // Bill of Lading No.

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setHouseBillNumber(String testData) {
		try {
			Random rand = new Random();
			int value = rand.nextInt(1000);
			String billOfLadingNo = Integer.toString(value);
			txtHouseBillNumber.clear();
			txtHouseBillNumber.sendKeys(testData + billOfLadingNo);

			houseBLNo = testData + billOfLadingNo;
			System.out.println(houseBLNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// ----------------Goods Details--------------------------
	public static void setDescription(String testData) {
		try {
			// ----------Srcoll-------------------
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");
			txtDescription.clear();
			txtDescription.sendKeys(testData); // Description
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setMarks(String testData) {
		try {
			txtMarks.clear();
			txtMarks.sendKeys(testData); // Marks
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setGrossWeight(String testData) {
		try {
			txtGrossWeight.sendKeys(testData); // Gross Weight

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setGrossWeightUOM(String testData) {
		try {
			txtGrossWeightUOM.sendKeys(testData); // Gross Weight (UOM)
			autoComplete.click();

		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setQuantityManifested(String testData) {
		try {
			txtQuantityManifested.sendKeys(testData); // Quantity Manifested (Total
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}

	}

	public static void setPackages_TypeQuantityManifested(String testData) {
		try {
			txtBOlQuantity.sendKeys(testData); // Packages Type (Qty. Manifested)
			autoComplete.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setQuantityLanded(String testData) {
		try {
			txtUnitQtyLanded.clear();
			txtUnitQtyLanded.sendKeys(testData); // Packages
			autoComplete.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setPortofLanding(String testData) {
		try {
			txtPortofLanding.clear();
			txtPortofLanding.sendKeys(testData); // Port // Loading
			autoComplete.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setremarks(String testData) {
		try { // Landed)
				// -----------------Scroll--------------
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			txtremarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCreate_btn(String testData) {
		try {
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	
//	public static void clickBack_btn(String testData) {
//		try {
//			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
//			jse.executeScript("window.scrollBy(0,2000)");
//			btnBack.click();
//			
//			jse.executeScript("window.scrollBy(0,2000)");
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//
//		}
//	}

//	==================HB Parties
	

	public static void clickHBParties_link(String testData) {
		try {
			HouseBillsFr_Links_icon.click();
			linkHBParties.click();
			OR.driver.switchTo().frame(frame_HBPartiesFrPg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setConsignor_Registered(String testData) {
		try {
			txtConsignor.sendKeys(testData);
			AutoCompleted.click();

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,300)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setConsignee(String testData) {
		try {
			txtSHBPartyName.sendKeys(testData); // Shipper
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setConsigneeAddress1(String testData) {
		try {
			StextAddress1.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setCountry(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,700)");
			
			txtCountry.sendKeys(testData);
			AutoCompleted.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	
	public static void setState(String testData) {
		try {
			txtState.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setCity(String testData) {
		try {
			txtCity.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setPostalCode(String testData) {
		try {
			txtPostalCode.sendKeys(testData);
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsNPAsCon(String testData) {
		try {
			chkIsNPAsCon.click(); //Notify Party same as Consignee
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickCreateHBP_btn(String testData) {
		try {
			btnCreate_HBP.click(); // Create
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickClose_btn(String testData) {
		try {
			btnClose.click(); // Close			
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}


//	===================Items======

	
	public static void clickHBItemNew_btn(String testData) {
		try {
//			OR.driver.switchTo().defaultContent();
//			OR.driver.switchTo().frame("contentframe");
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,3000)");
			
			btnHBItemNew.click(); // New
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setHS6_Code(String testData) {
		try {
			txtHS6code.sendKeys(testData); // HS Code (HS6)
			autoComplete.click(); // list

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCountryOfOrigin(String testData) {
		try {
			txtCountryOfOrigin.sendKeys(testData);
			autoComplete.click(); // list
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectCargoClass(String testData) {
		try {
			Select cargoClass = new Select(ddlCargoClass); // Cargo Class
			cargoClass.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setQuantity(String testData) {
		try {
			txtQuantity.clear();
			txtQuantity.sendKeys(testData); // Quantity

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setQantity_UOM(String testData) {
		try {
			txtQantityUOM.sendKeys(testData); // Quantity (UOM)
			autoComplete.click(); // List

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setGrossWeight_Item(String testData) {
		try {
			txtGrossWeight_Item.clear();
			txtGrossWeight_Item.sendKeys(testData); // Gross Weight

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setGrossWeight_UOM(String testData) {
		try {
			txtGrossWeightUOM_Item.sendKeys(testData); // Gross Weight (UOM)
			autoComplete.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCaroDescription(String testData) {
		try {
			txtDesc.sendKeys(testData); // Cargo
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCreate_HBItem_btn(String testData) {
		try {
			btnSaveNewHBItem.click(); // Create
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

//	public static void clickBack_btn(String testData) {
//		try {
//			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
//			jse.executeScript("window.scrollBy(0,2000)");
//			btnBack.click();
//			
//			jse.executeScript("window.scrollBy(0,2000)");
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//
//		}
//	}
	public static void clickManifestsDisclaimer(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			WebElement checkbox = chkManifestsDisclaimer;
			if (!checkbox.isSelected())
				checkbox.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickSubmitManifest_btn(String testData) {
		try {
			btnSubmitManifest.click();
			btnOK.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
//	==========DOIssues

//	public static void clickList_ManifestHouseBillLs(String testData) {
//		try {
//			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
//			jse.executeScript("window.scrollBy(0,1000)");
//			chkList_ManifestHouseBillLs.click();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//		}
//	}
//	public static void clickCreateView_DO_btn(String testData) {
//		try {
//			btnCreateViewDO.click();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//		}
//	}
//	public static void clickIssueDO_btn(String testData) {
//		try {
//			btnIssueDO.click();
//			btnOK.click();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Driver_Class.testResult = false;
//		}
//	}
//
//	
}
