package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageSettings {

	public static final String DASHBOARD_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[1]";
	public static final String SHIFTPLANNING_XPATH = "//*[@id=\"sn_schedule\"]";
	public static final String TIMECLOCK_XPATH = "//*[@id=\"sn_timeclock\"]";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]";
	public static final String TREINING_XPATH = "//*[@id=\"sn_training\"]";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]";
	public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]";
	public static final String PAYROLL_XPATH = "//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[2]/div[8]/a";
	public static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]";

	public static void dashbord(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DASHBOARD_XPATH)));
		WebElement dashbord = driver.findElement(By.xpath(DASHBOARD_XPATH));
		dashbord.click();
		String current = driver.getTitle();
		String expected = "Dashboard - Dashboard - Humanity";
		if (current.equals(expected)) {
			System.out.println(
					"Page title Dashboard " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out
					.println("Page title Dashboard " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void shiftPlanning(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SHIFTPLANNING_XPATH)));
		WebElement shiftPlanning = driver.findElement(By.xpath(SHIFTPLANNING_XPATH));
		shiftPlanning.click();
		String current = driver.getTitle();
		String expected = "ShiftPlanning - Humanity";
		if (current.equals(expected)) {
			System.out.println(
					"Page title ShiftPlanning " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out.println(
					"Page title ShiftPlanning " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void timeClock(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TIMECLOCK_XPATH)));
		WebElement timeClock = driver.findElement(By.xpath(TIMECLOCK_XPATH));
		timeClock.click();
		String current = driver.getTitle();
		String expected = "Timeclock - Overview - Humanity";
		if (current.equals(expected)) {
			System.out.println(
					"Page title Timeclock " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out
					.println("Page title Timeclock " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void leave(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LEAVE_XPATH)));
		WebElement leave = driver.findElement(By.xpath(LEAVE_XPATH));
		leave.click();
		String current = driver.getTitle();
		String expected = "Leave - Vacation - Humanity";
		if (current.equals(expected)) {
			System.out.println("Page title Leave " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out.println("Page title Leave " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void training(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TREINING_XPATH)));
		WebElement training = driver.findElement(By.xpath(TREINING_XPATH));
		training.click();
		String current = driver.getTitle();
		String expected = "Training - Overview - Humanity";
		if (current.equals(expected)) {
			System.out
					.println("Page title Training " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out
					.println("Page title Training " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void staff(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(STAFF_XPATH)));
		WebElement staff = driver.findElement(By.xpath(STAFF_XPATH));
		staff.click();
		String current = driver.getTitle();
		String expected = "Staff - List - Humanity";
		if (current.equals(expected)) {
			System.out.println("Page title Staff " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out.println("Page title Staff " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void availability(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(AVAILABILITY_XPATH)));
		WebElement availability = driver.findElement(By.xpath(AVAILABILITY_XPATH));
		availability.click();
		String current = driver.getTitle();
		String expected = "Humanity";
		if (current.equals(expected)) {
			System.out.println(
					"Page title Availability " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out.println(
					"Page title Availability " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void payroll(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PAYROLL_XPATH)));
		WebElement payroll = driver.findElement(By.xpath(PAYROLL_XPATH));
		payroll.click();
		String current = driver.getTitle();
		String expected = "Payroll - Scheduled-hours - Humanity";
		if (current.equals(expected)) {
			System.out
					.println("Page title Payroll " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out.println("Page title Payroll " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}

	public static void reports(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(REPORTS_XPATH)));
		WebElement reports = driver.findElement(By.xpath(REPORTS_XPATH));
		reports.click();
		String current = driver.getTitle();
		String expected = "Reports - Reports Home - Humanity";
		if (current.equals(expected)) {
			System.out
					.println("Page title Reports " + "('" + current + "')" + " is the same as the string " + expected);
		} else {
			System.out.println("Page title Reports " + "('" + current + "')" + " not the same as a string " + expected);
		}
	}
	public static void staff1(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(STAFF_XPATH)));
		WebElement staff = driver.findElement(By.xpath(STAFF_XPATH));
		staff.click();

	}

}
