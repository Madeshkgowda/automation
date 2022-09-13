package scrollBar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//typecasting
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//top to bottom
	js.executeScript("Window.ScrollBy(0,5000)");
	
	Thread.sleep(3000);

	//bottom to top
		js.executeScript("Window.ScrollBy(0,-5000)");
	}

}
