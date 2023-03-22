package SeleniumTest;
//package seleniumTest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//Ubaid Qaiser

class HealthCare_Facility_Auto_CSV
{

	WebDriver driver;


	// Test the facility addition/edit functionality
		@Test
		void testRun() throws FileNotFoundException
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

			driver.findElement(By.id("inputEmail")).sendKeys("info+admin@gtprinters.com");
			driver.findElement(By.id("inputPassword")).sendKeys("Testing123!");
			driver.findElement(By.cssSelector(".btn")).click();

			try
			{
				TimeUnit.SECONDS.sleep(5);
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


			//************** MODIFED BY ME
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
			JavascriptExecutor js = (JavascriptExecutor)driver;

			// Gender
			driver.findElement(By.id("edit_patient_sex")).click();
			driver.findElement(By.id("edit_patient_sex")).sendKeys(gender);

			// Phone Number
			driver.findElement(By.id("edit_patient_phone")).sendKeys(phone);

			// Address-1
			driver.findElement(By.id("autocomplete")).sendKeys(address1);

			// Address-2
			driver.findElement(By.id("address2")).sendKeys(address2);
			js.executeScript("$('html, body').animate({scrollTop: $('#city').offset().top - 200 }, 10);");
			try
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Address-2 City
			driver.findElement(By.id("city")).sendKeys(city);

			// Address-2 State
			driver.findElement(By.id("state")).click();
			driver.findElement(By.id("state")).sendKeys(state);

			// Address-2 ZIP Code
			driver.findElement(By.id("zipcode")).sendKeys(ZIP);


			js.executeScript("$('html, body').animate({scrollTop: $('#ethnicity').offset().top - 200 }, 10);");

			// Ethnicity
			driver.findElement(By.id("ethnicity")).click();
			driver.findElement(By.id("ethnicity")).sendKeys(ethnicity);

			// Race
			driver.findElement(By.id("race")).click();
			driver.findElement(By.id("race")).sendKeys(race);
			driver.findElement(By.id("race")).click();

			//*********************************Payment Option***********************************//

			WebElement paymentCash = driver.findElement(By.cssSelector("#edit_patient > div:nth-child(10) > div > div:nth-child(4) > label"));
			

			paymentCash.click();
			
			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient > div:nth-child(11) > div > label').offset().top - 150 }, 'slow');");


			for (int i=0;i<2;i++)
			{
				driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();
				driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
			}

			js.executeScript("$('html, body').animate({scrollTop: $('#edit_patient_comments').offset().top - 150 }, 'slow');");
			sleeep(2);
			driver.findElement(By.id("edit_patient_comments")).sendKeys("Test Comment");
			driver.findElement(By.id("email_patient_email")).sendKeys(valid_email);

			driver.findElement(By.cssSelector(".btn-primary")).click();


			sleeep(2);

			try {
				driver.findElement(By.cssSelector("#app-container > main > div > div.row.mt-4 > div > a:nth-child(2)")).click();
				
			}catch(Exception e) {
				
			}

			sleeep(4);

			
			

			driver.findElement(By.cssSelector("#patient_table > tbody > tr:first-child > td.dt-checkboxes-cell > input")).click();

			sleeep(1);

			Select oSelect2 = new Select(driver.findElement(By.cssSelector(".selected .customer-action")));
			sleeep(1);
			oSelect2.selectByVisibleText("View Reports");

			sleeep(1);

			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(1) > div.col-4.ml-5 > span:nth-child(2) > input")).click();

			sleeep(3);
			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(1) > div.col-4.ml-5 > span:nth-child(3) > input")).click();

			sleeep(2);

			sleeep(2);
			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(1) > div.col-4.ml-5 > span:nth-child(4) > input")).click();

			sleeep(2);
			sleeep(2);

			driver.navigate().refresh();

			String report1 = driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(2) > div > table > tbody > tr:nth-child(2) > td:nth-child(1)")).getAttribute("innerText");
			String report2 = driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(2) > div > table > tbody > tr:nth-child(3) > td:nth-child(1)")).getAttribute("innerText");
			String report3 = driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(2) > div > table > tbody > tr:nth-child(4) > td:nth-child(1)")).getAttribute("innerText");

			report1 = report1.substring(report1.indexOf("(") + 1);
			report1 = report1.substring(0, report1.indexOf(")"));

			report2 = report2.substring(report2.indexOf("(") + 1);
			report2 = report2.substring(0, report2.indexOf(")"));

			report3 = report3.substring(report3.indexOf("(") + 1);
			report3 = report3.substring(0, report3.indexOf(")"));
			String fileName = getSaltString() +  ".xls";


			
			
			
		        HSSFWorkbook workbook = new HSSFWorkbook();
		        HSSFSheet sheet = workbook.createSheet("SampleResult");
		         
		        Object[][] bookData = {
		                {"Sample ID","Sample Name","Result","COVID -FAM","IC-HEX"},
		                {"1",  report1 ,"COVID","",""},
		                {"2",  report2 ,"Indeterminate","",""},
		                {"5",  report3 ,"Negative","",""},
		                {"95",  "NC" ,"Failed","",""},
		                {"96",  "PC" ,"COVID","",""},
		                
		        };
		 
		        int rowCount = -1;
		         
		        for (Object[] aBook : bookData) {
		            Row row = sheet.createRow(++rowCount);
		             
		            int columnCount = -1;
		             
		            for (Object field : aBook) {
		                Cell cell = row.createCell(++columnCount);
		                if (field instanceof String) {
		                    cell.setCellValue((String) field);
		                } else if (field instanceof Integer) {
		                    cell.setCellValue((Integer) field);
		                }
		            }
		             
		        }
		         
		         
		        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
		            workbook.write(outputStream);
		        } catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 
			

