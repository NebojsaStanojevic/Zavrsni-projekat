package test;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;

public class AboutUsTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nebojsa\\01 IT Bootcamp\\Instalacije za kurs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 5)
	public void getScreenshot() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();

		HomePage.popUp(driver);
		HomePage.pressAbotUs(driver);
		HomePage.pressAbotUsPage(driver);
		HomePage.pressOkContinue(driver);
	

		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		
			FileUtils.copyFile(screenShot, new File("C:\\Users\\nesa\\eclipse-workspace\\zavrsniProjekat\\screenshot.png"));
		}
		catch (IOException e) {
			
			e.printStackTrace();
			}
		driver.close();
	}
}
