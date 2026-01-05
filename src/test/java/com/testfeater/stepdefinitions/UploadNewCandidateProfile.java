package com.testfeater.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testfeater.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String fileName) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(fileName);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("the user should see a success confirmation message")
public void the_user_should_see_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@When("the recruiter clicks on the upload (cloud) icon")
public void the_recruiter_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the recruiter browses and selects the first valid candidate profile file {string}")
public void the_recruiter_browses_and_selects_the_first_valid_candidate_profile_file(String candidateProfileFile1) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile1);
}
@When("the recruiter waits for the upload to complete and confirms success")
public void the_recruiter_waits_for_the_upload_to_complete_and_confirms_success() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@When("the recruiter browses and selects the second valid candidate profile file {string}")
public void the_recruiter_browses_and_selects_the_second_valid_candidate_profile_file(String candidateProfileFile2) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile2);
}
@Then("both profiles should be listed in the Profile Section")
public void both_profiles_should_be_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areBothProfilesListed();
}
@When("the user browses and selects a valid candidate profile file of 2MB")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_of_2MB() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("2MBFile");
}
@When("the user browses and selects a valid candidate profile file with a long filename {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_a_long_filename(String fileName) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(fileName);
}
@When("the user browses and selects a valid candidate profile file in .txt format")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_in_txt_format() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("valid_candidate.txt");
}
@When("the user browses and selects a valid candidate profile file with UTF-8 encoding")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_UTF8_encoding() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("valid_candidate_profile");
}
@When("the user browses and selects a valid candidate profile file with a .doc extension")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_doc_extension() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("valid_candidate.doc");
}
@When("the user browses and selects a valid candidate profile file with text in Spanish")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_text_in_spanish() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("candidate_profile_spanish.txt");
}
@When("the user browses and selects an unsupported file type {string}")
public void the_user_browses_and_selects_an_unsupported_file_type(String fileType) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(fileType);
}
@Then("an error message is displayed indicating the file type is not supported")
public void an_error_message_is_displayed_indicating_the_file_type_is_not_supported() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user browses and selects a file that exceeds the size limit")
public void the_user_browses_and_selects_a_file_that_exceeds_the_size_limit() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("6MBFile");
}
@Then("an error message is displayed indicating the file exceeds the maximum size limit")
public void an_error_message_is_displayed_indicating_the_file_exceeds_the_maximum_size_limit() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user does not select any file")
public void the_user_does_not_select_any_file() {
uploadNewCandidateProfilePage.deselectFile();
}
@Then("an error message is displayed indicating that no file was selected")
public void an_error_message_is_displayed_indicating_that_no_file_was_selected() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("a network failure occurs during the upload process")
public void a_network_failure_occurs_during_the_upload_process() {
uploadNewCandidateProfilePage.simulateNetworkFailure();
}
@Then("an error message is displayed indicating a network failure occurred")
public void an_error_message_is_displayed_indicating_a_network_failure_occurred() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the upload process times out")
public void the_upload_process_times_out() {
uploadNewCandidateProfilePage.simulateUploadTimeout();
}
@Then("an error message is displayed indicating the upload process timed out")
public void an_error_message_is_displayed_indicating_the_upload_process_timed_out() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user browses and selects a corrupted candidate profile file {string}")
public void the_user_browses_and_selects_a_corrupted_candidate_profile_file(String corruptedFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(corruptedFile);
}
@Then("the user should see an error message indicating the file is corrupted and cannot be uploaded")
public void the_user_should_see_an_error_message_indicating_the_file_is_corrupted_and_cannot_be_uploaded() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user browses and selects a valid candidate profile file with special characters in the filename {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_special_characters_in_the_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}
@When("the user browses and selects a valid candidate profile file with a very short filename {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_a_very_short_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}
@When("the recruiter browses and selects a valid candidate profile file with spaces in the filename {string}")
public void the_recruiter_browses_and_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}

@Given("the user clicks the upload button")
public void the_user_clicks_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the recruiter browses selects a valid candidate profile file with spaces in the filename")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithSpaces();
}
@Then("the upload process does not complete successfully")
public void the_upload_process_does_not_complete_successfully() {
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@When("the recruiter browses selects the first valid candidate profile file")
public void the_recruiter_browses_selects_the_first_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectFirstValidCandidateProfileFile();
}
@When("the recruiter clicks on the upload icon")
public void the_recruiter_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@Then("the upload process does not initiate")
public void the_upload_process_does_not_initiate() {
uploadNewCandidateProfilePage.isUploadInitiated();
}
@When("the user browses selects a corrupted candidate profile file")
public void the_user_browses_selects_a_corrupted_candidate_profile_file() {
uploadNewCandidateProfilePage.selectCorruptedCandidateProfileFile();
}
@When("I wait for the upload process to complete")
public void i_wait_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@Then("a success confirmation message should be displayed to the recruiter")
public void a_success_confirmation_message_should_be_displayed_to_the_recruiter() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the recruiter browses selects a valid candidate profile file of 2mb")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_of_2mb() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileOf2MB();
}
@When("I browse select a valid candidate profile file in .txt format")
public void i_browse_select_a_valid_candidate_profile_file_in_txt_format() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileInTxtFormat();
}
@When("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFile();
}
@When("the user browses selects a valid candidate profile file with a very short filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_very_short_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithVeryShortFilename();
}
@Then("a success confirmation message is displayed to the user")
public void a_success_confirmation_message_is_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the recruiter waits for the upload process to complete")
public void the_recruiter_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@When("the user browses selects a valid candidate profile file with a long filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_long_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithLongFilename();
}
@When("the recruiter browses selects the second valid candidate profile file")
public void the_recruiter_browses_selects_the_second_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectSecondValidCandidateProfileFile();
}
@When("the user browses selects a valid candidate profile file with special characters in the filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_special_characters_in_the_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithSpecialCharacters();
}
}