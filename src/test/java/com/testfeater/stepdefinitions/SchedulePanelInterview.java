package com.testfeater.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testfeater.pages.SchedulePanelInterviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SchedulePanelInterview extends DriverFactory {
SchedulePanelInterviewPage schedulePanelInterviewPage = new SchedulePanelInterviewPage(driver);
@Given("the recruiter is on the Schedule Interview section")
public void the_recruiter_is_on_the_schedule_interview_section() {
schedulePanelInterviewPage.navigateToScheduleInterviewSection();
}
@When("the recruiter clicks on Create Interview")
public void the_recruiter_clicks_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterviewButton();
}
@When("the recruiter selects {string} from the dropdown")
public void the_recruiter_selects_from_the_dropdown(String jobOpening) {
schedulePanelInterviewPage.selectJobOpening(jobOpening);
}
@When("the recruiter selects {string} from the available options")
public void the_recruiter_selects_from_the_available_options(String location) {
schedulePanelInterviewPage.selectLocation(location);
}
@When("the recruiter enters {string} and selects the candidate")
public void the_recruiter_enters_and_selects_the_candidate(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmail(candidateEmail);
}
@When("the recruiter chooses the {string}")
public void the_recruiter_chooses_the(String panelInterviewOption) {
schedulePanelInterviewPage.choosePanelInterviewOption(panelInterviewOption);
}
@When("the recruiter selects {string} and {string}")
public void the_recruiter_selects_and(String interviewDate, String startTime) {
schedulePanelInterviewPage.selectInterviewDateAndStartTime(interviewDate, startTime);
}
// DUPLICATE: @When("the recruiter selects {string} and {string}")
public void the_recruiter_selects_attendees_and_round(String attendees, String interviewRound) {
schedulePanelInterviewPage.selectAttendeesAndInterviewRound(attendees, interviewRound);
}
@When("the recruiter selects {string}")
public void the_recruiter_selects_provider(String interviewProvider) {
schedulePanelInterviewPage.selectInterviewProvider(interviewProvider);
}
@When("the recruiter clicks on Next")
public void the_recruiter_clicks_on_next() {
schedulePanelInterviewPage.clickNextButton();
}
@When("the recruiter attaches {string}")
public void the_recruiter_attaches(String requiredFiles) {
schedulePanelInterviewPage.attachRequiredFiles(requiredFiles);
}
@When("the recruiter clicks on Confirm and Send")
public void the_recruiter_clicks_on_confirm_and_send() {
schedulePanelInterviewPage.clickConfirmAndSendButton();
}
@Then("the system displays a confirmation message for the scheduled interview")
public void the_system_displays_a_confirmation_message_for_the_scheduled_interview() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@Then("all optional fields are saved and displayed correctly in the interview details")
public void all_optional_fields_are_saved_and_displayed_correctly_in_the_interview_details() {
schedulePanelInterviewPage.areOptionalFieldsDisplayedCorrectly();
}
@Then("notifications are sent to all participants with the additional information included")
public void notifications_are_sent_to_all_participants_with_the_additional_information_included() {
schedulePanelInterviewPage.areNotificationsSent();
}
@Then("the interview appears in the calendar of all attendees with all details")
public void the_interview_appears_in_the_calendar_of_all_attendees_with_all_details() {
schedulePanelInterviewPage.isInterviewInCalendar();
}
@Then("the candidate receives an email notification with all details")
public void the_candidate_receives_an_email_notification_with_all_details() {
schedulePanelInterviewPage.isEmailNotificationReceived();
}
@Then("the recruiter can view the scheduled interview in their dashboard with all information")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard_with_all_information() {
schedulePanelInterviewPage.isInterviewVisibleInDashboard();
}
@When("the recruiter selects a scheduled panel interview to edit")
public void the_recruiter_selects_a_scheduled_panel_interview_to_edit() {
schedulePanelInterviewPage.selectScheduledInterviewToEdit();
}
@When("the recruiter clicks on Edit Interview")
public void the_recruiter_clicks_on_edit_interview() {
schedulePanelInterviewPage.clickEditInterviewButton();
}
@When("the recruiter makes changes to the Interview Date, Start Time, or Attendees")
public void the_recruiter_makes_changes_to_the_interview_date_start_time_or_attendees() {
schedulePanelInterviewPage.makeChangesToInterviewDetails();
}
@When("the recruiter clicks on Save Changes")
public void the_recruiter_clicks_on_save_changes() {
schedulePanelInterviewPage.clickSaveChangesButton();
}
@Then("the system displays a confirmation message indicating that the interview has been updated")
public void the_system_displays_a_confirmation_message_indicating_that_the_interview_has_been_updated() {
schedulePanelInterviewPage.isUpdateConfirmationMessageDisplayed();
}
@Then("the updated interview details are reflected in the system")
public void the_updated_interview_details_are_reflected_in_the_system() {
schedulePanelInterviewPage.areUpdatedDetailsReflected();
}
@Then("notifications are sent to all attendees regarding the changes")
public void notifications_are_sent_to_all_attendees_regarding_the_changes() {
schedulePanelInterviewPage.areChangeNotificationsSent();
}
@Then("the candidate receives an email notification with updated interview details")
public void the_candidate_receives_an_email_notification_with_updated_interview_details() {
schedulePanelInterviewPage.isUpdatedEmailNotificationReceived();
}
@Then("the recruiter can view the updated interview in their dashboard")
public void the_recruiter_can_view_the_updated_interview_in_their_dashboard() {
schedulePanelInterviewPage.isUpdatedInterviewVisibleInDashboard();
}
@When("the user selects a scheduled panel interview to cancel")
public void the_user_selects_a_scheduled_panel_interview_to_cancel() {
schedulePanelInterviewPage.selectScheduledInterviewToCancel();
}
@When("the user clicks on Cancel Interview")
public void the_user_clicks_on_cancel_interview() {
schedulePanelInterviewPage.clickCancelInterviewButton();
}
@When("the user confirms the cancellation")
public void the_user_confirms_the_cancellation() {
schedulePanelInterviewPage.confirmCancellation();
}
@Then("the system displays a confirmation message indicating that the interview has been canceled")
public void the_system_displays_a_confirmation_message_indicating_that_the_interview_has_been_canceled() {
schedulePanelInterviewPage.isCancellationConfirmationMessageDisplayed();
}
@Then("the interview is removed from the scheduled interviews list")
public void the_interview_is_removed_from_the_scheduled_interviews_list() {
schedulePanelInterviewPage.isInterviewInScheduledList();
}
@Then("notifications are sent to all attendees regarding the cancellation")
public void notifications_are_sent_to_all_attendees_regarding_the_cancellation() {
schedulePanelInterviewPage.areCancellationNotificationsSent();
}
@Then("the candidate receives an email notification about the cancellation")
public void the_candidate_receives_an_email_notification_about_the_cancellation() {
schedulePanelInterviewPage.isCancellationEmailNotificationReceived();
}
@When("the user leaves the Job Opening field empty")
public void the_user_leaves_the_job_opening_field_empty() {
schedulePanelInterviewPage.leaveJobOpeningFieldEmpty();
}
@Then("the system displays an error message indicating that the Job Opening must be selected")
public void the_system_displays_an_error_message_indicating_that_the_job_opening_must_be_selected() {
schedulePanelInterviewPage.isJobOpeningErrorMessageDisplayed();
}
@Then("the user remains on the scheduling page")
public void the_user_remains_on_the_scheduling_page() {
schedulePanelInterviewPage.isOnSchedulingPage();
}
@Then("no interview is scheduled")
public void no_interview_is_scheduled() {
schedulePanelInterviewPage.isInterviewScheduled();
}
@When("the user leaves the Candidate field empty")
public void the_user_leaves_the_candidate_field_empty() {
schedulePanelInterviewPage.leaveCandidateFieldEmpty();
}
@Then("the system displays an error message indicating that a Candidate must be selected")
public void the_system_displays_an_error_message_indicating_that_a_candidate_must_be_selected() {
schedulePanelInterviewPage.isCandidateErrorMessageDisplayed();
}
@When("the user leaves the Interview Date field empty")
public void the_user_leaves_the_interview_date_field_empty() {
schedulePanelInterviewPage.leaveInterviewDateFieldEmpty();
}
@Then("the system displays an error message indicating that an Interview Date must be selected")
public void the_system_displays_an_error_message_indicating_that_an_interview_date_must_be_selected() {
schedulePanelInterviewPage.isInterviewDateErrorMessageDisplayed();
}
@When("the user leaves the Start Time field empty")
public void the_user_leaves_the_start_time_field_empty() {
schedulePanelInterviewPage.leaveStartTimeFieldEmpty();
}
@Then("the system displays an error message indicating that a Start Time must be selected")
public void the_system_displays_an_error_message_indicating_that_a_start_time_must_be_selected() {
schedulePanelInterviewPage.isStartTimeErrorMessageDisplayed();
}
@When("the user leaves the Attendees field empty")
public void the_user_leaves_the_attendees_field_empty() {
schedulePanelInterviewPage.leaveAttendeesFieldEmpty();
}
@Then("the system displays an error message indicating that at least one Attendee must be selected")
public void the_system_displays_an_error_message_indicating_that_at_least_one_attendee_must_be_selected() {
schedulePanelInterviewPage.isAttendeesErrorMessageDisplayed();
}
@When("the user selects a past Interview Date as {string}")
public void the_user_selects_a_past_interview_date_as(String interviewDate) {
schedulePanelInterviewPage.selectPastInterviewDate(interviewDate);
}
@Then("the system displays an error message indicating that the Interview Date cannot be in the past")
public void the_system_displays_an_error_message_indicating_that_the_interview_date_cannot_be_in_the_past() {
schedulePanelInterviewPage.isPastInterviewDateErrorMessageDisplayed();
}
@When("the user enters an invalid email format for the Candidate {string}")
public void the_user_enters_an_invalid_email_format_for_the_candidate(String email) {
schedulePanelInterviewPage.enterInvalidEmail(email);
}
@Then("the system displays an error message indicating that the email format is invalid")
public void the_system_displays_an_error_message_indicating_that_the_email_format_is_invalid() {
schedulePanelInterviewPage.isInvalidEmailErrorMessageDisplayed();
}
@When("the user enters a candidate email address that is at the maximum character limit of {string}")
public void the_user_enters_a_candidate_email_address_that_is_at_the_maximum_character_limit_of(String email) {
schedulePanelInterviewPage.enterCandidateEmailAtMaxLength(email);
}
@Then("the system should accept the email address without errors")
public void the_system_should_accept_the_email_address_without_errors() {
schedulePanelInterviewPage.isEmailAccepted();
}
@Then("the interview should be scheduled successfully")
public void the_interview_should_be_scheduled_successfully() {
schedulePanelInterviewPage.isInterviewScheduledSuccessfully();
}
@Then("notifications should be sent to all participants")
public void notifications_should_be_sent_to_all_participants() {
schedulePanelInterviewPage.areNotificationsSentToParticipants();
}

