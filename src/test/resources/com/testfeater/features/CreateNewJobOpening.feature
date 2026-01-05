
@feature_create_new_job_opening
Feature: CreateNewJobOpening

  Background: 
    Given the user is logged into the application

  @job_opening_navigation
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Job Openings" module from the main menu
    Then the Job Opening page is displayed with an "Add Job Opening" button visible

    Examples:
      |   |
      |   |

@display_job_opening_form
Scenario Outline: Create New Job Opening
  When the user clicks on the "Add Job Opening" button
  Then the Create New Job Opening form is displayed
  And all required fields are present

Examples:
  |  |
  |  |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create Job Opening Page
    When I fill in the Job Title field with "<job_title>"
    And I fill in the Job Description field with "<job_description>"
    And I select "<department>" from the Department dropdown
    And I fill in the Location field with "<location>"
    And I select "<employment_type>" as the Employment Type
    And I click the "Save" button
    Then the new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title         | job_description                                                                                  | department | location | employment_type |
      | Software Engineer  | Develop and maintain software applications, ensuring high performance and responsiveness.      | Engineering | New York | Full-time       |

  @required-fields-validation
  Scenario Outline: Create New Job Opening with Empty Required Fields
    When the user leaves all required fields empty
    And the user clicks the Save button
    Then the system displays error messages for each required field that is empty
    And the user remains on the Create New Job Opening form

    Examples:
      |  |

  @create-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create Job Opening Page
    When I fill in the Job Title field with "<job_title>"
    And I fill in the Job Description field with "<job_description>"
    And I select "<department>" from the dropdown
    And I leave the optional fields empty
    And I click the "Save" button
    Then the new job opening should be created successfully
    And the user should be redirected to the Job Openings listing page
    And the newly created job opening should be displayed in the listing

    Examples:
      | job_title          | job_description                                                           | department  |
      | Software Engineer   | Develop and maintain software applications, ensuring high performance and responsiveness. | Engineering  |

  @cancel_job_opening
  Scenario Outline: Create New Job Opening and Cancel
    When the user clicks the "Cancel" button on the Create New Job Opening form
    Then the user is redirected back to the Job Openings listing page
    And no new job opening is created

  Examples:
    |   |
    |   |

  @edit_job_opening
  Scenario Outline: Create New Job Opening
    When the user clicks on the newly created job opening
    And the user clicks the "Edit" button
    And the user modifies the Job Description field
    And the user clicks the "Save" button
    Then the job opening should be updated successfully
    And the user should be redirected to the Job Openings listing page
    And the updated job opening details should be displayed in the listing

    Examples:
      | Job Description      |
      | Update with new info |

  @view_job_openings
  Scenario Outline: Create New Job Opening
    Given the user clicks on the "Job Openings" module
    When the user observes the list of job openings
    Then the newly created job opening should be displayed in the list
    And the job opening details should be correct and match the entered data

    Examples:
      | job_title          | job_description                                   |
      | Software Engineer   | Responsible for software development and maintenance. |

  @filter-job-openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the filter options
    And the user selects a Department from the filter dropdown
    And the user clicks the Apply Filters button
    Then job openings are filtered based on the selected criteria
    And only relevant job openings are displayed in the listing

    Examples:
      | Department   |
      | Sales        |
      | Marketing    |
      | Engineering   |

  @verify_job_opening_details
  Scenario Outline: Create New Job Opening
    When the user clicks on the newly created job opening
    Then the job opening details are displayed correctly
    And all fields match the data entered during creation

  Examples:
    | job_title         | job_description       |
    | Software Engineer  | Develop and maintain software applications. |

  @invalid-job-title
  Scenario Outline: Create New Job Opening with Invalid Job Title
    Given the user enters "<job_title>" as the Job Title
    And the user enters "<company_name>" as the Company Name
    And the user enters "<location>" as the Location
    And the user enters "<description>" as the Job Description
    And the user enters "<salary>" as the Salary
    When the user clicks the Save button
    Then the system displays an error message indicating the Job Title is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | job_title | company_name      | location       | description      | salary     |
      | ab        | validCompanyName   | validLocation   | validDescription  | validSalary |

  @invalid-job_description
  Scenario Outline: Create New Job Opening with Invalid Job Description
    When I enter "<job_description>"
    And I enter "<title>"
    And I enter "<location>"
    And I enter "<salary>"
    And I select "<employment_type>"
    And I click the "Save" button
    Then the system displays an error message indicating the Job Description is too long
    And the user remains on the Create New Job Opening form

    Examples:
      | job_description | title              | location  | salary | employment_type |
      | a * 100         | Software Engineer   | New York  | 80000  | Full-time       |

  @invalid-department-selection
  Scenario Outline: Create New Job Opening with Invalid Department
    Given the user selects "<department>" from the Department dropdown
    And the user fills in the Job Title as "<job_title>"
    And the user fills in the Description as "<description>"
    And the user fills in the Location as "<location>"
    And the user fills in the Salary as "<salary>"
    When the user clicks the "Save" button
    Then the system displays an error message indicating the selected Department is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | department          | job_title        | description       | location          | salary        |
      | Invalid Department  | Valid Job Title  | Valid Description  | Valid Location     | Valid Salary  |

  @job-title-exists
  Scenario Outline: Create New Job Opening
    When I enter "<job_title>"
    And I fill in the Company Name with "<company_name>"
    And I fill in the Location with "<location>"
    And I fill in the Description with "<description>"
    And I fill in the Salary with "<salary>"
    And I click the "Save" button
    Then the system displays an error message indicating the Job Title already exists
    And the user remains on the Create New Job Opening form

    Examples:
      | job_title          | company_name         | location   | description | salary |
      | Software Engineer   | Tech Solutions Inc.  | New York   | a * 100     | 80000  |

  @invalid-data-input
  Scenario Outline: Create New Job Opening with Invalid Data
    Given the user enters "<salary>"
    And the user fills in the job title with "<job_title>"
    And the user fills in the location with "<location>"
    And the user fills in the description with "<description>"
    And the user fills in the company with "<company>"
    When the user clicks the Save button
    Then the system displays an error message indicating invalid data type
    And the user remains on the Create New Job Opening form

    Examples:
      | salary | job_title          | location   | description | company          |
      | abc    | Software Engineer   | New York   | a * 100     | Tech Innovations  |

  @unsaved_changes_warning
  Scenario Outline: Create New Job Opening
    Given the user makes changes to the form without saving
    When the user attempts to navigate to another module
    Then the system displays a warning message about unsaved changes
    And the user remains on the Create New Job Opening form until they confirm to leave

    Examples:
      | action                   |
      | navigate to Job Openings |

  @invalid-location
  Scenario Outline: Create New Job Opening with Invalid Location
    When I enter "<location>"
    And I enter "<title>"
    And I enter "<description>"
    And I enter "<company>"
    And I enter "<salary>"
    And I click the "Save" button
    Then the system displays an error message indicating the location is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | location      | title              | description                        | company                | salary  |
      | !@#$%^&*()    | Software Engineer   | Develop and maintain software applications. | Tech Innovations Inc. | 80000   |

  @max_characters_job_opening
  Scenario Outline: Create New Job Opening
    Given the user fills in the Job Title field with the maximum allowed characters
    And the user fills in the Job Description field with the maximum allowed characters
    And the user selects "<department>" from the dropdown
    And the user fills in other required fields with the maximum allowed characters
    When the user clicks the "Save" button
    Then the new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | department   |
      | Engineering  |

  @create-job-opening
  Scenario Outline: Create New Job Opening
    Given the user clicks "Add Job Opening"
    When the user fills in the job title "<job_title>"
    And the user fills in the job type "<job_type>"
    And the user fills in the experience required "<experience_required>"
    And the user fills in the salary "<salary>"
    And the user fills in the job description "<job_description>"
    And the user fills in the location "<location>"
    And the user fills in the start date "<start_date>"
    And the user fills in the end date "<end_date>"
    And the user clicks "Save"
    And the user quickly clicks "Add Job Opening" again
    When the user fills in the job title "<job_title2>"
    And the user fills in the job type "<job_type2>"
    And the user fills in the experience required "<experience_required2>"
    And the user fills in the salary "<salary2>"
    And the user fills in the job description "<job_description2>"
    And the user fills in the location "<location2>"
    And the user fills in the start date "<start_date2>"
    And the user fills in the end date "<end_date2>"
    And the user clicks "Save"
    Then both job openings should be created successfully
    And the user should be redirected to the Job Openings listing page after each save
    And both job openings should be displayed in the listing

    Examples:
      | job_title          | job_type   | experience_required | salary  | job_description                                | location   | start_date  | end_date    | job_title2         | job_type2  | experience_required2 | salary2 | job_description2                       | location2  | start_date2 | end_date2   |
      | Software Engineer  | Full-time  | 5 years            | 100000  | Develop and maintain software applications.   | New York   | 2023-10-01  | 2023-10-31  | Software Engineer  | Full-time  | 5 years            | 100000  | Develop and maintain software applications. | New York   | 2023-10-01  | 2023-10-31  |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user fills in the Job Title field with "<jobTitle>"
    And the user fills in the Job Description field with "<jobDescription>"
    And the user selects "<department>" from the dropdown
    And the user fills in other required fields with valid data
    When the user clicks the "Save" button
    Then the new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | jobTitle                        | jobDescription                                                                                 | department  |
      | Software Engineer @ Tech Co.    | We are looking for a Software Engineer who can develop and maintain applications ensuring high performance and responsiveness. | Engineering  |
