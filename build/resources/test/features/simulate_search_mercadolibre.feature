#Autor:Juan Diego Quintero
  #language:en

  Feature: Simulación de compra fallida con inicio de sesion en Mercadolibre
    Como usuario interesado en buscar un play5
    Quiero elegir el primer producto y comprarlo
    Para poder ver la pagina de inicio de sesion

    Scenario: Buscar un producto, comprarlo y obtener página de inicio de sesion
      Given ingreso al navegador
      And me dirijo a la pagina de mercadolibre
      When digito play 5 y doy click en buscar
      And doy click en el primer producto de "play 5"
      And doy click en el boton de Comprar ahora
      Then puedo observar que me pide iniciar sesion

