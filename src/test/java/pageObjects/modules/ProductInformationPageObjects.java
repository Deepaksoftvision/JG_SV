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
public class ProductInformationPageObjects extends PageFactoryInitializer{

	@FindBy(xpath="//input[@id='do-addtobag']")
	private WebElement addToBag;


	@FindBy(id="headerCheckoutLink")
	private WebElement checkoutLocator;


	@Step("Click On the Item")
	public ProductInformationPageObjects addToBag() 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 520, addToBag);	
		addToBag.click();
		return this;	
	}

	@Step("Checkout")
	public ProductInformationPageObjects clickOncheckoutInHeader() {
		FluentWaiting.waitUntillElementToBeClickable(30, 500, checkoutLocator);
		checkoutLocator.click();		
		return this;
	}

}
