package loginScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login']")). click();

String tittle=driver.getTitle();
System.out.println(tittle);
 
if (tittle.equals("actiTime.login")) {
	System.out.println("pass:home page is displayed");	
}
else
{
	System.out.println("fail:home page is not displayed");
}

String url= driver.getCurrentUrl();
System.out.println("url");

driver.close();
	}

}
