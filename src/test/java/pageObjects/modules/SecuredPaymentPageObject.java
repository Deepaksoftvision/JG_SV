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
	private WebElement securedPayment;
	
	
	@Step("Click On the Secured Payment")
	public SecuredPaymentPageObject clickOnSecuredpage() 
	{		
		FluentWaiting.waitUntillElementToBeVisible(30, 10, securedPayment);
		securedPayment.click();
		return this;
	}




}
