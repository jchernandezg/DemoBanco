@cuenta
Feature: Administracion de las cuentas en la pagina web de ParaBank
  Como usuario registrado de la webapp del banco
  Deseo administrar mis cuentas
  para poder disfrutar de sus servicios

  Background:
    Given El usuario registrado accede a la pagina de login
    And ingresa sus credenciales

  @abrircuenta
  Scenario: Apertura de cuenta satisfactoria
    Given el usuario accede a la opcion de crear cuenta
    When ingresa los datos de la nueva cuenta
    Then deberia ver la nueva cuenta creada