import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Demo2 {

	public  static  WebDriver wd=  null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "E:\\M.selva\\chromedriver.exe");
   //wd=new ChromeDriver();
		//WebDriver wd= new HtmlUnitDriver();
		//File  f= new File("E:\\M.selva\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
    System.setProperty("phantomjs.binary.path","E:\\M.selva\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		wd=new PhantomJSDriver();
		wd.get("http://www.amazon.in/");
     System.out.println(wd.getTitle());
     
     Demo2 a  =new Demo2();
     a.screenshot("Shopping");
     
 // a.screenshot(name);
	}
    public void screenshot(String name) throws IOException
    {
     File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(src, new File("E:\\M.selva\\"+name+".jpg"));
    }
     

     
     
     
     /*Thread.sleep(10000);
      WebElement signin=wd.findElement(By.xpath("//*[@id=\"slider\"]"));
      signin.getSize();
      
      Thread.sleep(10000);
//      WebElement login=wd.findElement(By.className("nav-text"));
      WebElement login=wd.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[2]/div/div[3]/a[1]/span"));
//      Select b =new Select();
      Actions a=new Actions(wd);
      a.moveToElement(signin).build().perform();
      a.moveToElement(login).build().perform();
      login.click();
      a.dragAndDrop(source, target)
      
      //System.out.println("selvakumar");
      String data= "selvakumar";
      System.out.println(data);https://jqueryui.com/resizable/
     */
     /*	wd.get("https://jqueryui.com/resizable/");

		wd.switchTo().frame(0);
		
		WebElement resizeable = wd.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions a = new Actions(wd);
		
		Thread.sleep(5000);
		
		a.clickAndHold(resizeable).build().perform();
		Thread.sleep(5000);
		a.moveToElement(resizeable, 80, 80).build().perform();
		Thread.sleep(5000);
		System.out.println("resized");
		a.release(resizeable).build().perform();
		System.out.println("success");
     */
     
  /*  	wd.manage().window().maximize();
		wd.get("https://jqueryui.com/slider/");

		wd.switchTo().frame(0);
		
		WebElement slider = wd.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		WebElement slideraxis=wd.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		int width=slideraxis.getSize().getWidth();
		
		System.out.println(slideraxis.getSize());
		
		System.out.println(width);
		
		Actions a = new Actions(wd);
		a.dragAndDropBy(slider, (width*75/100),0).build().perform();
		
		wd.switchTo().defaultContent();
		wd.findElement(By.xpath("//*[@id=\"menu-top\"]/li[5]/a")).click();
		//wd.close();
*/	
    /* wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
     Thread.sleep(5000);
     wd.switchTo().frame(0);
     Thread.sleep(10000);
//System.out.println(wd.findElement(By.xpath("")).getText());
     wd.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
     Alert a=wd.switchTo().alert();
     Thread.sleep(5000);
     System.out.println(a.getText());
   //  a.sendKeys("byee");//data
     a.accept();//ok
    // a.dismiss();//cancel
*/
     /*System.setProperty("webdriver.gecko.driver", "E:\\M.selva\\geckodriver.exe");
 	WebDriver wd = new ChromeDriver();

	wd.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	wd.switchTo().frame("iframeResult");

    WebElement Tryitlink = wd.findElement(By.xpath("/html/body/button"));
	
	Tryitlink.click();
	
	Alert a=wd.switchTo().alert();
	
	String data=a.getText();
	System.out.println(data);
	a.accept(); //ok
	//a.dismiss();//cancel
*/     
     
     
 /* wd.get("http://toolsqa.com/automation-practice-switch-windows/");
     
     WebElement we=  wd.findElement(By.xpath("//*[@id=\"button1\"]"));
     
     
     we.click();
    
     String parent =wd.getWindowHandle();
     
     System.out.println(parent);
     
     Set<String> links=wd.getWindowHandles();
     Iterator<String> it= links.iterator();
     
     while(it.hasNext())
    {
    	String parent1= it.next();
    	String child=it.next();
    	//String child1=it.fgnbbskjfbisfjk
    	Thread.sleep(5000);
    	wd.switchTo().window(child);
    	wd.manage().window().maximize();
    	Thread.sleep(5000);
    	System.out.println(wd.getTitle());
    	Thread.sleep(5000);
    	
    	wd.switchTo().window(parent);
    	Thread.sleep(5000);
    	System.out.println(wd.getTitle());
     
    }
	
	
	
	//wd.close();
	wd.quit();
	
	/*System.setProperty("webdriver.chrome.driver", "E:\\M.selva\\chromedriver.exe");
			                
			        WebDriver my = new ChromeDriver();
			                
			        //my.get("https://www.w3schools.com/HTML/tryit.asp?filename=tryhtml5_draganddrop");
			        my.navigate().to("https://www.w3schools.com/HTML/tryit.asp?filename=tryhtml5_draganddrop");*/
	//Headless browser
		//phantomjs
	
	

}
