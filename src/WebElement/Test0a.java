package WebElement;

	import java.time.Duration;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Test0a {

		public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement searchtb=driver.findElement(By.name("q"));
	searchtb.sendKeys("phone");
	Thread.sleep(3000);
	searchtb.clear();

	}

}
