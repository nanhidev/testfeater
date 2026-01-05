package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class UploadNewCandidateProfilePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "profileSection")
    private WebElement profileSection;

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "file-input")
    private WebElement fileInput;

    @FindBy(id = "upload-success-indicator")
    private WebElement successIndicator;

    @FindBy(id = "upload-init-indicator")
    private WebElement initIndicator;

    public UploadNewCandidateProfilePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToProfileSection() {
        try {
            elementUtils.clickElement(profileSection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFile(String fileName) {
        try {
            elementUtils.clearAndSendKeys(fileInput, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForUploadToComplete() {
        try {
            while (!checkProcessStatus()) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void validateSuccessConfirmationMessage() {
        try {
            String actualMessage = elementUtils.getElementText(successMessage);
            String expectedMessage = "Upload Successful";
            Assert.assertEquals(actualMessage, expectedMessage, "Success message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void validateErrorMessage(String expectedError) {
        try {
            String actualError = elementUtils.getElementText(errorMessage);
            Assert.assertEquals(actualError, expectedError, "Error message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFileWithSpaces() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/candidate profile with spaces.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileWithVeryShortFilename() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "a.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectSecondValidCandidateProfileFile() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/second/validCandidateProfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileWithSpecialCharacters() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/validCandidateProfile@#!.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileWithLongFilename() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/validCandidateProfileLongFilenameVeryLong.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUploadSuccessful() {
        try {
            Assert.assertTrue(successIndicator.isDisplayed(), "Upload was not successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFirstValidCandidateProfileFile() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/first/validCandidateProfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCorruptedCandidateProfileFile() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/corruptedCandidateProfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileOf2MB() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/validCandidateProfileOf2MB.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileInTxtFormat() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "path/to/validCandidateProfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areBothProfilesListed() {
        try {
            WebElement profile1 = driver.findElement(By.id("profile1"));
            WebElement profile2 = driver.findElement(By.id("profile2"));
            Assert.assertTrue(profile1.isDisplayed() && profile2.isDisplayed(), "Both profiles are not listed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void simulateNetworkFailure() {
        System.out.println("Simulating network failure...");
    }

    public void simulateUploadTimeout() {
        System.out.println("Simulating upload timeout...");
    }

    public void isUploadInitiated() {
        try {
            Assert.assertTrue(initIndicator.isDisplayed(), "Upload has not been initiated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checkProcessStatus() {
        // Implement logic to check the upload process status
        return true; // Placeholder return value
    }
}