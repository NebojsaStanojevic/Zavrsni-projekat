package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;

public class StartMyFreeTrialFirstUserTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nebojsa\\01 IT Bootcamp\\Instalacije za kurs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void testStartMyFreeTrial1() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();

		HomePage.popUp(driver);
		HomePage.typeFullName1(driver);
		HomePage.typeWorkEmail1(driver);
		HomePage.pressStartMyFreeTrial1(driver);

		String current = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/";

		Assert.assertEquals(current, expected);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	public void testStartScheduling () {

		HomePage.companyName(driver);
		HomePage.industry(driver);
		HomePage.functionalRole(driver);
		HomePage.phoneNumber(driver);
		HomePage.password(driver);
		HomePage.repeatPassword(driver);
		HomePage.pressStartScheduling(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";

		Assert.assertEquals(current, expected);
		
		driver.close();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
}
