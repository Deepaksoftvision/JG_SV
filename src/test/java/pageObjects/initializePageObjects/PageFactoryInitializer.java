/**
 * 
 */
package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import controllers.BaseMethod;
import pageObjects.modules.DottiLandingPageObjects;
import pageObjects.modules.DottiLoginPageObjects;
import pageObjects.modules.MyAccountPageObjects;
import pageObjects.modules.OrderConfirmationPageObjects;
import pageObjects.modules.ProductInformationPageObjects;
import pageObjects.modules.ProductListPageObjects;
import pageObjects.modules.SecuredPaymentPageObject;
import pageObjects.modules.ShoppingBagPageObjects;

/**
 * @author ${Gladson Antony}
 * @date Sep 17, 2016
 * 
 */
public class PageFactoryInitializer extends BaseMethod 
{

	public DottiLandingPageObjects landingPage() {
		return PageFactory.initElements(getWebDriver(), DottiLandingPageObjects.class);
	}

	public DottiLoginPageObjects loginPage() {
		return PageFactory.initElements(getWebDriver(), DottiLoginPageObjects.class);
	}
	
	public MyAccountPageObjects myAccountsPage() {
		return PageFactory.initElements(getWebDriver(), MyAccountPageObjects.class);
	}

	public ProductListPageObjects productListPage() {
		return PageFactory.initElements(getWebDriver(), ProductListPageObjects.class);
	}
	
	public ProductInformationPageObjects productInformationPage(){
		return PageFactory.initElements(getWebDriver(), ProductInformationPageObjects.class);
	}
	
	public ShoppingBagPageObjects shoppingBagPage(){
		return PageFactory.initElements(getWebDriver(), ShoppingBagPageObjects.class);
	}
	
	public SecuredPaymentPageObject securedPaymentPage(){
		return PageFactory.initElements(getWebDriver(), SecuredPaymentPageObject.class);
	}
	
	public OrderConfirmationPageObjects orderConfirmationPage(){
		return PageFactory.initElements(getWebDriver(), OrderConfirmationPageObjects.class);
	}
}
