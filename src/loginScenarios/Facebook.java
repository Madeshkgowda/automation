package loginScenarios;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Facebook {

			public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.id("loginbutton")).click();

		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		 
		if (tittle.equals("facebook.login")) {
			System.out.println("pass:home page is displayed");	
		}
		else
		{
			System.out.println("fail:home page is not displayed");
		}

		String url= driver.getCurrentUrl();
		System.out.println("url");

		driver.close();
			}

}
