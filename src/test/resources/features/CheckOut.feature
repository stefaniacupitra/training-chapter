# language:es
# encoding :iso-8859-1

@ECOMM-2999

@Ecommerce

Característica: Como cliente quiero solicitar un producto del Banco de Bogotá a través de los widgets en el checkout de WordPress para facilitar mi compra

  Antecedentes:
    Dado que el comprador ingresa al wordpress

  @CheckOut
    @TEST_ECOMM-2617
    @TEST_ECOMM-2618
    @TEST_ECOMM-2619
    @TEST_ECOMM-2620
    @TEST_ECOMM-2621
    @TEST_ECOMM-2622
    @TEST_ECOMM-2623
    @TEST_ECOMM-2624
    @TEST_ECOMM-2625

  Esquema del escenario: Visualización de widgets en el checkout según el valor del producto
    Dado que el comprador ingresa al wordpress
    Cuando busca el producto "<Product>"
    Entonces podra visualizar el texto "<Texto>"
    Ejemplos:
      | Product                        | Texto                                                             |
      | Parlante VTA                   | $60.000                                                           |
      | Reloj Hombre Tissot            | Págalo hasta en 6 cuotas de $ 219.488 aproximados sin intereses.  |
      | Kit Cámara de Seguridad        | $4.389.745                                                        |
      | Apple TV 4K                    | $150.000                                                          |
      | Computador Portátil LENOVO     | Págalo hasta en 24 cuotas de $ 83.334 aproximados sin intereses.  |
      | Reloj GARMIN                   | $20.000.000                                                       |
      | Cable KALLEY                   | $5.000                                                            |
      | Computador Portátil Gamer ASUS | Págalo hasta en 12 cuotas de $ 833.334 aproximados sin intereses. |
      | MacBook Pro                    | $10.974.362                                                       |