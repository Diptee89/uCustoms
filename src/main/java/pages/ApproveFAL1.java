package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import config.OR;
import test.Driver_Class;

public class ApproveFAL1 {
	
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
	@FindBy(partialLinkText = "Ship Arrival Declarations")
	static WebElement nestedSubMenuShipArrivalDeclarations;
	@FindBy(partialLinkText = "Ship Departure Declarations")
	static WebElement nestedSubMenuShipDepartureDeclarations;
	// -------------SEARCH
	@FindBy(id="txtSCIdNo")
	static WebElement txtSCIdNo;
	@FindBy(id="txtNameofShip")
	static WebElement txtNameofShip;
	@FindBy(id="txtImoNo")
	static WebElement txtImoNo;
	@FindBy(id="txtSCN")
	static WebElement txtSCN;
	@FindBy(id="txtPArrival")
	static WebElement txtPArrival;
	@FindBy(id="txtJouNum")
	static WebElement txtJouNum;

	@FindBy(xpath = "//*[@id=\"leftSearchPanel\"]")
	static WebElement lnkSADSearch;
	@FindBy(id = "txtRequestNo")
	static WebElement txtRequestNo;
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[20]/td/div/input[1]")
	static WebElement btnSearchSAD;
	@FindBy(id = "StateId")
	static WebElement ddlStatusSAD;
	@FindBy(xpath = "//*[@id=\"List_ShipArrivalDeclLs_0_ID0EBABAAA\"]/a/i")
	static WebElement lnkOpenSAD;
	@FindBy(xpath = "//*[@id=\"List_ShipDepatureDeclLs_0_ID0EBABAAA\"]/a/i")
	static WebElement lnkOpenSDD;
//------------Buttons
	@FindBy(xpath = "//*[text()='Submit']")
	static WebElement btnSubmit;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;
	@FindBy(xpath = "//*[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = "//*[text()='Approve']")
	static WebElement btnApprove;
	@FindBy(xpath = "//*[text()='Reject']")
	static WebElement btnReject;
	@FindBy(xpath = "//*[text()='Return for Correction']")
	static WebElement btnReturnForCorrection;
	@FindBy(xpath = "//*[text()='Print FAL1']")
	static WebElement btnPrintFAL1;
	@FindBy(id = "txtRevRks")
	static WebElement txtReviewRks;
	

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

	public static void clickShipArrivalDecNestedSubMenu(String testData) {
		try {

			nestedSubMenuShipArrivalDeclarations.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickShipDepartureDecNestedSubMenu(String testData) {
		try {

			nestedSubMenuShipDepartureDeclarations.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	

	// =============Search

	public static void clickSearchSADRequest(String testData) {
		try {
			lnkSADSearch.click();
			txtRequestNo.sendKeys(SAD.SADRequestNumber);
			txtSCIdNo.sendKeys(CargoImport.vesselId);
			txtNameofShip.sendKeys(CargoImport.shipName);
			txtImoNo.sendKeys(CargoImport.iMONumber);
			txtSCN.sendKeys(CargoImport.shipCallNo);
			txtJouNum.sendKeys(CargoImport.JourneyNo);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectStatusSAD(String testData) {
		try {
			OR.select(ddlStatusSAD, testData);
			// Select select = new Select(ddlStatusSAD);
			// select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSearch_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnSearchSAD.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	@SuppressWarnings("static-access")
	public static void clickOpenSAD(String testData) {
		try {
//			SAD obj = new SAD(OR.driver);
			lnkOpenSAD.click();
//			SAD.SADRequestNumber = obj.txtReqNumber_SAD.getText();
//			System.out.println("SAD Request Number While Approving FAL1 by JLM Port Officer: " + SAD.SADRequestNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	public static void clickOpenSDD(String testData) {
		try {
			
			lnkOpenSDD.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
	
	// ---------------------Buttons

	public static void clickSubmit_btn(String testData) {
		try {
			btnSubmit.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSave_btn(String testData) {
		try {
			btnSave.click();

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

	public static void clickApprove_btn(String testData) {
		try {
			btnApprove.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickReject_btn(String testData) {
		try {
			btnReject.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickReturnForCorrection_btn(String testData) {
		try {
			txtReviewRks.sendKeys(testData);
			btnReturnForCorrection.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickPrintFAL1_btn(String testData) {
		try {
			btnPrintFAL1.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

}
