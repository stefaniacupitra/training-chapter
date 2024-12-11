package com.bdb.stepdefinitions.commons;

import com.bdb.task.EnterAllyPage;
import com.bdb.utils.login.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Dado;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;

import static com.bdb.commons.Actors.COMMON_ACTOR;
import static net.serenitybdd.core.Serenity.getDriver;

public class LoginStep {

    private static final String WORDPRESS = "pages.Wordpress";

    private static final Logger LOG = LoggerFactory.getLogger(LoginStep.class.getSimpleName());
    private WebDriver driver = Serenity.getDriver();

    @Before
    public void setTheStageWeb(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
        COMMON_ACTOR.whoCan(BrowseTheWeb.with(driver));
        COMMON_ACTOR.remember(Constants.SCENARIO, scenario.getName());
        COMMON_ACTOR.describedAs("Cliente");

        LOG.info("***************************************************");
        LOG.info("    Escenario: " + scenario.getName());
        LOG.info("    Tags: " + scenario.getSourceTagNames());
        LOG.info("***************************************************");
    }

    @After
    public void checkTestCase(Scenario scenario) throws ParseException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        if (scenario.isFailed()) {
            jse.executeScript("browserstack_executor: {\"action\":\"setSessionStatus\",\"arguments\":{\"status\":\"failed\",\"reason\":\"TestFailed\"}}");
        } else {
            jse.executeScript("browserstack_executor: {\"action\":\"setSessionStatus\",\"arguments\":{\"status\":\"passed\",\"reason\":\"TestPassed\"}}");
        }
    }


    @Dado("que el comprador ingresa al wordpress")
    public void queElCompradorIngresaAlWordpress() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(WORDPRESS)
        );
    }

    @Dado("que estoy en la página de producción del aliado {string}")
    public void queEstoyEnLaPaginaDeProduccionDelAliado(String ally){
        COMMON_ACTOR.attemptsTo(
                EnterAllyPage.enterAllyPage(ally)
        );
    }
}
