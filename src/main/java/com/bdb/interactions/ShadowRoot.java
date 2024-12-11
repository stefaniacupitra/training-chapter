package com.bdb.interactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static net.serenitybdd.core.Serenity.getDriver;

public class ShadowRoot {

    private ShadowRoot() { }

    private static final String QUERY = "return arguments[0].shadowRoot.querySelector";
    private static final String QUERY_LIST = "return arguments[0].shadowRoot.querySelectorAll";
    private static final JavascriptExecutor JS_EXECUTOR = (JavascriptExecutor) getDriver();

    public static void clickOnElementInsideOneShadowRoot(String firstShadowHost, String firstNestedShadowedInput) {
        firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).click();
    }
    public static WebElement extractElementInsideOneShadowRoot(String firstShadowHost, String firstNestedShadowedInput) {
        return firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput);
    }
    public static WebElement extractElementInsideTwoShadowRoot(String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
        return secondJsExecutorMethod(firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput);
    }
    public static void clickOnElementInsideTwoShadowRoots(String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
        secondJsExecutorMethod(firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput).click();
    }
    public static String getTextOfElementInsideOneShadowRoot(String firstShadowHost, String firstNestedShadowedInput) {
        return firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).getText();
    }
    public static String getContentTextOfElementInsideOneShadowRoot(String firstShadowHost, String firstNestedShadowedInput) {
        return firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).getDomProperty("textContent");
    }
    public static String getTextOfElementInsideTwoShadowRoot(String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
        return secondJsExecutorMethod(firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput).getText();
    }
    public static void sendKeysToElementInsideOneShadowRoot(String firstShadowHost, String firstNestedShadowedInput, String key) {
        firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).sendKeys(key);
    }
    public static void sendKeysToElementInsideTwoShadowRoot(String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput, String key) {
        secondJsExecutorMethod(firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput).sendKeys(key);
    }
    public static void scrollToBottom(WebElement el) {
        JS_EXECUTOR.executeScript("arguments[0].scrollIntoView(arguments[1]);", el, false);
    }
    public static void scrollToTop(WebElement el) {
        JS_EXECUTOR.executeScript("arguments[0].scrollIntoView(arguments[1]);", el, true);
    }
    public static void sendKeysByShadowRoot(By selector, String firstNestedShadowedInput, String key) {
        firstJsExecutorMethod(selector, firstNestedShadowedInput).sendKeys(key);
    }
    public static List<WebElement> findAllElements(String firstShadowHost, String firstNestedShadowedInput) {
        WebElement findShadowHost;
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        findShadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(firstShadowHost)));
        return (List<WebElement>) JS_EXECUTOR.executeScript(QUERY_LIST + "('" + firstNestedShadowedInput + "');", findShadowHost);
    }
    public static List<WebElement> findAllElements(By elementHost, String firstNestedShadowedInput) {
        WebElement findShadowHost;
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        findShadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(elementHost));
        return (List<WebElement>) JS_EXECUTOR.executeScript(QUERY_LIST + "('" + firstNestedShadowedInput + "');", findShadowHost);
    }
    public static void clickAndScrollOnElementInsideOneShadowRoot(String firstShadowHost, String firstNestedShadowedInput) {
        WebElement elementToClick = firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", elementToClick);
        elementToClick.click();
    }
    private static WebElement firstJsExecutorMethod(String firstShadowHost, String firstNestedShadowedInput) {
        By elementHost;
        WebElement findShadowHost;
        elementHost = By.cssSelector(firstShadowHost);
        findShadowHost = getDriver().findElement(elementHost);
        return (WebElement) JS_EXECUTOR.executeScript(QUERY + "('" + firstNestedShadowedInput + "');", findShadowHost);
    }
    private static WebElement firstJsExecutorMethod(By selector, String firstNestedShadowedInput) {
        WebElement findShadowHost;
        findShadowHost = getDriver().findElement(selector);
        return (WebElement) JS_EXECUTOR.executeScript(QUERY + "('" + firstNestedShadowedInput + "');", findShadowHost);
    }
    public static WebElement firstJsExecutorMethod(WebElement hostNode, String firstNestedShadowedInput) {
        return (WebElement) JS_EXECUTOR.executeScript(QUERY + "('" + firstNestedShadowedInput + "');", hostNode);
    }
    private static WebElement secondJsExecutorMethod(String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
        return (WebElement) JS_EXECUTOR.executeScript(QUERY + "('" + secondNestedShadowedInput + "');", firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput));
    }

    public static void isselectedOnElementInsideOneShadowRoot(String firstShadowHost, String firstNestedShadowedInput) {
        firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).isSelected();
    }
}
