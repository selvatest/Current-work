package PageObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.FindBy;

public class Viewdirectory {

@FindBy(xpath="//input[@type=\"button\" and @class=\"btn\"]")
public List<WebElement> Horizontaltabs;

@FindBy(xpath="//a[@href=\"#\"]")
public List<WebElement> VerticalIcons;

@FindBy(xpath="//a[@href=\"#\"and text()=\"Order Files\"]")
public WebElement Order_Files;

@FindBy(xpath="//a[@href=\"#\"and text()=\"Order Information\"]")
public WebElement Order_Information;

@FindBy(xpath="//a[@href=\"#\"and text()=\"Classification\"]")
public WebElement Classification;

@FindBy(xpath="//a[@href=\"#\"and text()=\"View Directory\"]")
public WebElement View_Directory;

public void Directoryoptions() throws IOException
{
	/*File f= new File("E:\\M.selva\\Outputfile\\ViewDirectoryTabs.txt");
	if(!f.exists())
			{
		f.createNewFile();
			}
	
	FileWriter  fw= new FileWriter(f);
	BufferedWriter bw= new BufferedWriter(fw);
	
	for(int i= 0;i<Horizontaltabs.size();i++)
	{
		
		System.out.println(Horizontaltabs.get(i).getText());
		bw.write(Horizontaltabs.get(i).getText());
	}
	
	for(int j=0;j<VerticalIcons.size();j++)
	{
		System.out.println(VerticalIcons.get(j).getText());
		bw.write(VerticalIcons.get(j).getText());;
	}
	
	*/
	
}



public void Order_Files()
{
	Order_Files.click();
}

public void Order_Information()
{
	Order_Information.click();
}


public void Classification()
{
	Classification.click();
}


public void View_Directory()
{
	View_Directory.click();
}



}

