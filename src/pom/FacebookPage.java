package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public FacebookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void emailtextbox(String email) {
		emailtb.sendKeys(email);
	}
	
	public void passwordtextbox(String pass) {
		passwordtb.sendKeys(pass);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}

}
