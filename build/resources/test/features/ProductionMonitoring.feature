# language:es
# encoding :iso-8859-1

@EcommerceProduction

Caracter�stica: Pipeline de Monitoreo en Producci�n

  Como tester
  Quiero asegurarme de que los widgets y banners est�n visibles y funcionando correctamente en producci�n
  Para detectar problemas en tiempo real en los sitios aliados

  @Allys

  Esquema del escenario: Verificar la presencia de los banners/widgets en producci�n
    Dado que estoy en la p�gina de producci�n del aliado "<Ally>"
    Cuando el widget "<Widget>" est� visible
    Entonces podra visualizar el texto "<Text>"
    Ejemplos:
      | Ally     | Widget          | Text                                         |  |
      | DPrimero | PDP en DPrimero | Financia tu compra desde 12 hasta 72 cuotas. |  |
