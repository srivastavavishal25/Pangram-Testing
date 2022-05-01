package PangramPackage;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class PT_TryAgain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String source = "https://pangram-checker.com/";
		driver.get(source);
		driver.manage().window().maximize();

		// Soft Assertion
		SoftAssert sa = new SoftAssert();

//Test Case4 -- Click Try Again & it should return on previous screen

		driver.findElement(By.name("phrase")).sendKeys("abcdefghijklmnopqrstuvwxyzsdftenfd");
		driver.findElement(By.cssSelector("button.button.success")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.button.primary")).click();
		Thread.sleep(5000);

		// sa.assertTrue(driver.findElement(By.name("phrase")).isDisplayed());
		if (driver.findElement(By.name("phrase")).isDisplayed())
			System.out.println("Try Again returns to previous screen- Test Pass");
		else
			System.out.println("Try Again not working- Test Fail");
		driver.quit();
	}

}
