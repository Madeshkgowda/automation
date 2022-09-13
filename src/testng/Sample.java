package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {
	
	@DataProvider
     public Object[][] getData(){
		Object [] [] a=new Object[3][2];
		a[0][0]="adcdegfh";
		a[0][1]="werftgw";
		
		a[1][0]="1423457869";
		a[1][1]="2457896489";
		
		a[2][0]="kpmshwuw@#^&%#";
		a[2][1]="254785angcydsg#@$^%&";
		return a;
		
	}
	
	
	@Test(dataProvider="getData")
	public void demo(String username,String pwd) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(pwd);
   
	Thread.sleep(5000);
	driver.close();
}
}