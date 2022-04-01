#Autor: John Villamil
Feature: I'm test user for Utest
  I will register on Utest
  to access as Utest's user
  Scenario: User successfully create
    Given user in the homepage
    When user create and account filling all fields
    | strFirstName | strLastName | strEmail  | strBirthmount | strBirthday | strBirthyear | strZIP | strPassword   |
    | TuNombre     | TuApellido  | tuCorreo  | tuMes         | tuDia       | tuAnio       | tuZIP  | tuContrasenia |
    Then user sees its username