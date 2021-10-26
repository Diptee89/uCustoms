package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import config.OR;
import test.Driver_Class;

public class ApproveFormA {
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

	@FindBy(id = "ddlOrganization")
	static WebElement ddlOrganization;
	@FindBy(id = "ddlBusinessFunct")
	static WebElement ddlBusinessFunct;
	@FindBy(xpath = "//*[text()='Continue']")
	static WebElement btnContinue;

	// ---------------------------------------Menu-------
	@FindBy(xpath = "//*[@id='mb_ShipCargo']/a")
	static WebElement menuShipCargo;
	@FindBy(partialLinkText = "Ship Clearance")
	static WebElement subMenuShipClearance;
	@FindBy(partialLinkText = "Petroleum Safety Measures (Form A)")
	static WebElement nestedSubMenuFormA;

	@FindBy(id = "PetroleumSafetyNo")
	static WebElement txtRequestNumber;
	@FindBy(id = "txtshif1")
	static WebElement txtShipId;
	@FindBy(id = "srhtxtInfoCode")
	static WebElement txtLocationOfPetroleumCargoStored;
	@FindBy(id = "DateDatePicker")
	static WebElement DateDatePicker;
	@FindBy(xpath = "//*[text()='Today']")
	static WebElement btnToday;
	@FindBy(name = "StateId")
	static WebElement ddlStatus;
	@FindBy(xpath = "//*[@id=\"ID0EABCA\"]/td/table/tbody/tr/td/table/tbody/tr[12]/td/div/input[1]")
	static WebElement btnSearch;

	@FindBy(xpath = "//*[@id=\"List_SCPetroleumSafMeasuresLs_0_ID0EBABAAA\"]/a/i")
	static WebElement lnkOpenFormA_Che;
	@FindBy(id = "checkbox2")
	static WebElement chkInspectionFee;
	@FindBy(id = "textarea2")
	static WebElement txtReviewRemarks;
	@FindBy(xpath = "//*[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;
	@FindBy(xpath = "//*[text()='Submit to JLM Officer']")
	static WebElement btnSubmitToJLMOfficer;
	@FindBy(xpath = "//*[text()='Return for Correction']")
	static WebElement btnReturnForCorrection;
	@FindBy(xpath = "//*[@id=\"List_SCPetroleumSafMeasuresLs_0_ID0EBABAAA\"]/a/i")
	static WebElement lnkOpenFormA_JLM;
	@FindBy(xpath = "//*[text()='Approve']")
	static WebElement btnApprove;

	@FindBy(xpath = "//*[@id=\"exctttxt\"]")
	static WebElement alertRegistration;
	@FindBy(name = "txtRegiRefNo")
	static WebElement txtRegiRefNo;
	@FindBy(name = "ddlClass")
	static WebElement ddlClass;
	@FindBy(name = "txtFlashPoint")
	static WebElement txtFlashPoint;
	@FindBy(name = "ddlDecisionL")
	static WebElement ddlDecisionL;

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

	public static void selectOrganization(String testData) {
		try {
			OR.select(ddlOrganization, testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectUserProfile(String testData) {
		try {
			OR.select(ddlBusinessFunct, testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickContinue(String testData) {
		try {
			btnContinue.click();
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

	public static void clickFormANestedSubMenu(String testData) {
		try {
			nestedSubMenuFormA.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// =======================Search
	public static void setRequestNo(String testData) {
		try {
			txtRequestNumber.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setShipIdentification(String testData) {
		try {
			txtShipId.sendKeys(SAD.ShipIdentificationNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectStatus(String testData) {
		try {
			OR.select(ddlStatus, testData);
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

	public static void clickOpenFormAChem(String testData) {
		try {
			lnkOpenFormA_Che.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickInspectionFee(String testData) {
		try {

			WebElement checkbox = chkInspectionFee;
			if (!checkbox.isSelected()) {
				checkbox.click();
			}

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

	public static void clickSubmitToJLMOfficer(String testData) {
		try {
			btnSubmitToJLMOfficer.click();
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickOpenFormA_JLM(String testData) {
		try {
			lnkOpenFormA_JLM.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickApprove(String testData) {
		try {
			btnApprove.click();

			if ("Please Enter Registration Ref. No.".equals(alertRegistration.getText())) {
				txtRegiRefNo.sendKeys("REG001");
				OR.select(ddlClass, "Class I");
				txtFlashPoint.sendKeys("1200");
				OR.select(ddlDecisionL, "Approved Pending Payment");
				btnApprove.click();
			}
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}
}
