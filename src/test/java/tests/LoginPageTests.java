/**
 * 
 */
package tests;

import org.testng.annotations.Test;

import controllers.ExcelDataProvider;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import propertyFilesReader.SearchPropertiesFileReader;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Parameter;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * @author spi.qa5
 *
 */
public class LoginPageTests extends PageFactoryInitializer 
{

	SearchPropertiesFileReader data = new SearchPropertiesFileReader();
	
	public void login(String username, String password) throws Exception
	{
		landingPage()
		.clickOnLoginButton()
		.loginPage()
		.verifyPageTitle()
		.enterUserName(username)
		.enterPassword(password)
		.clickOnSubmitButton();
	}
	
	@TestCaseId("TC_Login_01")
	@Description("This is a test to verify the login functionailty")
	@Features("Login Page")
	@Test()
	public void loginTest_Positive() throws Exception
	{
		login(data.getUsername(),data.getPassword());
		loginPage()
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
		login(userName,password);
		loginPage()
		.verifyLoginErrorsMessage(errorMessage);		
	}
}
