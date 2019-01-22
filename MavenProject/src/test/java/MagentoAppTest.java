

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class MagentoAppTest

{  
	     @Test
	    public void magento() throws Exception
	    {
	    WebDriver driver;
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
        
		HomePage h = new HomePage(driver);
		h.clickOnMyAcc();
		
		Login l1 = new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePassword("Welcome123");
		l1.clickOnLogin();
		
		LogOutPage l2 = new LogOutPage(driver);
		l2.clickOnLogout();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
