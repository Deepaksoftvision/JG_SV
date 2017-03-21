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
	
	
}
