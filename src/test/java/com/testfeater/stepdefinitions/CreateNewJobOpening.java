package com.testfeater.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testfeater.pages.CreateNewJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateNewJobOpening extends DriverFactory {
CreateNewJobOpeningPage createNewJobOpeningPage = new CreateNewJobOpeningPage(driver);
@Given("the user is logged into the application")
public void theUserIsLoggedIntoTheApplication() {
driver = DriverFactory.getDriver();
}
@When("the user clicks on the {string} module from the main menu")
public void theUserClicksOnModuleFromTheMainMenu(String module) {
createNewJobOpeningPage.clickModule(module);
}
@Then("the Job Opening page is displayed with an {string} button visible")
public void theJobOpeningPageIsDisplayedWithButtonVisible(String button) {
createNewJobOpeningPage.isButtonVisible(button);
}
@When("the user clicks on the {string} button")
public void theUserClicksOnButton(String button) {
createNewJobOpeningPage.clickButton(button);
}
@Then("the Create New Job Opening form is displayed")
public void theCreateNewJobOpeningFormIsDisplayed() {
createNewJobOpeningPage.isFormDisplayed();
}
@Then("all required fields are present")
public void allRequiredFieldsArePresent() {
createNewJobOpeningPage.areRequiredFieldsPresent();
}
@Given("the user is on the Create Job Opening Page")
public void theUserIsOnTheCreateJobOpeningPage() {
createNewJobOpeningPage.navigateToCreateJobOpeningPage();
}
@When("I fill in the Job Title field with {string}")
public void iFillInTheJobTitleFieldWith(String jobTitle) {
createNewJobOpeningPage.fillJobTitle(jobTitle);
}
@When("I fill in the Job Description field with {string}")
public void iFillInTheJobDescriptionFieldWith(String jobDescription) {
createNewJobOpeningPage.fillJobDescription(jobDescription);
}
@When("I select {string} from the Department dropdown")
public void iSelectFromTheDepartmentDropdown(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("I fill in the Location field with {string}")
public void iFillInTheLocationFieldWith(String location) {
createNewJobOpeningPage.fillLocation(location);
}
@When("I select {string} as the Employment Type")
public void iSelectAsTheEmploymentType(String employmentType) {
createNewJobOpeningPage.selectEmploymentType(employmentType);
}
@When("I click the {string} button")
public void iClickTheButton(String button) {
createNewJobOpeningPage.clickButton(button);
}
@Then("the new job opening is created successfully")
public void theNewJobOpeningIsCreatedSuccessfully() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@Then("the user is redirected to the Job Openings listing page")
public void theUserIsRedirectedToTheJobOpeningsListingPage() {
createNewJobOpeningPage.isOnJobOpeningsListingPage();
}
@Then("the newly created job opening is displayed in the listing")
public void theNewlyCreatedJobOpeningIsDisplayedInTheListing() {
createNewJobOpeningPage.isJobOpeningDisplayed();
}
@When("the user leaves all required fields empty")
public void theUserLeavesAllRequiredFieldsEmpty() {
createNewJobOpeningPage.leaveRequiredFieldsEmpty();
}
@Then("the system displays error messages for each required field that is empty")
public void theSystemDisplaysErrorMessagesForEachRequiredFieldThatIsEmpty() {
createNewJobOpeningPage.areErrorMessagesDisplayed();
}
@Then("the user remains on the Create New Job Opening form")
public void theUserRemainsOnTheCreateNewJobOpeningForm() {
createNewJobOpeningPage.isFormDisplayed();
}
@When("the user clicks the {string} button on the Create New Job Opening form")
public void theUserClicksTheButtonOnTheCreateNewJobOpeningForm(String button) {
createNewJobOpeningPage.clickButton(button);
}
@Then("no new job opening is created")
public void noNewJobOpeningIsCreated() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@When("the user clicks on the newly created job opening")
public void theUserClicksOnTheNewlyCreatedJobOpening() {
createNewJobOpeningPage.clickOnNewlyCreatedJobOpening();
}
@When("the user clicks the {string} button")
public void theUserClicksTheEditButton(String button) {
createNewJobOpeningPage.clickButton(button);
}
@When("the user modifies the Job Description field")
public void theUserModifiesTheJobDescriptionField() {
createNewJobOpeningPage.modifyJobDescription();
}
@Then("the job opening should be updated successfully")
public void theJobOpeningShouldBeUpdatedSuccessfully() {
createNewJobOpeningPage.isJobOpeningUpdated();
}
@Then("the updated job opening details should be displayed in the listing")
public void theUpdatedJobOpeningDetailsShouldBeDisplayedInTheListing() {
createNewJobOpeningPage.isUpdatedJobOpeningDisplayed();
}
@When("the user observes the list of job openings")
public void theUserObservesTheListOfJobOpenings() {
createNewJobOpeningPage.viewJobOpeningsList();
}
@Then("the job opening details should be correct and match the entered data")
public void theJobOpeningDetailsShouldBeCorrectAndMatchTheEnteredData() {
createNewJobOpeningPage.isJobOpeningDetailsCorrect();
}
@When("the user selects {string} from the filter dropdown")
public void theUserSelectsFromTheFilterDropdown(String department) {
createNewJobOpeningPage.selectFilterDepartment(department);
}
@When("the user clicks on the filter options")
public void theUserClicksOnTheFilterOptions() {
createNewJobOpeningPage.clickFilterOptions();
}
@Then("job openings are filtered based on the selected criteria")
public void jobOpeningsAreFilteredBasedOnTheSelectedCriteria() {
createNewJobOpeningPage.isJobOpeningsFiltered();
}
@Then("only relevant job openings are displayed in the listing")
public void onlyRelevantJobOpeningsAreDisplayedInTheListing() {
createNewJobOpeningPage.isRelevantJobOpeningsDisplayed();
}
@When("the user enters {string} as the Job Title")
public void theUserEntersAsTheJobTitle(String jobTitle) {
createNewJobOpeningPage.fillJobTitle(jobTitle);
}
@When("the user enters {string} as the Company Name")
public void theUserEntersAsTheCompanyName(String companyName) {
createNewJobOpeningPage.fillCompanyName(companyName);
}
@When("the user enters {string} as the Location")
public void theUserEntersAsTheLocation(String location) {
createNewJobOpeningPage.fillLocation(location);
}
@When("the user enters {string} as the Job Description")
public void theUserEntersAsTheJobDescription(String description) {
createNewJobOpeningPage.fillJobDescription(description);
}
@When("the user enters {string} as the Salary")
public void theUserEntersAsTheSalary(String salary) {
createNewJobOpeningPage.fillSalary(salary);
}
@Then("the system displays an error message indicating the Job Title is invalid")
public void theSystemDisplaysAnErrorMessageIndicatingTheJobTitleIsInvalid() {
createNewJobOpeningPage.isErrorMessageDisplayed("Job Title is invalid");
}
@Then("the system displays an error message indicating the Job Description is too long")
public void theSystemDisplaysAnErrorMessageIndicatingTheJobDescriptionIsTooLong() {
createNewJobOpeningPage.isErrorMessageDisplayed("Job Description is too long");
}
@Then("the system displays an error message indicating the selected Department is invalid")
public void theSystemDisplaysAnErrorMessageIndicatingTheSelectedDepartmentIsInvalid() {
createNewJobOpeningPage.isErrorMessageDisplayed("Department is invalid");
}
@Then("the system displays an error message indicating the Job Title already exists")
public void theSystemDisplaysAnErrorMessageIndicatingTheJobTitleAlreadyExists() {
createNewJobOpeningPage.isErrorMessageDisplayed("Job Title already exists");
}
@Then("the system displays an error message indicating invalid data type")
public void theSystemDisplaysAnErrorMessageIndicatingInvalidDataType() {
createNewJobOpeningPage.isErrorMessageDisplayed("Invalid data type");
}
@Then("the system displays a warning message about unsaved changes")
public void theSystemDisplaysAWarningMessageAboutUnsavedChanges() {
createNewJobOpeningPage.isUnsavedChangesWarningDisplayed();
}
@Then("the system displays an error message indicating the location is invalid")
public void theSystemDisplaysAnErrorMessageIndicatingTheLocationIsInvalid() {
createNewJobOpeningPage.isErrorMessageDisplayed("Location is invalid");
}
@Then("the new job opening should be created successfully")
public void theNewJobOpeningShouldBeCreatedSuccessfully() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@Then("the user should be redirected to the Job Openings listing page after each save")
public void theUserShouldBeRedirectedToTheJobOpeningsListingPageAfterEachSave() {
createNewJobOpeningPage.isOnJobOpeningsListingPage();
}

@Given("the user fills in the end date {string}")
public void the_user_fills_in_the_end_date(String endDate) {
createNewJobOpeningPage.fillInEndDate(endDate);
}
@Then("the user should be redirected to the job openings listing page")
public void the_user_should_be_redirected_to_the_job_openings_listing_page() {
createNewJobOpeningPage.isJobOpeningsListingPageDisplayed();
}
@Then("the job opening page is displayed with an add job opening button visible")
public void the_job_opening_page_is_displayed_with_an_add_job_opening_button_visible() {
createNewJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("the user clicks the save button")
public void the_user_clicks_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@When("the user quickly clicks add job opening again")
public void the_user_quickly_clicks_add_job_opening_again() {
createNewJobOpeningPage.clickAddJobOpeningButton();
}
@Given("the user fills in the job description field with {string}")
public void the_user_fills_in_the_job_description_field_with(String jobDescription) {
createNewJobOpeningPage.fillInJobDescription(jobDescription);
}
@Given("the user fills in the job title with {string}")
public void the_user_fills_in_the_job_title_with(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@Given("i fill in the description with {string}")
public void i_fill_in_the_description_with(String description) {
createNewJobOpeningPage.fillInDescription(description);
}
@When("the user clicks the apply filters button")
public void the_user_clicks_the_apply_filters_button() {
createNewJobOpeningPage.clickApplyFiltersButton();
}
@Given("the user fills in the location with {string}")
public void the_user_fills_in_the_location_with(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@When("i clickElement the save button")
public void i_click_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@Given("the user fills in the job description {string}")
public void the_user_fills_in_the_job_description(String jobDescription) {
createNewJobOpeningPage.fillInJobDescription(jobDescription);
}
@Given("the user fills in the location {string}")
public void the_user_fills_in_the_location(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@Given("the user fills in the company with {string}")
public void the_user_fills_in_the_company_with(String company) {
createNewJobOpeningPage.fillInCompany(company);
}
@When("the user clicks on the job openings module from the main menu")
public void the_user_clicks_on_the_job_openings_module_from_the_main_menu() {
createNewJobOpeningPage.clickJobOpeningsModule();
}
@Given("the user fills in the location as {string}")
public void the_user_fills_in_the_location_as(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@When("the user clicks the cancel button on the create new job opening form")
public void the_user_clicks_the_cancel_button_on_the_create_new_job_opening_form() {
createNewJobOpeningPage.clickCancelButton();
}
@Then("the user is redirected back to the job openings listing page")
public void the_user_is_redirected_back_to_the_job_openings_listing_page() {
createNewJobOpeningPage.isJobOpeningsListingPageDisplayed();
}
@Then("the job opening details are displayed correctly")
public void the_job_opening_details_are_displayed_correctly() {
createNewJobOpeningPage.areJobOpeningDetailsDisplayedCorrectly();
}
@Given("i fill in the company name with {string}")
public void i_fill_in_the_company_name_with(String companyName) {
createNewJobOpeningPage.fillInCompanyName(companyName);
}
@Then("all fields match the data entered during creation")
public void all_fields_match_the_data_entered_during_creation() {
createNewJobOpeningPage.doFieldsMatchDataEntered();
}
@Given("the user fills in the start date {string}")
public void the_user_fills_in_the_start_date(String startDate) {
createNewJobOpeningPage.fillInStartDate(startDate);
}
@Given("i leave the optional fields empty")
public void i_leave_the_optional_fields_empty() {
createNewJobOpeningPage.leaveOptionalFieldsEmpty();
}
@When("the user selects a department from the filter dropdown")
public void the_user_selects_a_department_from_the_filter_dropdown() {
createNewJobOpeningPage.selectDepartmentFromFilter();
}
@Then("both job openings should be displayed in the listing")
public void both_job_openings_should_be_displayed_in_the_listing() {
createNewJobOpeningPage.areBothJobOpeningsDisplayed();
}
@Then("both job openings should be created successfully")
public void both_job_openings_should_be_created_successfully() {
createNewJobOpeningPage.areBothJobOpeningsCreatedSuccessfully();
}
@When("the user attempts to navigate to another module")
public void the_user_attempts_to_navigate_to_another_module() {
createNewJobOpeningPage.navigateToAnotherModule();
}
@Given("the user fills in the salary as {string}")
public void the_user_fills_in_the_salary_as(String salary) {
createNewJobOpeningPage.fillInSalary(salary);
}
@Given("i select {string} from the dropdown")
public void i_select_from_the_dropdown(String option) {
createNewJobOpeningPage.selectFromDropdown(option);
}
@When("the user clicks save")
public void the_user_clicks_save() {
createNewJobOpeningPage.clickSaveButton();
}
@Given("i fill in the salary with {string}")
public void i_fill_in_the_salary_with(String salary) {
createNewJobOpeningPage.fillInSalary(salary);
}
@Then("the newly created job opening should be displayed in the listing")
public void the_newly_created_job_opening_should_be_displayed_in_the_listing() {
createNewJobOpeningPage.isNewlyCreatedJobOpeningDisplayed();
}
@Given("the user fills in the experience required {string}")
public void the_user_fills_in_the_experience_required(String experience) {
createNewJobOpeningPage.fillInExperienceRequired(experience);
}
@Given("the user fills in the job title as {string}")
public void the_user_fills_in_the_job_title_as(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@Given("the user fills in the description as {string}")
public void the_user_fills_in_the_description_as(String description) {
createNewJobOpeningPage.fillInDescription(description);
}
@Given("the user fills in the job title {string}")
public void the_user_fills_in_the_job_title(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@Given("i fill in the location with {string}")
public void i_fill_in_the_location_with(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@Given("the user fills in other required fields with the maximum allowed characters")
public void the_user_fills_in_other_required_fields_with_the_maximum_allowed_characters() {
createNewJobOpeningPage.fillInOtherRequiredFieldsWithMaxCharacters();
}
@Given("i enter {string}")
public void i_enter(String input) {
createNewJobOpeningPage.enterInput(input);
}
@When("the user clicks the edit button")
public void the_user_clicks_the_edit_button() {
createNewJobOpeningPage.clickEditButton();
}
@Given("the user fills in other required fields with valid data")
public void the_user_fills_in_other_required_fields_with_valid_data() {
createNewJobOpeningPage.fillInOtherRequiredFieldsWithValidData();
}
@Given("the user fills in the salary {string}")
public void the_user_fills_in_the_salary(String salary) {
createNewJobOpeningPage.fillInSalary(salary);
}
@Given("the user fills in the job type {string}")
public void the_user_fills_in_the_job_type(String jobType) {
createNewJobOpeningPage.fillInJobType(jobType);
}
@Then("the newly created job opening should be displayed in the list")
public void the_newly_created_job_opening_should_be_displayed_in_the_list() {
createNewJobOpeningPage.isNewlyCreatedJobOpeningDisplayedInList();
}
@Given("the user fills in the job description field with the maximum allowed characters")
public void the_user_fills_in_the_job_description_field_with_the_maximum_allowed_characters() {
createNewJobOpeningPage.fillInJobDescriptionWithMaxCharacters();
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createNewJobOpeningPage.clickAddJobOpeningButton();
}
@Then("the user remains on the create new job opening form until they confirm to leave")
public void the_user_remains_on_the_create_new_job_opening_form_until_they_confirm_to_leave() {
createNewJobOpeningPage.isOnCreateNewJobOpeningForm();
}
}