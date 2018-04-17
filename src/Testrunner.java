import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testrunner extends Baseclass {

	
	
	public Testrunner() throws IOException {
		//super();
		Baseclass a = new Baseclass();
	}
	@BeforeTest
	public void intial() throws IOException
	{
		initial();
		System.out.println(wd.getTitle());
	}
	
	@Test(priority=0,dataProvider="datasheet")
	public void login(String Username, String Password) throws IOException
	{
		System.out.println(Username+ " " + Password  );
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Loginpage login1= PageFactory.initElements(wd, Loginpage.class);
		screenshot("Login");
		login1.login(Username,Password);
		
	}
	@Test(priority=1/*,enabled=false*/)
	public void homepage() throws IOException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		screenshot("Homepage");
		Homepage home=PageFactory.initElements(wd, Homepage.class);
		home.homepage();
		home.tabs();
	}
	
	@Test(priority=2/*,enabled=false*/)
	public void production() throws InterruptedException, IOException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ProductionOrder prod=PageFactory.initElements(wd, ProductionOrder.class);
		prod.productiontab();
		System.out.println(wd.getTitle());
		screenshot("Production Tab");
		
		prod.viewdirectory();
		screenshot("Alert Box");
		Thread.sleep(5000);
		alert();
		
		
		prod.option();
		screenshot("option");
		prod.viewdirectory();
		
		
	}
	
	@Test(priority=3/*,enabled=false*/)
	public void ViewDirectory() throws InterruptedException, IOException
	{
		
		screenshot("View Directory");
		Viewdirectory view=PageFactory.initElements(wd, Viewdirectory.class);
		view.Directoryoptions();
		
		
		view.Order_Files();
		screenshot("Order_files");
		
		view.Order_Information();
		screenshot("Order_Info");
		
		view.Classification();
		screenshot("Classification");
		
		view.View_Directory();
		screenshot("view_directory");		
	}
	
	@DataProvider(name="datasheet")
	
	public  static Object[][] data() throws IOException {
		
		//ExcelReader a= new ExcelReader();
		Object[][]data= ExcelReader.singledata();
		return data;
	}
	
	@AfterSuite
	public void close()
	{
		if(!(wd==null))
		{
			wd.close();
		}
	}
}


