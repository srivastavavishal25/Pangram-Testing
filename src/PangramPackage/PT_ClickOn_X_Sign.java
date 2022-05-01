package PangramPackage;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class PT_ClickOn_X_Sign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String source = "https://pangram-checker.com/";
		driver.get(source);
		driver.manage().window().maximize();

		// Soft Assertion
		SoftAssert sa = new SoftAssert();

// On click of "X" icon text should be cleared
		driver.findElement(By.name("phrase")).sendKeys("abcdefghijklmnopqrstuvwxyzsdftenfd");
		Thread.sleep(1000);
		driver.findElement(By.className("default-icon-cross")).click();
		Thread.sleep(5000);
		if (driver.findElement(By.name("phrase")).getText().contains(""))
			System.out.println("Text cleared- TC passed");
		else
			System.out.println("Text not cleared- TC Fail");
		driver.quit();

	}

}
