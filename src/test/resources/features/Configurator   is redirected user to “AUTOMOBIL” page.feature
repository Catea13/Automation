Feature: Configurator is redirected user to “AUTOMOBIL” page
  Scenario: Configurator is redirected user to “AUTOMOBIL” page
    When Click "Configurator" button top
    Then Click "button"
    Then Content "АВТОМОБИЛЬ KIA АВТОМОБИЛЬ KIA" visible

