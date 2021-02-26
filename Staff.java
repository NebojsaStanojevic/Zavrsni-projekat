package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Staff {

	public static final String ADDEMPLOYEES_ID = "act_primary";	
	public static final String FIRSTNAME_XPATH =  "//*[@id=\"_asf1\"]";
	public static final String LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	public static final String EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	public static final String SAVEEMPLOYEERS_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/button";
	public static final String ALLSTAFF_XPATH = "//*[@id=\"StaffSchedules\"]/ul[1]/li[1]/a";
	public static final String NAME_XPATH = "//*[@id=\"7\"]/a";
	public static final String EDITDETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String CHANGETHENAME_XPATH = "//*[@id=\"first_name\"]";
	public static final String CHANGESAVEEMPLOYEER_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	public static final String CHECKTHENAME_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/div[1]/ul/li[1]/span[2]";


public static void addEmployees(WebDriver driver) {
	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ADDEMPLOYEES_ID)));
		WebElement addEmployees = driver.findElement(By.id(ADDEMPLOYEES_ID));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addEmployees.click();
	
	}
	public static void firstName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(FIRSTNAME_XPATH)));
		WebElement firstName = driver.findElement(By.xpath(FIRSTNAME_XPATH));
		firstName.click();
		firstName.sendKeys("Darko");
	}
	public static void lastName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LASTNAME_XPATH)));
		WebElement lastName = driver.findElement(By.xpath(LASTNAME_XPATH));
		lastName.click();
		lastName.sendKeys("Tomic");
	}
	public static void email(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EMAIL_XPATH)));
		WebElement email = driver.findElement(By.xpath(EMAIL_XPATH));
		email.click();
		email.sendKeys("darko.tomic@gmail.com");
	}
	public static void saveEmployees(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SAVEEMPLOYEERS_XPATH)));
		WebElement saveEmployees = driver.findElement(By.xpath(SAVEEMPLOYEERS_XPATH));
		saveEmployees.click();

	}
	public static void allStaff(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ALLSTAFF_XPATH)));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement allStaff = driver.findElement(By.xpath(ALLSTAFF_XPATH));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		allStaff.click();

	}
	public static void name(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Nevena Ivkovic")));
		WebElement name = driver.findElement(By.linkText("Nevena Ivkovic"));
		name.click();
	}
	public static void editDetails(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EDITDETAILS_XPATH)));
		WebElement editDetails = driver.findElement(By.xpath(EDITDETAILS_XPATH));
		editDetails.click();
	}
	public static void changeTheName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHANGETHENAME_XPATH)));
		WebElement changeTheName = driver.findElement(By.xpath(CHANGETHENAME_XPATH));
		changeTheName.click();
		driver.findElement(By.xpath(CHANGETHENAME_XPATH)).clear();
		changeTheName.sendKeys("Marija");
	}
	public static void changeSaveEmployees(WebDriver driver) {

		WebElement changeSaveEmployees = driver.findElement(By.xpath(CHANGESAVEEMPLOYEER_XPATH));
		changeSaveEmployees.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void checkTheNames(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHECKTHENAME_XPATH)));
		WebElement checkTheName = driver.findElement(By.xpath(CHECKTHENAME_XPATH));
		checkTheName.click();
	}
}
