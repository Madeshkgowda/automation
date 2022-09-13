package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele=driver.findElement(By.name("q"));
		if(ele.isDisplayed()) {
			System.out.println("pass:element is displayed");
			ele.sendKeys("admin");
		}
		else
		{
			System.out.println("fail:element is not displayed");
		}
		driver.close();
		}

}
