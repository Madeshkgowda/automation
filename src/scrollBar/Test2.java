package scrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Create with strip lights']"));
		//typecasting
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("argument[0],scrollIntoView();",ele);
				
				Thread.sleep(3000);
				js.executeScript("argument[0],scrollIntoView();",ele);
				ele.click();
	}

}
