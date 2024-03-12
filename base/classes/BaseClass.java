package org.base.classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.input.model.DragData;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver d;
	public static Select s;

	public static void browserLaunch(String browserName) {

		if (browserName.equals("Chrome")) {

			d = new ChromeDriver();
		}
		else if (browserName.equals("Firefox")) {

			d = new FirefoxDriver();
		}
		else if (browserName.equals("Edge")) {

			d = new EdgeDriver();
		}
		d.manage().window().maximize();
	}
	
	public static void waitsUsingImplicit() {

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void pageLoad() {

		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
	
	public static String getPropertyDatas(String propertyKey) throws IOException {

		File f = new File("C:\\Users\\jayas\\OneDrive\\Documents\\Fitpeo\\Fitpeo\\PropertyFiles\\Datas.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(propertyKey); 
	}  	

	public static void launchUrl(String url) {

		d.get(url);
	}
	
	public static void switchWindow(int windowNumber) {

		Set<String> mulWind = d.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(mulWind);
		d.switchTo().window(li.get(windowNumber));
	}
	
	public static void pressEnter() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
	}
	
	public static void passTextUsingJs(WebElement targetWebelement, String val) {

		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('value','" + val +"' )", targetWebelement);
	}
	
	public static String getUrl() { 

		String url = d.getCurrentUrl();
		return url; 
	}
	
	public static String getTheTitle() {

		String title = d.getTitle();
		return title;
	}

	public static void passText(WebElement element, String txt) {

		element.sendKeys(txt);
	}

	public static void clickWebelement(WebElement element) {

		element.click();
	}	
	
	public static void closeBrowser() {

		d.quit();
	}
	
	public static void screenShot() {

		
		
	}
	
}
