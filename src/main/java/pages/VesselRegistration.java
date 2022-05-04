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

public class VesselRegistration {
	WebDriver driver;
	public static String shipName;
	// ------------------------------------------Login------------------------------------
	@FindBy(xpath = "//*[@id=\"signin-link\"]/strong")
	static WebElement liLogin;
	@FindBy(xpath = "//*[@id=\"sUserId\"]")
	static WebElement txtLoginId;
	@FindBy(xpath = "//*[@id=\"sUserPassword\"]")
	static WebElement txtPassword;
	@FindBy(xpath = "//*[@id=\"signin-dropdown\"]/form/table/tbody/tr[6]/td/input")
	static WebElement btnLoginInUcustoms;
	@FindBy(xpath = "//*[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a")
	static WebElement liSignOut;

	// -----------------------------------------VR------------------------------------------------
	@FindBy(xpath = "//*[@id='mb_Registration']/a")
	static WebElement menuRegistration;
	@FindBy(linkText = "Carrier")
	static WebElement subMenuCarrier;
	@FindBy(linkText = "Vessel Registration")
	static WebElement nestedSubMenuVR;
	@FindBy(id = "btnNew")
	static WebElement btnNew;
	@FindBy(xpath = "//*[@id='txtFrnship']")
	static WebElement rdFrnship;
	@FindBy(xpath = "//*[text()='Create']")
	static WebElement btnCreate;
	@FindBy(xpath = "//*[@id='txtVesselName']")
	static WebElement txtVesselName;
	@FindBy(xpath = ".//*[@id='ddVesselType']")
	static WebElement ddVesselType;
	@FindBy(xpath = "//*[@id=\"txtOtherVesselType\"]")
	static WebElement txtOtherVesselType;
	@FindBy(xpath = ".//*[@id='txtYear']")
	static WebElement txtYear;
	@FindBy(xpath = ".//*[@id='txtIMONumber']")
	static WebElement txtIMONumber;
	@FindBy(xpath = "//*[@id='txtFlagOfShip']")
	static WebElement txtFlagOfShip;
	@FindBy(xpath = ".//*[@id='autocompletediv']/li[1]/a")
	static WebElement autocompletediv;
	@FindBy(xpath = ".//*[@id='txtCalSign']")
	static WebElement txtCalSign;
	@FindBy(xpath = ".//*[@id='txtLBP']")
	static WebElement txtLBP;
	@FindBy(xpath = ".//*[@id='ddlVSLTr']")
	static WebElement ddlVSLTr;
	@FindBy(xpath = "//*[@id=\"ddlVslTrm\"]")
	static WebElement ddlVslTrm;
	@FindBy(xpath = "//*[@id=\"txtLOA\"]")
	static WebElement txtLOA;
	@FindBy(xpath = "//*[@id=\"txtTeuCap\"]")
	static WebElement txtTeuCap;
	@FindBy(xpath = "//*[@id=\"txtRegNo\"]")
	static WebElement txtOfficelNo;
	@FindBy(xpath = "//*[@id=\"txtPortOfReg\"]")
	static WebElement txtPortOfReg;
	@FindBy(xpath = "//*[@id=\"txtCertRegDateDatePicker\"]")
	static WebElement txtCertRegDateDatePicker;
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]")
	static WebElement btnToday;
	@FindBy(xpath = ".//*[@id='txtDeadWtMet']")
	static WebElement txtDeadWtMet;
	@FindBy(xpath = ".//*[@id='txtGrossRegTons']")
	static WebElement txtGrossRegTons;
	@FindBy(xpath = ".//*[@id='txtNetRegTons']")
	static WebElement txtNetRegTons;
	@FindBy(xpath = "//*[@id=\"txtpandiclub\"]")
	static WebElement txtpandiclub;
	@FindBy(xpath = "//*[@id=\"txtPosofBridge\"]")
	static WebElement txtPosofBridge;
	@FindBy(xpath = "//*[@id=\"IsGearedY\"]")
	static WebElement rdIsGearedY;
	@FindBy(xpath = "//*[@id=\"txtStandardDraught\"]")
	static WebElement txtStandardDraught;
	@FindBy(xpath = "//*[@id=\"txtDisplacementWt\"]")
	static WebElement txtDisplacementWt;
	@FindBy(xpath = ".//*[@id='ddTypeofhull']")
	static WebElement ddTypeofhull;
	@FindBy(xpath = ".//*[@id='ddlbeam']")
	static WebElement ddlbeam;
	@FindBy(xpath = "//*[@id=\"txtLocBoard1\"]")
	static WebElement txtLocBoard1;
	@FindBy(xpath = "//select[@id='ddlAreaofOperation']")
	static WebElement ddlAreaofOperation;
	@FindBy(xpath = ".//*[@id='taRemarks']")
	static WebElement txtRemarks;
	@FindBy(xpath = "//*[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = ".//*[text()='Back']")
	static WebElement btnBack;
	@FindBy(xpath = ".//*[@id='VesselsFr_Links_icon']/i")
	static WebElement VesselsFr_Links_icon;
	@FindBy(linkText = "Ship Owner Details")
	static WebElement lnkShipOwnr;
	@FindBy(id = "frame_ShipOwnerDetailsFrPg")
	static WebElement frame_ShipOwnerDetailsFrPg;
	@FindBy(xpath = ".//*[@id='rbtnRegistered']")
	static WebElement rbtnRegistered;
	@FindBy(xpath = ".//*[@id='rbtnUnRegistered']")
	static WebElement rbtnUnregistered;
	@FindBy(xpath = "//*[@id=\"txtBRN\"]")
	static WebElement txtBRN;
	@FindBy(xpath = "//*[@id=\"txtShipOwnname\"]")
	static WebElement txtShipOwnname;
	@FindBy(xpath = "//*[@id=\"txtEmailId\"]")
	static WebElement txtEmailId;
	@FindBy(xpath = "//*[@id=\"txtMobileNo\"]")
	static WebElement txtMobileNo;
	@FindBy(xpath = "//*[@id=\"txtAddress1\"]")
	static WebElement txtAddress1;
	@FindBy(xpath = "//*[@id=\"txtAddress2\"]")
	static WebElement txtAddress2;
	@FindBy(xpath = "//*[@id=\"txtAddress3\"]")
	static WebElement txtAddress3;
	@FindBy(xpath = "//*[@id=\"txtPostalCodeId\"]")
	static WebElement txtPostalCodeId;
	@FindBy(xpath = "//*[@id=\"txtCityName\"]")
	static WebElement txtCityName;
	@FindBy(xpath = "//*[@id=\"txtStateName\"]")
	static WebElement txtStateName;
	@FindBy(xpath = "//*[@id=\"txtCountryId\"]")
	static WebElement txtCountryId;
	@FindBy(xpath = ".//*[@id='btnimo']")
	static WebElement btnimo;
	@FindBy(id = "frame_ShipOwnerRegistredLsPg")
	static WebElement frame_ShipOwnerRegistredLsPg;
	@FindBy(xpath = ".//*[@id='List_ShipOwnerRegistredLs_1_Name']/a")
	static WebElement List_ShipOwnerRegistredLs_1_Name;
	@FindBy(xpath = "//button[text()='Close']")
	static WebElement btnClose;
	@FindBy(linkText = "Charterer Details")
	static WebElement lnkChartererDetails;
	@FindBy(id = "frame_ScchartererDetailsFrPg")
	static WebElement frame_ScchartererDetailsFrPg;
	@FindBy(id = "txtCharCode")
	static WebElement txtCharCode;
	@FindBy(id = "txtCharName")
	static WebElement txtCharNamee;
	@FindBy(id = "txtAddress1")
	static WebElement txtAddress1_CHR;
	@FindBy(id = "txtAddress2")
	static WebElement txtAddress2_CHR;
	@FindBy(id = "txtAddress3")
	static WebElement txtAddress3_CHR;
	@FindBy(id = "txtPostCode")
	static WebElement txtPostCode;
	@FindBy(id = "txtCity")
	static WebElement txtCity;
	@FindBy(id = "txtState")
	static WebElement txtState;
	@FindBy(id = "txtcountryname")
	static WebElement txtcountryname;
	@FindBy(id = "txtMobile")
	static WebElement txtMobile;
	@FindBy(id = "textemail")
	static WebElement textemail;
	@FindBy(xpath = "//input[@id=\"chkManifestsDisclaimer\"]")
	static WebElement chkManifestsDisclaimer;
	@FindBy(xpath = ".//*[@id='btnSubmit']")
	static WebElement btnSubmit;
	@FindBy(xpath = "//*[@id=\"VesselName\"]")
	static WebElement VesselName;
	@FindBy(xpath = ".//*[@id='ddlstatus']")
	static WebElement ddlstatus;
	@FindBy(xpath = ".//*[@id='ID0EABBA']/td/table/tbody/tr/td/table/tbody/tr[16]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = ".//*[@id='List_VesselsLs_0_cell_lnkOpen']/a/i")
	static WebElement List_VesselsLs_0_cell_lnkOpen;
	@FindBy(xpath = ".//*[@id='taRevRemarks']")
	static WebElement taRevRemarks;
	@FindBy(xpath = ".//*[text()='Return for Correction']")
	static WebElement btnReturnForCorrection;
	@FindBy(xpath = ".//*[text()='Reject']")
	static WebElement btnReject;
	@FindBy(xpath = ".//*[text()='Approve']")
	static WebElement btnApprove;
	@FindBy(xpath = "//*[@id=\"List_VesselsLs_0_ID0EAABAAA\"]/a")
	static WebElement lnkTransactionHistory;
	@FindBy(id = "frame_VesselsHistoryLsPg")
	static WebElement frame_VesselsHistoryLsPg;
	@FindBy(linkText = "Ship Identification No.")
	static WebElement lnkShipIdentificationNo;
	@FindBy(linkText = "User Profile")
	static WebElement lnkUserProfile;
	@FindBy(linkText = "Operation")
	static WebElement lnkOperation;
	@FindBy(linkText = "Date and Time")
	static WebElement lnkDateAndTime;
	@FindBy(linkText = "Status")
	static WebElement lnkStatus;
	@FindBy(xpath = "//*[@id=\"close\"]")
	static WebElement btnClose_Tra;

	public VesselRegistration(WebDriver driver) {

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

	public static void clickRegistrationMenu(String testData) {
		try {
			menuRegistration.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSubMenu(String testData) {
		try {
			subMenuCarrier.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNestedSubMenu(String testData) {
		try {
			nestedSubMenuVR.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNew_btn(String testData) {
		try {
			OR.driver.switchTo().defaultContent(); // --------Switch to main frame----------------------
			OR.driver.switchTo().frame("contentframe");
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1100)");

			btnNew.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickFrnship_rdb(String testData) {
		try {
			rdFrnship.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickCreate_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setVesselName_txt(String testData) {
		try {
			
			txtVesselName.clear();
			Random rand = new Random();
			int value = rand.nextInt(1000);
			String gShipName = Integer.toString(value);

			txtVesselName.sendKeys(testData + gShipName);
			shipName = testData + gShipName;
			System.out.println("GetText " + shipName);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickVesselType_ddl(String testData) {
		try {
			Select vesseltype = new Select(ddVesselType);
			if (testData == "OTHERS") {
				txtOtherVesselType.sendKeys("Yaak Boat");
			} else {
				vesseltype.selectByVisibleText(testData);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setYear(String testData) {
		try {
			txtYear.clear();
			txtYear.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setIMONumber(String testData) {
		try {
			txtIMONumber.clear();
			Random rand = new Random();
			int value = rand.nextInt(10000);
			String IMO = Integer.toString(value);
			txtIMONumber.sendKeys(testData + IMO);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setFlagOfShip(String testData) {
		try {
			txtFlagOfShip.clear();
			txtFlagOfShip.sendKeys(testData);
			autocompletediv.click();
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setCalSignNo(String testData) {
		try {
			txtCalSign.clear();
			txtCalSign.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLBP(String testData) {
		try {
			txtLBP.clear();
			txtLBP.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickVesselTrade_ddl(String testData) {
		try {
			Select VesselTrade = new Select(ddlVSLTr);
			VesselTrade.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickVesselTerm_ddl(String testData) {
		try {
			Select VesselTrade = new Select(ddlVslTrm);
			VesselTrade.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLOA(String testData) {
		try {
			txtLOA.clear();
			txtLOA.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setTEUCapacity(String testData) {
		try {
			txtTeuCap.clear();
			txtTeuCap.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setOfficialNo(String testData) {
		try {
			txtOfficelNo.clear();
			txtOfficelNo.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortOfReg(String testData)  {
		try {
			txtPortOfReg.clear();
			txtPortOfReg.sendKeys(testData);
			Thread.sleep(500);
			autocompletediv.click();
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickCertRegDateDatePicker(String testData)  {
		try {
			txtCertRegDateDatePicker.click();
			btnToday.click();
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDeadWtMet(String testData) {
		try {
			txtDeadWtMet.clear();
			txtDeadWtMet.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setGRT(String testData) {
		try {
			txtGrossRegTons.clear();
			txtGrossRegTons.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNRT(String testData) {
		try {
			// -------------Scroll -------------------
			txtNetRegTons.clear();
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			txtNetRegTons.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setpandiclub(String testData) {
		try {
			// -------------Scroll -------------------
			txtpandiclub.clear();
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			txtpandiclub.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectPosofBridge_ddl(String testData) {
		try {
			// -------------Scroll -------------------
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			Select PosofBridge = new Select(txtPosofBridge);
			PosofBridge.selectByVisibleText(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setStandardDraught(String testData) {
		try {
			txtStandardDraught.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDisplacementWt(String testData) {
		try {
			txtDisplacementWt.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectTypeofhull_ddl(String testData) {
		try {
			Select typeofHull = new Select(ddTypeofhull);
			typeofHull.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setBeam(String testData) {
		try {
			ddlbeam.clear();
			ddlbeam.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setCargoType(String testData) {
		try {
			txtLocBoard1.sendKeys(testData);
			autocompletediv.click();
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectAreaofOperation_ddl(String testData) {
		try {
			Select select = new Select(ddlAreaofOperation);
			// select.selectByIndex(1);
			// select.selectByValue(testData);
			select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setRemarks(String testData) {
		try {
			txtRemarks.clear();
			txtRemarks.sendKeys(testData);
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickBack_btn(String testData) {
		try {
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickTransactionHistory(String testData) {

		try {
			OR.driver.switchTo().defaultContent(); // --------Switch to main frame----------------------
			OR.driver.switchTo().frame("contentframe");
			lnkTransactionHistory.click();
			OR.driver.switchTo().frame(frame_VesselsHistoryLsPg);
			Thread.sleep(1000);
			OR.takeSnapShot("TransactionH");
			lnkShipIdentificationNo.click();
			lnkUserProfile.click();
			lnkOperation.click();
			lnkDateAndTime.click();
			lnkStatus.click();
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1100)");
			btnClose_Tra.click();
			OR.driver.switchTo().defaultContent(); // --------Switch to main frame----------------------
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickVesselsFr_Links_icon(String testData) {
		try {
			VesselsFr_Links_icon.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickShipOwnr_lnk(String testData) {
		try {
			lnkShipOwnr.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	// -------------------------------Registered------------------------------------------
	public static void clickRegistered_rb(String testData) {
		try {
			OR.driver.switchTo().frame(frame_ShipOwnerDetailsFrPg);
			rbtnRegistered.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickShipOwnerName(String testData) {
		try {
			btnimo.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickShipOwnerReg_list(String testData) {
		try {
			OR.driver.switchTo().frame(frame_ShipOwnerRegistredLsPg);
			List_ShipOwnerRegistredLs_1_Name.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickCreateSO_btn(String testData) {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			OR.driver.switchTo().frame(frame_ShipOwnerDetailsFrPg);

			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// --------Un Registered------------------------------------------
	public static void clickUnregistered_rb(String testData) {
		try {
			// OR.driver.switchTo().frame(frame_ShipOwnerDetailsFrPg);
			rbtnUnregistered.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setBRN_NRIC_PassportNo(String testData) {
		try {
			txtBRN.clear();
			txtBRN.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setShipOwnerName(String testData) {
		try {
			txtShipOwnname.clear();
			txtShipOwnname.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setEmailId(String testData) {
		try {
			txtEmailId.clear();
			txtEmailId.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setMobileNo(String testData) {
		try {// *[@id="txtMobileNo"]
			txtMobileNo.clear();
			txtMobileNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setAddress1(String testData) {
		try {// *[@id="txtAddress1"]
			txtAddress1.clear();
			txtAddress1.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setAddress2(String testData) {
		try {// *[@id="txtAddress2"]
			txtAddress2.clear();
			txtAddress2.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setAddress3(String testData) {
		try {// *[@id="txtAddress3"]
			txtAddress3.clear();
			txtAddress3.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setPostalCodeId(String testData) {
		try {
			txtPostalCodeId.clear();
			txtPostalCodeId.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setCityName(String testData) {
		try {// *[@id="txtCityName"]
			txtCityName.clear();
			txtCityName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setStateName(String testData) {
		try {
			
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			txtStateName.clear();
			txtStateName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setCountryId(String testData) {
		try {
			txtCountryId.sendKeys(testData);			
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickSave_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			
			btnSave.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickClose_btn(String testData) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");

			btnClose.click();

			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// -------------Charterer Details--------------------------------
	public static void clickChartererDetails_lnk(String testData) {
		try {
			lnkChartererDetails.click();
			OR.driver.switchTo().frame(frame_ScchartererDetailsFrPg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setChartererCode(String testData) {
		try {
			txtCharCode.clear();
			txtCharCode.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setCharName(String testData) {
		try {
			txtCharNamee.clear();
			txtCharNamee.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setAddress1_CHR(String testData) {
		try {
			txtAddress1_CHR.clear();
			txtAddress1_CHR.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setAddress2_CHR(String testData) {
		try {
			txtAddress2_CHR.clear();
			txtAddress2_CHR.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setAddress3_CHR(String testData) {
		try {
			txtAddress3_CHR.clear();
			txtAddress3_CHR.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setPostalCode_CHR(String testData) {
		try {
			txtPostCode.clear();
			txtPostCode.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setCity_CHR(String testData) {
		try {
			txtCity.clear();
			txtCity.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setState_CHR(String testData) {
		try {
			txtState.clear();
			txtState.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setCountryName_CHR(String testData) {
		try {
			txtcountryname.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setMobile_CHR(String testData) {
		try {
			txtMobile.clear();
			txtMobile.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void setEmail_CHR(String testData) {
		try {
			textemail.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}
	// --------------------------------------------------

	public static void clickManifestsDisclaimer_chk(String testData) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2300)");

			WebElement checkbox = chkManifestsDisclaimer;
			boolean isChecked = checkbox.isSelected();
			System.out.println("The checkbox is selection state is - " + isChecked);

			if (!checkbox.isSelected())
				chkManifestsDisclaimer.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSubmit_btn(String testData) {
		try {
			btnSubmit.click();
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setVesselName(String testData) {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			VesselName.clear();
			VesselName.sendKeys(shipName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickStatus_ddl(String testData) {
		try {
			Select select = new Select(ddlstatus);
			// status.selectByVisibleText(testData);
			select.selectByIndex(12);
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

	public static void clickVessel_list(String testData) {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

			List_VesselsLs_0_cell_lnkOpen.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setReviewRemarks(String testData) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			taRevRemarks.clear();
			taRevRemarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickReturnForCorrection(String testData) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");

			btnReturnForCorrection.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickReject(String testData) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");

			btnReject.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	public static void clickApprove_btn(String testData) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");

			btnApprove.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}
}
