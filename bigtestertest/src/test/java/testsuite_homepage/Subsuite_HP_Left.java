package testsuite_homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Subsuite_HP_Left {
	@Test(priority = 20)
	public void flaseLoginBadCodeExampleForPOM() throws InterruptedException {
		String username = "bigtester";
		String password = "bigtester";
		By usernameLocator = By.id("modlgn_username");
		By passwordLocator = By.id("modlgn_passwd");
		By loginButtonLocator = By.name("Submit");

		WebDriver driver = SuiteInitializer.getDriver();

		driver.findElement(usernameLocator).sendKeys(username);
		driver.findElement(passwordLocator).sendKeys(password);
		driver.findElement(loginButtonLocator).click();
		// wait2();
		Assert.assertTrue(
				driver.getPageSource()
						.contains(
								"Username and password do not match or you do not have an account yet"),
				"False Login page not appear");
		Thread.sleep(3000);
		System.out.println("False Login page appears");
	}

	@Test(priority = 1)
	public void abc() {
		WebDriver driver = SuiteInitializer.getDriver();
		String i = driver.getCurrentUrl();
		System.out.println(i + " home url printed in console");
		Assert.assertTrue(true);

	}

	@Test(dependsOnMethods = "abc")
	private static void printBeforeMethod() {
		System.out.println("before method");
	}

	@Test(dependsOnMethods = "abc")
	private static void printBeforeMethod1() {
		System.out.println("before method");
	}
}
