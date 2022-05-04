package test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ExcelUtils;
import config.OR;
import pages.AckIMPJourney;
import pages.ArriveJourney;
import pages.CancelIMPJourney;
import pages.CargoImport;
import pages.Container;
import pages.LoadUnload;
import pages.Manifest;
import pages.SAD;
import pages.FOT;
import pages.LoginLogout;
import pages.VesselRegistration;

public class Driver_Class {
	public static Method[] meth;
	public static ExcelUtils excelUtils;
	public static boolean testResult;
	public static String testObject;
	public static String testData;
	public static int nRows;
	public static String propFilePath = "C://TFS//Automation(Selenium)//Maven_TestNG_POM_POI//uCustoms//src//main//java\\config//config.properties";

// @Test(invocationCount = 5)

	@BeforeTest
	public static void setUp() {
		OR.openBrowser();

	}

	public static void LoginLogout() throws Throwable {
		
		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		LoginLogout obj = PageFactory.initElements(OR.driver, LoginLogout.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("LoginSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("LoginSheet"));

		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			testResult = true;
			System.out.println("Mathod || " + Keyword + "= PASSED");
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword))
					meth[j].invoke(obj, testData); // Invoke the methods from LoginLogout Class
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}

		}
		is.close();
	}
	public static void LoginPage() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		LoginLogout obj = PageFactory.initElements(OR.driver, LoginLogout.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("LoginSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("LoginSheet"));

		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			testResult = true;
			System.out.println("Mathod || " + Keyword + "= PASSED");
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword))
					meth[j].invoke(obj, testData); // Invoke the methods from LoginLogout Class
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();
	}

// @Test(priority = 1)
	public static void vesselRegistration() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		VesselRegistration obj = PageFactory.initElements(OR.driver, VesselRegistration.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("VRSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("VRSheet"));
		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);

		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			testResult = true;
			System.out.println("Mathod || " + Keyword + "= PASSED");
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword))
					meth[j].invoke(obj, testData);
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}

		}
		is.close();
	}

//	@Test(priority = 2)
	public static void submit_ImportJourney() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		CargoImport obj = PageFactory.initElements(OR.driver, CargoImport.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("CargoSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("CargoSheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);
		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass

			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword)) {
					meth[j].invoke(obj, testData); //
					testResult = true;
					System.out.println("Mathod || " + Keyword + "= PASSED");
				}
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();
	}

// @Test(priority = 3)
	public static void createContainer() throws Throwable {
		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		Container obj = PageFactory.initElements(OR.driver, Container.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ContainerSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ContainerSheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);
		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			testResult = true;
			System.out.println("Mathod || " + Keyword + "= PASSED");
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword))
					meth[j].invoke(obj, testData); // Invoke the methods from LoginLogout Class
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();
	}

	@Test(priority = 4)
	public static void manifestSubmitted() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		Manifest obj = PageFactory.initElements(OR.driver, Manifest.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ManifestSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ManifestSheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);
		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass

			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword)) {
					meth[j].invoke(obj, testData); // Invoke the methods from LoginLogout Class
					testResult = true;
					System.out.println("Mathod || " + Keyword + "= PASSED");
				}
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();
	}

//	@Test(priority = 5)
	public static void arriveImpJourney() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		ArriveJourney obj = PageFactory.initElements(OR.driver, ArriveJourney.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ArriveJourneySheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ArriveJourneySheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);
		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword)) {
					meth[j].invoke(obj, testData); // Invoke the methods from LoginLogout Class
					testResult = true;
					System.out.println("Mathod || " + Keyword + "= PASSED");
				}
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();

	}

//	@Test(priority = 6)
	public static void LoadUnloadCertification() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		LoadUnload obj = PageFactory.initElements(OR.driver, LoadUnload.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("LoadUnloadSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("LoadUnloadSheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);
		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword)) {
					meth[j].invoke(obj, testData); // Invoke the methods from LoginLogout Class
					testResult = true;
					System.out.println("Mathod || " + Keyword + "= PASSED");
				}
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();

	}

//	@Test(priority = 7)
	public static void FOT() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		FOT obj = PageFactory.initElements(OR.driver, FOT.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("FOTSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("FOTSheet"));

		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			testResult = true;
			System.out.println("Mathod || " + Keyword + "= PASSED");
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword))
					meth[j].invoke(obj, testData); // Invoke the methods from LoginLogout Class
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();
	}

//	@Test(priority = 6)
	public static void createSAD() throws Throwable {
		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		SAD obj = PageFactory.initElements(OR.driver, SAD.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ShipArrivalDecSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ShipArrivalDecSheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);

		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			testResult = true;
			System.out.println("Mathod || " + Keyword + "= PASSED");
			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword))
					meth[j].invoke(obj, testData); //
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}
		}
		is.close();
	}

//	@Test(priority = 13)
	public static void Acknowledge_ImportJourney() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		AckIMPJourney obj = PageFactory.initElements(OR.driver, AckIMPJourney.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("AckJourneySheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("AckJourneySheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);
		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass

			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword)) {
					meth[j].invoke(obj, testData); //
					testResult = true;
					System.out.println("Mathod || " + Keyword + "= PASSED");
				}
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}

		}
		is.close();
	}

// @Test(priority = 14)
	public static void cancel_ImportJourney() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		CancelIMPJourney obj = PageFactory.initElements(OR.driver, CancelIMPJourney.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("CancelImpJourenySheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("CancelImpJourenySheet"));

		System.out.println("Nubmer Of Methods: " + meth.length + " | Number of Rows: " + nRows);
		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass

			for (int j = 0; j < meth.length; j++) {
				if (meth[j].getName().equals(Keyword)) {
					meth[j].invoke(obj, testData); //
					testResult = true;
					System.out.println("Mathod || " + Keyword + "= PASSED");
				}
			}
			if (testResult == true) {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Pass", i, 6);
			} else {
				ExcelUtils.setCellData(prop.getProperty("Path"), "Fail", i, 6);
			}

		}
		is.close();
	}

}
