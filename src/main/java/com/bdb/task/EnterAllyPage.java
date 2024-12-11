package com.bdb.task;

import com.bdb.ui.WebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.bdb.constants.ProductsConstants.MACKBOOK_PRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterAllyPage implements Task {

    private final Logger logger = LoggerFactory.getLogger(EnterAllyPage.class);


    private static final String DPRIMERO = "pages.DPrimero";

    private final  String allys;

    public EnterAllyPage(String aliados) {
        this.allys = aliados;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (allys){
            case "DPrimero":
                actor.attemptsTo(
                        Open.browserOn().thePageNamed(DPRIMERO)
                );
                break;
            default:
                logger.info("Valor no encontrado en el switch: " + allys);
                break;
        }
    }

    public static EnterAllyPage enterAllyPage(String product) {
        return instrumented(EnterAllyPage.class, product);
    }
}
