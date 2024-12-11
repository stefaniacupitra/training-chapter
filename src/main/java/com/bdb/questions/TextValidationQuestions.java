package com.bdb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static com.bdb.constants.Constants.QUESTION_MESSAGE;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_CERO_PAY_1;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_CERO_PAY_2;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_CREDI_CONVENIO_1;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_CREDI_CONVENIO_2;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_PLUGIN_CERO_PAY;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_PLUGIN_CREDI_CONVENIO;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_PLUGIN_TARJETA_CREDITO;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_TARJETA_CREDITO_1;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_TARJETA_CREDITO_2;
import static com.bdb.ui.WebPage.TEXT_EXPECTED_WIDGET_PDP_DPRIMERO;

public class TextValidationQuestions implements Question<Boolean> {

    private final Logger logger = LoggerFactory.getLogger(TextValidationQuestions.class);


    private final String textsExpected;

    public TextValidationQuestions(String textsExpected) {
        this.textsExpected = textsExpected;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        switch (textsExpected) {
            case "$60.000":
                String textsObtained1 = TEXT_EXPECTED_CERO_PAY_1.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained1);
                return validateText(textsObtained1);
            case "Págalo hasta en 6 cuotas de $ 219.488 aproximados sin intereses.":
                String textsObtained2 = TEXT_EXPECTED_PLUGIN_CERO_PAY.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained2);
                return validateText(textsObtained2);
            case "$4.389.745":
                String textsObtained3 = TEXT_EXPECTED_CERO_PAY_2.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained3);
                return validateText(textsObtained3);
            case "$150.000":
                String textsObtained4 = TEXT_EXPECTED_CREDI_CONVENIO_1.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained4);
                return validateText(textsObtained4);
            case "Págalo hasta en 24 cuotas de $ 83.334 aproximados sin intereses.":
                String textsObtained5 = TEXT_EXPECTED_PLUGIN_CREDI_CONVENIO.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained5);
                return validateText(textsObtained5);
            case "$20.000.000":
                String textsObtained6 = TEXT_EXPECTED_CREDI_CONVENIO_2.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained6);
                return validateText(textsObtained6);
            case "$5.000":
                String textsObtained7 = TEXT_EXPECTED_TARJETA_CREDITO_1.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained7);
                return validateText(textsObtained7);
            case "Págalo hasta en 12 cuotas de $ 833.334 aproximados sin intereses.":
                String textsObtained8 = TEXT_EXPECTED_PLUGIN_TARJETA_CREDITO.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained8);
                return validateText(textsObtained8);
            case "$10.974.362":
                String textsObtained9 = TEXT_EXPECTED_TARJETA_CREDITO_2.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained9);
                return validateText(textsObtained9);
            case "Financia tu compra desde 12 hasta 72 cuotas.":
                String textsObtained10 = TEXT_EXPECTED_WIDGET_PDP_DPRIMERO.resolveFor(actor).getText();
                logger.info(QUESTION_MESSAGE, textsExpected, textsObtained10);
                return validateText(textsObtained10);
            default:
                throw new IllegalArgumentException("Valor no encontrado en el switch: " + textsExpected);
        }
    }

    private boolean validateText(String textsObtained) {
        return textsObtained.equals(textsExpected);
    }

    public static TextValidationQuestions searchProductDesktopQuestions(String text) {
        return new TextValidationQuestions(text);
    }
}
