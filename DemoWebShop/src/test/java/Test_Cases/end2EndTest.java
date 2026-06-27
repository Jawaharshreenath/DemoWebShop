package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.baseClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.cartPage;
import Utilities.ScreenshotUtil;

public class end2EndTest extends baseClass{
	@Test
	public void end2End() throws IOException {
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		cartPage cp = new cartPage(driver);
		
		lp.login();
		hp.searchProuct();
		cp.CartOption();
		
		ScreenshotUtil.capture(driver, "E2Etest");
		
	}

}
