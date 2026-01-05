package com.testfeater.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testfeater.pages.LoginScreenforRecruitersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenforRecruiters extends DriverFactory {
LoginScreenforRecruitersPage loginPage = new LoginScreenforRecruitersPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginScreen();
}
@When("I enter {string}")
public void i_enter_email(String email_id) {
loginPage.enterEmail(email_id);
}
@When("I enter {string} in the Email ID field")
public void i_enter_email_in_the_email_id_field(String email_id) {
loginPage.enterEmail(email_id);
}
@When("I enter {string} in the Password field")
public void i_enter_password_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@When("I click on the 'Show Password' option")
public void i_click_on_show_password_option() {
loginPage.clickShowPassword();
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@When("I click the Login button again")
public void i_click_the_login_button_again() {
loginPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
"User is not redirected to the dashboard", loginPage.isDashboardDisplayed();
}
@Then("the dashboard should load without errors")
public void the_dashboard_should_load_without_errors() {
"Dashboard loaded with errors", loginPage.isDashboardLoadedWithoutErrors();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
"Login button is not enabled", loginPage.isLoginButtonEnabled();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
"Password is still visible", loginPage.isPasswordVisible();
}
@Then("an error message {string} should be displayed")
public void an_error_message_should_be_displayed(String errorMessage) {
Assert.assertEquals("Error message does not match", errorMessage, loginPage.getErrorMessage());
}
@Then("the user remains on the login screen")
public void the_user_remains_on_the_login_screen() {
"User is not on the login screen", loginPage.isLoginScreenDisplayed();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
"Login button is enabled", loginPage.isLoginButtonEnabled();
}
@When("I leave the Email ID field empty")
public void i_leave_the_email_id_field_empty() {
loginPage.leaveEmailFieldEmpty();
}
@When("I leave the Password field empty")
public void i_leave_the_password_field_empty() {
loginPage.leavePasswordFieldEmpty();
}
@Then("the user should see the error message {string}")
public void the_user_should_see_the_error_message(String errorMessage) {
Assert.assertEquals("Error message does not match", errorMessage, loginPage.getErrorMessage());
}

@Given("I open the application in {string}")
public void i_open_the_application_in(String url) {
driver = DriverFactory.getDriver();
driver.get(url);
}
@When("I enter a valid email id {string} in the email id field")
public void i_enter_a_valid_email_id_in_the_email_id_field(String email) {
loginScreenforRecruitersPage.enterEmailId(email);
}
@When("the user enters {string} in the password field")
public void the_user_enters_password_in_the_password_field(String password) {
loginScreenforRecruitersPage.enterPassword(password);
}
@When("the recruiter clicks the login button")
public void the_recruiter_clicks_the_login_button() {
loginScreenforRecruitersPage.clickLoginButton();
}
// DUPLICATE: @Then("the user should see the error message {string}")
public void the_user_should_see_the_error_message(String errorMessage) {
Assert.assertEquals(errorMessage, loginScreenforRecruitersPage.getErrorMessage());
}
@Then("the user should remain on the login screen")
public void the_user_should_remain_on_the_login_screen() {
loginScreenforRecruitersPage.isLoginScreenDisplayed();
}
// DUPLICATE: @Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
loginScreenforRecruitersPage.isDashboardDisplayed();
}
@When("I clickElement on the 'hide password' option")
public void i_click_on_the_hide_password_option() {
loginScreenforRecruitersPage.clickHidePasswordOption();
}
@Then("the user is redirected to the dashboard in {string}")
public void the_user_is_redirected_to_the_dashboard_in(String url) {
Assert.assertEquals(url, driver.getCurrentUrl());
}
@Then("an error message 'please enter your email id.' is displayed")
public void an_error_message_please_enter_your_email_id_is_displayed() {
Assert.assertEquals("please enter your email id.", loginScreenforRecruitersPage.getErrorMessage());
}
@Then("an error message 'please enter your password.' is displayed")
public void an_error_message_please_enter_your_password_is_displayed() {
Assert.assertEquals("please enter your password.", loginScreenforRecruitersPage.getErrorMessage());
}
@Then("the user should see the error message 'password must be at least 6 characters long.'")
public void the_user_should_see_the_error_message_password_must_be_at_least_6_characters_long() {
Assert.assertEquals("password must be at least 6 characters long.", loginScreenforRecruitersPage.getErrorMessage());
}
@Then("an error message 'incorrect email id or password.' is displayed")
public void an_error_message_incorrect_email_id_or_password_is_displayed() {
Assert.assertEquals("incorrect email id or password.", loginScreenforRecruitersPage.getErrorMessage());
}
@Then("an error message 'please enter a valid email id.' is displayed")
public void an_error_message_please_enter_a_valid_email_id_is_displayed() {
Assert.assertEquals("please enter a valid email id.", loginScreenforRecruitersPage.getErrorMessage());
}
}