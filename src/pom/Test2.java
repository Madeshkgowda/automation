package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FacebookPage f=new FacebookPage(driver);
		f.emailtextbox("admin@12");
		f.passwordtextbox("manager");
		Thread.sleep(3000);
		f.loginbutton();

	}

}
