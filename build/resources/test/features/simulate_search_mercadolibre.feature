#Autor:Juan Diego Quintero
  #language:en

  Feature: Simulación compra fallida por estar sin sesión iniciada
    Como usuario sin iniciar sesion
    Quiero comprar un artículo
    Para poder ver un mensaje indicando que iniciar sesión es obligatorio para comprar

    Scenario: Buscar un articulo e intentar comprarlo para que salga que debe iniciar sesion
      Given ingreso al navegador
      And me dirijo a la pagina de mercadolibre
      When digito play 5 y doy click en buscar
      And doy click en el primer producto de "play 5"
      And doy click en el boton de Comprar ahora
      Then puedo observar que me pide iniciar sesion

