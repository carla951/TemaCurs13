package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.SingleEventPage;

public class ContactTest extends BaseTest{
	
	@Test
	public void testContacts() throws InterruptedException {
		ContactsPage contactsPage = homePage.navigateToContacts();
		SingleEventPage singleEvent = contactsPage.clickOnEvent();
		
		Thread.sleep(3500);
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		WebElement btn = driver.findElement(By.cssSelector("button[title='Zoom out']"));
		
		btn.click();
		Thread.sleep(2500);
		btn.click();
		Thread.sleep(2500);
		btn.click();
		Thread.sleep(2500);
		btn.click();
		Thread.sleep(2500);
		btn.click();
		Thread.sleep(2500);
		
		
	}
	
	
}


