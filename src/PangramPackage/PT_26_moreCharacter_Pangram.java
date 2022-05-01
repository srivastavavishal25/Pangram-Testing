package PangramPackage;

import static org.testng.Assert.assertTrue;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class PT_26_moreCharacter_Pangram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String source = "https://pangram-checker.com/";
		driver.manage().window().maximize();
		driver.get(source);

		// Soft Assertion
		SoftAssert sa = new SoftAssert();

//Test Case3 --When more then 26 characters with  Pangram			 	
		driver.findElement(By.name("phrase")).sendKeys("abcdefghijklmnopqrstuvwxyzsdftenfd");
		driver.findElement(By.cssSelector("button.button.success")).click();
		Thread.sleep(2000);
		String expectedmsg = driver.findElement(By.className("dialog-content")).getText();
		String actualmsg = "Pangram: true Missing Letters";
		if (expectedmsg.contains(actualmsg))
			System.out.println("String is Pangram-Test pass");
		else
			System.out.println("Test Fail");
		driver.quit();
	}

}
