/**
 * 
 */
package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import controllers.BaseMethod;
import pageObjects.modules.DottiFootersPageObjects;
import pageObjects.modules.DottiHeadersPageObjects;
import pageObjects.modules.DottiLandingPageObjects;
import pageObjects.modules.DottiLoginPageObjects;
import pageObjects.modules.MyAccountPageObjects;
import pageObjects.modules.OrderConfirmationPageObjects;
import pageObjects.modules.ProductDescriptionPageObjects;
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
	/*Page Headers*/
	public DottiHeadersPageObjects pageHeaders()
	{
		return PageFactory.initElements(getWebDriver(), DottiHeadersPageObjects.class);
	}
	
	/*Page Footers*/
	public DottiFootersPageObjects pageFooters()
	{
		return PageFactory.initElements(getWebDriver(), DottiFootersPageObjects.class);
	}

	/*Landing Page*/
	public DottiLandingPageObjects landingPage()
	{
		return PageFactory.initElements(getWebDriver(), DottiLandingPageObjects.class);
	}

	/*Login Page*/
	public DottiLoginPageObjects loginPage() 
	{
		return PageFactory.initElements(getWebDriver(), DottiLoginPageObjects.class);
	}
	
	/*My Accounts Page*/
	public MyAccountPageObjects myAccountsPage() 
	{
		return PageFactory.initElements(getWebDriver(), MyAccountPageObjects.class);
	}

	/*Product List Page*/
	public ProductListPageObjects productListPage() 
	{
		return PageFactory.initElements(getWebDriver(), ProductListPageObjects.class);
	}
	
	/*Product Description Page*/
	public ProductDescriptionPageObjects productDescriptionPage()
	{
		return PageFactory.initElements(getWebDriver(), ProductDescriptionPageObjects.class);
	}
	
	/*Shopping Bag*/
	public ShoppingBagPageObjects shoppingBagPage()
	{
		return PageFactory.initElements(getWebDriver(), ShoppingBagPageObjects.class);
	}
	
	/*Payment Gateway Page*/
	public SecuredPaymentPageObject securedPaymentPage()
	{
		return PageFactory.initElements(getWebDriver(), SecuredPaymentPageObject.class);
	}
	
	/*Order Confirmation Page*/
	public OrderConfirmationPageObjects orderConfirmationPage()
	{
		return PageFactory.initElements(getWebDriver(), OrderConfirmationPageObjects.class);
	}
}
