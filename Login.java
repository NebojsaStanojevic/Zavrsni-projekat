package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	private static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	private static final String EMAIL_USERNAME_XPATH = "//*[@id=\"email\"]";
	private static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
	private static final String PRESSLOGIN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";

	public static void login(WebDriver driver) {
		WebElement login = driver.findElement(By.xpath(LOGIN_XPATH));
		login.click();
	}

	public static void typeEmail(WebDriver driver) {
		WebElement typeEmail = driver.findElement(By.xpath(EMAIL_USERNAME_XPATH));
		typeEmail.click();
		typeEmail.sendKeys("snezana52@gmail.com");
	}

	public static void typePassword(WebDriver driver) {
		WebElement typePassword = driver.findElement(By.xpath(PASSWORD_XPATH));
		typePassword.click();
		typePassword.sendKeys("Nn1a2a3a4");
	}

	public static void pressLogin(WebDriver driver) {
		WebElement pressLogin = driver.findElement(By.xpath(PRESSLOGIN_XPATH));
		pressLogin.click();
	}
}