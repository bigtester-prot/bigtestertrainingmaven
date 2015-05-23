package testsuite_homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

public class SuiteFinalizer {
	@AfterSuite
	public void afterSuite() {
		WebDriver driver = SuiteInitializer.getDriver();
		driver.close();
	}
}