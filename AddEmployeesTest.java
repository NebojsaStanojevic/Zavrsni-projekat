package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.Login;
import objects.ManageSettings;
import objects.Staff;

public class AddEmployeesTest{

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nebojsa\\01 IT Bootcamp\\Instalacije za kurs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 16)
	public void addEmployeesTest() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();

		HomePage.popUp(driver);
		Login.login(driver);
		Login.typeEmail(driver);
		Login.typePassword(driver);
		Login.pressLogin(driver);

		ManageSettings.staff1(driver);
		Staff.addEmployees(driver);

		Staff.firstName(driver);
		Staff.lastName(driver);
		Staff.email(driver);
		Staff.saveEmployees(driver);
		driver.navigate().refresh();
	
	}
	@Test(priority = 17)
	public void checkAddEmployeesTest() {
		
		ManageSettings.staff1(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Darko Tomic")));
		WebElement name = driver.findElement(By.linkText("Darko Tomic"));
		name.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/div[1]/ul/li[1]/span[2]")));
		WebElement actualText = driver.findElement(By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/div[1]/ul/li[1]/span[2]"));
	
		String expected = "Darko Tomic";
		Assert.assertEquals(actualText.getText(), expected);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
