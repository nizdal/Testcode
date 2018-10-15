

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MagentoTest {

	@Test
	public void posCredentials()throws Exception {
		
	String url = "http://www.magento.com";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	
	Main m = new Main(driver);
	m.clickOnMyacc();
	
	
	Login login = new Login(driver);
	
	login.typeEmail("nawazbegum012@gmail.com");
	login.typePass("Welcome4321");
	login.clickOnLogin();
	
	
	Logout logout = new Logout(driver);
	logout.clickOnLogout();
	
	driver.quit();

	}

}
