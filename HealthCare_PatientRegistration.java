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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;




class HealthCare_PatientRegistration 
{
	
	WebDriver driver;


	// Test the patient registration functionality
		@Test
		void testPatientProfile() throws FileNotFoundException 
		{
			//System.setProperty("webdriver.chrome.driver", "chromedriver");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\s8077\\eclipse-workspace-2\\SeleniumTest\\chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://genolab_demo.mvstack.com/en/patient/registration/1");
			try 
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//*********************************Start_Questionnaire***********************************//
			//driver.findElement(By.linkText("Open Link Here")).click(); //Severe Symptoms
			//driver.findElement(By.id("submitAnswers")).click();
			//Note - all combinations and permutations of questionnaire will be tested as requested.
			
			
			
			//*********************************End_Questionnaire***********************************//
			
			
			SecureRandom rand =  new SecureRandom();
			Integer numE= rand.nextInt(1000);
			String num = numE.toString();
			String email = "sbadawy807+"+num+"@gmail.com";
			
			//E-mail registration
			
			driver.findElement(By.id("user_email")).sendKeys(email);
			driver.findElement(By.id("patient_register")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Screening option selection
			
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
			
			//First Name
			driver.findElement(By.id("edit_patient_firstName")).sendKeys("Test");

			//Last Name
			driver.findElement(By.id("edit_patient_lastName")).sendKeys("Name");
			
			//Birthday Month
			driver.findElement(By.id("select-month")).click();
			driver.findElement(By.id("select-month")).sendKeys("February");
			
			//Birthday Day
			driver.findElement(By.id("select-day")).click();
			driver.findElement(By.id("select-day")).sendKeys("14");
			
			// Birthday Year
			driver.findElement(By.id("select-year")).click();
			driver.findElement(By.id("select-year")).sendKeys("2013");			
			
			// Gender
			driver.findElement(By.id("edit_patient_sex")).click();
			driver.findElement(By.id("edit_patient_sex")).sendKeys("M");			
			
			// Phone Number
			driver.findElement(By.id("edit_patient_phone")).sendKeys("1234567890");			
			
			// Address-1
			driver.findElement(By.id("autocomplete")).sendKeys("TestAddress");			
			
			// Address-2
			driver.findElement(By.id("address2")).sendKeys("GarbageGarbageGarbage");			
			
			// Address-2 City 
			driver.findElement(By.id("city")).sendKeys("California");			
			
			// Address-2 State
			driver.findElement(By.id("state")).click();			
			driver.findElement(By.id("state")).sendKeys("Louisiana");			
			
			// Address-2 ZIP Code
			driver.findElement(By.id("zipcode")).sendKeys("44000");			
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			// Ethnicity
			driver.findElement(By.id("ethnicity")).click();
			driver.findElement(By.id("ethnicity")).sendKeys("Hispanic or Latino");
			
			// Race
			driver.findElement(By.id("race")).click();
			driver.findElement(By.id("race")).sendKeys("American Indian or Alaska Native");
			driver.findElement(By.id("race")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			js.executeScript("document.getElementById('edit_patient_paymentMethod_0').checked = true;document.getElementById('edit_patient_paymentMethod_0').click(); $('#edit_patient_insuranceType').val('1').trigger('change');");
			
			
			
			
			
			driver.findElement(By.cssSelector("#edit_patient_insuranceId")).sendKeys("dsjsdhusd");
			
			

			driver.findElement(By.cssSelector("#submit_patient")).click();
			

			// Sample Collection Location - Removed after adding questionnaire
/*			driver.findElement(By.cssSelector(".swab-point:nth-child(1) .custom-control-label")).click();	// Future Pharmacy		
			driver.findElement(By.cssSelector(".swab-point:nth-child(2) .custom-control-label")).click();	// JFK		
			driver.findElement(By.cssSelector(".swab-point:nth-child(3) .custom-control-label")).click();	// Call Us		
*/
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//****************NEW Patient again
			driver.findElement(By.xpath("//*[@id='app-container']/main/div/div[3]/div/a[1]")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//Screening option selection
			
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
			
			//First Name
			driver.findElement(By.id("edit_patient_firstName")).sendKeys("Test");

			//Last Name
			driver.findElement(By.id("edit_patient_lastName")).sendKeys("Name");
			
			//Birthday Month
			driver.findElement(By.id("select-month")).click();
			driver.findElement(By.id("select-month")).sendKeys("February");
			
			//Birthday Day
			driver.findElement(By.id("select-day")).click();
			driver.findElement(By.id("select-day")).sendKeys("14");
			
			// Birthday Year
			driver.findElement(By.id("select-year")).click();
			driver.findElement(By.id("select-year")).sendKeys("2013");			
			
			// Gender
			driver.findElement(By.id("edit_patient_sex")).click();
			driver.findElement(By.id("edit_patient_sex")).sendKeys("M");			
			
			// Phone Number
			driver.findElement(By.id("edit_patient_phone")).sendKeys("1234567890");			
			
			// Address-1
			driver.findElement(By.id("autocomplete")).sendKeys("TestAddress");			
			
			// Address-2
			driver.findElement(By.id("address2")).sendKeys("GarbageGarbageGarbage");			
			
			// Address-2 City 
			driver.findElement(By.id("city")).sendKeys("California");			
			
			// Address-2 State
			driver.findElement(By.id("state")).click();			
			driver.findElement(By.id("state")).sendKeys("Louisiana");			
			
			// Address-2 ZIP Code
			driver.findElement(By.id("zipcode")).sendKeys("44000");			
			js.executeScript("window.scrollBy(0,1000)");
			
			// Ethnicity
			driver.findElement(By.id("ethnicity")).click();
			driver.findElement(By.id("ethnicity")).sendKeys("Hispanic or Latino");
			
			// Race
			driver.findElement(By.id("race")).click();
			driver.findElement(By.id("race")).sendKeys("American Indian or Alaska Native");
			driver.findElement(By.id("race")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			js.executeScript("document.getElementById('edit_patient_paymentMethod_1').checked = true;document.getElementById('edit_patient_paymentMethod_1').click();");
			
			
			driver.findElement(By.cssSelector("#submit_patient")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//** Update Patient**//
			
			driver.findElement(By.xpath("//*[@id='app-container']/main/div/div[2]/div/div[2]/div/span/a")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//First Name UPDATE
			driver.findElement(By.id("edit_patient_firstName")).sendKeys("Test update");
			
			js.executeScript("window.scrollBy(0,2000)");

			driver.findElement(By.cssSelector("#submit_patient")).click();

			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.findElement(By.xpath("//*[@id='app-container']/main/div/div[3]/div/a[1]")).click();

			
			
			////////
			
			driver.findElement(By.cssSelector("#noSymptoms a")).click();
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.switchTo().alert().accept();

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
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//*********************************Patient Info***********************************//
			
			//First Name
			driver.findElement(By.id("edit_patient_firstName")).sendKeys("Test");

			//Last Name
			driver.findElement(By.id("edit_patient_lastName")).sendKeys("Name");
			
			//Birthday Month
			driver.findElement(By.id("select-month")).click();
			driver.findElement(By.id("select-month")).sendKeys("February");
			
			//Birthday Day
			driver.findElement(By.id("select-day")).click();
			driver.findElement(By.id("select-day")).sendKeys("14");
			
			// Birthday Year
			driver.findElement(By.id("select-year")).click();
			driver.findElement(By.id("select-year")).sendKeys("2013");			
			
			// Gender
			driver.findElement(By.id("edit_patient_sex")).click();
			driver.findElement(By.id("edit_patient_sex")).sendKeys("M");			
			
			// Phone Number
			driver.findElement(By.id("edit_patient_phone")).sendKeys("1234567890");			
			
			// Address-1
			driver.findElement(By.id("autocomplete")).sendKeys("TestAddress");			
			
			// Address-2
			driver.findElement(By.id("address2")).sendKeys("GarbageGarbageGarbage");			
			
			// Address-2 City 
			driver.findElement(By.id("city")).sendKeys("California");			
			
			// Address-2 State
			driver.findElement(By.id("state")).click();			
			driver.findElement(By.id("state")).sendKeys("Louisiana");			
			
			// Address-2 ZIP Code
			driver.findElement(By.id("zipcode")).sendKeys("44000");			
			js.executeScript("window.scrollBy(0,1000)");
			
			// Ethnicity
			driver.findElement(By.id("ethnicity")).click();
			driver.findElement(By.id("ethnicity")).sendKeys("Hispanic or Latino");
			
			// Race
			driver.findElement(By.id("race")).click();
			driver.findElement(By.id("race")).sendKeys("American Indian or Alaska Native");
			driver.findElement(By.id("race")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			js.executeScript("document.getElementById('edit_patient_paymentMethod_1').checked = true;document.getElementById('edit_patient_paymentMethod_1').click();");
			
			
			driver.findElement(By.cssSelector("#submit_patient")).click();
			
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.findElement(By.xpath("//*[@id='app-container']/main/div/div[2]/div/div[3]/div/span/span")).click();			
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.switchTo().alert().accept();

			try 
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			// SAVE & contune button
			driver.findElement(By.xpath("//*[@id='app-container']/main/div/div[3]/div/a[2]")).click();
			
			// tersm and condition 
			js.executeScript("window.scrollBy(0,2000);$('#accept_condition_agreeTerms').click()");
			

			driver.findElement(By.id("terms_confirmation")).click();

			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.switchTo().defaultContent();
			driver.findElement(By.id("card-element")).click();
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Secure card payment input frame']")));

			driver.findElement(By.name("cardnumber")).sendKeys("4242424242424242");
			driver.findElement(By.name("exp-date")).sendKeys("0444");
			driver.findElement(By.name("postal")).sendKeys("22222");
			driver.findElement(By.name("cvc")).sendKeys("444");
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.id("form_payment_submit")).click();

			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			driver.close();
//			//*********************************Payment Option***********************************//
//			
//			WebElement paymentInsurance = driver.findElement(By.cssSelector(".form-row:nth-child(11) .custom-control:nth-child(2) > .custom-control-label"));
//			WebElement paymentCreditCard = driver.findElement(By.cssSelector(".form-row:nth-child(11) .custom-control:nth-child(3) > .custom-control-label"));
//			WebElement paymentCash = driver.findElement(By.cssSelector(".custom-control:nth-child(4) > .custom-control-label"));
//			WebElement paymentCaresAct = driver.findElement(By.cssSelector(".custom-control:nth-child(5) > .custom-control-label"));
//			
//			//** Uncomment the mode of payment to be tested from the 4 lines below **//
//			// 1 - Insurance, 2- Credit Card, 3- Cash, 4- CaresAct
//			
//	//		WebElement selected = paymentInsurance;
//			WebElement selected = paymentCreditCard;
//	//		WebElement selected = paymentCash;
//	//		WebElement selected = paymentCaresAct;
//			
//			if (selected.equals(paymentCreditCard))
//			{
//				paymentCreditCard.click();
//				driver.findElement(By.id("submit_patient")).click();
//				try 
//				{
//					TimeUnit.SECONDS.sleep(4);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				driver.findElement(By.cssSelector(".custom-control-label")).click();
//				driver.findElement(By.id("terms_confirmation")).click();
//				
//				try 
//				{
//					TimeUnit.SECONDS.sleep(4);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				driver.switchTo().defaultContent();
//				driver.findElement(By.id("card-element")).click();
//				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Secure card payment input frame']")));
//
//				driver.findElement(By.name("cardnumber")).sendKeys("4242424242424242");
//				driver.findElement(By.name("exp-date")).sendKeys("444");
//				driver.findElement(By.name("postal")).sendKeys("22222");
//				driver.findElement(By.name("cvc")).sendKeys("444");
//				
//				driver.switchTo().defaultContent();
//				
//				driver.findElement(By.id("form_payment_submit")).click();
//
//				try 
//				{
//					TimeUnit.SECONDS.sleep(4);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			else if (selected.equals(paymentInsurance))
//			{
//				WebElement dropdown;
//				paymentInsurance.click();
//				dropdown = driver.findElement(By.id("select2-edit_patient_insuranceType-container"));
//				dropdown.click();
//				try 
//				{
//					TimeUnit.SECONDS.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
////				driver.findElement(By.xpath("//ul[@id='select2-edit_patient_insuranceType-results']/li"));
//				
//				List<WebElement> options = driver.findElements(By.xpath("//ul[@id='select2-edit_patient_insuranceType-results']/li"));
//				for (WebElement my_option:options)
//				{
//				    String innerhtml = my_option.getAttribute("innerHTML");
//				    if(innerhtml.contentEquals("Access Health"))
//				    {
//				        my_option.click();
//				        break;
//				    }
//				    System.out.println("Option chosen is : "+innerhtml);    
//				}
//				
//				driver.findElement(By.id("edit_patient_insuranceId")).sendKeys("12345678A");
//				driver.findElement(By.id("checkEligibility")).click();
//				
//				try 
//				{
//					TimeUnit.SECONDS.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				driver.findElement(By.id("submit_patient")).click();
//				
//				try 
//				{
//					TimeUnit.SECONDS.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				driver.findElement(By.cssSelector(".custom-control-label")).click();
//				driver.findElement(By.id("terms_confirmation")).click();
//				
//			}
//			else if (selected.equals(paymentCash))
//			{
//				paymentCash.click();
//				driver.findElement(By.id("submit_patient")).click();
//				
//				try 
//				{
//					TimeUnit.SECONDS.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				driver.findElement(By.cssSelector(".custom-control-label")).click();
//				driver.findElement(By.id("terms_confirmation")).click();
//				
//				
//			}
//			else if (selected.equals(paymentCaresAct))
//			{
//				paymentCaresAct.click();
//				driver.findElement(By.id("submit_patient")).click();
//				
//				try 
//				{
//					TimeUnit.SECONDS.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				driver.findElement(By.cssSelector(".custom-control-label")).click();
//				driver.findElement(By.id("terms_confirmation")).click();
//			}
//			else
//			{
//				System.out.println("No payment option selected");
//			}
//
//			// Assertion Criteria
//			String current;
//			current = driver.findElement(By.cssSelector("h1")).getText();			
//			String actual = "Thank You";
//			assertEquals(actual,current);
//			
			//Close browser
			
		}

}


