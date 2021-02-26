package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.Login;
import objects.ManageSettings;

public class ManageSettingsTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nebojsa\\01 IT Bootcamp\\Instalacije za kurs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 7)
	public void dashbordTest() {
	driver.navigate().to(HomePage.URL);
	driver.manage().window().maximize();

	HomePage.popUp(driver);
	Login.login(driver);
	Login.typeEmail(driver);
	Login.typePassword(driver);
	Login.pressLogin(driver);
	ManageSettings.dashbord(driver);
	String current = driver.getTitle();
	String expected = "Dashboard - Dashboard - Humanity";
	Assert.assertEquals(current, expected);

}
	@Test(priority = 8)
	public void shiftPlanningTest() {
	ManageSettings.shiftPlanning(driver);
	String current = driver.getTitle();
	String expected = "ShiftPlanning - Humanity";
	Assert.assertEquals(current, expected);

}
	@Test(priority = 9)
	public void timeClockTest() {
	ManageSettings.timeClock(driver);
	String current = driver.getTitle();
	String expected = "Timeclock - Overview - Humanity";
	Assert.assertEquals(current, expected);
}
	@Test(priority = 10)
	public void leaveTest() {
	ManageSettings.leave(driver);
	String current = driver.getTitle();
	String expected = "Leave - Vacation - Humanity";
	Assert.assertEquals(current, expected);
}
	@Test(priority = 11)
	public void trainingTest() {
	ManageSettings.training(driver);
	String current = driver.getTitle();
	String expected = "Training - Overview - Humanity";
	Assert.assertEquals(current, expected);
}
	@Test(priority = 12)
	public void staffTest() {
	ManageSettings.staff(driver);
	String current = driver.getTitle();
	String expected = "Staff - List - Humanity";
	Assert.assertEquals(current, expected);
}
	@Test(priority = 13)
	public void availabilityTest() {
	ManageSettings.availability(driver);
	String current = driver.getTitle();
	String expected = "Humanity";
	Assert.assertEquals(current, expected);
}
	@Test(priority = 14)
	public void payrollTest() {
	ManageSettings.payroll(driver);
	String current = driver.getTitle();
	String expected = "Payroll - Scheduled-hours - Humanity";
	Assert.assertEquals(current, expected);
}
	@Test(priority = 15)
	public void reportsTest() {
	ManageSettings.reports(driver);
	String current = driver.getTitle();
	String expected = "Reports - Reports Home - Humanity";
	driver.close();
	Assert.assertEquals(current, expected);
}

}
