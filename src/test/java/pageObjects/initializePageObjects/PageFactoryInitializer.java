/**
 * 
 */
package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import controllers.BaseMethod;
import pageObjects.modules.DottiLandingPageObjects;
import pageObjects.modules.DottiLoginPageObjects;

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

}
