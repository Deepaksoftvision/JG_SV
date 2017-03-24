/**
 * @author Gladson Antony
 * @date 24-Mar-2017
 */
package tests;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class LandingPageTests extends PageFactoryInitializer
{

	@TestCaseId("TC_LandingPage_01")
	@Description("This is a test to verify the Sub Menus under New Arrivals Menu!")
	@Features("Landing Page")
	@Test
	public void verifyNewArrivalSubMenus() throws Exception
	{
		pageHeaders()
		.verifyNewArrivalsLinksWithTitles();
	}

	@TestCaseId("TC_LandingPage_02")
	@Description("This is a test to verify the Sub Menus under Latest Offers Menu!")
	@Features("Landing Page")
	@Test
	public void verifyLatestOffersSubMenus() throws Exception
	{
		pageHeaders()
		.verifyLatestOffersLinksWithTitles();
	}

}
