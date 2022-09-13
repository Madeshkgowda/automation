package loginScenarios;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Qspider  {

			public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://campus.qspiders.com/user");

		driver.findElement(By.name("edit-name")).sendKeys("admin");
		driver.findElement(By.name("edit-pass")).sendKeys("manager");
		driver.findElement(By.id("edit-submit")).click();

		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		 
		if (tittle.equals("qspiders,campus.login")) {
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
