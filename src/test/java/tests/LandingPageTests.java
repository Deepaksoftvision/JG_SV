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

	@TestCaseId("TC_LandingPage_03")
	@Description("This is a test to verify the Sub Menus under Tops Menu!")
	@Features("Landing Page")
	@Test
	public void verifyTopsSubMenus() throws Exception
	{
		pageHeaders()
		.verifyTopsLinksWithTitles();
	}
	
	@TestCaseId("TC_LandingPage_04")
	@Description("This is a test to verify the Sub Menus under Dresses Menu!")
	@Features("Landing Page")
	@Test
	public void verifyDressesSubMenus() throws Exception
	{
		pageHeaders()
		.verifyDressesLinksWithTitles();
	}
	
	@TestCaseId("TC_LandingPage_05")
	@Description("This is a test to verify the Sub Menus under Jackets Menu!")
	@Features("Landing Page")
	@Test
	public void verifyJacketsSubMenus() throws Exception
	{
		pageHeaders()
		.verifyJacketsLinksWithTitles();
	}
	
	@TestCaseId("TC_LandingPage_06")
	@Description("This is a test to verify the Sub Menus under Bottoms Menu!")
	@Features("Landing Page")
	@Test
	public void verifyBottomsSubMenus() throws Exception
	{
		pageHeaders()
		.verifyBottomsLinksWithTitles();
	}
	
	@TestCaseId("TC_LandingPage_07")
	@Description("This is a test to verify the Sub Menus under Denim Menu!")
	@Features("Landing Page")
	@Test
	public void verifyDenimSubMenus() throws Exception
	{
		pageHeaders()
		.verifyDenimLinksWithTitles();
	}
	
	@TestCaseId("TC_LandingPage_08")
	@Description("This is a test to verify the Sub Menus under Shoes & Accessories Menu!")
	@Features("Landing Page")
	@Test
	public void verifyShoes_AccessoriesSubMenus() throws Exception
	{
		pageHeaders()
		.verifyShoes_AccessoriesLinksWithTitles();
	}
	
	@TestCaseId("TC_LandingPage_09")
	@Description("This is a test to verify the Sub Menus under Sale Menu!")
	@Features("Landing Page")
	@Test
	public void verifySaleSubMenus() throws Exception
	{
		pageHeaders()
		.verifySaleLinksWithTitles();
	}
}
