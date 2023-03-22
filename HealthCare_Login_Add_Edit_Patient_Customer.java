package SeleniumTest;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;




class HealthCare_Login_Add_Edit_Patient_Customer 
{
	
	WebDriver driver;


	// Test the patient registration functionality
		@Test
		void testAddEdit_Patient() throws FileNotFoundException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\s8077\\eclipse-workspace-2\\SeleniumTest\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://genolab_demo.mvstack.com/en/login");
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
			
			try 
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//li[2]/a/i")).click();
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")).click();
			Select oSelect = new Select(driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")));			 
			oSelect.selectByVisibleText("View Patients");
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.linkText("ADD NEW")).click();
			driver.findElement(By.linkText("RT-PCR")).click();
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//	Screening option selection
			
			driver.findElement(By.cssSelector("#severeSymptoms a")).click();
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.id("submitAnswers")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
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
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
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
//			
//			WebElement paymentInsurance = driver.findElement(By.cssSelector(".form-row:nth-child(10) .custom-control:nth-child(2) > .custom-control-label"));
//			WebElement paymentCreditCard = driver.findElement(By.cssSelector(".form-row:nth-child(10) .custom-control:nth-child(3) > .custom-control-label"));
//			WebElement paymentCash = driver.findElement(By.cssSelector(".form-row:nth-child(10) .custom-control:nth-child(4) > .custom-control-label"));
//			WebElement paymentCaresAct = driver.findElement(By.cssSelector(".form-row:nth-child(10) .custom-control:nth-child(5) > .custom-control-label"));
			

			WebElement paymentInsurance =  driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(2) > label"));
			WebElement paymentCreditCard = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(3) > label"));
			WebElement paymentCash = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(4) > label"));
			
			//** Uncomment the mode of payment to be tested from the 4 lines below **//
			// 1 - Insurance, 2- Credit Card, 3- Cash, 4- CaresAct
			
	//		WebElement selected = driver.findElement(By.cssSelector(".form-row:nth-child(10) .custom-control:nth-child(2) > .custom-control-label"));
	//		WebElement selected = driver.findElement(By.cssSelector(".form-row:nth-child(10) .custom-control:nth-child(3) > .custom-control-label"));
	//		WebElement selected = driver.findElement(By.cssSelector(".form-row:nth-child(10) .custom-control:nth-child(4) > .custom-control-label"));
			WebElement selected = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(4) > label"));
			
			if (selected.equals(paymentCreditCard))
			{
				paymentCreditCard.click();

			}
			else if (selected.equals(paymentInsurance))
			{
				WebElement dropdown;
				paymentInsurance.click();
				dropdown = driver.findElement(By.id("select2-edit_patient_insuranceType-container"));
				dropdown.click();
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				List<WebElement> options = driver.findElements(By.xpath("//ul[@id='select2-edit_patient_insuranceType-results']/li"));
				for (WebElement my_option:options)
				{
				    String innerhtml = my_option.getAttribute("innerHTML");
				    if(innerhtml.contentEquals("Access Health"))
				    {
				        my_option.click();
				        break;
				    }
				    System.out.println("Option chosen is : "+innerhtml);    
				}
				
				driver.findElement(By.id("edit_patient_insuranceId")).sendKeys("12345678A");
				driver.findElement(By.id("checkEligibility")).click();
				
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.id("submit_patient")).click();
				
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			else if (selected.equals(paymentCash))
			{
				paymentCash.click();
				
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}
//			else if (selected.equals(paymentCaresAct))
//			{
//				paymentCaresAct.click();
//				
//				try 
//				{
//					TimeUnit.SECONDS.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
			else
			{
				System.out.println("No payment option selected");
			}
			
			for (int i=0;i<2;i++)
			{
				driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();
				driver.findElement(By.xpath("//label[contains(.,'No')]")).click();				
			}
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");
			
