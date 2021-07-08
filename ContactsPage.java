package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
	
	WebDriver driver;
	public By contactLink = By.linkText("CONTACTS");
	
	public ContactsPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public SingleEventPage clickOnEvent() {
		driver.findElement(contactLink).click();
		return new SingleEventPage(driver);
	}
		
		public void clickOnZoomOut() {
			driver.findElement(mapLink).click();
	}
}
	


