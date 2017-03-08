package tests;

import org.testng.annotations.Test;

import controllers.ExcelDataProvider;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Parameter;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class Test1 extends PageFactoryInitializer
{	
	@TestCaseId("TC_GMail_001")
	@Description("To verify the working of GMail link from Google Home Page using JavaScript Executor")
	@Test(dataProvider="excelSheetNameAsMethodName",dataProviderClass=ExcelDataProvider.class)
	public void testGoogle(@Parameter("Testcase ID")String testCaseID,@Parameter("Email ID")String emailID, @Parameter("Password")String password) throws Exception
	{
		googleHomePage()
		.verifyPageTitle()
		.clickonGmailLink()
		.gmailPage()
		.verifyPageTitle()
		.enterEmailID(emailID);
	}
}
