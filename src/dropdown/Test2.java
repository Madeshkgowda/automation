package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.id("gh-cat"));

		Select s=new  Select(dropdown);
		
		s.selectByIndex(4);
		
		s.selectByValue("14339");
	
		s.selectByVisibleText("Cameras & Photo");
		
		s.deselectAll();
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement opt:allOptions) {
			System.out.println(opt.getText());
		}
		driver.close();
		
		
		
		
	}

}
