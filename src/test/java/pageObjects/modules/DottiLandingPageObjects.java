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
	
	@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'New Arrivals')]")
	private WebElement menu_NewArrivals;
	
	
	@FindBy(id="WC_CachedHeaderDisplay_links_1_1__1")
	private WebElement subMenu_NewClothing;
		

	@Step("To Click on Login Button")
	public DottiLandingPageObjects clickOnLoginButton() 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, loginButtonLocator);
		loginButtonLocator.click();
		return this;
	}

	@Step("Mouse Hover on New Arrivals")
	public DottiLandingPageObjects mouseHoverOnNewArrivals() 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 500, menu_NewArrivals);
		mousehover(menu_NewArrivals);
		return this;
	}

	@Step("Click On New Clothing")
	public DottiLandingPageObjects clickOnNewClothing() 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, subMenu_NewClothing);
		subMenu_NewClothing.click();
		return this;
	}
}
