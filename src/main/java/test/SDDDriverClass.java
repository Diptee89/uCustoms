package test;

import java.lang.reflect.Method;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ExcelUtils;
import config.OR;
import pages.ApproveFAL1;
import pages.ApproveImmigration;
import pages.CargoExport;
import pages.LoadUnload;
import pages.Manifest;
import pages.SDD;
import pages.SOC;

public class SDDDriverClass {
	public static Method[] meth;
	public static ExcelUtils excelUtils;
	public static boolean testResult;
	public static String testObject;
	public static String testData;
	public static int nRows;
	public static String propFilePath = "C://TFS//Automation(Selenium)//Maven_TestNG_POM_POI//uCustoms//src//main//java\\config//config.properties";

	// @Test(invocationCount = 50)

	@BeforeTest
	public static void setUp() {
		OR.openBrowser();
	}

	@Test(priority = 0)
	public static void submit_ExportJourney() throws Throwable {
		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		CargoExport obj = PageFactory.initElements(OR.driver, CargoExport.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ExportJourneySheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ExportJourneySheet"));

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

	@Test(priority = 1)
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

	@Test(priority = 2)
	public static void CreateSDD() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		SDD obj = PageFactory.initElements(OR.driver, SDD.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ShipDepartureDecSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ShipDepartureDecSheet"));
		System.out.println("Nubmer Of Methods: " + meth.length + " || Number of Rows: " + nRows);

		for (int i = 1; i < nRows; i++) {
			String Keyword = ExcelUtils.getCellData(i, 3); // Action_Keyword
			testData = ExcelUtils.getCellData(i, 4); // test Data Login id & pass
			testResult = true;
			System.out.println("Mathod || " + Keyword + "|| PASSED");
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

	@Test(priority = 3)
	public static void approveFAL1() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		ApproveFAL1 obj = PageFactory.initElements(OR.driver, ApproveFAL1.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ApproveSDDSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ApproveSDDSheet"));

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

	@Test(priority = 4)
	public static void approveImmigration() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		ApproveImmigration obj = PageFactory.initElements(OR.driver, ApproveImmigration.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("ApproveImmigrationDepSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("ApproveImmigrationDepSheet"));

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
	
	@Test(priority = 5)
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
	
	@Test(priority = 6)
	public static void CreateSOC() throws Throwable {
		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		SOC obj = PageFactory.initElements(OR.driver, SOC.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("SOCSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("SOCSheet"));

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
}
