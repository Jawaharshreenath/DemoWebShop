package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.baseClass;
import Pages.RegisterPage;
import Utilities.ScreenshotUtil;

public class Register extends baseClass{
	@Test
	public void RegisterTest() throws IOException {
		RegisterPage res = new RegisterPage(driver);
		res.Registeration();
		ScreenshotUtil.capture(driver, "registerPage");
		
	}

}
