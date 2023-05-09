Feature: user should create the account

Scenario Outline: user should able to create the account

Given user alreay in log in page
Then user enters "<username>"and "<password>"
Then user click on log in button
Then user is in home page
And clicks on employee option
Then click on create option
Then user is in create account page
Then user enters "<firstname>" and "<lastname>" and "<emailid>" and "<phonenumber>"
Then click on save button
Then close the browser

Examples:
| username | password | firstname | lastname | emailid | phonenumber |
| training@jalaacademy.com | jobprogram | Giri | Mahesh | giri@123 | 9144356795 |
| training@jalaacademy.com | jobprogram | chakri | chak | chak@123 | 9144534563 |