@Given("I select the interview date start time")
public void i_select_the_interview_date_start_time() {
schedulePanelInterviewPage.selectInterviewDateStartTime();
}
@Given("I select the cidate")
public void i_select_the_cidate() {
schedulePanelInterviewPage.selectCidate();
}
@When("I select {string} as the start time")
public void i_select_as_the_start_time(String startTime) {
schedulePanelInterviewPage.selectStartTime(startTime);
}
@When("the user fills in optional fields (interview notes {string}, special instructions {string})")
public void the_user_fills_in_optional_fields(String interviewNotes, String specialInstructions) {
schedulePanelInterviewPage.fillInOptionalFields(interviewNotes, specialInstructions);
}
@Then("the interview can be scheduled successfully")
public void the_interview_can_be_scheduled_successfully() {
schedulePanelInterviewPage.isInterviewScheduledSuccessfully();
}
@When("the user clicks on next")
public void the_user_clicks_on_next() {
schedulePanelInterviewPage.clicksNext();
}
@When("the user enters the cidate's email address as {string}")
public void the_user_enters_the_cidate_email_address_as(String email) {
schedulePanelInterviewPage.enterCidateEmailAddress(email);
}
@When("the user clicks on confirm send")
public void the_user_clicks_on_confirm_send() {
schedulePanelInterviewPage.clicksConfirmSend();
}
@When("the user selects the cidate {string}")
public void the_user_selects_the_cidate(String cidate) {
schedulePanelInterviewPage.selectCidate(cidate);
}
@When("I enter {string} select the cidate")
public void i_enter_select_the_cidate(String cidate) {
schedulePanelInterviewPage.enterAndSelectCidate(cidate);
}
@When("selects a location from the available options")
public void selects_a_location_from_the_available_options() {
schedulePanelInterviewPage.selectLocation();
}
@When("enters an invalid email format for the cidate {string}")
public void enters_an_invalid_email_format_for_the_cidate(String invalidEmail) {
schedulePanelInterviewPage.enterInvalidCidateEmail(invalidEmail);
}
@When("I clickElement on create interview")
public void i_click_on_create_interview() {
schedulePanelInterviewPage.clickOnCreateInterview();
}
@When("I choose the {string}")
public void i_choose_the(String option) {
schedulePanelInterviewPage.chooseOption(option);
}
@When("the recruiter selects {string} as the start time")
public void the_recruiter_selects_as_the_start_time(String startTime) {
schedulePanelInterviewPage.recruiterSelectsStartTime(startTime);
}
@When("the recruiter enters {string}")
public void the_recruiter_enters(String input) {
schedulePanelInterviewPage.recruiterEnters(input);
}
@When("selects a job opening from the dropdown")
public void selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.selectJobOpening();
}
@When("the user selects a job opening from the dropdown")
public void the_user_selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.userSelectsJobOpening();
}
@When("the user enters {string} selects the cidate")
public void the_user_enters_selects_the_cidate(String cidate) {
schedulePanelInterviewPage.userEntersAndSelectsCidate(cidate);
}
@Then("the recruiter can view the scheduled interview in their dashboard")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard() {
schedulePanelInterviewPage.isInterviewVisibleInDashboard();
}
@When("the recruiter selects {string} as the minimum number of attendees")
public void the_recruiter_selects_as_the_minimum_number_of_attendees(String minAttendees) {
schedulePanelInterviewPage.recruiterSelectsMinAttendees(minAttendees);
}
@Then("notifications are sent to all participants")
public void notifications_are_sent_to_all_participants() {
schedulePanelInterviewPage.areNotificationsSent();
}
@When("the user selects {string} from the available options")
public void the_user_selects_from_the_available_options(String option) {
schedulePanelInterviewPage.userSelectsFromAvailableOptions(option);
}
@When("I attach {string}")
public void i_attach(String file) {
schedulePanelInterviewPage.attachFile(file);
}
@When("I enter a cidate email address that is at the maximum character limit of {string}")
public void i_enter_a_cidate_email_address_that_is_at_the_maximum_character_limit_of(String maxLength) {
schedulePanelInterviewPage.enterCidateEmailAddressAtMaxLength(maxLength);
}
@When("the user chooses the {string} option")
public void the_user_chooses_the_option(String option) {
schedulePanelInterviewPage.userChoosesOption(option);
}
@When("the user schedules a panel interview with multiple attendees")
public void the_user_schedules_a_panel_interview_with_multiple_attendees() {
schedulePanelInterviewPage.schedulePanelInterviewWithMultipleAttendees();
}
@Then("all attendees receive notifications")
public void all_attendees_receive_notifications() {
schedulePanelInterviewPage.areAllAttendeesNotified();
}
@Then("the interview appears in the calendar of all attendees")
public void the_interview_appears_in_the_calendar_of_all_attendees() {
schedulePanelInterviewPage.isInterviewInAllAttendeesCalendars();
}
@When("the user selects the interview provider {string}")
public void the_user_selects_the_interview_provider(String provider) {
schedulePanelInterviewPage.selectInterviewProvider(provider);
}
@Then("the email should include a calendar invite for the interview")
public void the_email_should_include_a_calendar_invite_for_the_interview() {
schedulePanelInterviewPage.isCalendarInviteIncludedInEmail();
}
@When("the user enters the cidate's email address {string} selects the cidate")
public void the_user_enters_the_cidate_email_address_selects_the_cidate(String email) {
schedulePanelInterviewPage.enterCidateEmailAddressAndSelect(email);
}
@When("I select {string} from the dropdown")
public void i_select_from_the_dropdown(String option) {
schedulePanelInterviewPage.selectFromDropdown(option);
}
@When("the user enters a cidate email address {string}")
public void the_user_enters_a_cidate_email_address(String email) {
schedulePanelInterviewPage.enterCidateEmailAddress(email);
}
@When("the user selects the interview date {string} start time {string}")
public void the_user_selects_the_interview_date_start_time(String interviewDate, String startTime) {
schedulePanelInterviewPage.userSelectsInterviewDateAndStartTime(interviewDate, startTime);
}
@When("the system displays an error message indicating that the interview time overlaps with an existing interview")
public void the_system_displays_an_error_message_indicating_that_the_interview_time_overlaps_with_an_existing_interview() {
schedulePanelInterviewPage.isErrorMessageDisplayedForOverlappingTime();
}
@When("the user clicks on create interview")
public void the_user_clicks_on_create_interview() {
schedulePanelInterviewPage.userClicksOnCreateInterview();
}
@When("I select {string} {string}")
public void i_select(String option1, String option2) {
schedulePanelInterviewPage.selectOptions(option1, option2);
}
@When("the recruiter selects the cidate")
public void the_recruiter_selects_the_cidate() {
schedulePanelInterviewPage.recruiterSelectsCidate();
}
}