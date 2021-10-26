package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class ApprovePKP {

	WebDriver driver;

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
	@FindBy(partialLinkText = "Arrived Vessel Advise Form(PKP)")
	static WebElement nestedSubMenuVesselAdviseFormPKP;
	// -------------Search
	@FindBy(id = "AdviseNo")
	static WebElement txtAdviseNo;
	@FindBy(id = "Status")
	static WebElement ddlStatus; // *[@id="List_SCVesselAdvisePKPArrLs_2_ID0EAABAAA"]/a/i
	@FindBy(xpath = "//*[@id=\"List_SCVesselAdvisePKPArrLs_0_ID0EAABAAA\"]/a/i")
	static WebElement lnkOpenAdvisePKP;
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[6]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id=\"btnrestSearch\"]")
	static WebElement btnResetSearch;
	// -----------------------Shipping Agent Submit Maritime
	@FindBy(partialLinkText = "Ship Arrival Declarations")
	static WebElement nestedSubMenuShipArrivalDeclarations;

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
	// ==============Maritime

	@FindBy(id = "txtTonn")
	static WebElement txtTonn;
	@FindBy(id = "txtCabinPass")
	static WebElement txtCabinPass;
	@FindBy(id = "txtDeckPass")
	static WebElement txtDeckPass;
	@FindBy(id = "txtCrew")
	static WebElement txtCrew;

	@FindBy(id = "ddlShipStatus")
	static WebElement ddlShipStatus;
	@FindBy(id = "txtFindRem")
	static WebElement txtFindings;
	@FindBy(id = "txtRevRem")
	static WebElement txtReviewRemarks;
	// ---------------------Buttons
	@FindBy(xpath = "//button[text()='Create']")
	static WebElement btnCreate;
	@FindBy(xpath = "//*[text()='Submit']")
	static WebElement btnSubmit;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;
	@FindBy(xpath = "//*[@id=\"btnClose\"]") // *[text()='Back']
	static WebElement btnBackFormA;
	@FindBy(xpath = "//*[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = "//*[text()='Complete']")
	static WebElement btnComplete;
	@FindBy(xpath = "//*[text()='Close']")
	static WebElement btnClose;
	@FindBy(xpath = "//*[text()='Quarantine Needed']")
	static WebElement btnQuarantineNeeded;
	@FindBy(xpath = "//*[text()='Request for Maritime Declaration']")
	static WebElement btnRequestForMaritimeDeclaration;
	@FindBy(xpath = "//*[text()='Return for Correction']")
	static WebElement btnReturnForCorrection;
	@FindBy(xpath = "//*[text()='OSS Issued']")
	static WebElement btnOSSIssued;
	@FindBy(xpath = "//*[text()='Pratique Issued']")
	static WebElement btnPratiqueIssued;
	@FindBy(xpath = "//*[text()='Approve']")
	static WebElement btnApprove;
	@FindBy(xpath = "//*[text()='PHC Issued']")
	static WebElement btnPHCIssued;
	@FindBy(xpath = "//*[text()='Acknowledge PHC']")
	static WebElement btnAcknowledgePHC;
	@FindBy(xpath = "//*[text()='Maritime Declaration Submitted']")
	static WebElement btnMaritimeDeclarationSubmitted;

	
	
	
	public ApprovePKP(WebDriver driver) {

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

	// ----------------------------PKP MOH------------
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

	public static void clickVesselAdviseFormPKPNestedSubMenu(String testData) {
		try {
			nestedSubMenuVesselAdviseFormPKP.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// ==================Maritime Declaration

	// -------------Search PKP
	public static void setVesselAdviceNo(String testData) {
		try {
			//			txtAdviseNo.sendKeys(testData);
			txtAdviseNo.sendKeys(SAD.vesselAdviseNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectStatus(String testData) {
		try {
			Select select = new Select(ddlStatus);
			select.selectByVisibleText(testData);
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

	public static void clickResetSearch(String testData) {
		try {
			btnResetSearch.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickOpenAdvisePKP(String testData) {
		try {
			lnkOpenAdvisePKP.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectShipStatus(String testData) {
		try {
//			OR.select(ddlShipStatus, testData);
			Select select = new Select(ddlShipStatus);
			select.selectByVisibleText(testData);
			if ("B: Quarantine WHARF".equals(testData)) {
				txtReviewRemarks.sendKeys("Ship Status is Quarantine WHARF");
				btnQuarantineNeeded.click();
				txtFindings.sendKeys("Quarantine WHARF");
				btnOSSIssued.click();
				btnPratiqueIssued.click();

			} else if ("C: Quarantine Anchorage".equals(testData)) {
				txtReviewRemarks.sendKeys("Ship Status is Quarantine Anchorage");
				btnQuarantineNeeded.click();
				txtFindings.sendKeys("Quarantine Anchorage");
				btnOSSIssued.click();
				btnPratiqueIssued.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickRequestForMaritimeDeclaration_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,5000)");
			btnRequestForMaritimeDeclaration.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickBack_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,5000)");
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

//	-----------------SHipping Agent
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

	public static void clickSearchSADRequest(String testData) {
		try {
			lnkSADSearch.click();
			txtRequestNo.sendKeys(SAD.SADRequestNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectStatusSAD(String testData) {
		try {
			OR.select(ddlStatusSAD, testData);
			
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

	public static void clickOpenSAD(String testData) {
		try {			
			lnkOpenSAD.click();				
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	@SuppressWarnings("static-access")
	public static void clicklnkSCMarDecHead(String testData) {
		try {
			SAD obj = new SAD(OR.driver);
			obj.linkRepository.click();
			obj.lnkPKP.click();
			OR.driver.switchTo().frame(obj.frame_PKP);
			SAD.lnkRepoPKP.click();
			SAD.lnkMaritimeDeclarationofHealth.click();
			OR.driver.switchTo().frame(obj.frame_MHealthDeclaration);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setTonnage(String testData) {
		try {
			txtTonn.clear();
			txtTonn.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setCabinPass(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			txtCabinPass.clear();
			txtCabinPass.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDeckPass(String testData) {
		try {
			txtDeckPass.clear();
			txtDeckPass.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setCrew(String testData) {
		try {
			txtCrew.clear();
			txtCrew.sendKeys(testData);
			SAD.clickCreate_btn(testData);
			btnSubmit.click();
			SAD.clickClose_btn(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickMaritimeDeclarationSubmitted(String testData) {
		try {
			
			btnMaritimeDeclarationSubmitted.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickPHCIssued(String testData) {
		try {
			btnPHCIssued.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	
	public static void clickAcknowledgePHC(String testData) {
		try {
			btnAcknowledgePHC.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickApprovePKP(String testData) {
		try {
			btnApprove.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
}
