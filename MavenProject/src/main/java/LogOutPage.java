

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage
{
    WebDriver driver;
    
    By logout= By.linkText("Log Out");

	public LogOutPage(WebDriver driver) {
		this.driver=driver;
	}
    
	public void clickOnLogout() {
		driver.findElement(logout).click();
		
	}
    
}
