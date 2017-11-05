package Guoyasoft;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class firstestngTest {
	WebDriver driver;

	@BeforeClass
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver",
				"D://software//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:www.baidu.com");
	}

	@AfterClass
	public void quitChrome() {
		driver.quit();
	}

	@Test
	public void testLogin() throws InterruptedException {
		//WebElement userName = driver.findElement(By.id("login"));
		//userName.clear();
		//userName.sendKeys("德邦");
		
		WebElement userName1=driver.findElement(By.id("su"));
		//userName1.clear();
		userName1.sendKeys("德邦");
		//WebElement password=driver.findElement(By.id("password"));
		//password.clear();
		//password.sendKeys("12345678");
		
		//WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement submit=driver.findElement(By.id("德邦"));
		submit.click();
		
		Thread.sleep(2000);
		
		boolean result=driver.getPageSource().contains("德邦");

		
		Assert.assertEquals(true, result);
	}
	
}

