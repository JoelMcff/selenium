package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.Hooks;

import java.time.Duration;

public class Wait {

    private static final WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(30));

    public static void waitVisibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void andClick(WebElement element){
        waitVisibilityOf(element);
        element.click();
    }
    public static void andWrite(WebElement element, String text){
        waitVisibilityOf(element);
        element.sendKeys(text);
    }

}
