package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import com.utils.ElementUtils;

public class CreateNewJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "moduleDropdown") // Unique locator for module dropdown
    private WebElement moduleDropdown;
    @FindBy(id = "jobTitleField") // Unique locator for job title field
    private WebElement jobTitleField;
    @FindBy(id = "jobDescriptionField") // Unique locator for job description field
    private WebElement jobDescriptionField;
    @FindBy(id = "departmentDropdown") // Unique locator for department dropdown
    private WebElement departmentDropdown;
    @FindBy(id = "locationField") // Unique locator for location field
    private WebElement locationField;
    @FindBy(id = "employmentTypeDropdown") // Unique locator for employment type dropdown
    private WebElement employmentTypeDropdown;
    @FindBy(id = "saveButton") // Unique locator for save button
    private WebElement saveButton;
    @FindBy(id = "addJobOpeningButton") // Unique locator for add job opening button
    private WebElement addJobOpeningButton;
    @FindBy(id = "errorMessage") // Unique locator for error message
    private WebElement errorMessage;

    public CreateNewJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickModule(String module) {
        try {
            elementUtils.clickElement(moduleDropdown);
            elementUtils.selectOptionInDropdown(moduleDropdown, module);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillJobTitle(String jobTitle) {
        try {
            elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillJobDescription(String jobDescription) {
        try {
            elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDepartment(String department) {
        try {
            elementUtils.clickElement(departmentDropdown);
            elementUtils.selectOptionInDropdown(departmentDropdown, department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillLocation(String location) {
        try {
            elementUtils.clearAndSendKeys(locationField, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectEmploymentType(String employmentType) {
        try {
            elementUtils.clickElement(employmentTypeDropdown);
            elementUtils.selectOptionInDropdown(employmentTypeDropdown, employmentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isErrorMessageDisplayed(String expectedMessage) {
        try {
            String actualMessage = elementUtils.getElementText(errorMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFormDisplayed() {
        try {
            Assert.assertTrue("Create New Job Opening form is not displayed", elementUtils.isElementDisplayed(jobTitleField));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInJobDescription(String description) {
        try {
            elementUtils.clearAndSendKeys(jobDescriptionField, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInOtherRequiredFieldsWithMaxCharacters() {
        try {
            WebElement otherField1 = driver.findElement(By.id("field1"));
            WebElement otherField2 = driver.findElement(By.id("field2"));
            elementUtils.clearAndSendKeys(otherField1, "Max Character Value");
            elementUtils.clearAndSendKeys(otherField2, "Max Character Value");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInStartDate(String startDate) {
        try {
            WebElement startDateField = driver.findElement(By.id("startDate"));
            elementUtils.clearAndSendKeys(startDateField, startDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningDetailsCorrect(String expectedDetails) {
        try {
            WebElement detailsElement = driver.findElement(By.id("jobDetails"));
            String actualDetails = elementUtils.getElementText(detailsElement);
            Assert.assertEquals(actualDetails, expectedDetails, "Job opening details do not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFromDropdown(String dropdownId, String option) {
        try {
            WebElement dropdown = driver.findElement(By.id(dropdownId));
            elementUtils.selectOptionInDropdown(dropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInCompany(String companyName) {
        try {
            WebElement companyField = driver.findElement(By.id("companyName"));
            elementUtils.clearAndSendKeys(companyField, companyName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningsListingPageDisplayed() {
        try {
            WebElement pageElement = driver.findElement(By.id("jobOpeningsList"));
            boolean isDisplayed = elementUtils.isElementDisplayed(pageElement);
            Assert.assertTrue(isDisplayed, "Job openings listing page is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickButton(String buttonId) {
        try {
            WebElement button = driver.findElement(By.id(buttonId));
            elementUtils.clickElement(button);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areBothJobOpeningsCreatedSuccessfully(String opening1, String opening2) {
        try {
            WebElement openingElement1 = driver.findElement(By.xpath("//div[text()='" + opening1 + "']"));
            WebElement openingElement2 = driver.findElement(By.xpath("//div[text()='" + opening2 + "']"));
            Assert.assertTrue(elementUtils.isElementDisplayed(openingElement1), "Job opening 1 is not displayed!");
            Assert.assertTrue(elementUtils.isElementDisplayed(openingElement2), "Job opening 2 is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewJobOpeningsList() {
        try {
            WebElement viewListButton = driver.findElement(By.id("viewJobOpenings"));
            elementUtils.clickElement(viewListButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToCreateJobOpeningPage() {
        try {
            WebElement createJobOpeningButton = driver.findElement(By.id("createJobOpening"));
            elementUtils.clickElement(createJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickJobOpeningsModule() {
        try {
            WebElement jobOpeningsModule = driver.findElement(By.id("jobOpeningsModule"));
            elementUtils.clickElement(jobOpeningsModule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveRequiredFieldsEmpty() {
        try {
            WebElement submitButton = driver.findElement(By.id("submitButton"));
            elementUtils.clickElement(submitButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningDisplayed(String jobTitle) {
        try {
            WebElement jobOpeningElement = driver.findElement(By.xpath("//div[text()='" + jobTitle + "']"));
            boolean isDisplayed = elementUtils.isElementDisplayed(jobOpeningElement);
            Assert.assertTrue(isDisplayed, "Job opening is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}