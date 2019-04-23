Feature: Exanmen Julio Daviu Pagina Puma

  Scenario: Once page load puma must select a shoes

    Given Load 'Puma'

    And click 'Hombre'

    And Find 'Searh'

    And  fill 'Data'

    And chose 'Sport'

    And  get 'Talla'

    And select 'Talla'

    And quantity is "Cantidad: 1" on 'bag'

    Then price is "$1,329"

    And final price is "$1,428"

