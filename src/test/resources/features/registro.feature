@registro
Feature: Registro de usuarios en la pagina web de ParaBank
  Como usuario nuevo de la webapp del banco
  Deseo registrarme en la aplicación
  para poder disfrutar de sus servicios

  @registroOk
  Scenario Outline: Registro de usuario nuevo
    Given El usuario ingresa a la pagina del banco
    When registra los datos en el formulario
      |nombre|apellido|direccion|ciudad|estado|codPostal|documento|usuario|password|
      |<nombre>|<apellido>|<direccion>|<ciudad>|<estado>|<codPostal>|<documento>|<usuario>|<password>|
    Then deberia ver el mensaje de bienvenida
    Examples:
      |nombre |apellido |direccion          |ciudad   |estado     |codPostal|documento  |usuario    |password|
      |Mateo  |Lopez	|Calle 42 # 15-34	|Bogota	  |Bogota	  |50030	|1001234445	|Mlopez	    |Super@_Secret0|
      |Daniel |Castillo	|Carrera 13 #64‑29	|Cali	  |Valle	  |50031	|1001234446	|Dcastillo	|Super@_Secret1|
      |Alicia |Jimenez	|Carrera 15 #82-19	|Medellin |Antioquia  |50032	|1001234447	|Ajimenez	|Super@_Secret2|