package PageObject;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Output.file;

public class Homepage {

	
	@FindBy(id="userNavLabel")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"home_Tab\"]/a")
	private WebElement Hometab;
	
	@FindBy(xpath="//a[contains(@title,'Tab')]")
	public List<WebElement> links;
	
	public void homepage()
	{
		String name=username.getText();
		System.out.println("Login user is :" + name);
	}
	public void tabs() throws IOException
	{
		
		Hometab.isEnabled();
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
	//	file.Homepage();
       
	}
	
	
	
	
	
	
	
}