			//***OLDCODE***/
//			driver.findElement(By.id("email_patient_email")).sendKeys(invalid_email);
//			driver.findElement(By.id("checkEmail")).click();
//			driver.findElement(By.id("email_patient_email")).clear();
//			try 
//			{
//				TimeUnit.SECONDS.sleep(2);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.id("email_patient_email")).sendKeys(alreadyexist_email);
//			driver.findElement(By.id("checkEmail")).click();
//			driver.findElement(By.id("email_patient_email")).clear();
//			try 
//			{
//				TimeUnit.SECONDS.sleep(2);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.id("email_patient_email")).sendKeys(valid_email);
//			driver.findElement(By.id("checkEmail")).click();
//			
//			driver.findElement(By.cssSelector(".btn-primary")).click();
			
			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient_comments').offset().top - 150 }, 'slow');");
			try 
			{
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");
			
			driver.findElement(By.id("email_patient_email")).sendKeys(valid_email);

			driver.findElement(By.cssSelector(".btn-primary")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.cssSelector("#app-container > main > div > div.row.mt-4 > div > a:nth-child(2)")).click();
			
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")).click();
			oSelect = new Select(driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")));			 
			oSelect.selectByVisibleText("Edit Patient");
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
			
			paymentInsurance = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(2) > label"));
			paymentCreditCard = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(3) > label"));
			paymentCash = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(4) > label"));
			
			//** Uncomment the mode of payment to be tested from the 4 lines below **//
			// 1 - Insurance, 2- Credit Card, 3- Cash, 4- CaresAct
			
//			selected = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(2) > label"));
//			selected = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(3) > label"));
			selected = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(4) > label"));
			
			if (selected.equals(paymentCreditCard))
			{
				paymentCreditCard.click();

			}
			else if (selected.equals(paymentInsurance))
			{
				WebElement dropdown;
				paymentInsurance.click();
				dropdown = driver.findElement(By.id("select2-edit_patient_insuranceType-container"));
				dropdown.click();
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				List<WebElement> options = driver.findElements(By.xpath("//ul[@id='select2-edit_patient_insuranceType-results']/li"));
				for (WebElement my_option:options)
				{
				    String innerhtml = my_option.getAttribute("innerHTML");
				    if(innerhtml.contentEquals("Access Health"))
				    {
				        my_option.click();
				        break;
				    }
				    System.out.println("Option chosen is : "+innerhtml);    
				}
				
				driver.findElement(By.id("edit_patient_insuranceId")).sendKeys("12345678A");
				driver.findElement(By.id("checkEligibility")).click();
				
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.id("submit_patient")).click();
				
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			else if (selected.equals(paymentCash))
			{
				paymentCash.click();
				
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}
//			else if (selected.equals(paymentCaresAct))
//			{
//				paymentCaresAct.click();
//				
//				try 
//				{
//					TimeUnit.SECONDS.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
			else
			{
				System.out.println("No payment option selected");
			}
			
			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient > div:nth-child(11) > div > label').offset().top - 150 }, 'slow');");
			
			for (int i=0;i<2;i++)
			{
				driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();
				driver.findElement(By.xpath("//label[contains(.,'No')]")).click();				
			}
			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient_comments').offset().top - 150 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");
			
			
//			driver.findElement(By.id("email_patient_email")).sendKeys(invalid_email);
//			driver.findElement(By.id("checkEmail")).click();
//			driver.findElement(By.id("email_patient_email")).clear();
//			try 
//			{
//				TimeUnit.SECONDS.sleep(2);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.id("email_patient_email")).sendKeys(alreadyexist_email);
//			driver.findElement(By.id("checkEmail")).click();
//			driver.findElement(By.id("email_patient_email")).clear();
//			try 
//			{
//				TimeUnit.SECONDS.sleep(2);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.id("email_patient_email")).sendKeys(valid_email);
//			driver.findElement(By.id("checkEmail")).click();
			
			driver.findElement(By.cssSelector(".btn-primary")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			String current = driver.getCurrentUrl();
			String actual = "https://genolab_demo.mvstack.com/en/patient/patient-list/all/1";
			assertEquals(actual,current);
			
			//Close browser
			driver.close();
		}

}


