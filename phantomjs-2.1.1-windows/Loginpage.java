package PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="Login")
	private WebElement sandbox;
	
	
	public void login(String Username, String Password)
	{
		/*username.sendKeys("ken@kirinuki.jp.full");
		password.sendKeys("83waz1yo");*/
		username.sendKeys(Username);
		password.sendKeys(Password);
		sandbox.click();	
	}
	

}
