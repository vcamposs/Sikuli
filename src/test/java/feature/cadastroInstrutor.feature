Feature: Teste de inclusão de instrutor

  Scenario Outline: O usuário deverá incluir um instrutor no sistema SCA
    Given que o usuário está logado no sistema SCA com o user "<user>" e senha "<senha>"
    When ele acessa a tela de inclusão de instrutor
    And inclui nome "<nome>", licenca "<licenca>", telefone "<telefone>", celular "<celular>", email "<email>" e nota "<nota>"
    Then as informações são salvas e o sistema é fechado

    Examples:
      | user | senha | nome    | licenca | telefone   | celular    | email         | nota           |
      | SCA  | SCA   | Victor  | 367845  | 9809878787 | 9873656356 | email@ola.com | teste cucumber |


