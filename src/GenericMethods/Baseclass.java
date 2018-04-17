
package GenericMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static Properties locators = null;
	public static Properties config = null;
	public static WebDriver wd = null;

	/*public Baseclass() throws IOException {
		browser();
	}*/

	public void browser() throws IOException {
		if (wd == null) {
			initial();
		}

	}

	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * Baseclass main= new Baseclass(); main.initial(); }
	 */

	public void initial() throws IOException {

		FileInputStream f = new FileInputStream(
				new File("E:\\M.selva\\Outside-Project-master\\src\\Resources\\config.properties"));
		// new

		//File("user.dir"+"\\src\\Resources\\config.properties\\locator.properties"));
		locators = new Properties();
		locators.load(f);
		System.out.println(locators.getProperty("browser"));

		FileInputStream f1 = new FileInputStream(
				new File("E:\\M.selva\\Outside-Project-master\\src\\Resources\\config.properties"));
		// new
		// File("user.dir"+"\\src\\Resources\\config.properties\\config.properties"));
		config = new Properties();
		config.load(f1);

		File phantom = new File("E:\\M.selva\\Outside-Project-master\\src\\Resources\\config.properties");

		// new File("user.dir"+"\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

		if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", config.getProperty("firefoxdriver"));
			wd = new FirefoxDriver();
			wd.get(config.getProperty("URL"));
		} 
		else if (config.getProperty("browser").equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
			wd = new ChromeDriver();
			wd.get(config.getProperty("URL"));
		}
		else if (config.getProperty("browser").equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", config.getProperty("iedriver"));
			wd = new InternetExplorerDriver();
			wd.get(config.getProperty("URL"));

		}
		else if (config.getProperty("browser").equalsIgnoreCase("htmlunitdriver")) {
			wd = new HtmlUnitDriver();
			wd.get(config.getProperty("URL"));
		}
		else

		if (config.getProperty("browser").equalsIgnoreCase("phantom")) {

			System.setProperty("phantomjs.binary.path", phantom.getAbsolutePath());
			wd = new PhantomJSDriver();
			wd.get(config.getProperty("URL"));
		}
	}

	/*
	 * public static WebElement getwebelement(String locator) throws IOException {
	 * // return wd.findElement(By.id(locators.getProperty(locator))); try { return
	 * wd.findElement(By.id(locators.getProperty(locator))); } catch (Throwable a) {
	 * File srcfile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(srcfile, new
	 * File("E:\\Room mates work\\M.Selva\\FileRepo-master\\FileRepo-master\\Screenshot"
	 * + locator + ".jpg")); System.out.println(a.getMessage());
	 * 
	 * } return null; }
	 */

	/*public void close() {
		wd.close();
		wd = null;

	}*/

	public void screenshot(String name) throws IOException {
		File srcfile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("E:\\M.selva\\Outside-Project-master\\Screenshot\\" + name + ".jpg"));
	}

	/*public void logger() {
		Logger log = Logger.getLogger(getClass());

	}*/

	
	public void alert() {
		Alert a = wd.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}

	public void select(WebElement select, String value) {
		Select s = new Select(select);
		s.selectByVisibleText(value);
	}

	public void action() {
		Actions act = new Actions(wd);
	}

	public void Delay() {
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
