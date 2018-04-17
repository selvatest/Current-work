package PageObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	
	public void productiontab() throws IOException{
		
	productiontab.click();
	Boolean data=productiontab.isEnabled();
	System.out.println("Production order Tab is Seledted : " +data);

	/*File f= new File("E:\\M.selva\\Outputfile\\Productiontabs.txt");
	if(!f.exists())
			{
		f.createNewFile();
			}
	
	FileWriter  fw= new FileWriter(f);
	BufferedWriter bw= new BufferedWriter(fw);
	for(int i =0;i<prodtabs.size();i++)
	{
		System.out.println(prodtabs.get(i).getText());
		bw.write(prodtabs.get(i).getText());
	}
	
	bw.close();
	
	*/
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
