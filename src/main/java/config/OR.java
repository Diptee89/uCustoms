package config;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class OR {

	public static WebDriver driver;
	public static Random rand;
	

	public static String fileWithPath = "C:\\TFS\\Automation(Selenium)\\Maven_TestNG_POM_POI\\uCustoms\\src\\main\\java\\config\\";
	
	public static void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","D://Diptee 657//Workspace//Selenium Installation//chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	public static void scroll() throws InterruptedException {
		try {
			JavascriptExecutor jse =(JavascriptExecutor) driver; 
			jse.executeScript("window.scrollBy(0,1000)");
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void select(WebElement path, String value) throws InterruptedException {
		try {
			Select select=new Select(path);
			select.selectByVisibleText(value);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void takeSnapShot(String strName) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) driver); // Convert web driver object to TakeScreenshot
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE); // to create image file
		rand = new Random();
		int value = rand.nextInt(1000000);
		File DestFile = new File("C:\\TFS\\Automation(Selenium)\\Maven_TestNG_POM_POI\\uCustoms\\src\\main\\java\\snapShots\\"+strName+value+".jpg");
		FileUtils.copyFile(SrcFile, DestFile);

	}
	public static void upload() throws InterruptedException {
		try {
			Thread.sleep(5000);
//			Runtime.getRuntime().exec("D:\\Workspace\\E2E uCustom Automate\\Ucustoms\\src\\main\\java\\config\\UploadFile.exe"); // AutoIT
			StringSelection ss = new StringSelection("C:\\TFS\\Automation(Selenium)\\Maven_TestNG_POM_POI\\uCustoms\\src\\main\\java\\config\\Img.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Thread.sleep(1000);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
//	public static int generateRandomInt()
//	{
//		rand = new Random();
//		int value = rand.nextInt(1000000);
//		
//		return value;
//	}
}
