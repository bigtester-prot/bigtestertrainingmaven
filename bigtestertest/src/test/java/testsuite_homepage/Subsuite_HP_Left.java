package testsuite_homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Subsuite_HP_Left {
  @Test (priority=2)
  public void f() {
	  WebDriver driver = SuiteInitializer.getDriver();
	  String i = driver.getCurrentUrl();
	  System.out.println(i + " home url printed in console");
  }

  @Test (priority=1)
  public void abc() {
	  WebDriver driver = SuiteInitializer.getDriver();
		String i = driver.getCurrentUrl();
		System.out.println(i + " home url printed in console");
		Assert.assertTrue(true);
		
  }
  
  @Test (dependsOnMethods="abc")
	private static void printBeforeMethod() {
		System.out.println("before method");
	}

  @Test (dependsOnMethods="abc")
 	private static void printBeforeMethod1() {
 		System.out.println("before method");
 	}
}
