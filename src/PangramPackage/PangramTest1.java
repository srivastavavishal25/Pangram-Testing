package PangramPackage;

//import static org.testng.Assert.assertTrue;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.asserts.SoftAssert;


public class PangramTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String source ="https://pangram-checker.com/";
		 driver.manage().window().maximize();
		driver.get(source);
		
		//Soft Assertion
		//SoftAssert sa = new SoftAssert();
	
		
//	Test-1-- Site security check
		 String destination =driver.getCurrentUrl();
		 if (source.contains(destination))
		 {
			 System.out.println("Site is secure");
			// sa.assertTrue(true);
		 }
		 else 
		 {
			 System.out.println("Non Secure");
			// sa.assertTrue(false);
		 }
		 
//Test Case2	--When more then 26 characters but not  Pangram		
     driver.findElement(By.name("phrase")).sendKeys("dgfhggddefghijklmnopqrstuvwxyzsdftenfd");
		 driver.findElement(By.cssSelector("button.button.success")).click();
		 Thread.sleep(2000);
		 String expectedmsg = driver.findElement(By.className("dialog-content")).getText();
		 String actualmsg ="Pangram: false Missing Letters";
		  if (expectedmsg.contains(actualmsg))
			 System.out.println("String is not Pangram-Test pass");
		 else
			 System.out.println("Test Fail");

		 
//Test Case3 --When more then 26 characters with  Pangram			 	
/*	 driver.findElement(By.name("phrase")).sendKeys("abcdefghijklmnopqrstuvwxyzsdftenfd");
		 driver.findElement(By.cssSelector("button.button.success")).click();
		 Thread.sleep(2000);
		 String expectedmsg = driver.findElement(By.className("dialog-content")).getText();
		 String actualmsg ="Pangram: true Missing Letters";
		 if (expectedmsg.contains(actualmsg))
			 System.out.println("String is Pangram-Test pass");
		 else 
			 System.out.println("Test Fail");	
*/

//Test Case4 -- Click Try Again & it should return on previous screen
/*		 
		 driver.findElement(By.name("phrase")).sendKeys("abcdefghijklmnopqrstuvwxyzsdftenfd");
		 driver.findElement(By.cssSelector("button.button.success")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button.button.primary")).click();
		 Thread.sleep(5000);
		 
		//  sa.assertTrue(driver.findElement(By.name("phrase")).isDisplayed()); 		 
		if (driver.findElement(By.name("phrase")).isDisplayed())
			System.out.println("Try Again returns to previous screen- Test Pass");
		else
			System.out.println("Try Again not working- Test Fail");
*/   
	
//Test-5 --On click of "X" icon text should be cleared
/*		 driver.findElement(By.name("phrase")).sendKeys("abcdefghijklmnopqrstuvwxyzsdftenfd");		 
		 Thread.sleep(1000);
		 driver.findElement(By.className("default-icon-cross")).click();
		 Thread.sleep(5000);
		if (driver.findElement(By.name("phrase")).getText().contains(""))
			System.out.println("Text cleared- TC passed");
		else 
			System.out.println("Text not cleared- TC Fail");
*/  
		 
// Test-6-- Click on Submit without text
/*		 driver.findElement(By.cssSelector("button.button.success")).click();
         Thread.sleep(2000);
		 String expectedmsg = driver.findElement(By.className("dialog-content")).getText();
		 String actualmsg ="Pangram: false Missing Letters: a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
		 if (expectedmsg.contains(actualmsg))
			 System.out.println("String matched- all 26 characters available-Test Passed");
		 else 
			 System.out.println("Test Fail-some Alphabets are missing");	 
*/
		 

	}

}
