package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class CancelledSAD {

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
	@FindBy(xpath = "//*[@id=\"leftSearchPanel\"]")
	static WebElement lnkSADSearch;
	@FindBy(id = "StateId")
	static WebElement ddlStatusSAD;
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[20]/td/div/input[1]")
	static WebElement btnSearchSAD;
	@FindBy(xpath = "//*[@id=\"List_ShipArrivalDeclLs_0_ID0EBABAAA\"]/a/i")
	static WebElement lnkOpenSAD;

	@FindBy(id = "DDlCanReason")
	static WebElement ddlCanReason;
	@FindBy(id = "TxtCanRemarks")
	static WebElement txtCanRemarks;
	@FindBy(xpath = "//*[text()='Request For Cancellation']")
	static WebElement btnRequestForCancellation;
	@FindBy(xpath = "//*[text()='Approve']")
	static WebElement btnApprove;
	

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

	// ----------------------------Ship Arrival Declaration-------------------------
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

	public static void clicklnkSADSearch(String testData) {
		try {
			lnkSADSearch.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void selectStatusSAD(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(1000);
			Select select=new Select (ddlStatusSAD);
			select.selectByVisibleText(testData);
				} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSearch_btn(String testData) {
		try {
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

	public static void selectCanReason(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			OR.select(ddlCanReason, testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setCanRemarks(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			txtCanRemarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickRequestForCancellation(String testData) {
		try {
			btnRequestForCancellation.click();
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
}
