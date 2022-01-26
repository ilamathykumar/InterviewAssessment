package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Basee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TestPageObject;

public class TestStepDef extends Basee {
	
	TestPageObject testpageobject = new TestPageObject();
	
	@Given("user is on gmail page")
	public void user_is_on_gmail_page() {
	    String actualtitle = driver.getTitle();
	    String expectedtitle = "Gmail";
	    Assert.assertEquals(expectedtitle, actualtitle);
	    logger.info("User is on gmail page");
		
	}
	@When("user enters username {string}")
	public void user_enters_username(String emailValue) {
		testpageobject.enterEmail(emailValue);
		logger.info("User entered the email");
	    
	}
	@When("user clicks on next button")
	public void user_clicks_on_next_button() throws InterruptedException{
		testpageobject.clickNext();
		Thread.sleep(3000);

	}
	@When("user enters password {string}")
	public void user_enters_password(String passwordValue) throws InterruptedException {
		testpageobject.enterPassword(passwordValue);
		Thread.sleep(3000);

		logger.info("User entered the password");
	}
	@When("user clicks on compose button")
	public void user_clicks_on_compose_button() throws InterruptedException{
		testpageobject.clickCompose();
		Thread.sleep(3000);
		logger.info("user clicked on compose");
	}
	@When("user enters recipient {string} and subject {string} and body {string}")
	public void user_enters_recipient_and_subject_and_body(String recipientValue, String subjectValue, String bodyValue) throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='subjectbox']")));
	    
	    driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(recipientValue);
	    driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(subjectValue);
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(bodyValue);
	    logger.info("User entered subject and body");
	}
	@When("user clicks on more options")
	public void user_clicks_on_more_options() throws InterruptedException {
		testpageobject.clickOptions();
		Thread.sleep(5000);
		logger.info("User clicked options");

	}
	@When("user clicks on label")
	public void user_clicks_on_label() throws InterruptedException{
		testpageobject.clickLabel();
		logger.info("User clicked label");

		Thread.sleep(5000);


	}
	@When("user clicks on social checkbox")
	public void user_clicks_on_social_checkbox() throws InterruptedException {
		testpageobject.clickSocial();
		logger.info("User clicked social");

		Thread.sleep(5000);

	}
	@When("user clicks send option")
	public void user_clicks_send_option() throws InterruptedException {
		testpageobject.clickSend();
		logger.info("User clicked send");

		Thread.sleep(3000);

	}
	@When("user waits for the email to arrive in the inbox")
	public void user_waits_for_the_email_to_arrive_in_the_inbox() throws InterruptedException{
		testpageobject.clickSocialTab();
		Thread.sleep(5000);
		logger.info("User waiting");


	}
	@When("user clicks on the star button")
	public void user_clicks_on_the_star_button() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@aria-label='Not starred']")));
		
	    List<WebElement> list = driver.findElements(By.xpath("//span[@aria-label='Not starred']"));
	    for(int i=0; i<list.size();i++) {
	    	list.get(2).click();
	    	break;
	    }
		Thread.sleep(5000);
		logger.info("User clicked star");


	}
	@When("user clicks on the received email")
	public void user_clicks_on_the_received_email() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='y2']")));
		
	    List<WebElement> list = driver.findElements(By.xpath("//span[@class='y2']"));
	    for(int i=0; i<list.size();i++) {
	    	list.get(2).click();
	    	break;
	    }
		Thread.sleep(5000);
		logger.info("User clicked received email");


	}
	@Then("user be able to verify the email with emailbody")
	public void user_be_able_to_verify_the_email_with_emailbody() {
	    String expectedBody = testpageobject.getBody();
	    String actualBody="Test Email Body";
	    Assert.assertEquals(expectedBody, actualBody);
		logger.info("User verified");

	    		
	}
	

}
