
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

  Background: 
    Given the user is on the Profile section

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message

  Examples:
    | file_type |
    | PDF       |
    | DOCX      |

  @upload_first_candidate_profile
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload (cloud) icon
    And the recruiter browses and selects the first valid candidate profile file
    And the recruiter clicks on the Upload button
    Then the recruiter waits for the upload to complete and confirms success
    And the recruiter clicks on the upload (cloud) icon
    And the recruiter browses and selects the second valid candidate profile file
    And the recruiter clicks on the Upload button
    Then the recruiter waits for the upload to complete and confirms success
    And both profiles should be listed in the Profile Section

    Examples:
      | candidate_profile_file_1 | candidate_profile_file_2 |
      | profile1.pdf             | profile2.pdf             |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects a valid candidate profile file of 2MB
  And the recruiter clicks on the Upload button
  And the recruiter waits for the upload process to complete
  Then a success confirmation message is displayed to the user

  Examples:
    | title                       |
    | Upload New Candidate Profile |

@valid-long-filename-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file with a long filename
  And the user clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message is displayed to the user

  Examples:
    | file_name                                          |
    | Candidate_Profile_2023_John_Doe_Very_Long_Filename.pdf |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When I click on the upload icon
  And I browse and select a valid candidate profile file in .txt format
  And I click on the Upload button
  And I wait for the upload process to complete
  Then a success confirmation message is displayed to the user

Examples:
  | candidate_profile     |
  | valid_candidate.txt   |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with UTF-8 encoding
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | candidate_profile_file |
      | valid_candidate_profile |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with a .doc extension
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | <file>               |
    | valid_candidate.doc   |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with text in Spanish
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | valid_candidate_profile_file |
      | candidate_profile_spanish.txt |

@unsupported-file-upload
Scenario Outline: Upload New Candidate Profile with Unsupported File Type
  Given the user clicks on the upload (cloud) icon
  When the user browses and selects an unsupported file type <file_type>
  And the user clicks on the Upload button
  Then an error message is displayed indicating the file type is not supported
  And the upload process does not initiate

Examples:
  | file_type |
  | .exe      |

  @file_size_exceeded
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a file that exceeds the size limit
    And the user clicks on the Upload button
    Then an error message is displayed indicating the file exceeds the maximum size limit
    And the upload process does not initiate

    Examples:
      | file_size |
      | 6MB       |

@error-message-no-file-selected
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user does not select any file
  And the user clicks on the Upload button
  Then an error message is displayed indicating that no file was selected
  And the upload process does not initiate

  Examples:
    |  |
    |  |

  @network-failure
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload (cloud) icon
    When the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And a network failure occurs during the upload process
    Then an error message is displayed indicating a network failure occurred
    And the upload process does not complete successfully

    Examples:
      | valid_candidate_profile_file |
      | valid_profile.pdf            |

@timeout-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a valid candidate profile file
  And the user clicks the Upload button
  And the upload process times out
  Then an error message is displayed indicating the upload process timed out
  And the upload process does not complete successfully

  Examples:
    | No input data required |

  @corrupted-file-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a corrupted candidate profile file
    And the user clicks on the Upload button
    Then the user should see an error message indicating the file is corrupted and cannot be uploaded

    Examples:
      | corrupted_file     |
      | corrupted_file_1   |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file with special characters in the filename
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then a success confirmation message is displayed to the user

Examples:
  | filename                |
  | John_Doe@2023.pdf      |

  @upload_valid_candidate_profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with a very short filename
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | filename   |
    | A.pdf      |

@valid-file-upload
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects a valid candidate profile file with spaces in the filename
  And the recruiter clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message should be displayed to the recruiter

Examples:
  | filename                     |
  | John Doe Profile.pdf        |
