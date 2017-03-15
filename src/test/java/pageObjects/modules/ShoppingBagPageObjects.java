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
public class ShoppingBagPageObjects extends PageFactoryInitializer
{
	@FindBy(id="headerCheckoutLink")
	private WebElement checkoutLocator;

	@Step("Click on Checkout in Shopping Bag Page")
	public ShoppingBagPageObjects clickOnCheckout() 
	{		
		FluentWaiting.waitUntillElementToBeClickable(30, 500, checkoutLocator);
		checkoutLocator.click();
		return this;
	}


	

}
