Feature: DataTable Functionality

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    Scenario: Create Country

      And Click on the element in LeftNav
          | setup |
          | parameters |
          | countries |

      And Click on the element in DialogContent
        | addButton |

      And User sending the keys in DialogContent
        | nameInput | berkUlk1 |
        | codeInput | i1234 |

      And Click on the element in DialogContent
        | saveButton |

      Then Success message should be displayed



  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup |
      | parameters |
      | nationalities |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in DialogContent
      | nameInput | berkUlk1 |


    And Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed

