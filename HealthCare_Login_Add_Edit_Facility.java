package SeleniumTest;
//package seleniumTest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
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


//Ubaid Qaiser

class HealthCare_Login_Add_Edit_Facility 
{
	
	WebDriver driver;


	// Test the facility addition/edit functionality
		@Test
		void testAddEdit_Facility() throws FileNotFoundException, InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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
			driver.findElement(By.linkText("ADD NEW")).click();
			try 
			{
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//*********************Facility Info**********************//
			
			String facilityName = "Tested Facility";
			String address = "12345678 Drive";
			String city = "California";
			String state = "Washington";
			String zipcode = "4400000000";
			String phoneNo = "1234567890";
			String fax = "12345667890";
			
			
			
			driver.findElement(By.id("customer_name")).sendKeys(facilityName);
			driver.findElement(By.id("autocomplete")).sendKeys(address);
			driver.findElement(By.id("city")).sendKeys(city);
			driver.findElement(By.id("state")).sendKeys(state);
			driver.findElement(By.id("zipcode")).sendKeys(zipcode);
			driver.findElement(By.id("customer_phone")).sendKeys(phoneNo);
			driver.findElement(By.id("customer_fax")).sendKeys(fax);
			
			driver.findElement(By.id("delivery_time")).sendKeys("24 Hrs");
			driver.findElement(By.cssSelector(".select2-selection")).click();
			driver.switchTo().activeElement().sendKeys("badr.ahmed+salesrole@gmail.com");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.findElement(By.cssSelector(".select2-selection")).click();
			driver.switchTo().activeElement().sendKeys("ubaidqaiser97@gmail.com");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("printerserialnumber")).sendKeys("123456");
			driver.findElement(By.id("printertracking")).sendKeys("1234");
			
			for(int i =0;i<4;i++)
			{
				try 
				{
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.id("sentprinter")).click();				
			}
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("$('html, body').animate({scrollTop: $('#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(6) > div > div:nth-child(2) > label').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Radio Buttons
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(6) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(6) > div > div:nth-child(3) > label")).click();


			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(7) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(7) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(8) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(8) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(9) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(9) > div > div:nth-child(3) > label")).click();
			js.executeScript("$('html, body').animate({scrollTop: $('#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(10) > div > div:nth-child(2) > label').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(10) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(10) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(11) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(11) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(12) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(12) > div > div:nth-child(3) > label")).click();
			
			js.executeScript("$('html, body').animate({scrollTop: $('#customer_chargeAmount').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("customer_chargeAmount")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(17) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(17) > div > div:nth-child(3) > label")).click();
			
			js.executeScript("$('html, body').animate({scrollTop: $('#customer_attendingPhysician').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.findElement(By.id("customer_attendingPhysician")).sendKeys("Dr. Ubaid");
			driver.findElement(By.id("customer_account")).sendKeys("12345qwert");
			driver.findElement(By.id("customer_npi")).sendKeys("121122");
		
			driver.findElement(By.cssSelector(".btn-primary")).click();;
			
			try 
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			boolean found = false;
			int index = 1;
			boolean foundAgain = false;
			int page = 1;

			while (!foundAgain)
			{
				System.out.println(page);
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement table = driver.findElement(By.id("customer_table"));
				List<WebElement> allRows = table.findElements(By.tagName("tr"));
				index = 1;
				for (WebElement row : allRows) 
				{
//			        System.out.println("content >>   " + row.getText());
				    List<WebElement> cells = row.findElements(By.xpath("//td[3]"));
				    for (WebElement cell : cells) 
				    {
				        System.out.println("content >>   " + cell.getText());
						if (cell.getText().equals("Test Fac"))
						{
							foundAgain = true;
							break;
						}
						else
						{
						    index++;
							continue;
						}

				    }
				    if (foundAgain==true)
				    {
				    	break;
				    }
				}
			    if (foundAgain==true)
			    {
			    	break;
			    }
				try 
				{
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (driver.findElements(By.cssSelector(".next.disabled")).size() ==1  ) {
					break;
				}else {

					driver.findElement(By.linkText("Next")).click();
					try 
					{
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}



			
			
//			Integer i = new Integer(index);
//			String location = i.toString();
//			if (index%2==0)
//			{
//				System.out.println(index);
//				WebElement ele = driver.findElement(By.cssSelector(".even:nth-child("+location+") .customer-action"));
//				JavascriptExecutor jse = (JavascriptExecutor)driver;
//				jse.executeScript("arguments[0].click()", ele);
//				Thread.sleep(500); 
////				driver.findElement(By.cssSelector(".even:nth-child("+location+") .customer-action")).click();
//			}
//			else
//			{
//				System.out.println(index);
//				WebElement ele = driver.findElement(By.cssSelector(".odd:nth-child("+location+") .customer-action"));
//				JavascriptExecutor jse = (JavascriptExecutor)driver;
//				jse.executeScript("arguments[0].click()", ele);
//	//			driver.findElement(By.cssSelector(".odd:nth-child("+location+") .customer-action")).click();
//			}
			driver.findElement(By.cssSelector("#customer_table > tbody > tr:last-child > td.hidden_on_mobile.dt-checkboxes-cell > input")).click();
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			Select oSelect = new Select(driver.findElement(By.cssSelector(".selected .customer-action")));			 
			oSelect.selectByVisibleText("Edit Facility");

			//Uncomment below code to edit facility info
			//The facility at the top of the Facilities page will be edited
			
//*********************Facility Info**********************//
			
			facilityName = "Tested Fac";
			address = "12345678 Drive";
			city = "California";
			state = "Washington";
			zipcode = "4400000000";
			phoneNo = "1234567890";
			fax = "12345667890";
			
			
			
			driver.findElement(By.id("customer_name")).sendKeys(facilityName);
			driver.findElement(By.id("autocomplete")).sendKeys(address);
			driver.findElement(By.id("city")).sendKeys(city);
			driver.findElement(By.id("state")).sendKeys(state);
			driver.findElement(By.id("zipcode")).sendKeys(zipcode);
			driver.findElement(By.id("customer_phone")).sendKeys(phoneNo);
			driver.findElement(By.id("customer_fax")).sendKeys(fax);
			
			driver.findElement(By.id("delivery_time")).sendKeys("24 Hrs");
			driver.findElement(By.cssSelector(".select2-selection")).click();
			driver.switchTo().activeElement().sendKeys("badr.ahmed+salesrole@gmail.com");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.findElement(By.cssSelector(".select2-selection")).click();
			driver.switchTo().activeElement().sendKeys("ubaidqaiser97@gmail.com");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("printerserialnumber")).sendKeys("123456");
			driver.findElement(By.id("printertracking")).sendKeys("1234");
			
			for(int i1 = 0;i1<4;i1++)
			{
				try 
				{
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.id("sentprinter")).click();				
			}

			js.executeScript("$('html, body').animate({scrollTop: $('#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(6) > div > div:nth-child(2) > label').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Radio Buttons
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(6) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(6) > div > div:nth-child(3) > label")).click();


			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(7) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(7) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(8) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(8) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(9) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(9) > div > div:nth-child(3) > label")).click();
			js.executeScript("$('html, body').animate({scrollTop: $('#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(10) > div > div:nth-child(2) > label').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(10) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(10) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(11) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(11) > div > div:nth-child(3) > label")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(12) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(12) > div > div:nth-child(3) > label")).click();
			
			js.executeScript("$('html, body').animate({scrollTop: $('#customer_chargeAmount').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("customer_chargeAmount")).click();

			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(17) > div > div:nth-child(2) > label")).click();
			driver.findElement(By.cssSelector("#app-container > main > div > div:nth-child(2) > div > div > div > form > div:nth-child(17) > div > div:nth-child(3) > label")).click();
			
			js.executeScript("$('html, body').animate({scrollTop: $('#customer_attendingPhysician').offset().top - 200 }, 10);");
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.id("customer_attendingPhysician")).sendKeys("Dr. Ubaid");
			driver.findElement(By.id("customer_npi")).sendKeys("121122");
			driver.findElement(By.id("customer_account")).sendKeys("12345qwert");
		
			driver.findElement(By.cssSelector(".btn-primary")).click();;
			
			try 
			{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String current = driver.getCurrentUrl();
			String actual = "https://genolab_demo.mvstack.com/en/customer/";
			assertEquals(actual,current);
			
			//Close browser
			driver.close();
		}

}


