Feature: DataTable Ornek

  Scenario: User list
    When Write a username "berk"
    And Write username and password "berk" and "1234"
    And Write a username as DataTable
        | berk |
        | doga |
        | yuksel |

    And Write a username and password as DataTable
      | berk | 1234 |
      | doga | 2345 |
      | yuksel | 3456 |

