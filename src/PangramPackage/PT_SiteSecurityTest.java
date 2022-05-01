package PangramPackage;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class PT_SiteSecurityTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String source = "https://pangram-checker.com/";
		driver.get(source);
		driver.manage().window().maximize();

		// Soft Assertion
		SoftAssert sa = new SoftAssert();

//	Test-1-- Site security check
		String destination = driver.getCurrentUrl();
		if (source.contains(destination)) {
			System.out.println("Site is secure");
			sa.assertTrue(true);
		} else {
			System.out.println("Non Secure");
			sa.assertTrue(false);
		}
		driver.quit();

	}

}
