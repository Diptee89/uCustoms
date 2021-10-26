package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import config.OR;
import test.Driver_Class;

public class ApproveImmigration {

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
	// ---------------------------------------Menu-------
	@FindBy(xpath = "//*[@id='mb_ShipCargo']/a")
	static WebElement menuShipCargo;
	@FindBy(partialLinkText = "Ship Clearance")
	static WebElement subMenuShipClearance;
	@FindBy(partialLinkText = "Immigration Clearance List For Arrival")
	static WebElement nestedSubMenuImmigrationArrival;
	@FindBy(partialLinkText = "Immigration Clearance List For Departure")
	static WebElement nestedSubMenuImmigrationDeparture;
	
//	============Approve
	
	@FindBy(id="txtReviewRemarks")
	static WebElement txtReviewRemarks;
	@FindBy(xpath = "//*[text()='Approve']")
	static WebElement btnApprove;
	@FindBy(xpath="//*[@id='btnApprove']")
	static WebElement btnApproveFAL6;
	@FindBy(id="btnApprove")
	static WebElement btnApproveFAL5;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;
	@FindBy(id="txtwfApplicantRe")
	static WebElement txtRequestNumber;
	@FindBy(id="txtRequestNumber") 
	static WebElement txtRequestNoDep;
	@FindBy(id="ShipIdt")
	static WebElement txtShipID;
	@FindBy(id="txtshif1")
	static WebElement txtshif1;
	@FindBy(id="JrnNum")
	static WebElement txtVoyageNo;
	@FindBy(name="StateId")
	static WebElement ddlState;
//	@FindBy(name="txtStatus")
//	static WebElement txtStatus;
	               
	@FindBy(xpath="//*[@id=\"ID0EABCA\"]/td/table/tbody/tr/td/table/tbody/tr[10]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath="//*[@id=\"ID0EABCA\"]/td/table/tbody/tr/td/table/tbody/tr[8]/td/div/input[1]")
	static WebElement btnSearchDep;
	@FindBy(xpath="//*[@id=\"List_SCImmigrationClearanceLs_0_ID0EBABAAA\"]/a/i")
	static WebElement lnkOpenImmi;
	@FindBy(xpath="//*[@id=\"List_SCImmigrationClearanceDepartureLs_0_ID0EAABAAA\"]/a/i")
	static WebElement lnkOpenImmiDep;
	@FindBy(xpath="//*[@id=\"SCImmigrationClearanceFr_Links_icon\"]/i")
	static WebElement lnkRepository;
	
	@FindBy(partialLinkText="Crew List (FAL 5)")
	static WebElement lnkFAL5;
	@FindBy(partialLinkText="Passenger List (FAL 6)")
	static WebElement lnkFAL6;
	@FindBy(id = "frame_SCCrewInformationFrPg")
	static WebElement frame_FAL5;
	@FindBy(id = "frame_SCPassengersFrPg")
	static WebElement frame_FAL6;
	@FindBy(xpath = "//*[text()='Approve All']")
	static WebElement btnApproveAll;

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

	// ========================Menu Immigration
	public static void clickShipCargoMenu(String testData) {
		try {
			menuShipCargo.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickShipClearanceSubMenu(String testData) {
		try {
			subMenuShipClearance.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickImmigrationArrivalNestedSubMenu(String testData) {
		try {
			nestedSubMenuImmigrationArrival.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	public static void clickImmigrationDepartureNestedSubMenu(String testData) {
		try {
			nestedSubMenuImmigrationDeparture.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	
//	=======Search=======
	
	public static void setRequestNumber(String testData) {
		try {
			txtRequestNumber.sendKeys(SAD.SADRequestNumber);
			txtShipID.sendKeys(SAD.ShipIdentificationNo);
			txtVoyageNo.sendKeys(CargoImport.voyageNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	public static void setRequestNumberDep(String testData) {
		try {
			txtRequestNoDep.sendKeys(SAD.SADRequestNumber);
			txtshif1.sendKeys(SAD.ShipIdentificationNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	public static void selectStatus(String testData) {
		try {
			OR.select(ddlState, testData);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	
	public static void clickSearch(String testData) {
		try {
			btnSearch.click();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	public static void clickSearchDep(String testData) {
		try {
			btnSearchDep.click();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	
	public static void clickOpenImmigration(String testData) {
		try {
			lnkOpenImmi.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	public static void clickOpenImmigrationDep(String testData) {
		try {
			lnkOpenImmiDep.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	
	public static void clickFAL5_lnk(String testData) {
		try {
			lnkRepository.click();
			lnkFAL5.click();
			OR.driver.switchTo().frame(frame_FAL5);
			} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickApproveFAL5(String testData) {
		try {
			btnApproveAll.click();			
			btnApproveFAL5.click();			
			btnBack.click();
			OR.driver.switchTo().parentFrame();
			} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickFAL6_lnk(String testData) {
		try {
			lnkRepository.click();
			lnkFAL6.click();
			OR.driver.switchTo().frame(frame_FAL6);
			} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickApproveFAL6(String testData) {
		try {
			btnApproveAll.click();
			txtReviewRemarks.sendKeys(testData);
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			btnApproveFAL6.click();
			JavascriptExecutor jse1 = (JavascriptExecutor) OR.driver;
			jse1.executeScript("window.scrollBy(0,2500)");
			btnBack.click();
			OR.driver.switchTo().parentFrame();
			} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	
	public static void setReviewRemarks(String testData) {
		try {
			txtReviewRemarks.sendKeys(testData);
			} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickApprove_btn(String testData) {
		try {
			btnApprove.click();
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
