# language:es
# encoding :iso-8859-1

@EcommerceProduction

Característica: Pipeline de Monitoreo en Producción

  Como tester
  Quiero asegurarme de que los widgets y banners estén visibles y funcionando correctamente en producción
  Para detectar problemas en tiempo real en los sitios aliados

  @Allys

  Esquema del escenario: Verificar la presencia de los banners/widgets en producción
    Dado que estoy en la página de producción del aliado "<Ally>"
    Cuando el widget "<Widget>" esté visible
    Entonces podra visualizar el texto "<Text>"
    Ejemplos:
      | Ally     | Widget          | Text                                         |  |
      | DPrimero | PDP en DPrimero | Financia tu compra desde 12 hasta 72 cuotas. |  |
