package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothCorrect {
	@Test
	@Parameters({"username","password"})
	private void loginWithBothCorrect(String uName, String pword) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Zapcom\\eclipse-wrkspace\\SuiteExample\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);
		Thread.sleep(3000);

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		Thread.sleep(3000);
		driver.quit();  
	}
	}


