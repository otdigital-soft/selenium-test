package SeleniumTest;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




class HealthCare_Login_CSV
{

	WebDriver driver;


	// Test the patient registration functionality
		@Test
		void testRun() throws FileNotFoundException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\s8077\\eclipse-workspace-2\\SeleniumTest\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://genolab_demo.mvstack.com/en/login/");
			try
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			//E-mail registration

			driver.findElement(By.id("inputEmail")).sendKeys("info+admin@gtprinters.com");
			driver.findElement(By.id("inputPassword")).sendKeys("Testing123!");
			driver.findElement(By.cssSelector(".btn")).click();


			try
			{
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.linkText("Utilities")).click();

			sleeep(1);
			
			driver.findElement(By.linkText("Import Covid Results")).click();

			sleeep(2);
			
			WebElement chooseFile = driver.findElement(By.id("form_fileToUpload"));
			
			// Here you can change CSV file path
			chooseFile.sendKeys("C:/test.csv");

//			chooseFile.sendKeys("/Users/abdulmannan/eclipse-workspace/Selenium Test/test.csv");
			
			sleeep(1);
			
			driver.findElement(By.id("form_submit")).click();
			
			sleeep(5);


//			driver.close();
		}

		void sleeep(int sec) {
			try
			{
				TimeUnit.SECONDS.sleep(sec);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}


