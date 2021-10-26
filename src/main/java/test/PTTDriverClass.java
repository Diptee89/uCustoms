package test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ExcelUtils;
import config.OR;
import pages.FTAManagement;

public class PTTDriverClass {
	public static Method[] meth;
	public static ExcelUtils excelUtils;
	public static boolean testResult;
	public static String testObject;
	public static String testData;
	public static int nRows;
	public static String propFilePath = "C://TFS//Automation(Selenium)//Maven_TestNG_POM_POI//uCustoms//src//main//java\\config//config.properties";


	@BeforeTest
	public static void setUp() {
		OR.openBrowser();

	}

	@Test(priority = 0)
	public static void submit_ImportJourney() throws Throwable {

		File f = new File(propFilePath);
		FileInputStream is = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(is);

		FTAManagement obj = PageFactory.initElements(OR.driver, FTAManagement.class);

		excelUtils = new ExcelUtils();
		Method[] meth = obj.getClass().getDeclaredMethods(); // Return all methods in an array

		ExcelUtils.setExcelFile(prop.getProperty("Path"), prop.getProperty("FTAManagementSheet"));
		nRows = ExcelUtils.getRowCount(prop.getProperty("FTAManagementSheet"));

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
