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
public class DottiLandingPageObjects extends PageFactoryInitializer
{
	
	@FindBy(className="do-login")
	private WebElement loginButtonLocator;

	@Step("To Click on Login Button")
	public DottiLandingPageObjects clickOnLoginButton() 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, loginButtonLocator);
		loginButtonLocator.click();
		return this;
	}

}
