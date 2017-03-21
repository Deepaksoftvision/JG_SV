/**
 * @author Gladson Antony
 * @date 21-Mar-2017
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class DottiFootersPageObjects extends PageFactoryInitializer 
{
	@FindBy(xpath="//a[@href='http://test.dotti.co.nz/shop/en/dottinz/about-us']")
	private WebElement link_AboutUs;

	@FindBy(xpath="//a[@href='http://test.dotti.co.nz/shop/en/dottinz/jobs']")
	private WebElement link_Jobs;

	@FindBy(xpath="//li[contains(text(),'Quick Links')]/parent::ul/descendant::a[contains(text(),'Gift Cards')]")
	private WebElement link_GiftCard;

	@FindBy(xpath="//li[contains(text(),'Quick Links')]/parent::ul/descendant::a[contains(text(),'Stores')]")
	private WebElement link_Stores;

	@FindBy(xpath="//a[contains(@title,'Terms & Conditions')]")
	private WebElement link_TermsAndConditions;

	@FindBy(xpath="//a[contains(.,'How To Shop')]")
	private WebElement link_HowToShop;

	@FindBy(xpath="//a[contains(.,'Delivery & Returns')]")
	private WebElement link_DeliveryAndReturns;

	@FindBy(xpath="//a[contains(.,'Pricing & Payments')]")
	private WebElement link_PricingAndPayments;

	@FindBy(xpath="//a[contains(.,'Size Guide')]")
	private WebElement link_SizeGuide;

	@FindBy(xpath="//a[contains(.,'Contact Us')]")
	private WebElement link_ContactUs;

	@FindBy(xpath="//a[contains(.,'Privacy')]")
	private WebElement link_Privacy;

	@FindBy(xpath="//a[contains(.,'Terms of use')]")
	private WebElement link_TermsOfUse;

	@FindBy(xpath="//a[@title='Visit dotti on Instagram']")
	private WebElement socialNetwork_Instagram;

	@FindBy(xpath="//a[@href='http://twitter.com/dotti_squad']")
	private WebElement socialNetwork_Twitter;

	@FindBy(xpath="//a[@href='http://www.facebook.com/dotti']")
	private WebElement socialNetwork_Facebook;

	@FindBy(xpath="//a[contains(.,'Visa')]")
	private WebElement payment_VISA;

	@FindBy(xpath="//a[contains(.,'MasterCard')]")
	private WebElement payment_MasterCard;

	@FindBy(xpath="//a[contains(.,'PayPal')]")
	private WebElement payment_PayPal;

	@FindBy(xpath="//a[contains(.,'Dotti Gift Card')]")
	private WebElement payment_DottiGiftCard;
}
