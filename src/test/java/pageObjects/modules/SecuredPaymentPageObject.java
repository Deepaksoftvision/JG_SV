/**
 * 
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

/**
 * @author spi.qa5
 *
 */
public class SecuredPaymentPageObject extends PageFactoryInitializer {
	
	
	
	@FindBy(id="submitDeliveryOptions")
	private WebElement securedPaymentLocator;
	
	@FindBy(id="credit-card-number")
	private WebElement creditcardnumberLocator;
	
	@FindBy(id="braintree-hosted-field-number")
	private WebElement creditcardnumberLocator_Frame;
	
	@FindBy(id="expiration-month")
	private WebElement expMonthLocator;
	
	@FindBy(id="braintree-hosted-field-expirationMonth")
	private WebElement expMonthLocator_Frame;
	
	@FindBy(id="expiration-year")
	private WebElement expYearLocator;
	
	@FindBy(id="braintree-hosted-field-expirationYear")
	private WebElement expYearLocator_Frame;
	
	@FindBy(id="cvv")
	private WebElement cvvLocator;
	
	@FindBy(id="braintree-hosted-field-cvv")
	private WebElement cvvLocator_Frame;

	@FindBy(id="do-place-order-btn")
	private WebElement button_PlaceOrder;
	
	
	
	@Step("Click On the Secured Payment")
	public SecuredPaymentPageObject clickOnSecuredPayment() 
	{		
		FluentWaiting.waitUntillElementToBeVisible(30, 10, securedPaymentLocator);
		securedPaymentLocator.click();
		return this;
	}


	@Step("Enter Credit Card Details for the Card {0}")
	public SecuredPaymentPageObject enterCreditCardDetails(String cardNo, String ccMonth, String ccYear, String cccvv) throws Exception 
	{
		switchToFrameByWebElement(creditcardnumberLocator_Frame);
		FluentWaiting.waitUntillElementToBeVisible(30, 10, creditcardnumberLocator);
		creditcardnumberLocator.sendKeys(cardNo);
		switchOutOfFrame();
		switchToFrameByWebElement(expMonthLocator_Frame);
		expMonthLocator.sendKeys(ccMonth);
		switchOutOfFrame();
		switchToFrameByWebElement(expYearLocator_Frame);
		expYearLocator.sendKeys(ccYear);
		switchOutOfFrame();
		switchToFrameByWebElement(cvvLocator_Frame);
		cvvLocator.sendKeys(cccvv);
		switchOutOfFrame();
		return this;
	}


	@Step("Click on Place Order Button")
	public SecuredPaymentPageObject clickOnPlaceOrder() 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 10, button_PlaceOrder);
		button_PlaceOrder.click();
		return this;
	}



}
