/**
 * 
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

/**
 * @author spi.qa5
 *
 */
public class OrderConfirmationPageObjects extends PageFactoryInitializer
{

	@FindBy(tagName="h1")
	private WebElement orderConfirmationLocator;
	
	
	@Step("Verify Order Confirmation Page")
	public OrderConfirmationPageObjects verifyOrderStatus() 
	{
		FluentWaiting.waitUntillElementToBeVisible(180, 500, orderConfirmationLocator);
		Assert.assertTrue(orderConfirmationLocator.isDisplayed());
		return this;
	}

}
