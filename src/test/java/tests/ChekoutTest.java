/**
 * 
 */
package tests;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import propertyFilesReader.SearchPropertiesFileReader;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * @author spi.qa5
 *
 */

public class ChekoutTest extends PageFactoryInitializer
{
	LoginPageTests loginTestPage = new LoginPageTests();
	SearchPropertiesFileReader data = new SearchPropertiesFileReader();

	@TestCaseId("TC_Checkout_01")
	@Description("This is a test to verify the Checkout functionailty")
	@Features("Checkout Page")
	@Test()
	public void Checkout_Positive() throws Exception
	{
		loginTestPage.login(data.getUsername(),data.getPassword());
		loginPage()
		.verifyPageTitleAfterLogin()
		.verifyLoginSuccessMessage()
		.landingPage()
		.mouseHoverOnNewArrivals()
		.clickOnNewClothing()
		.productListPage()
		.clickOnFirstItem()
		.productInformationPage()
		.addToBag()
		.clickOncheckoutInHeader()
		.shoppingBagPage()
		.clickOnCheckout()
		.securedPaymentPage()
		.enterCreditCardDetails(data.getCardNo(),data.getCCMonth(),data.getCCYear(),data.getCCCVV())
		.clickOnPlaceOrder();
	}
}
