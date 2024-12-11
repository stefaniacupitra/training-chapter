package com.bdb.task;

import com.bdb.ui.WebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.bdb.constants.ProductsConstants.GAMING_LAPTOP;
import static com.bdb.constants.ProductsConstants.KALLEY_USB_CABLE;
import static com.bdb.constants.ProductsConstants.MENS_WATCH;
import static com.bdb.constants.ProductsConstants.APPLE_TV;
import static com.bdb.constants.ProductsConstants.MACKBOOK_PRO;
import static com.bdb.constants.ProductsConstants.GARMIN_WATCH;
import static com.bdb.constants.ProductsConstants.VTA_SPEAKER;
import static com.bdb.constants.CheckoutConstants.NAME;
import static com.bdb.constants.CheckoutConstants.LAST_NAME;
import static com.bdb.constants.CheckoutConstants.ADRRESS;
import static com.bdb.constants.CheckoutConstants.CITY;
import static com.bdb.constants.CheckoutConstants.EMAIL;

import static com.bdb.constants.ProductsConstants.LENOVO_LAPTOP;
import static com.bdb.constants.ProductsConstants.SECURITY_CAMERA_KIT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchProductDesktop implements Task {

    private final Logger logger = LoggerFactory.getLogger(SearchProductDesktop.class);

    private final  String products;

    public SearchProductDesktop(String productos) {
        this.products = productos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (products) {
            case "Parlante VTA":
                actor.attemptsTo(
                        SendKeys.of(VTA_SPEAKER).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE)
                );
                break;
            case "Reloj Hombre Tissot":
                actor.attemptsTo(
                        SendKeys.of(MENS_WATCH).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE),
                        WaitUntil.the(WebPage.NAME, isVisible()).forNoMoreThan(20).seconds(),
                        SendKeys.of(NAME).into(WebPage.NAME),
                        SendKeys.of(LAST_NAME).into(WebPage.LAST_NAME),
                        SendKeys.of(ADRRESS).into(WebPage.ADDRESS),
                        SendKeys.of(CITY).into(WebPage.CITY),
                        SendKeys.of(EMAIL).into(WebPage.EMAIL),
                        Click.on(WebPage.PAY),
                        Click.on(WebPage.PLACE_ORDER),
                        WaitUntil.the(WebPage.TEXT_EXPECTED_PLUGIN_CERO_PAY, isVisible()).forNoMoreThan(20).seconds()
                );
                break;
            case "Kit Cámara de Seguridad":
                actor.attemptsTo(
                        SendKeys.of(SECURITY_CAMERA_KIT).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE)
                );
                break;
            case "Apple TV 4K":
                actor.attemptsTo(
                        SendKeys.of(APPLE_TV).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE)
                );
                break;
            case "Computador Portátil LENOVO":
                actor.attemptsTo(
                        SendKeys.of(LENOVO_LAPTOP).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE),
                        WaitUntil.the(WebPage.NAME, isVisible()).forNoMoreThan(20).seconds(),
                        SendKeys.of(NAME).into(WebPage.NAME),
                        SendKeys.of(LAST_NAME).into(WebPage.LAST_NAME),
                        SendKeys.of(ADRRESS).into(WebPage.ADDRESS),
                        SendKeys.of(CITY).into(WebPage.CITY),
                        SendKeys.of(EMAIL).into(WebPage.EMAIL),
                        Click.on(WebPage.PAY),
                        Click.on(WebPage.PLACE_ORDER),
                        WaitUntil.the(WebPage.TEXT_EXPECTED_PLUGIN_CREDI_CONVENIO, isVisible()).forNoMoreThan(20).seconds()
                );
                break;
            case "Reloj GARMIN":
                actor.attemptsTo(
                        SendKeys.of(GARMIN_WATCH).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE)
                );
                break;
            case "Cable KALLEY":
                actor.attemptsTo(
                        SendKeys.of(KALLEY_USB_CABLE).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE)
                );
                break;
            case "Computador Portátil Gamer ASUS":
                actor.attemptsTo(
                        SendKeys.of(GAMING_LAPTOP).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE),
                        WaitUntil.the(WebPage.NAME, isVisible()).forNoMoreThan(20).seconds(),
                        SendKeys.of(NAME).into(WebPage.NAME),
                        SendKeys.of(LAST_NAME).into(WebPage.LAST_NAME),
                        SendKeys.of(ADRRESS).into(WebPage.ADDRESS),
                        SendKeys.of(CITY).into(WebPage.CITY),
                        SendKeys.of(EMAIL).into(WebPage.EMAIL),
                        Click.on(WebPage.PAY),
                        Click.on(WebPage.PLACE_ORDER),
                        WaitUntil.the(WebPage.TEXT_EXPECTED_PLUGIN_TARJETA_CREDITO, isVisible()).forNoMoreThan(20).seconds()
                );
                break;
            case "MacBook Pro":
                actor.attemptsTo(
                        SendKeys.of(MACKBOOK_PRO).into(WebPage.SEARCH_PRODUCT_DESKTOP),
                        Click.on(WebPage.SEARCH_BUTTON_DESKTOP),
                        WaitUntil.the(WebPage.ADD_TO_CART, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(WebPage.ADD_TO_CART),
                        Click.on(WebPage.OPEN_CART),
                        Click.on(WebPage.FINALIZE_PURCHASE)
                );
                break;
            default:
                logger.info("Valor no encontrado en el switch: " + products);
                break;
        }
    }

    public static SearchProductDesktop searchProductDesktop(String product) {
        return instrumented(SearchProductDesktop.class, product);
    }
}
