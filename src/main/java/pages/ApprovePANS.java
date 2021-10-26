package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import config.OR;
import test.Driver_Class;

public class ApprovePANS {
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
	@FindBy(partialLinkText = "Pre-Arrival Notification Of Security (PANS) List For Arrival")
	static WebElement nestedSubMenuPANS;
	
//	-----------Search
	@FindBy(id="txtshif1")
	static WebElement txtShipIDNo;
	@FindBy(id="txtshif2")
	static WebElement txtVoyageNumber;
	@FindBy(id="txtVesselType")
	static WebElement txtVesselName;
	@FindBy(id="txtSubmittedDate")
	static WebElement txtShipCallNo;
	@FindBy(id="txtStatus")
	static WebElement txtStatus;	
	@FindBy(xpath="//*[@id=\"ID0EABCA\"]/td/table/tbody/tr/td/table/tbody/tr[12]/td/div/input[1]")
	static WebElement btnSearch;
	
//	============Approve
	@FindBy(xpath="//*[@id=\"List_SCPANSecurityLs_0_ID0EBABAAA\"]/a/i")
	static WebElement lnkOpenPANS;
	@FindBy(id="txtReviewRemarks")
	static WebElement txtReviewRemarks;
	@FindBy(xpath = "//*[text()='Approve']")
	static WebElement btnApprove;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;
	
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

	// ========================Menu JLMPort Officer
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
	public static void clickPANSNestedSubMenu(String testData) {
		try {

			nestedSubMenuPANS.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}	
	
	
	public static void setShipIDNo(String testData) {
		try {
//			txtShipIDNo.sendKeys(testData);
			txtShipIDNo.sendKeys(SAD.ShipIdentificationNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setVoyageNumber(String testData) {
		try {
//			txtVoyageNumber.sendKeys(testData);
			txtVoyageNumber.sendKeys(CargoImport.voyageNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setVesselName(String testData) {
		try {
//			txtVesselName.sendKeys(testData);
			txtVesselName.sendKeys(SAD.ShipName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void setShipCallNo(String testData) {
		try {
//			txtShipCallNo.sendKeys(testData);
			txtShipCallNo.sendKeys(SAD.ShipCallNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void selectStatus(String testData) {
		try {
			OR.select(txtStatus, testData);
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
	public static void clickOpenPANS(String testData) {
		try {
			lnkOpenPANS.click();
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
