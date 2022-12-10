package com.incollect.Pages;

import com.incollect.WebdriverSettings;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    static void waitFor(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebdriverSettings.driver, Duration.ofSeconds(5));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            //
        }
    }
}
