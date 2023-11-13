#language: en

Feature: User creation
  @d
  Scenario Outline: Create a new user
    Given that the user enters the Utest page to register
    When he registers his personal information
      | name | lastName | email | day | month | year |
      | <name> | <lastName> | <email> | <day> | <month> | <year> |
    And registers his location
      | city | zip | country |
      | <city> | <zip> | <country> |
    And register their devices
      | computer | version | language | mobile | model | os |
      | <computer> | <version> | <language> | <mobile> | <model> | <os> |
    And register his password
      | password |
      | <password> |
    Then he verifies the registration of the new user
    Examples:
      | name | lastName | email | day | month | year | password | city   | zip   | country | computer | version | language | mobile  | model | os |
      | Danier | Mena | danm2@test.com | 8   | June | 1990 | Prueba6789 | Madrid | 28053 | Spain   | Windows  | 10 | Spanish  | Xiaomi | Redmi 9T | Android 11 |