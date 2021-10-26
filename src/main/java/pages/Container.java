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

public class Container {

	WebDriver driver;
	public static String impJourneyNo;
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
	@FindBy(linkText = "Import Journey")
	static WebElement nestedSubMenuImportJourney;
	@FindBy(name = "StateId") // *[@id="4"]
	static WebElement ddlStatus;
	@FindBy(xpath = "//*[@id='ID0EABBA']/td/table/tbody/tr/td/table/tbody/tr[14]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id='List_JourneyLs_0_ID0EBABAAA']/a/i")
	static WebElement List_JourneyLs_0;

	@FindBy(xpath = "//*[@id='JourneyFr_Links_icon']/i")
	static WebElement JourneyFr_Links_icon;
	@FindBy(linkText = "Container and Vehicle Information")
	static WebElement lnkContainer_Vehicle;
	@FindBy(id = "frame_JourneyContainerLsPg")
	static WebElement frame_JourneyContainerLsPg;
	@FindBy(xpath = "//*[@id='submitbutton2']")
	static WebElement btnsubmitbutton2;
	@FindBy(xpath = "//*[@id='submitbutton1']")
	static WebElement btnsubmitbutton1;

	@FindBy(xpath = "//*[@id='ddlkind']")
	static WebElement ddlkind;
	@FindBy(xpath = "//*[@id='IsISOType']")
	static WebElement IsISOType;
	@FindBy(xpath = "//*[@id='txtContainerNo']")
	static WebElement txtContainerNo;
	@FindBy(xpath = "//*[@id='ddlKindType']")
	static WebElement ddlKindType;
	@FindBy(xpath = "//*[@id='ddlContainerLoadType']")
	static WebElement ddlContainerLoadType;
	@FindBy(xpath = "//*[@id='txtTareWt']")
	static WebElement txtTareWt;
	@FindBy(xpath = "//*[@id='ddlTareWeightUOM']")
	static WebElement ddlTareWeightUOM;
	@FindBy(xpath = ".//*[@id='autocompletediv']/li/a")
	static WebElement autocompletediv;
	@FindBy(xpath = "//*[@id='txtgrossweight']")
	static WebElement txtgrossweight;
	@FindBy(xpath = "//*[@id='PGrossUOM']")
	static WebElement PGrossUOM;
	@FindBy(xpath = "//*[@id='txtiso']")
	static WebElement txtiso;
	@FindBy(xpath = "//*[@id='txttemparature']")
	static WebElement txttemparature;
	@FindBy(xpath = "//*[@id='txtseal']")
	static WebElement txtseal;
	@FindBy(xpath = "//*[@id='txtpackages']")
	static WebElement txtpackages;
	@FindBy(xpath = "//*[@id='txtQantityUOM']")
	static WebElement txtQantityUOM;
	@FindBy(xpath = "//*[@id='textarea1']")
	static WebElement textarea1;
	@FindBy(xpath = "//*[@id='txtRemarks']")
	static WebElement txtRemarks;
	@FindBy(id = "frame_CancellationPg")
	static WebElement frame_CancellationPg;
	@FindBy(id = "ddlCancellationReason")
	static WebElement ddlCancellationReason;
	@FindBy(xpath = "//*[@id=\"List_JourneyContainerLs_0_Cell_CopyEdit\"]/a")
	static WebElement lnkCopy_Edit;
	
	@FindBy(xpath = "//*[@id=\"List_JourneyContainerLs_ColHeader_\"]/a")
	static WebElement List_Container_No;
	@FindBy(xpath = "//*[@id=\"List_JourneyContainerLs_ColHeader_ISOCode\"]/a")
	static WebElement List_Container_Size;
	@FindBy(xpath = "//*[@id=\"List_JourneyContainerLs_ColHeader_ISOCode\"]/a")
	static WebElement List_Container_Type;
	@FindBy(xpath = "//*[@id=\"List_JourneyContainerLs_ColHeader_\"]/a")
	static WebElement List_Status;
	@FindBy(xpath = "//*[@id=\"close\"]")
	static WebElement btnClose;
	
	
	

