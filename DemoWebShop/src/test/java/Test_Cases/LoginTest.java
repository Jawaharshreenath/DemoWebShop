package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.baseClass;
import Pages.LoginPage;
import Utilities.ScreenshotUtil;

public class LoginTest extends baseClass {
	@Test
	public void loginTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.login();
		ScreenshotUtil.capture(driver, "LoginPage");
	}
	

}

