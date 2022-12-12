package com.incollect.Pages;

import com.incollect.WebdriverSettings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(WebdriverSettings.driver, this);
    }

    @FindBy(xpath = "/html/body/header/div/div[2]/div/a/i")
    private WebElement header;

    @FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
    private WebElement confirmationButton;

    @FindBy(css = "[href=\"/account-details/?a=register\"]")
    private WebElement registerButton;

    @FindBy(id = "first_name")
    private WebElement firstNameEditField;

    @FindBy(id = "last_name")
    private WebElement lastNameEditField;

    @FindBy(id = "job_title")
    private WebElement jobTitleEditField;

    public void waitForPage() {
        System.out.println("waitForPage homepage");
        waitFor(header);
    }

    public void clickHeader() {
        System.out.println("clickHeader");
        header.click();
    }

    public void clickConfirmation() {
        System.out.println("clickConfirmation");
        confirmationButton.click();
    }

    public void clickRegisterButton() {
        System.out.println("clickRegisterPage");
        registerButton.click();
    }

    public void sendFirstName(String value) {
        System.out.println("firstNameEditField" + value);
        firstNameEditField.sendKeys(value);
    }

    public void sendLastName(String value) {
        System.out.println("sendLastName" + value);

        lastNameEditField.sendKeys(value);
    }

    public void sendJobName(String value) {
        System.out.println("jobTitleEditField" + value);
        jobTitleEditField.sendKeys(value);
    }



}
