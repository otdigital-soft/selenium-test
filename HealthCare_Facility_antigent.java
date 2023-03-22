package SeleniumTest;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



class HealthCare_Facility_antigent
{

	WebDriver driver;

	
	// Test the patient registration functionality
		@Test
		void test_run() throws FileNotFoundException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\s8077\\eclipse-workspace-2\\SeleniumTest\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://genolab_demo.mvstack.com/en/login");

//			driver.get("http://localhost/en/login");

			try
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			//E-mail registration


			driver.findElement(By.id("inputEmail")).sendKeys("info+customer@gtprinters.com");
			driver.findElement(By.id("inputPassword")).sendKeys("Testing123!");
			driver.findElement(By.cssSelector(".btn")).click();

			sleep(5);
			driver.findElement(By.xpath("//li[2]/a/i")).click();
			sleep(4);
			
			driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")).click();
			Select oSelect = new Select(driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")));
			oSelect.selectByVisibleText("View Patients");
			sleep(4);
			
			driver.findElement(By.linkText("ADD NEW")).click();
			driver.findElement(By.linkText("RAPID (15 mins)")).click();
			
//			System.out.print("GGGggg");
			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("$(\".input-group-prepend button\").trigger(\"click\")");
//			
			sleep(2);
			
//			driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/div[1]/div/div[2]/div/div/div/a[2]")).click();
//			sleep(1);

			

			//	Screening option selection

			driver.findElement(By.cssSelector("#severeSymptoms a")).click();
			sleep(1);

			driver.findElement(By.id("submitAnswers")).click();

			sleep(5);



			//*********************************Patient Info***********************************//
			SecureRandom rand =  new SecureRandom();
			Integer numE= rand.nextInt(1000);
			String num = numE.toString();
			String email = "sbadawy807+"+num+"@gmail.com";

			String firstname = "Test";
			String lastname = "Name";
			String month = "February";
			String day= "14";
			String year= "1999";
			String gender= "M";
			String phone= "1234567890";
			String address1= "TestAddress1";
			String address2= "TestAddress2";
			String city= "California";
			String state= "Lousiana";
			String ZIP= "44000000";
			String ethnicity= "Hispanic or Latino";
			String race = "American Indian or Alaska Native";
			String valid_email=email;
			String invalid_email="testmail@gmall.com";
			String alreadyexist_email="ubaidqaiser97@gmail.com";

			//First Name
			driver.findElement(By.id("edit_patient_firstName")).sendKeys(firstname);

			//Last Name
			driver.findElement(By.id("edit_patient_lastName")).sendKeys(lastname);

			//Birthday Month
			driver.findElement(By.id("select-month")).click();
			driver.findElement(By.id("select-month")).sendKeys(month);

			//Birthday Day
			driver.findElement(By.id("select-day")).click();
			driver.findElement(By.id("select-day")).sendKeys(day);

			// Birthday Year
			driver.findElement(By.id("select-year")).click();
			driver.findElement(By.id("select-year")).sendKeys(year);

			// Gender
			driver.findElement(By.id("edit_patient_sex")).click();
			driver.findElement(By.id("edit_patient_sex")).sendKeys(gender);

			// Phone Number
			driver.findElement(By.id("edit_patient_phone")).sendKeys(phone);

			// Address-1
			driver.findElement(By.id("autocomplete")).sendKeys(address1);

			// Address-2
			driver.findElement(By.id("address2")).sendKeys(address2);

			// Address-2 City
			driver.findElement(By.id("city")).sendKeys(city);

			// Address-2 State
			driver.findElement(By.id("state")).click();
			driver.findElement(By.id("state")).sendKeys(state);

			// Address-2 ZIP Code
			driver.findElement(By.id("zipcode")).sendKeys(ZIP);



			js.executeScript("window.scrollBy(0,1000)");
			js.executeScript("$('html, body').animate({scrollTop: $('#ethnicity').offset().top - 200 }, 10);");

			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Ethnicity
			driver.findElement(By.id("ethnicity")).click();
			driver.findElement(By.id("ethnicity")).sendKeys(ethnicity);

			// Race
			driver.findElement(By.id("race")).click();
			driver.findElement(By.id("race")).sendKeys(race);
			driver.findElement(By.id("race")).click();

			//*********************************Payment Option***********************************//

			
			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient_paymentMethod_0').offset().top - 200 }, 10);");

//			WebElement paymentCash = driver.findElement(By.cssSelector("#edit_patient_paymentMethod_0"));
//
//
//			paymentCash.click();

			for (int i=0;i<2;i++)
			{
				driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();
				driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
			}
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");


			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient_comments').offset().top - 150 }, 'slow');");

			sleep(2);
			
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");

			driver.findElement(By.id("email_patient_email")).sendKeys(valid_email);

			driver.findElement(By.cssSelector(".btn-primary")).click();

			
			
			
			
			sleep(2);

			
			///// ADD again 
			driver.findElement(By.linkText("Add new patient")).click();

			
			
//			Screening option selection

			driver.findElement(By.cssSelector("#severeSymptoms a")).click();
			sleep(1);

			driver.findElement(By.id("submitAnswers")).click();

			sleep(5);
			
			
			driver.findElement(By.id("edit_patient_firstName")).sendKeys(firstname);

			//Last Name
			driver.findElement(By.id("edit_patient_lastName")).sendKeys(lastname);

			//Birthday Month
			driver.findElement(By.id("select-month")).click();
			driver.findElement(By.id("select-month")).sendKeys(month);

			//Birthday Day
			driver.findElement(By.id("select-day")).click();
			driver.findElement(By.id("select-day")).sendKeys(day);

			// Birthday Year
			driver.findElement(By.id("select-year")).click();
			driver.findElement(By.id("select-year")).sendKeys(year);

			// Gender
			driver.findElement(By.id("edit_patient_sex")).click();
			driver.findElement(By.id("edit_patient_sex")).sendKeys(gender);

			// Phone Number
			driver.findElement(By.id("edit_patient_phone")).sendKeys(phone);

			// Address-1
			driver.findElement(By.id("autocomplete")).sendKeys(address1);

			// Address-2
			driver.findElement(By.id("address2")).sendKeys(address2);

			// Address-2 City
			driver.findElement(By.id("city")).sendKeys(city);

			// Address-2 State
			driver.findElement(By.id("state")).click();
			driver.findElement(By.id("state")).sendKeys(state);

			// Address-2 ZIP Code
			driver.findElement(By.id("zipcode")).sendKeys(ZIP);



			js.executeScript("window.scrollBy(0,1000)");
			js.executeScript("$('html, body').animate({scrollTop: $('#ethnicity').offset().top - 200 }, 10);");

			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Ethnicity
			driver.findElement(By.id("ethnicity")).click();
			driver.findElement(By.id("ethnicity")).sendKeys(ethnicity);

			// Race
			driver.findElement(By.id("race")).click();
			driver.findElement(By.id("race")).sendKeys(race);
			driver.findElement(By.id("race")).click();

			//*********************************Payment Option***********************************//



//			paymentCash = driver.findElement(By.cssSelector("#edit_patient_paymentMethod_0"));
//
//
//			paymentCash.click();

			for (int i=0;i<2;i++)
			{
				driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();
				driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
			}
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");


			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient_comments').offset().top - 150 }, 'slow');");

			sleep(2);
			
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");

			driver.findElement(By.id("email_patient_email")).clear();
			driver.findElement(By.id("email_patient_email")).sendKeys(valid_email);

			driver.findElement(By.cssSelector(".btn-primary")).click();

			
			//////
			
			sleep(2);

			driver.findElement(By.cssSelector("#app-container > main > div > div.row.sortable-custom > div > div > div > span > a")).click();

			sleep(4);




			//*********************************Edit Patient Info***********************************//


			String email2 = "sbadawy807+"+num+"new"+"@gmail.com";

			firstname = "Test";
			lastname = "Name";
			month = "January";
			day= "14";
			year= "1999";
			gender= "M";
			phone= "0987654321";
			address1= "TestAddress1";
			address2= "TestAddress2";
			city= "California";
			state= "Lousiana";
			ZIP= "44000000";
			ethnicity= "Hispanic or Latino";
			race = "American Indian or Alaska Native";
			valid_email=email2;
			invalid_email="testmail@gmall.com";
			alreadyexist_email="ubaidqaiser97@gmail.com";

			//First Name
			driver.findElement(By.id("edit_patient_firstName")).sendKeys(firstname);

			//Last Name
			driver.findElement(By.id("edit_patient_lastName")).sendKeys(lastname);

			//Birthday Month
			driver.findElement(By.id("select-month")).click();
			driver.findElement(By.id("select-month")).sendKeys(month);

			//Birthday Day
			driver.findElement(By.id("select-day")).click();
			driver.findElement(By.id("select-day")).sendKeys(day);

			// Birthday Year
			driver.findElement(By.id("select-year")).click();
			driver.findElement(By.id("select-year")).sendKeys(year);

			// Gender
			driver.findElement(By.id("edit_patient_sex")).click();
			driver.findElement(By.id("edit_patient_sex")).sendKeys(gender);

			// Phone Number
			driver.findElement(By.id("edit_patient_phone")).sendKeys(phone);

			// Address-1
			driver.findElement(By.id("autocomplete")).sendKeys(address1);

			// Address-2
			driver.findElement(By.id("address2")).sendKeys(address2);

			// Address-2 City
			driver.findElement(By.id("city")).sendKeys(city);

			// Address-2 State
			driver.findElement(By.id("state")).click();
			driver.findElement(By.id("state")).sendKeys(state);

			// Address-2 ZIP Code
			driver.findElement(By.id("zipcode")).sendKeys(ZIP);


			js = (JavascriptExecutor)driver;
			js.executeScript("$('html, body').animate({scrollTop: $('#ethnicity').offset().top - 200 }, 10);");
			try
			{
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Ethnicity
			driver.findElement(By.id("ethnicity")).click();
			driver.findElement(By.id("ethnicity")).sendKeys(ethnicity);

			// Race
			driver.findElement(By.id("race")).click();
			driver.findElement(By.id("race")).sendKeys(race);
			driver.findElement(By.id("race")).click();

			//*********************************Payment Option***********************************//


//			paymentCash = driver.findElement(By.cssSelector("#edit_patient_paymentMethod_0"));
//
//
//			paymentCash.click();
			
			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient > div:nth-child(11) > div > label').offset().top - 150 }, 'slow');");



			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient_comments').offset().top - 150 }, 10);");



			driver.findElement(By.cssSelector(".btn-primary")).click();

			try
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



			driver.findElement(By.linkText("Save & Continue")).click();


			sleep(5);
			
			driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")).click();
			
			sleep(2);
			
			driver.findElement(By.xpath("//*[@id=\"patient_table\"]/tbody/tr[1]/td[6]/span[3]/input")).click();
			sleep(1);
			driver.switchTo().alert().accept();
			
			sleep(1);
			oSelect = new Select(driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")));
			oSelect.selectByVisibleText("View Reports");

			sleep(5);

			driver.findElement(By.cssSelector(".addAntigenResult")).click();
			sleep(1);
			
			oSelect = new Select(driver.findElement(By.cssSelector("#antigenResult")));
			oSelect.selectByVisibleText("NEGATIVE");
			
			driver.findElement(By.cssSelector("#antigenResultSave")).click();
			
			sleep(5);
			
			driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/div[4]/div/table/tbody/tr[2]/td[1]/a")).click();
			
			sleep(5);
			
			//Close browser
			driver.quit();
		}

		void sleep(int sec) {
			try
			{
				TimeUnit.SECONDS.sleep(sec);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


}


