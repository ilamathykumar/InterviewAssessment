package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class TestPageObject extends Basee {
	
	public TestPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement email;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Compose']")
	private WebElement compose;
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement recipient;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subject;
	
	@FindBy(xpath="//div[@aria-label='Message Body']")
	private WebElement body;
	
	@FindBy(xpath="//div[@aria-label='More options']")
	private WebElement options;
	
	@FindBy(xpath="//div[text()='Label']")
	private WebElement label;
	
	@FindBy(xpath="//div[@title='Social']")
	private WebElement social;
	
	@FindBy(xpath="//div[contains(text(),'Send') and @role='button']")
	private WebElement sendButton;
	
	@FindBy(xpath="//div[text()='Social']")
	private WebElement socialTab;
	
	@FindBy(xpath="//span[@aria-label='Not starred']")
	private WebElement starButton;
	
	@FindBy(xpath="//span[@class='y2']")
	private WebElement emailLink;
	
	@FindBy(xpath="//div[text()='Test Email Body']")
	private WebElement emailBody;
	
	public void enterEmail(String emailValue) {
		email.sendKeys(emailValue);
	}
	public void clickNext() {
		next.click();
	}
	public void enterPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}
	public void clickCompose() {
		compose.click();
	}
	public void clickOptions() {
		options.click();
	}
	public void clickLabel() {
		label.click();
	}
	public void clickSocial() {
		social.click();
	}
	public void clickSend() {
		sendButton.click();
	}
	public void clickSocialTab() {
		socialTab.click();
	}
	public void clickStar() {
		starButton.click();
	}
    public String getBody() {
    	return emailBody.getText();
    }
	
}
