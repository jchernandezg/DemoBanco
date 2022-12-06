@login
Feature: Ingreso de usuarios en la pagina web de ParaBank
  Como usuario registrado de la webapp del banco
  Deseo ingresar a la aplicación
  para poder disfrutar de sus servicios

  @loginOk
  Scenario: Login satisfactorio de usuario registrado
    Given El usuario registrado accede a la pagina de login
    When ingresa sus credenciales
    Then deberia ver el mensaje de ingreso