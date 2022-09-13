package WebElement;


	import java.time.Duration;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Test1a {

		public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();

	}

}
