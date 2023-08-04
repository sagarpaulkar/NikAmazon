package Amazon.NikAmazon;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass  {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void AmezonPage() {
		PageCart p = new PageCart(driver);
		p.Verifysignclick();
		p.SetUsername();
		p.Verifyclickcontinue();
		p.SetPassword();
		p.VerifyClicksubmit();
		p.VerifySearch();
		p.VerifySearchbtn();
		p.VerifyClickonProduct();
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr = s.iterator();
		String firstWindow= itr.next();
		String secondWindow = itr.next();
		driver.switchTo().window(secondWindow);
		
		p.Verifyclickoncart();
		
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
	
	
}