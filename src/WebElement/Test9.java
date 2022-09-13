package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement button=driver.findElement(By.id("keepLoggedInCheckBox"));
		if(button.isSelected()) {
			System.out.println("pass:element is Selected");
		}
		else
		{
			System.out.println("fail:element is not Selected");
		}
		
		driver.close();
	}
	
}
