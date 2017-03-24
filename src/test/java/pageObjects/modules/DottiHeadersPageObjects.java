/**
 * @author Gladson Antony
 * @date 21-Mar-2017
 */
package pageObjects.modules;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

public class DottiHeadersPageObjects extends PageFactoryInitializer 
{
	@FindBy(css="a.do-logo")
	private WebElement dottiLogo;

	@FindBy(xpath="//a[@class='do-login']")
	private WebElement loginLocator;

	@FindBy(xpath="//div[@id='do-header-options']/descendant::a[contains(text(),'Stores')]")
	private WebElement storesLocator;

	@FindBy(xpath="//div[@id='do-header-options']/descendant::a[contains(text(),'Need Help?')]")
	private WebElement needHelpLocator;

	@FindBy(xpath="//div[@id='do-header-options']/descendant::a[contains(text(),'Recommendations')]")
	private WebElement recommendationsLocator;

	@FindBy(xpath="//div[@id='do-header-options']/descendant::span[contains(text(),'Wishlist')]")
	private WebElement wishlistLocator;

	@FindBy(css="a#shoppingCartBar")
	private WebElement myBagLocator;

	@FindBy(css="a#headerCheckoutLink")
	private WebElement checkoutLocator;

	@FindBy(css="li#countrySelect")
	private WebElement countryChooser;

	@FindBy(css="li#countrySelectAU")
	private WebElement country_AUS;

	@FindBy(css="li#countrySelectNZ")
	private WebElement country_NZ;

	@FindBy(css="input#do-product-search-term") 
	private WebElement searchBoxLocator;

	@FindBy(css="div[class='header-contact-info-text']")
	private WebElement contactNumberLocator;

	@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'New Arrivals')]")
	private WebElement menu_NewArrivals;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'New Arrivals')]/ancestor::li/descendant::a")})
	private List<WebElement> newArrivals_SubMenu;

	@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'Latest Offers')]")
	private WebElement menu_LatestOffers;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'Latest Offers')]/ancestor::li/descendant::a")})
	private List<WebElement> latestOffers_SubMenu;

	@FindBy(css="a[href$='/tops']")
	private WebElement menu_Tops;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[text()='Tops']/ancestor::li/descendant::ul/li/a")})
	private List<WebElement> tops_SubMenu;

	@FindBy(css="a[href$='/dresses']")
	private WebElement menu_Dresses;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[text()='Dresses']/ancestor::li/descendant::ul/li/a")})
	private List<WebElement> dresses_SubMenu;

	@FindBy(css="a[href$='/jackets']")
	private WebElement menu_Jackets;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[text()='Jackets']/ancestor::li/descendant::ul/li/a")})
	private List<WebElement> jackets_SubMenu;

	@FindBy(css="a[href$='/bottoms']")
	private WebElement menu_Bottoms;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[text()='Bottoms']/ancestor::li/descendant::ul/li/a")})
	private List<WebElement> bottoms_SubMenu;

	@FindBy(css="a[href$='/denim']")
	private WebElement menu_Denim;

	@FindAll({@FindBy(xpath="///ul[@id='do-menu']/descendant::a[text()='Denim']/ancestor::li/descendant::ul/li/a")})
	private List<WebElement> denim_SubMenu;

	@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'Shoes & Accessories')]")
	private WebElement menu_ShoesAndAccessories;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[text()='Shoes & Accessories']/ancestor::li/descendant::ul/li/a")})
	private List<WebElement> shoesAndAccessories_SubMenu;

	@FindBy(css="a[href$='/sale']")
	private WebElement menu_Sale;

	@FindAll({@FindBy(xpath="//ul[@id='do-menu']/descendant::a[text()='Sale']/ancestor::li/descendant::ul/li/a")})
	private List<WebElement> sale_SubMenu;

	@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'New Arrivals')]")
	private WebElement menu_GiftCards;

	@FindBy(xpath="//ul[@id='do-menu']/descendant::a[contains(text(),'New Arrivals')]")
	private WebElement menu_LookBookAndTrends;

	@FindBy(css="a.do-logout")
	private WebElement logoutLocator;

	@FindBy(css="a#shoppingCartBar span[class='do-total-bag-price']")
	private WebElement myBag_Bar_Price;

	@FindBy(css="a#shoppingCartBar span[class='do-quantity']")
	private WebElement myBag_Bar_Quantity;

	@FindBy(css="div#do-mini-cart td[class='order-total'] span")
	private WebElement myBag_DropDown_Price;

	@FindBy(css="div#do-mini-cart li[class='do-product-quantity']")
	private WebElement myBag_DropDown_Quantity;

	@FindBy(css="div#do-mini-cart li[class='do-product-title']")
	private WebElement myBag_DropDown_ProductName;

	@FindBy(css="div#do-mini-cart a#moreItemsLink")
	private WebElement myBag_DropDown_ViewBag;

	@Step("click on Login Button")
	public DottiHeadersPageObjects clickOnLoginButton()
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, loginLocator);
		loginLocator.click();
		return this;
	}

	@Step("click on Logout Button")
	public DottiHeadersPageObjects clickOnLogoutButton()
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, logoutLocator);
		logoutLocator.click();
		return this;
	}

	@Step("click on Checkout")
	public DottiHeadersPageObjects clickOncheckout()
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, checkoutLocator);
		checkoutLocator.click();		
		return this;
	}

	@Step("click on View Bag")
	public DottiHeadersPageObjects clickOnViewBag()
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, myBag_DropDown_ViewBag);
		myBag_DropDown_ViewBag.click();		
		return this;
	}

	@Step("choose County {0}")
	public DottiHeadersPageObjects chooseCountry(String Country) throws Exception
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, countryChooser);
		if (Country.toLowerCase() == "australia" || Country.toLowerCase() == "au" || Country.toLowerCase() == "aud") 
		{
			country_AUS.click();
			Thread.sleep(2000);
		}
		else if (Country.toLowerCase() == "new zealand" || Country.toLowerCase() == "nz" || Country.toLowerCase() == "nzd") 
		{
			country_NZ.click();
			Thread.sleep(2000);
		}	
		return this;
	}

	@Step("choose Australia")
	public DottiHeadersPageObjects chooseCountryAustralia() throws Exception
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, country_AUS);
		country_AUS.click();
		Thread.sleep(2000);
		return this;
	}
	
	@Step("choose New Zealand")
	public DottiHeadersPageObjects chooseCountryNewZealand() throws Exception
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, country_NZ);
		country_NZ.click();
		Thread.sleep(2000);
		return this;
	}
	
	@Step("Search for: {0}")
	public DottiHeadersPageObjects searchFor(String searchText) throws Exception
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, searchBoxLocator);
		searchBoxLocator.clear();
		searchBoxLocator.sendKeys(searchText);
		hitEnter();
		return this;
	}

	@Step("Verify New Arrivals Links with Titles")
	public DottiHeadersPageObjects verifyNewArrivalsLinksWithTitles() throws Exception 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 500, menu_NewArrivals);
		verifyMultiplePagesOnMouseHover(menu_NewArrivals, newArrivals_SubMenu);
		return this;
	}

	@Step("Verify latest Offers Links with Titles")
	public DottiHeadersPageObjects verifyLatestOffersLinksWithTitles() throws Exception 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 500, menu_LatestOffers);
		verifyMultiplePagesOnMouseHover(menu_LatestOffers, latestOffers_SubMenu);
		return this;
	}

}
