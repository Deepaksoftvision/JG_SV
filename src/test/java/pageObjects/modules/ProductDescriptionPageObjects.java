/**
 * @author Gladson Antony
 * @date 21-Mar-2017
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

public class ProductDescriptionPageObjects extends PageFactoryInitializer
{
	@FindBy(xpath="//h3[@class='do-breadcrumb']/span")
	private WebElement productBreadcrumbLocator;
	
	@FindBy(css="h1#product-description")
	private WebElement productTitleLocator;
	
	@FindBy(css="label#productPrice")
	private WebElement productPriceLocator;
	
	@FindBy(css="input#do-quantity")
	private WebElement productQuantityLocator;
	
	@FindBy(xpath="//input[@id='do-addtobag']")
	private WebElement addToBag;
	
	@FindBy(css="button#do-addtowishlist")
	private WebElement productAddToWishListLocator;

	@FindBy(css="a[title='Share by email']")
	private WebElement share_Email;
	
	@FindBy(css="a[href*='pinterest']")
	private WebElement share_Pinterest;
	
	@FindBy(css="div#soldout")
	private WebElement soldOutLocator;
	
	@FindBy(css="div#soldout")
	private WebElement deliveryLocator;
	
	@FindBy(css="div#soldout")
	private WebElement returnsLocator;
	
	@FindBy(css="div#soldout")
	private WebElement sizeGuideLocator;
	
	
	@Step("click On Add to Bag")
	public ProductDescriptionPageObjects addToBag() 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, addToBag);	
		addToBag.click();
		return this;	
	}


}
