package com.bdb.task;

import com.bdb.ui.WebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.bdb.constants.ProductsConstants.MACKBOOK_PRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewWidget implements Task {

    private final Logger logger = LoggerFactory.getLogger(ViewWidget.class);

    private final  String widget;

    public ViewWidget(String widgets) {
        this.widget = widgets;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (widget) {
            case "PDP en DPrimero":
                actor.attemptsTo(
                        WaitUntil.the(WebPage.CLOSE_BANKS_INFORMATION_MODAL, isVisible()).forNoMoreThan(2).seconds(),
                        Click.on(WebPage.CLOSE_BANKS_INFORMATION_MODAL),
                        Click.on(WebPage.WIDGET_PDP_DPRIMERO),
                        WaitUntil.the(WebPage.WIDGET_PDP_DPRIMERO, isVisible()).forNoMoreThan(30).seconds()
                );
                break;
            default:
                logger.info("Valor no encontrado en el switch: " + widget);
                break;
        }

    }

    public static ViewWidget viewWidget(String widget) {
        return instrumented(ViewWidget.class, widget);
    }
}
