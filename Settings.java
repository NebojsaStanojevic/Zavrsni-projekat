package objects;

//c) settings
//Promeniti jezik
//Odcekirati (disable) notifikacije

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Settings {
	
	public static final String SETTINGS_XPATH = "//*[@id=\"_nav\"]/div[3]/ul/li";	
	public static final String CHANGELANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";	
	public static final String VIAEMAIL_XPATH = "//*[@id=\"pref_pref_email\"]";	
	public static final String VIASMS_XPATH = "//*[@id=\"pref_pref_sms\"]";		
	public static final String VIAMOBILEPUSH_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";	
	public static final String SAVESETTINGS_XPATH = "//*[@id=\"_save_settings_button\"]";		
	
	public static void settings(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SETTINGS_XPATH)));
		WebElement settings = driver.findElement(By.xpath(SETTINGS_XPATH));
		settings.click();
	}
	public static void changeLanguage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHANGELANGUAGE_XPATH)));
		WebElement language = driver.findElement(By.xpath(CHANGELANGUAGE_XPATH));
		language.click();
		WebElement changeLanguage = driver.findElement(By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select/option[37]"));
		changeLanguage.click();
}
		public static void viaEMail(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(VIAEMAIL_XPATH)));
		WebElement viaEMail = driver.findElement(By.xpath(VIAEMAIL_XPATH));
		viaEMail.click();
	}
	public static void viaSms(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(VIASMS_XPATH)));
		WebElement viaSms = driver.findElement(By.xpath(VIASMS_XPATH));
		viaSms.click();
	}
	public static void viaMobilePush(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(VIAMOBILEPUSH_XPATH)));
		WebElement viaMobilePush = driver.findElement(By.xpath(VIAMOBILEPUSH_XPATH));
		viaMobilePush.click();
	}
	public static void saveSettings(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SAVESETTINGS_XPATH)));
		WebElement saveSettings = driver.findElement(By.xpath(SAVESETTINGS_XPATH));
		saveSettings.click();
	}
}
