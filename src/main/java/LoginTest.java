import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhushan12902\\eclipse-workspace\\chromedriver_win32 (2)\\chromedriver.exe");

		driver=new ChromeDriver();
		
	}
	
	@Test
	public void login()
	{
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("bhushan19dec");
	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
