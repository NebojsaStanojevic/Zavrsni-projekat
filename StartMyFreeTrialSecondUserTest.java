package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;

public class StartMyFreeTrialSecondUserTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nebojsa\\01 IT Bootcamp\\Instalacije za kurs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 3)
	public void testStartMyFreeTrial2() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();

		HomePage.popUp(driver);
		HomePage.pressStartMyFreeTrial2(driver);
		HomePage.typeFullName2(driver);
		HomePage.typeWorkEmail2(driver);
		HomePage.pressStartMyFreeTrial3(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/";

		Assert.assertEquals(current, expected);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
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
