package com.bdb.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class WebPage {

    private WebPage() {
    }

    private static final String EXPECTED_TEST = "//tr[@class='order-total']//bdi[1]";
    private static final String EXPECTED_TEST_PLUGIN_SHADOW_HOSTS = "bdb-ec4-financing-method[type='widget']";
    private static final String EXPECTED_TEST_PLUGIN_TARGET = " div:nth-child(1) > p:nth-child(4)";
    public static final Target SEARCH_PRODUCT_DESKTOP = Target.the("Buscar producto")
            .locatedBy("//input[@id='thaps-search-autocomplete-3']");
    public static final Target SEARCH_BUTTON_DESKTOP = Target.the("Botón buscar producto")
            .locatedBy("//div[@class='desktop-main-header']//button[@id='thaps-search-button']");
    public static final Target PRODUCT_SELECTION_1 = Target.the("Selección de producto")
            .locatedBy("//*[@id=\"shop-product-wrap\"]/ul/li[1]/div/div/div[1]");
    public static final Target PRODUCT_SELECTION_2 = Target.the("Selección de producto")
            .locatedBy("//*[@id=\"shop-product-wrap\"]/ul/li[2]/div/div/div[1]");
    public static final Target ADD_TO_CART = Target.the("Botón añadir a la cesta")
            .locatedBy(".single_add_to_cart_button.button.alt");
    public static final Target OPEN_CART = Target.the("Botón abrir la cesta")
            .locatedBy("//div[@id='2']//div[@class='taiowc-cart-item']");
    public static final Target FINALIZE_PURCHASE = Target.the("Botón finalizar compra")
            .locatedBy("//div[@id='2']//a[@class='button checkout wc-forward'][normalize-space()='Checkout']");
    public static final Target NAME = Target.the("Digitar nombre")
            .locatedBy("//input[@id='billing_first_name']");
    public static final Target LAST_NAME = Target.the("Digitar apellido")
            .locatedBy("//input[@id='billing_last_name']");
    public static final Target ADDRESS = Target.the("Digitar dirección")
            .locatedBy("//input[@id='billing_address_1']");
    public static final Target CITY = Target.the("Digitar ciudad")
            .locatedBy("//input[@id='billing_city']");
    public static final Target EMAIL = Target.the("Digitar correo electronico")
            .locatedBy("//input[@id='billing_email']");
    public static final Target PAY = Target.the("Botón pago con Banco de Bogotá")
            .locatedBy("//input[@id='payment_method_bdb_payment_method']");
    public static final Target PLACE_ORDER = Target.the("Botón realizar el pedido")
            .locatedBy("//button[@id='place_order']");
    public static final Target TEXT_EXPECTED_CERO_PAY_1 = Target.the("Texto esperado de Cero Pay")
            .locatedBy(EXPECTED_TEST);
    public static final Target TEXT_EXPECTED_PLUGIN_CERO_PAY = Target.the("Texto esperado plugin de Cero Pay")
            .located(ByShadow.cssSelector(EXPECTED_TEST_PLUGIN_TARGET, EXPECTED_TEST_PLUGIN_SHADOW_HOSTS, " bdb-ec4-payment-order:nth-child(1)"));
    public static final Target TEXT_EXPECTED_CERO_PAY_2 = Target.the("Texto esperado de Cero Pay")
            .locatedBy(EXPECTED_TEST);
    public static final Target TEXT_EXPECTED_CREDI_CONVENIO_1 = Target.the("Texto esperado de CrediConvenio")
            .locatedBy(EXPECTED_TEST);
    public static final Target TEXT_EXPECTED_PLUGIN_CREDI_CONVENIO = Target.the("Texto esperado plugin de CrediConvenio")
            .located(ByShadow.cssSelector(EXPECTED_TEST_PLUGIN_TARGET, EXPECTED_TEST_PLUGIN_SHADOW_HOSTS, " bdb-ec4-payment-order:nth-child(2)"));
    public static final Target TEXT_EXPECTED_CREDI_CONVENIO_2 = Target.the("Texto esperado de CrediConvenio")
            .locatedBy(EXPECTED_TEST);
    public static final Target TEXT_EXPECTED_TARJETA_CREDITO_1 = Target.the("Texto esperado de Tarjeta de credito")
            .locatedBy(EXPECTED_TEST);
    public static final Target TEXT_EXPECTED_PLUGIN_TARJETA_CREDITO = Target.the("Texto esperado plugin de CrediConvenio")
            .located(ByShadow.cssSelector(EXPECTED_TEST_PLUGIN_TARGET, EXPECTED_TEST_PLUGIN_SHADOW_HOSTS, " bdb-ec4-payment-order:nth-child(3)"));
    public static final Target TEXT_EXPECTED_TARJETA_CREDITO_2 = Target.the("Texto esperado de Tarjeta de credito")
            .locatedBy(EXPECTED_TEST);

    public static final Target CLOSE_BANKS_INFORMATION_MODAL = Target.the("Botón X para cerrar modal de informativa de bancos")
            .located(ByShadow.cssSelector("svg[role='img']", "#pop-convert-app"));
    public static final Target WIDGET_PDP_DPRIMERO = Target.the("Abrir widget en PDP aliado DPrimero")
            .located(ByShadow.cssSelector(".widget-body-alt","bdb-ec4-financing-method[type='widget']", ".hydrated"));
    public static final Target TEXT_EXPECTED_WIDGET_PDP_DPRIMERO = Target.the("Texto esperado widget en PDP aliado DPrimero")
            .located(ByShadow.cssSelector(" bdb-ml-modal-normal:nth-child(1) > div:nth-child(1) > slot:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > p:nth-child(2)", "bdb-ec4-modal-financing[class='hydrated']"));



}
