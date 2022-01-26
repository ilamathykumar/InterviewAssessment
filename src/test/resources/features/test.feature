Feature: Have an existing gmail account

@smokeTest
Scenario:
Given user is on gmail page
When user enters username 'testquestion72@gmail.com' 
And user clicks on next button
When user enters password 'testquestion7272'
And user clicks on next button
And user clicks on compose button
And user enters recipient 'testquestion72@gmail.com' and subject 'Test Mail' and body 'Test Email Body'
And user clicks on more options
And user clicks on label
And user clicks on social checkbox
And user clicks send option
And user waits for the email to arrive in the inbox
And user clicks on the star button
And user clicks on the received email
Then user be able to verify the email with emailbody
