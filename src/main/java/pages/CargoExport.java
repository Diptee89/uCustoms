package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class CargoExport {
//	public static String JourneyNo;

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
	// -----------------------------------------------------------------------------------------------
	@FindBy(xpath = "//*[@id='mb_ShipCargo']/a")
	static WebElement menuShipCargo;
	@FindBy(linkText = "Journey and Manifest")
	static WebElement subMenuJourneyAndManifest;
	@FindBy(linkText = "Export Journey")
	static WebElement nestedSubMenuEportJourney;
	@FindBy(id = "txtOrginport")
	static WebElement txtPortDeparture;
	@FindBy(xpath = ".//*[@id='autocompletediv']/li/a")
	static WebElement autocompletediv;
	@FindBy(xpath = "//button[text()='New']")
	static WebElement btnNew;
	@FindBy(id="frame_NewExpJourneyConfirmFrPg")
	static WebElement frame_NewExpJourneyConfirm;
	
	@FindBy(id = "portname")
	static WebElement txtportname;
	@FindBy(id = "NextPortOfCall")
	static WebElement txtNextPortOfCall;
	@FindBy(xpath = ".//*[@id='txtLastPortOfCallATADatePicker']")
	static WebElement txtLastPortOfCallATADatePicker;
	@FindBy(xpath = "//*[@id='ddlLastPortOfCallATAHrs']")
	static WebElement ddlLastPortOfCallATAHrs;
	@FindBy(xpath = "//*[@id='ddlLastPortOfCallATAMin']")
	static WebElement ddlLastPortOfCallATAMin;
	@FindBy(xpath = "//button[text()='Today']")
	static WebElement btnToday;
	@FindBy(xpath = ".//*[@id='txtLastPortOfCallATDDatePicker']")
	static WebElement txtLastPortOfCallATDDatePicker;
	@FindBy(xpath = ".//*[@id='ddlLastPortOfCallATDHrs']")
	static WebElement ddlLastPortOfCallATDHrs;
	@FindBy(xpath = ".//*[@id='ddlLastPortOfCallATDMin']")
	static WebElement ddlLastPortOfCallATDMin;
	@FindBy(xpath = ".//*[@id='LastPortOfCallVoyageNo']")
	static WebElement txtLastPortOfCallVoyageNo;
	@FindBy(xpath = ".//*[@id='LastPortOfCallPurposeOfCall']")
	static WebElement ddlLastPortOfCallPurposeOfCall;
	@FindBy(xpath = ".//*[@id='LastPortOfCallISPS']")
	static WebElement ddlLastPortOfCallISPS;
	@FindBy(xpath = ".//*[@id='EntryPoint']")
	static WebElement txtEntryPoint;
	@FindBy(xpath = ".//*[@id='dateofshipmentDatePicker']")
	static WebElement dateofshipmentDatePicker;
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/div/select[1]")
	static WebElement month_datepicker;
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/div/select[2]")
	static WebElement year_datepicker;
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]/a") // 2nd Row 1 Column
	static WebElement select_date;
	@FindBy(xpath = "//*[@id='DateOfShipmentHrs']")
	static WebElement ddlDateOfShipmentHrs;
	@FindBy(xpath = "//*[@id='DateOfShipmentMins']")
	static WebElement ddlDateOfShipmentMins;
	@FindBy(xpath = ".//*[@id='ExpectedArrivalDateDatePicker']")
	static WebElement ExpectedArrivalDate;
	@FindBy(xpath = ".//*[@id='ddlExpectedArrivalDateHrs']")
	static WebElement ddlExpectedArrivalDateHrs;
	@FindBy(xpath = ".//*[@id='ddlExpectedArrivalDateMins']")
	static WebElement ddlExpectedArrivalDateMins;
	@FindBy(xpath = ".//*[@id='ExpectedDepartureDateDatePicker']")
	static WebElement ExpectedDepartureDate;
	@FindBy(xpath = ".//*[@id='ExpectedDepartureDateHrs']")
	static WebElement ExpectedDepartureDateHrs;
	@FindBy(xpath = ".//*[@id='ExpectedDepartureDateMins']")
	static WebElement ExpectedDepartureDateMins;
	@FindBy(xpath = ".//*[@id='ShipName']")
	static WebElement txtShipName;
	@FindBy(id = "VesselId")
	static WebElement txtVesselId;
	@FindBy(xpath = ".//*[@id='IMONumber']")
	static WebElement txtIMONumber;
	@FindBy(xpath = ".//*[@id='CaptainName']")
	static WebElement txtCaptainName;
	@FindBy(xpath = ".//*[@id='ActualBerth']")
	static WebElement txtActualBerth;
	@FindBy(xpath = ".//*[@id='txtCountryofShipOp']")
	static WebElement txtCountryofShipOp;
	@FindBy(xpath = ".//*[@id='txtFreshWR']")
	static WebElement txtFreshWR;
	@FindBy(xpath = ".//*[@id='txtWRQuantity']")
	static WebElement txtWRQuantity;
	@FindBy(xpath = ".//*[@id='txtQuantUOM']")
	static WebElement txtQuantUOM;
	@FindBy(xpath = ".//*[@id='txtVoyageNo']")
	static WebElement txtVoyageNo;
	@FindBy(xpath = ".//*[@id='txtDepartureVoyageNo']")
	static WebElement txtDepartureVoyageNo;
	@FindBy(xpath = ".//*[@id='txtBerthalong']")
	static WebElement txtBerthalong;
	@FindBy(xpath = "//*[@id='txtTugBoatVesselId']")
	static WebElement txtTugBoatVesselId;
	@FindBy(xpath = "//*[@id='txtDraughtPortSideAft']")
	static WebElement txtDraughtPortSideAft;
	@FindBy(xpath = "//*[@id='ddlDPSAFTUOM']")
	static WebElement ddlDPSAFTUOM;
	@FindBy(xpath = " //*[@id='txtDraughtPortSideForward']")
	static WebElement txtDraughtPortSideForward;
	@FindBy(xpath = "//*[@id='ddlDPSFUOM']")
	static WebElement ddlDPSFUOM;
	@FindBy(xpath = "//*[@id='txtDraughtStarboardAFT']")
	static WebElement txtDraughtStarboardAFT;
	@FindBy(xpath = "//*[@id='ddlDStarboardAFTUOM']")
	static WebElement ddlDStarboardAFTUOM;
	@FindBy(xpath = "//*[@id='txtDraughtStarboardForward']")
	static WebElement txtDraughtStarboardForward;
	@FindBy(xpath = "//*[@id='ddlDraughtStarboardForwardUOM']")
	static WebElement ddlDraughtStarboardForwardUOM;
	@FindBy(xpath = "//*[@id='ArrivalBerth']")
	static WebElement txtArrivalBerth;
	@FindBy(xpath = "//*[@id='txtArrivalDraught']")
	static WebElement txtArrivalDraught;
	@FindBy(xpath = "//*[@id='ddlArrivalDraughtUOM']")
	static WebElement ddlArrivalDraughtUOM;
	@FindBy(xpath = "//*[@id='txtBerth']")
	static WebElement txtBerth;
	@FindBy(xpath = "//*[@id='txtLocationName']")
	static WebElement txtLocationName;
	@FindBy(xpath = "//*[@id='txtInboundService']")
	static WebElement txtInboundService;
	@FindBy(xpath = "//*[@id='txtOutBoundService']")
	static WebElement txtOutBoundService;
	@FindBy(xpath = "//*[@id='txtCargoOperation']")
	static WebElement txtCargoOperation;
	@FindBy(xpath = "//*[@id='txtContcount']")
	static WebElement txtContcount;
	@FindBy(xpath = "//*[@id='ddlCargoType']")
	static WebElement ddlCargoType;
	@FindBy(xpath = "//*[@id='txtCargoWeight']")
	static WebElement txtCargoWeight;
	@FindBy(xpath = "//*[@id='txtWeightUOM']")
	static WebElement txtWeightUOM;
	@FindBy(xpath = "//*[@id='txtPOCode']")
	static WebElement txtPOCode;
	@FindBy(xpath = "//*[@id='txtPLAcNo']")
	static WebElement txtPLAcNo;
	@FindBy(xpath = ".//*[@id='Loadingremarks']")
	static WebElement txtLoadingremarks;
	@FindBy(xpath = ".//*[@id='Dischargeremarks']")
	static WebElement txtDischargeremarks;
	@FindBy(xpath = ".//*[@id='remarks']")
	static WebElement txtRemarks;
	@FindBy(xpath = "//*[@id='JourneyNumber']")
	static WebElement lblJourneyNumber;
	@FindBy(xpath = "//*[@id='chkIsMultiplePort']")
	static WebElement chkIsMultiplePort;
	@FindBy(name = "StateId") // *[@id="4"]
	static WebElement ddlStatus;
	@FindBy(xpath = "//*[@id='ID0EABBA']/td/table/tbody/tr/td/table/tbody/tr[14]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id='List_JourneyLs_0_ID0EBABAAA']/a/i")
	static WebElement List_JourneyLs_0;
	@FindBy(xpath = "//*[@id='btnJRClose']")
	static WebElement btnJRClose;
	@FindBy(xpath = "//*[@id='frame_JourneyRoutesLsPg']")
	static WebElement frame_JourneyRoutesLsPg;
	@FindBy(xpath = "//*[@id='txtDateETDDatePicker']")
	static WebElement txtDateETDDatePicker;
	@FindBy(xpath = "//*[@id='List_JourneyRoutesLs_0_ddFromHourETD']")
	static WebElement List_JourneyRoutesLs_0_ddFromHourETD;
	@FindBy(xpath = "//*[@id='List_JourneyRoutesLs_0_ddFromMinETD']")
	static WebElement List_JourneyRoutesLs_0_ddFromMinETD;

	@FindBy(xpath = "//*[@id='txtDateETADatePicker']")
	static WebElement txtDateETADatePicker;
	@FindBy(xpath = "//*[@id='List_JourneyRoutesLs_1_ddFromHourETA']")
	static WebElement List_JourneyRoutesLs_1_ddFromHourETA;
	@FindBy(xpath = "//*[@id='List_JourneyRoutesLs_1_ddFromMinETA']")
	static WebElement List_JourneyRoutesLs_1_ddFromMinETA;
	@FindBy(xpath = "//*[@id='//*[@id=\"savebttn\"]']")
	static WebElement savebttn;
	// --------------------------Buttons----------------------------------------

	@FindBy(xpath = "//button[text()='Create']")
	static WebElement btnCreate;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;
	@FindBy(xpath = "//*[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = "//*[text()='Cancel Journey']")
	static WebElement btnCancelJourney;
	@FindBy(xpath = "//button[text()='OK']")
	static WebElement btnOK;
	@FindBy(xpath = "//button[text()='Submit Journey']")
	static WebElement btnSubmitJourney;
	@FindBy(xpath = "//button[text()='Amend']")
	static WebElement btnAmend;
	@FindBy(xpath = "//button[text()='Create Manifest']")
	static WebElement btnCreateManifest;
	@FindBy(xpath = "//button[text()='Cancel Manifest']")
	static WebElement btnCancelManifest;
	@FindBy(xpath = "//button[text()='Request for Amendment']")
	static WebElement btnRequestForAmendment;
	@FindBy(xpath = "//button[text()='Split Bill']")
	static WebElement btnSplitBill;
	@FindBy(xpath = "//button[text()='Cancel Bill']")
	static WebElement btnCancelBill;
	@FindBy(xpath = "//button[text()='Cancel Bill Line']")
	static WebElement btnCancelBillLine;


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
			nestedSubMenuEportJourney.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
//============Create Import Journey
	public static void setPortDeparture(String testData) {
		try {
			// ----------Switch to main iframe--------------
			

			// ----------Import Journey New ------------
			txtPortDeparture.clear();
			txtPortDeparture.sendKeys(testData);
			autocompletediv.click();
			
			CargoImport.portOfArrival=txtPortDeparture.getAttribute("value");
			System.out.println(txtPortDeparture.getAttribute("irmsg"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickNew(String testData) {
		try {
			btnNew.click();
			OR.driver.switchTo().frame(frame_NewExpJourneyConfirm);
			btnOK.click();
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setPortOfDischarge(String testData) {
		try {
			txtportname.clear();
			txtportname.sendKeys(testData);
			autocompletediv.click();
			CargoImport.portOfOrigin=txtportname.getAttribute("value");
			System.out.println(txtportname.getAttribute("irmsg"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	
	public static void setNextPortOfCall(String testData) {
		try {
			txtNextPortOfCall.sendKeys(testData);
			autocompletediv.click();
			System.out.println(txtNextPortOfCall.getAttribute("irmsg"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setEntryPoint(String testData) {
		try {
			txtEntryPoint.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickDateOfShipment(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,400)");

			dateofshipmentDatePicker.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void select_Year(String testData) {
		try {
			Select year = new Select(year_datepicker);
			year.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void select_Month_Date(String testData) {
		try {

			Select month = new Select(month_datepicker);
			month.selectByVisibleText(testData);

			select_date.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectDateOfShipment_Hrs(String testData) {
		try {
			Select hrs = new Select(ddlDateOfShipmentHrs);
			hrs.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectDateOfShipment_Mins(String testData) {
		try {
			Select mins = new Select(ddlDateOfShipmentMins);
			mins.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickExpectedDeparture(String testData) {
		try {
			ExpectedDepartureDate.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectExpectedDeparture_Hrs(String testData) {
		try {
			Select hrs = new Select(ExpectedDepartureDateHrs);
			hrs.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectExpectedDeparture_Mins(String testData) {
		try {

			Select mins = new Select(ExpectedDepartureDateMins);
			mins.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setVesselID(String testData) {
		try {

			txtVesselId.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setIMONumber(String testData) {
		try {
			txtIMONumber.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setShipName_VesselName(String testData) {
		try {
//			 txtShipName.sendKeys("RAINBOW"); 
			txtShipName.sendKeys(testData);
//			 txtShipName.sendKeys("%%"+VesselRegistration.shipName);
			Thread.sleep(2000);
			autocompletediv.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setCaptainName(String testData) {
		try {
			txtCaptainName.sendKeys(testData);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setActualBerth(String testData) {
		try {

			txtActualBerth.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCountryofShipOp(String testData) {
		try {

			txtCountryofShipOp.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setFreshWater(String testData) {
		try {

			txtFreshWR.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setFreshWaterQuantity(String testData) {
		try {

			txtWRQuantity.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setFreshWaterQuantity_UOM(String testData) {
		try {

			txtQuantUOM.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	public static void setDepartureVoyageNo(String testData) {
		try {
			txtDepartureVoyageNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setTugBoatVesselId(String testData) {
		try {
			txtTugBoatVesselId.sendKeys(testData);
			autocompletediv.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDraughtPortSideAft(String testData) {
		try {
			txtDraughtPortSideAft.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectDPSAFTUOM(String testData) {
		try {
			Select select = new Select(ddlDPSAFTUOM);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDraughtPortSideForward(String testData) {
		try {
			txtDraughtPortSideForward.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectDPSFUOM(String testData) {
		try {
			Select select = new Select(ddlDPSFUOM);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDraughtStarboardAFT(String testData) {
		try {
			txtDraughtStarboardAFT.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectDStarboardAFTUOM(String testData) {
		try {
			Select select = new Select(ddlDStarboardAFTUOM);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDraughtStarboardForward(String testData) {
		try {
			txtDraughtStarboardForward.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectDraughtStarboardForwardUOM(String testData) {
		try {
			Select select = new Select(ddlDraughtStarboardForwardUOM);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setArrivalBerth(String testData) {
		try {
			txtArrivalBerth.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setArrivalDraught(String testData) {
		try {
			txtArrivalDraught.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectArrivalDraughtUOM(String testData) {
		try {
			Select select = new Select(ddlArrivalDraughtUOM);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setBerth(String testData) {
		try {
			txtBerth.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setLocationName(String testData) {
		try {
			txtLocationName.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setInboundService(String testData) {
		try {
			txtInboundService.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setOutBoundService(String testData) {
		try {
			txtOutBoundService.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCargoOperation(String testData) {
		try {
			txtCargoOperation.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setContcount(String testData) {
		try {
			txtContcount.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCargoType(String testData) {
		try {
			Select select = new Select(ddlCargoType);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setCargoWeight(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,400)");

			txtCargoWeight.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setWeightUOM(String testData) {
		try {
			txtWeightUOM.sendKeys(testData); // Berth Alongside
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setPOCode(String testData) {
		try {
			txtPOCode.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setPLAcNo(String testData) {
		try {
			txtPLAcNo.sendKeys(testData); // Berth Alongside
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setLoadingremarks(String testData) {
		try {
			txtLoadingremarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setDischargeremarks(String testData) {
		try {
			txtDischargeremarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setRemarks(String testData) {
		try {
			txtRemarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCreate_JourneyBtn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnCreate.click(); // Create Button
			btnOK.click(); // OK
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
@FindBy(id="ShipCallNotxt")
static WebElement txtShipCallNo;
	public static void clickSubmit_JourneyBtn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnSubmitJourney.click(); // Submit
			WebElement journeyNo = lblJourneyNumber;
			CargoImport.JourneyNo = journeyNo.getText();
			System.out.println("Import Journey no. from Journey screen: " + CargoImport.JourneyNo);

			btnOK.click(); // OK
				
			
			JavascriptExecutor jse1 = (JavascriptExecutor) OR.driver;
			jse1.executeScript("window.scrollBy(0,300)");
			CargoImport.vesselId= txtVesselId.getAttribute("value");
			CargoImport.iMONumber =txtIMONumber.getAttribute("value");
			CargoImport.shipName= txtShipName.getAttribute("value");
			CargoImport.shipCallNo= txtShipCallNo.getAttribute("value");
			System.out.println("Vessel Identification No.: "+CargoImport.vesselId+", IMO Number: "+CargoImport.iMONumber+", Ship Name/Vessel Name: "+CargoImport.shipName+", Ship Call No. (SCN): "+CargoImport.shipCallNo);
//			Thread.sleep(2000);		
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
			List_JourneyLs_0.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickMultiplePorts_chk(String testData) {
		try {
			WebElement checkbox = chkIsMultiplePort;
			// boolean isChecked = checkbox.isSelected();
			// System.out.println("The checkbox is selection state is - " + isChecked);

			if (!checkbox.isSelected()) {
				checkbox.click();

				OR.driver.switchTo().alert().getText();
				OR.driver.switchTo().alert().accept();
				OR.driver.switchTo().frame(frame_JourneyRoutesLsPg);

			} else {
				checkbox.click();

				OR.driver.switchTo().alert().getText();
				OR.driver.switchTo().alert().accept();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickETD(String testData) {
		try {
			txtDateETDDatePicker.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectETD_Hrs(String testData) {
		try {
			Select hrs = new Select(List_JourneyRoutesLs_0_ddFromHourETD);
			hrs.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectETD_Mins(String testData) {
		try {
			Select mins = new Select(List_JourneyRoutesLs_0_ddFromMinETD);
			mins.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickETA(String testData) {
		try {
			txtDateETADatePicker.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectETA_Hrs(String testData) {
		try {
			Select hrs = new Select(List_JourneyRoutesLs_1_ddFromHourETA);
			hrs.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectETA_Mins(String testData) {
		try {
			Select mins = new Select(List_JourneyRoutesLs_1_ddFromMinETA);
			mins.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSaveJR_btn(String testData) {
		try {
			savebttn.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickRClose_btn(String testData) {
		try {
			btnJRClose.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

		} catch (Exception e) {
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

}
