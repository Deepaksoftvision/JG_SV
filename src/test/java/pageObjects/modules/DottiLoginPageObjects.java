/**
 * 
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

/**
 * @author spi.qa5
 *
 */
public class DottiLoginPageObjects extends PageFactoryInitializer
{
	
	@FindBy(id="do-login-email")
	private WebElement userNameLocator;
	
	@FindBy(id="do-login-password")
	private WebElement passwordLocator;
	
	@FindBy(id="do-login-submit")
	private WebElement loginButtonLocator;
	
	@FindBy(xpath="//h1")
	private WebElement accountHomeLocator;
	
	@FindBy(id="errordo-login-email")
	private WebElement usernameErrorMessageLocator;
	
	@FindBy(id="errordo-login-password")
	private WebElement passwordErrorMessageLocator;
	
	@FindBy(id="do-error")
	private WebElement errorHeaderLocator;
	
	
	@Step("To Verify the Page Title of the Login Page")
	public DottiLoginPageObjects verifyPageTitle() 
	{
		FluentWaiting.waitForTitleToBe(30, 100, "Login • Dotti");
		return this;
	}
	
	
	@Step("Enter Username {0}")
	public DottiLoginPageObjects enterUserName(String UserName) throws Exception 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 10, userNameLocator);
		sendKeys(userNameLocator, UserName);
		return this;
	}

	@Step("Enter Password {0}")
	public DottiLoginPageObjects enterPassword(String password) 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 10, passwordLocator);
		sendKeys(passwordLocator, password);
		return this;
	}

	@Step("Click on submit button")
	public DottiLoginPageObjects clickOnSubmitButton() 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 10, loginButtonLocator);
		loginButtonLocator.click();
		return this;
	}

	@Step("Verify Login Success Message")
	public DottiLoginPageObjects verifyLoginSuccessMessage() throws Exception 
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 10, accountHomeLocator);
		Assert.assertTrue(accountHomeLocator.isDisplayed());
		return this;
	}


	@Step("Verify the page title")
	public DottiLoginPageObjects verifyPageTitleAfterLogin() throws Exception 
	{
		Thread.sleep(5000);
		Assert.assertEquals(getWebDriver().getTitle().trim(), "My Account • Dotti");
		return this;
	}


	@Step("To Verify the Error Message: '{0}'")
	public DottiLoginPageObjects verifyLoginErrorsMessage(String errorMessage)
	{
		String actualText="";
		String emailErrorMessage="";
		String passwordErrorMessage="";
		
		try
		{
			emailErrorMessage = usernameErrorMessageLocator.getText().trim();
		}
		catch(Exception e)
		{ }
		
		try
		{
			passwordErrorMessage = passwordErrorMessageLocator.getText().trim();
		}
		catch(Exception e)
		{ }
		
		actualText = emailErrorMessage + passwordErrorMessage;
		Assert.assertEquals(actualText, errorMessage);
		return this;
	}

}
