Feature: I'm test user for Utest
  I will register on Utest
  to access as Utest's user
  Scenario: User successfully create
    Given user in the homepage
    When user create and account filling all fields
    Then user sees its username