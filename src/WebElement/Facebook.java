package WebElement;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.findElement(By.name("firstname")).sendKeys("madesh");
		driver.findElement(By.name("lastname")).sendKeys("krishna");
		driver.findElement(By.name("reg_email__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
		driver.findElement(By.id("day")).sendKeys("18");
		driver.findElement(By.id("month")).sendKeys("apr");
		driver.findElement(By.id("year")).sendKeys("1996");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        driver.findElement(By.id("(//button[@type='submit'])[2]")).click();
	}

}
