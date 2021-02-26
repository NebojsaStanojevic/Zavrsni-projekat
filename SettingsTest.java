package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import objects.HomePage;
import objects.Login;
import objects.Settings;

public class SettingsTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nebojsa\\01 IT Bootcamp\\Instalacije za kurs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 27)
	public void changeLanguageTest() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();

		HomePage.popUp(driver);
		Login.login(driver);
		Login.typeEmail(driver);
		Login.typePassword(driver);
		Login.pressLogin(driver);
		Settings.settings(driver);
		Settings.changeLanguage(driver);
		Settings.saveSettings(driver);
		driver.navigate().refresh();

		String current = driver.getCurrentUrl();
		String expected = "https://novotarije8.humanity.com/app/admin/settings/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 27)
	public void disableNotificationsTest() {
;
		Settings.viaEMail(driver);
		Settings.viaSms(driver);
		Settings.viaMobilePush(driver);
		Settings.saveSettings(driver);
		driver.navigate().refresh();

		String current = driver.getCurrentUrl();
		String expected = "https://novotarije8.humanity.com/app/admin/settings/";
		Assert.assertEquals(current, expected);
		driver.close();
	}
}
