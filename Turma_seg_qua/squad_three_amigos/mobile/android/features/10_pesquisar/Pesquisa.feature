Feature:

Functionality: Pesquisa do WhatsApp

  Scenario Outline: Validar pesquisa da pagina principal do WhatsApp

    Given que tenho o whatsApp instalado no aparelho mobile

    When clico na "lupa de pesquisa"
    And digito <buscar>

    Then é exibido na tela <resultado> relacionado

    Examples:
      | buscar   | resultado |
      | "Yonara" | "Yonara"  |


