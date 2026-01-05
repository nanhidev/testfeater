
@feature_user_login
Feature: LoginScreenforRecruiters

Background: 
  Given the user is on the Login Screen

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click on the 'Show Password' option
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard should load without errors

  Examples:
    | email_id             | password           |
    | recruiter@example.com | SecurePassword123  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  Then the Login button should be enabled

  Examples:
    | email_id            | password          |
    | krishna@gmail.com   | ValidPassword123  |

@password_visibility_toggle
Scenario Outline: Login Screen for Recruiters
  When I enter a valid password "<password>" in the Password field
  And I click on the 'Show Password' option
  Then the password should be visible
  And I click on the 'Hide Password' option
  Then the password should be hidden

  Examples:
    | password          |
    | ValidPassword123! |

  @feature_user_login
  @failed_login_retry
  Scenario Outline: Login Screen for Recruiters
    Given the user is on the Login Screen
    When I enter "<invalid_email>"
    And I enter "<invalid_password>"
    And I click the Login button
    Then the error message 'Incorrect email ID or password.' should be displayed
    And the user should remain on the login screen
    When I enter "<valid_email>"
    And I enter "<valid_password>"
    And I click the Login button again
    Then the user should be redirected to the dashboard

    Examples:
      | invalid_email        | invalid_password | valid_email               | valid_password     |
      | invalid_email@domain | short            | valid_email@example.com   | ValidPassword123   |

@valid-login-chrome
Scenario Outline: Login Screen for Recruiters
  When I open the application in "<browser>"
  And I enter a valid email ID "<email>" in the Email ID field
  And I enter a valid password "<password>" in the Password field
  And I click the Login button
  Then the user is redirected to the dashboard in "<browser>"

  Examples:
    | browser  | email                | password           |
    | Chrome   | krishna@gmail.com    | ValidPassword123   |
    | Firefox  | krishna@gmail.com    | ValidPassword123   |
    | Safari   | krishna@gmail.com    | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<emailID>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | emailID                | password           |
    | user123@domain.com    | validPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email              | password           |
    | USER@DOMAIN.COM    | ValidPassword123   |
    | user@domain.com    | ValidPassword123   |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And the recruiter clicks the Login button
  Then the recruiter should be redirected to the dashboard

  Examples:
    | email_id              | password   |
    | user123@domain.com    | Passw0rd!  |

@invalid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Incorrect email ID or password.' is displayed
  And the user remains on the login screen

  Examples:
    | email_id             | password |
    | invalid_email@domain | short    |

  @disabled_login_button
  Scenario Outline: Login Screen for Recruiters
    Given the user leaves the Email ID field empty
    And the user enters "<password>" in the Password field
    Then the Login button should be disabled

    Examples:
      | password            |
      | valid_password123   |

@empty_email_id
Scenario Outline: Login Screen for Recruiters
  When I leave the Email ID field empty
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Please enter your email ID.' is displayed
  And the user remains on the login screen

  Examples:
    | password       |
    | valid_password |

@error_message_empty_password
Scenario Outline: Login Screen for Recruiters
  Given I enter "<email_id>"
  And I leave the Password field empty
  When I click the Login button
  Then an error message 'Please enter your password.' is displayed
  And the user remains on the login screen

  Examples:
    | email_id           |
    | krishna@gmail.com  |

@invalid-email-format
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Please enter a valid email ID.' is displayed
  And the user remains on the login screen

  Examples:
    | email          | password          |
    | user@domain    | validPassword123   |

@short_password_error
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the user should see the error message 'Password must be at least 6 characters long.'
  And the user remains on the Login Screen

  Examples:
    | email               | password |
    | krishna@gmail.com   | 123      |

@invalid_email_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And the user clicks the Login button
  Then an error message 'Please enter a valid email ID.' is displayed
  And the user remains on the login screen

  Examples:
    | email_id           | password            |
    | user@domain#.com   | ValidPassword123    |

  @error_message_for_space_input
  Scenario Outline: Login Screen for Recruiters
    Given I enter "<email>"
    And I enter "<password>"
    And I click the Login button
    Then an error message 'Please enter your email ID.' is displayed
    And the user remains on the login screen

    Examples:
      | email | password |
      | " "   | " "     |

@max_character_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id                                                                                 | password                                                                                 |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And the user clicks the Login button
  Then the user is redirected to the dashboard

  Examples:
    | email_id           | password        |
    | krishna@gmail.com  | !@#$%^&*()      |

@successful-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email               | password        |
    | " user@domain.com " | " password123 " |
