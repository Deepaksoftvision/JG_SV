/**
 * @author Gladson Antony
 * @date 21-Mar-2017
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

public class MyAccountPageObjects extends PageFactoryInitializer
{
	@FindBy(xpath="//h1")
	private WebElement header_MyAccountPage;
	
	@FindBy(xpath="//table[@id='do-personal-account']/descendant::a[@id='personalInformation']")
	private WebElement button_EditPersonalInfo;
	
	@FindBy(xpath="//table[@id='do-personal-account']/descendant::a[@id='addressBook']")
	private WebElement button_EditAddress;
	
	@FindBy(xpath="//table[@id='do-personal-account']/descendant::td[contains(text(),'Name')]/following-sibling::td[@class='do-detail']")
	private WebElement usernameLocator;
	
	@FindBy(xpath="//table[@id='do-personal-account']/descendant::td[contains(text(),'Primary address')]/following-sibling::td[@class='do-detail']")
	private WebElement addressLocator;
	
	@FindBy(xpath="//div/a[@id='trackOrderStatus']")
	private WebElement orderStatusLocator;
	
	@FindBy(xpath="//div/a[@id='wishList']")
	private WebElement wishListLocator;
	
	@FindBy(xpath="//h3[@class='do-breadcrumb']")
	private WebElement breadcrumb_MyAccount;
	
	@Step("verify My Account Page Header")
	public MyAccountPageObjects verifyMyAccountPageHeader() throws Exception
	{
		FluentWaiting.waitUntillElementToBeVisible(60, 500, header_MyAccountPage);
		Assert.assertTrue(header_MyAccountPage.isDisplayed());
		return this;
	}
	
	@Step("verify My Account Page Breadcrumbs")
	public MyAccountPageObjects verifyMyAccountPageBreadcrumbs() throws Exception
	{
		FluentWaiting.waitUntillElementToBeVisible(60, 500, breadcrumb_MyAccount);
		Assert.assertTrue(breadcrumb_MyAccount.isDisplayed());
		return this;
	}
	
	@Step("verify My Account Page Objects")
	public MyAccountPageObjects verifyMyAccountPageObjects() throws Exception
	{
		FluentWaiting.waitUntillElementToBeVisible(60, 500, header_MyAccountPage);
		Assert.assertTrue(header_MyAccountPage.isDisplayed(), "My Account Page Header is not Displayed");
		Assert.assertTrue(breadcrumb_MyAccount.isDisplayed(), "My Account Page Breadcrumb is not Displayed");
		Assert.assertTrue(usernameLocator.isDisplayed(), "UserName is not Displayed");
		Assert.assertTrue(addressLocator.isDisplayed(), "Primary Address is not Displayed");
		Assert.assertTrue(button_EditAddress.isDisplayed(), "Edit Address button is not Displayed");
		Assert.assertTrue(button_EditPersonalInfo.isDisplayed(), "Edit Personal Info button is not Displayed");
		Assert.assertTrue(wishListLocator.isDisplayed(), "Wishlist is not Displayed");
		Assert.assertTrue(orderStatusLocator.isDisplayed(), "Order Status is not being Displayed");
		return this;
	}

}
