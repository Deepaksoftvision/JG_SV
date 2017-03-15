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
public class ProductListPageObjects extends PageFactoryInitializer 
{

	@FindBy(xpath="//*[@id='WC_CatalogSearchResultDisplay_td_2_5']")
	private WebElement firstItem;
	
	
	@Step("Click On the Item")
	public ProductListPageObjects clickOnFirstItem() 
	{		
		FluentWaiting.waitUntillElementToBeVisible(30, 10, firstItem);
		firstItem.click();
		return this;
	}

}