			sleeep(1);
			/////////// CSV UPLOAD
			driver.findElement(By.linkText("Utilities")).click();

			sleeep(1);
			
			driver.findElement(By.linkText("Import Covid Results")).click();

			sleeep(2);
			

			js.executeScript("document.querySelector('#form_fileToUpload').removeAttribute('accept')");
			
			sleeep(1);
			
			WebElement chooseFile = driver.findElement(By.id("form_fileToUpload"));

			File file = new File(fileName);
			
			chooseFile.sendKeys(file.getAbsolutePath());
			
			sleeep(1);
			
			driver.findElement(By.id("form_submit")).click();
			
			sleeep(5);
			
			/// REGENERATE
			
			driver.findElement(By.linkText("Facilities")).click();
			sleeep(4);
			driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")).click();
			Select oSelect11 = new Select(driver.findElement(By.cssSelector(".odd:nth-child(1) .customer-action")));
			oSelect11.selectByVisibleText("View Patients");

			sleeep(4);

			driver.findElement(By.cssSelector("#patient_table > tbody > tr:first-child > td.dt-checkboxes-cell > input")).click();
			
			sleeep(1);
			
			Select oSelect22 = new Select(driver.findElement(By.cssSelector(".selected .customer-action")));
			oSelect22.selectByVisibleText("View Reports");
			
			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(2) > div > table > tbody > tr:nth-child(2) > td:nth-child(4) > button")).click();
			sleeep(4);
			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(2) > div > table > tbody > tr:nth-child(3) > td:nth-child(4) > button")).click();
			sleeep(4);
			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(2) > div > table > tbody > tr:nth-child(4) > td:nth-child(4) > button")).click(); 
			sleeep(4);
			
			
			driver.navigate().refresh();
			sleeep(2);
			
			driver.findElement(By.cssSelector("#app-container > main > div.container-fluid > div:nth-child(2) > div > table > tbody > tr:nth-child(2) > td:nth-child(1) > a.reportRequest")).click();
			

			sleeep(7);
			//Close browser
			driver.quit();
		}
		protected String getSaltString() {
	        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 18) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String saltStr = salt.toString();
	        return saltStr;

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


