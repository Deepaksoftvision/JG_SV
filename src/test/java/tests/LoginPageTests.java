/**
 * 
 */
package tests;

import org.testng.annotations.Test;

import controllers.ExcelDataProvider;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Parameter;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * @author spi.qa5
 *
 */
public class LoginPageTests extends PageFactoryInitializer {

	@TestCaseId("TC_Login_01")
	@Description("This is a test to verify the login functionailty")
	@Features("Login Page")
	@Test(dataProvider="excelSheetNameAsMethodName", dataProviderClass=ExcelDataProvider.class)
	public void loginTest_Positive(@Parameter("Testcase ID")String testcaseID, @Parameter("UserName")String userName, 
			@Parameter("password")String password) throws Exception
	{
		landingPage()
		.clickOnLoginButton()
		.loginPage()
		.verifyPageTitle()
		.enterUserName(userName)
		.enterPassword(password)
		.clickOnSubmitButton()
		.verifyPageTitleAfterLogin()
		.verifyLoginSuccessMessage();		
	}
	
	@TestCaseId("TC_Login_01")
	@Description("This is a test to verify the login functionailty - Error Scenarios")
	@Features("Login Page")
	@Test(dataProvider="excelSheetNameAsMethodName", dataProviderClass=ExcelDataProvider.class)
	public void loginTest_Negative(@Parameter("Testcase ID")String testcaseID, @Parameter("UserName")String userName, 
			@Parameter("password")String password,@Parameter("Error Message")String errorMessage) throws Exception
	{
		landingPage()
		.clickOnLoginButton()
		.loginPage()
		.verifyPageTitle()
		.enterUserName(userName)
		.enterPassword(password)
		.clickOnSubmitButton()
		.verifyLoginErrorsMessage(errorMessage);		
	}
}
