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




class HealthCare_Login_Report_s
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
			driver.findElement(By.linkText("Facilities")).click();
			try
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.cssSelector("#customer_table > tbody > tr:first-child > td.hidden_on_mobile.dt-checkboxes-cell > input")).click();
			try
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Select oSelect = new Select(driver.findElement(By.cssSelector(".selected .customer-action")));
			oSelect.selectByVisibleText("View Patients");

			sleeep(1);

			Select oSelect1 = new Select(driver.findElement(By.cssSelector("#patientDateFilter")));
			sleeep(1);

			oSelect1.selectByVisibleText("All Patients");

			sleeep(2);

			driver.findElement(By.cssSelector("#patient_table > tbody > tr:first-child > td.dt-checkboxes-cell > input")).click();

			sleeep(1);

			Select oSelect2 = new Select(driver.findElement(By.cssSelector(".selected .customer-action")));
			oSelect2.selectByVisibleText("View Reports");

			sleeep(1);

			//
			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(1) > div.col-4.ml-5 > span:nth-child(3) > input")).click();

			sleeep(4);

			try {

				List<WebElement> w = driver.findElements(By.className("reportRequest"));
				if (w.size() > 0) {
					w.get(0).click();
					sleeep(5);
				}

			}catch(Exception e) {

			}

			driver.close();
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


