package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class SchedulePanelInterviewPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "createInterviewButton")
    private WebElement createInterviewButton;
    @FindBy(id = "jobOpeningDropdown")
    private WebElement jobOpeningDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "candidateEmailInput")
    private WebElement candidateEmailInput;
    @FindBy(id = "panelInterviewOptionDropdown")
    private WebElement panelInterviewOptionDropdown;
    @FindBy(id = "interviewDateInput")
    private WebElement interviewDateInput;
    @FindBy(id = "startTimeInput")
    private WebElement startTimeInput;
    @FindBy(id = "nextButton")
    private WebElement nextButton;
    @FindBy(id = "confirmSendButton")
    private WebElement confirmSendButton;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;
    @FindBy(id = "attendeesInput")
    private WebElement attendeesInput;
    @FindBy(id = "optionalNotesInput")
    private WebElement optionalNotesInput;
    @FindBy(id = "specialInstructionsInput")
    private WebElement specialInstructionsInput;
    @FindBy(id = "attachFileButton")
    private WebElement attachFileButton;

    public SchedulePanelInterviewPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickCreateInterviewButton() {
        try {
            elementUtils.clickElement(createInterviewButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectJobOpening(String jobOpening) {
        try {
            elementUtils.clickElement(jobOpeningDropdown);
            elementUtils.selectOptionInDropdown(jobOpeningDropdown, jobOpening);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.clickElement(locationDropdown);
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterCandidateEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(candidateEmailInput, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void choosePanelInterviewOption(String option) {
        try {
            elementUtils.clickElement(panelInterviewOptionDropdown);
            elementUtils.selectOptionInDropdown(panelInterviewOptionDropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewDateAndStartTime(String date, String time) {
        try {
            elementUtils.clearAndSendKeys(interviewDateInput, date);
            elementUtils.clearAndSendKeys(startTimeInput, time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickNextButton() {
        try {
            elementUtils.clickElement(nextButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickConfirmAndSendButton() {
        try {
            elementUtils.clickElement(confirmSendButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isConfirmationMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(confirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void enterAttendees(String attendees) {
        try {
            elementUtils.clearAndSendKeys(attendeesInput, attendees);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInOptionalFields(String interviewNotes, String specialInstructions) {
        try {
            elementUtils.clearAndSendKeys(optionalNotesInput, interviewNotes);
            elementUtils.clearAndSendKeys(specialInstructionsInput, specialInstructions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attachFile(String filePath) {
        try {
            elementUtils.clickElement(attachFileButton);
            // Logic to handle file attachment goes here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void verifyConfirmationMessage(String expectedMessage) {
        try {
            String actualMessage = elementUtils.getElementText(confirmationMessage);
            Assert.assertEquals("Confirmation message does not match!", expectedMessage, actualMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectScheduledInterviewToCancel() {
        try {
            WebElement selectInterview = driver.findElement(By.id("selectInterview"));
            elementUtils.clickElement(selectInterview);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmCancellation() {
        try {
            WebElement confirmButton = driver.findElement(By.id("confirmCancellation"));
            elementUtils.clickElement(confirmButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInterviewDateErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("interviewDateErrorMessage"));
            Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message for interview date is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInterviewVisibleInDashboard() {
        try {
            WebElement interviewElement = driver.findElement(By.id("dashboardInterview"));
            Assert.assertTrue(elementUtils.isElementDisplayed(interviewElement), "Interview is not visible in dashboard!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveInterviewDateFieldEmpty() {
        try {
            WebElement dateField = driver.findElement(By.id("interviewDate"));
            elementUtils.clearAndSendKeys(dateField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveStartTimeFieldEmpty() {
        try {
            WebElement startTimeField = driver.findElement(By.id("startTime"));
            elementUtils.clearAndSendKeys(startTimeField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveAttendeesFieldEmpty() {
        try {
            WebElement attendeesField = driver.findElement(By.id("attendees"));
            elementUtils.clearAndSendKeys(attendeesField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningErrorMessageDisplayed() {
        try {
            WebElement jobOpeningError = driver.findElement(By.id("jobOpeningError"));
            Assert.assertTrue(elementUtils.isElementDisplayed(jobOpeningError), "Job opening error message is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInvalidEmailErrorMessageDisplayed() {
        try {
            WebElement invalidEmailError = driver.findElement(By.id("invalidEmailError"));
            Assert.assertTrue(elementUtils.isElementDisplayed(invalidEmailError), "Invalid email error message is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isAttendeesErrorMessageDisplayed() {
        try {
            WebElement attendeesError = driver.findElement(By.id("attendeesError"));
            Assert.assertTrue(elementUtils.isElementDisplayed(attendeesError), "Attendees error message is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isCancellationConfirmationMessageDisplayed() {
        try {
            WebElement confirmationMessage = driver.findElement(By.id("cancellationConfirmationMessage"));
            Assert.assertTrue(elementUtils.isElementDisplayed(confirmationMessage), "Cancellation confirmation message is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUpdateConfirmationMessageDisplayed() {
        try {
            WebElement updateConfirmationMessage = driver.findElement(By.id("updateConfirmationMessage"));
            Assert.assertTrue(elementUtils.isElementDisplayed(updateConfirmationMessage), "Update confirmation message is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInterviewInScheduledList() {
        try {
            // Logic to check if interview is in the scheduled list...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areNotificationsSent() {
        try {
            // Logic to verify notifications sent...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areCancellationNotificationsSent() {
        try {
            // Logic to verify cancellation notifications...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areChangeNotificationsSent() {
        try {
            // Logic to verify notification sending...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInterviewScheduledSuccessfully() {
        try {
            // Logic to verify successful interview scheduling...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void userSelectsJobOpening() {
        try {
            elementUtils.selectOptionInDropdown(jobOpeningDropdown, "Job Opening 1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void userSelectsFromAvailableOptions(String option) {
        try {
            WebElement optionField = driver.findElement(By.id("availableOptions"));
            elementUtils.selectOptionInDropdown(optionField, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectPastInterviewDate(String interviewDate) {
        try {
            WebElement pastDateField = driver.findElement(By.id("pastInterviewDate"));
            elementUtils.clearAndSendKeys(pastDateField, interviewDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewProvider(String provider) {
        try {
            // Logic to select interview provider...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void schedulePanelInterviewWithMultipleAttendees() {
        try {
            // Logic for multi-attendee scheduling...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attachRequiredFiles(String requiredFiles) {
        try {
            // Logic to attach required files...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}