	// ---------------------Buttons
	@FindBy(xpath = "//button[text()='Create']")
	static WebElement btnCreate;
	@FindBy(xpath = "//button[text()='Back']")
	static WebElement btnBack;
	@FindBy(xpath = "//button[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = "//button[text()='Cancel Container'][@id='cancelBL'][@name='cancelBL']")
	static WebElement btnCancelContainer;
	@FindBy(xpath = "//button[text()='OK']")
	static WebElement btnOK;
	
	
	public Container(WebDriver driver) {

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

	// -----------------------Containers & Vehicle

	public static void clickJourneyFr_Links_icon(String testData) {
		try {
			JourneyFr_Links_icon.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickContainer_Vehicle_lnk(String testData) {
		try {
			lnkContainer_Vehicle.click();
			Driver_Class.testResult = false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void clickNewCon_btn(String testData) {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			OR.driver.switchTo().frame(frame_JourneyContainerLsPg);
			btnsubmitbutton2.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickDelete_btn(String testData) {
		try {
			btnsubmitbutton1.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectKinds(String testData) {
		try {
			Select select = new Select(ddlkind);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsISOType(String testData) {
		try {
			WebElement checkbox = IsISOType;
			
			if (!checkbox.isSelected())
				checkbox.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setContainerNo(String testData) {
		try {
			Random rand = new Random();
			int value = rand.nextInt(1000000);
			txtContainerNo.sendKeys(testData + value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectKindType(String testData) {
		try {
			Select select = new Select(ddlKindType);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectContainerLoadType(String testData) {
		try {
			Select select = new Select(ddlContainerLoadType);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setTareWt(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,300)");
			txtTareWt.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectTareWeightUOM(String testData) {
		try {
			ddlTareWeightUOM.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setGrossWeight(String testData) {
		try {
			txtgrossweight.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPGrossUOM(String testData) {
		try {
			PGrossUOM.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setISO(String testData) {
		try {
			txtiso.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setTemparature(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,300)");
			txttemparature.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setSeal(String testData) {
		try {
			txtseal.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPackages(String testData) {
		try {
			txtpackages.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setQantityUOM(String testData) {
		try {
			txtQantityUOM.sendKeys(testData);
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDescription(String testData) {
		try {
			textarea1.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setRemarks(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1500)");
			txtRemarks.sendKeys(testData);
			
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

	public static void clickBack_btn(String testData) {
		try {
			// JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			// jse.executeScript("window.scrollBy(0,1500)");
			btnBack.click();
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

	public static void clickCancelContainer_btn(String testData) {
		try {

			btnCancelContainer.click();
			OR.driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	
	public static void selectCancellationReason_ddl(String testData) {
		try {
			OR.driver.switchTo().frame(frame_CancellationPg);
	Select select =new Select (ddlCancellationReason);
	select.selectByVisibleText(testData);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		Driver_Class.testResult = false;
	}
}
	public static void clickOK_btn(String testData) {
		try {
			btnOK.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			OR.driver.switchTo().frame(frame_JourneyContainerLsPg);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		Driver_Class.testResult = false;
	}
}
	
	public static void clickCopy_Edit(String testData) {
		try {
			lnkCopy_Edit.click();
			
	} catch (Exception e) {
		System.out.println(e.getMessage());
		Driver_Class.testResult = false;
	}
}
	public static void clickContainer_Sorting(String testData) {
		try {
			List_Container_No.click();
			List_Container_Size.click();
			List_Container_Type.click();
			List_Status.click();
			
	} catch (Exception e) {
		System.out.println(e.getMessage());
		Driver_Class.testResult = false;
	}
}
	
	public static void clickClose_Edit(String testData) {
		try {
			btnClose.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
	} catch (Exception e) {
		System.out.println(e.getMessage());
		Driver_Class.testResult = false;
	}
}
	
}
