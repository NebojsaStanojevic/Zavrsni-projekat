package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*ZAVRSNI PROJEKAT IX GENERACIJA - BEOGRAD
Zavrsni projekat pise se u programskom jeziku java koristeci selenium, postujuci POM (page object model). 
Testovi se pisu samo za “happy path” (pozitivne scenarije) koristeci testNG.
Radi se 4 dana, za vreme predavanja.
Zavrsen projekat kaci se na vas github i u folder na drajvu sa vasim imenom (naziv foldera: zavrsni projekat; nacin kacenja isti kao i sve do sada).

Testira se sajt www.humanity.com.
Kao pripremu za izradu projekta potrebno je napraviti lazni nalog na tom sajtu i zapoceti besplatnu probnu verziju. 
Ne ostavljati prave e-mail adrese. Kredencijale izmisliti ili koristiti neki sajt za generisanje i sacuvati kredencijale negde radi kasnijeg koriscenja.

ZADACI:
a) pocetna strana
Proveriti da li na pocetnoj strani novi user moze da zapocne besplatnu probnu verziju na oba ponudjena nacina
Doci do stranice ABOUT US i napraviti screenshot strane
Proveriti da li postojeci user uspesno moze da se loguje

b) vasaFirma/humanity
Proveriti sve elemente iz gornjeg menija - da li naziv iz menija odgovara strani na koju sajt redirektuje prilikom kliktanja na dugme
Dodati novog zaposlenog i proveriti uspesnost dodavanja
Zaposlenom promeniti ime
3.1. Dodatni zadatak: zaposlenom dodati fotografiju 
Koristeci apachePOI (ucitavanjem iz excel tabele), automatski dodati minimum 5 novih zaposlenih i proveriti uspesnost dodavanja. 
Sami kreirate tabelu sa potrebnim podacima.

c) settings
Promeniti jezik
Odcekirati (disable) notifikacije

d) profile
Omoguciti da se barata podesavanjima profila (izmene po vasem izboru, najmanje 2).*/

public class HomePage {
	public static final String URL = "https://www.humanity.com/";
	private static final String FULLNAME1_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String WORKEMAIL1_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	private static final String STARTMYFREETRIAL1_XPATH = "//*[@id=\"free-trial-link-01\"]";
	private static final String POPUP_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	private static final String COMPANINAME_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String INDUSTRI_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div/span";
	private static final String FUNCTIONALROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div";
	private static final String PHONENUMBER_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String REPEATPASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String STARTSCHEDULING_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	private static final String STARTMYFREETRIAL2_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";	
	private static final String FULLNAME2_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	private static final String WORKEMAIL2_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	private static final String STARTMYFREETRIAL3_XPATH = "//*[@id=\"popup-free-trial-link\"]";	
	
	private static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	private static final String ABOUTUSPAGE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";	
	private static final String OKCONTINUE_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button";
	

	
	
	public static void typeFullName1(WebDriver driver) {
		WebElement fullName1 = driver.findElement(By.xpath(FULLNAME1_XPATH));
		fullName1.click();
		fullName1.sendKeys("Snezana Milija");
	}

	public static void typeWorkEmail1(WebDriver driver) {
		WebElement workEmail1 = driver.findElement(By.xpath(WORKEMAIL1_XPATH));
		workEmail1.click();
		workEmail1.sendKeys("snezana52@gmail.com");
	}

	public static void pressStartMyFreeTrial1(WebDriver driver) {
		WebElement pressStartMyFreeTrial1 = driver.findElement(By.xpath(STARTMYFREETRIAL1_XPATH));
		pressStartMyFreeTrial1.click();
	}

	public static void popUp(WebDriver driver) {
		WebElement popUp = driver.findElement(By.xpath(POPUP_XPATH));
		popUp.click();
	}

	public static void companyName(WebDriver driver) {
		WebElement companyName = driver.findElement(By.xpath(COMPANINAME_XPATH));
		companyName.click();
		companyName.sendKeys("Novotarije");
	}

	public static void industry(WebDriver driver) {
		WebElement industry = driver.findElement(By.xpath(INDUSTRI_XPATH));
		industry.click();
		WebElement industryP = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div/ul/li[7]"));
		industryP.click();
	
	}

	public static void functionalRole(WebDriver driver) {
		WebElement functionalRole = driver.findElement(By.xpath(FUNCTIONALROLE_XPATH));
		functionalRole.click();
		WebElement functionalRoleO = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/ul/li[6]"));
		functionalRoleO.click();
	}

	public static void phoneNumber(WebDriver driver) {
		WebElement phoneNumber = driver.findElement(By.xpath(PHONENUMBER_XPATH));
		phoneNumber.click();
		phoneNumber.sendKeys("123456789");
	}

	public static void password(WebDriver driver) {
		WebElement password = driver.findElement(By.xpath(PASSWORD_XPATH));
		password.click();
		password.sendKeys("Nn1a2a3a4");
	}

	public static void repeatPassword(WebDriver driver) {
		WebElement repeatPassword = driver.findElement(By.xpath(REPEATPASSWORD_XPATH));
		repeatPassword.click();
		repeatPassword.sendKeys("Nn1a2a3a4");
	}

	public static void pressStartScheduling(WebDriver driver) {
		WebElement pressStartScheduling = driver.findElement(By.xpath(STARTSCHEDULING_XPATH));
		pressStartScheduling.click();
	}
	public static void pressStartMyFreeTrial2(WebDriver driver) {
		WebElement pressStartMyFreeTrial2 = driver.findElement(By.xpath(STARTMYFREETRIAL2_XPATH));
		pressStartMyFreeTrial2.click();
	}	
	public static void typeFullName2(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(FULLNAME2_XPATH)));
		WebElement fullName2 = driver.findElement(By.xpath(FULLNAME2_XPATH));
		fullName2.click();
		fullName2.sendKeys("Nikola Nikola");
	}

	public static void typeWorkEmail2(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(WORKEMAIL2_XPATH)));
		WebElement workEmail2 = driver.findElement(By.xpath(WORKEMAIL2_XPATH));
		workEmail2.click();
		workEmail2.sendKeys("nikola5@gmail.com");
	}

	public static void pressStartMyFreeTrial3(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(STARTMYFREETRIAL3_XPATH)));
		WebElement pressStartMyFreeTrial3 = driver.findElement(By.xpath(STARTMYFREETRIAL3_XPATH));
		pressStartMyFreeTrial3.click();
	}

	public static void pressAbotUs(WebDriver driver) {
		WebElement pressAboutUs = driver.findElement(By.xpath(ABOUTUS_XPATH));
		pressAboutUs.click();
	}	

	public static void pressAbotUsPage(WebDriver driver) {
		WebElement pressAboutUsPage = driver.findElement(By.xpath(ABOUTUSPAGE_XPATH));
		pressAboutUsPage.click();
	}
	public static void pressOkContinue(WebDriver driver) {
		WebElement pressOkContinue = driver.findElement(By.xpath(OKCONTINUE_XPATH));
		pressOkContinue.click();
	}

}
