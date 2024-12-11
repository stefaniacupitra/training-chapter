package com.bdb.stepdefinitions;


import com.bdb.questions.TextValidationQuestions;
import com.bdb.task.SearchProductDesktop;
import com.bdb.task.ViewWidget;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static com.bdb.commons.Actors.COMMON_ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitions {
    @Cuando("busca el producto {string}")
    public void buscaElProducto(String product) {
        COMMON_ACTOR.attemptsTo(
                SearchProductDesktop.searchProductDesktop(product)
        );

    }
    @Cuando("el widget {string} esté visible")
    public void elWidgetEsteVisible(String widget) {
        COMMON_ACTOR.attemptsTo(
                ViewWidget.viewWidget(widget)
        );

    }
    @Entonces("podra visualizar el texto {string}")
    public void podraVisualizarElTexto(String text) {
        COMMON_ACTOR.should(
                seeThat(
                        TextValidationQuestions.searchProductDesktopQuestions(text)));
    }


}
