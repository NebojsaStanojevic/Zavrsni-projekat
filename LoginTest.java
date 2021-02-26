package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.Login;

public class LoginTest {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nebojsa\\01 IT Bootcamp\\Instalacije za kurs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 6)
	public void loginTest() {
	driver.navigate().to(HomePage.URL);
	driver.manage().window().maximize();

	HomePage.popUp(driver);
	Login.login(driver);
	Login.typeEmail(driver);
	Login.typePassword(driver);
	Login.pressLogin(driver);

	String current = driver.getCurrentUrl();
	String expected = "https://www.humanity.com/app/";
	driver.close();
	Assert.assertEquals(current, expected);

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

}

}
