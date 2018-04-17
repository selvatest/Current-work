import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductionOrder {


	@FindBy(xpath="//a[contains(@title,'Production') and text()=\"Production Order\"]")
	public WebElement productiontab;
	
	@FindBy(name="view_directory")
	public WebElement viewdirectory;
	
	@FindBy(xpath="//*[@id=\"a0yO0000002oA2h\"]")
	public WebElement checkbox;
	
	@FindBy(xpath="//input[@type=\"button\" and @class=\"btn\"]")
	public List<WebElement> prodtabs;
	
	public void productiontab(){
		
	productiontab.click();
	Boolean data=productiontab.isEnabled();
	System.out.println("Production order Tab is Seledted : " +data);
	for(int i =0;i<prodtabs.size();i++)
	{
		System.out.println(prodtabs.get(i).getText());
	}
	
	}
	
	public void viewdirectory()
	{
		viewdirectory.click();
	}
	
	public void option()
	{
		checkbox.click();
	}
}
