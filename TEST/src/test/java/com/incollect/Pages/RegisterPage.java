package com.incollect.Pages;

import com.incollect.WebdriverSettings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {
    public RegisterPage() {
        PageFactory.initElements(WebdriverSettings.driver, this);

    }
    @FindBy(id = "email")
    private WebElement emailFill;

    @FindBy(id = "password")
    private WebElement passwordFill;

    @FindBy(id = "telephone")
    private WebElement telephoneFill;

    @FindBy(id = "country")
    private WebElement countryDropDown;

    @FindBy(id = "ui-id-185")
    private WebElement ClickCountry;


    @FindBy(id = "zone")
    private WebElement countryZone;

    @FindBy(id = "ui-id-297")
    private WebElement ClickCityButton;

    @FindBy(id = "company")
    private WebElement companyNameFill;

    @FindBy(id = "btypebutton")
    private WebElement businessTypeButton;

    @FindBy(xpath = "//*[@id=\"ui-id-458\"]")
    private WebElement clickBusinessTypeButton;

    @FindBy(id = "how_hear-button")
    private WebElement howHearButton;

    @FindBy(xpath = "/html/body/form/div[1]/div/div[13]/input[2]")
    private WebElement clickHowHearButton;

    @FindBy(id = "registerSubmit")
    private WebElement registerSubmitButton;

    public void waitForPage() {
        waitFor(emailFill);
    }


    public void sendPasswordFill(String value) {
        System.out.println("sendPasswordFill" + value);
        passwordFill.sendKeys(value);
    }

    public void sendTelephoneFill(String value) {
        System.out.println("sendTelephoneFill" + value);
        telephoneFill.sendKeys(value);
    }

    public void selectCountry(String value) {
        new Select(countryDropDown).selectByVisibleText(value);

    }

    public void clickCountry() {
        System.out.println("clickCountry");
        ClickCountry.click();
    }

    public void selectZone(String value) {
        new Select(countryZone).selectByVisibleText(value);
    }

    public void clickCityButton() {
        System.out.println("clickCityButton");
        ClickCityButton.click();
    }

    public void sendCompanyFill(String value) {
        System.out.println("sendCompanyFill");
        companyNameFill.sendKeys(value);
    }

    public void selectBusinessTypeButton(String value) {
        new Select(businessTypeButton).selectByVisibleText(value);
    }


    public void clickBusinessTypeButton() {
        System.out.println("clickBusinessTypeButton");
        clickBusinessTypeButton.click();
    }

    public void selectHowHearButton(String value) {
        new Select(howHearButton).selectByVisibleText(value);
    }

    public void clickHowHearButton() {
        System.out.println("clickHowHearButton");
        clickHowHearButton.click();
    }

    public void clickRegisterSubmitButton() {
        System.out.println("registerSubmitButton");
        registerSubmitButton.click();
    }



















}
