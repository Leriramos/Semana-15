Feature: Login

  Scenario: Login com sucesso
    Given Usuário está na página de login
    When Usuário preenche o campo de usuário com "tomsmith"
    And Usuário preenche o campo de senha com "SuperSecretPassword!"
    And Usuário clica no botão de login
    Then Usuário deve ver a mensagem "You logged into a secure area!"

  Scenario: Login com senha em branco
    Given Usuário está na página de login
    When Usuário preenche o campo de usuário com "tomsmith"
    And Usuário deixa o campo de senha em branco
    And Usuário clica no botão de login
    Then Usuário deve ver a mensagem "Your password is invalid!"
