package com.incollect.Pages;

import com.incollect.WebdriverSettings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//*[@id=\"country-button\"]/span[2]")
    private WebElement countryButton;

    @FindBy(id = "ui-id-185")
    private WebElement clickClick;

    @FindBy(xpath = "//*[@id=\"country_zone-button\"]/span[2]")
    private WebElement countryZoneButton;

    @FindBy(id = "company")
    private WebElement companyNameFill;

    @FindBy(xpath = "//*[@id=\"business_type-button\"]/span[2]")
    private WebElement businessTypeButton;


    @FindBy(xpath = "//*[@id=\"ui-id-458\"]")
    private WebElement clickClick2;

    @FindBy(xpath = "//*[@id=\"how_hear-button\"]/span[2]")
    private WebElement howHearButton;

    @FindBy(xpath = "/html/body/form/div[1]/div/div[13]/input[2]")
    private WebElement clickClick3;

    @FindBy(id = "registerSubmit")
    private WebElement registerSubmitButton;


    public void sendPasswordFill(String value) {
        passwordFill.sendKeys(value);
    }

    public void sendTelephoneFill(String value) {
        telephoneFill.sendKeys(value);
    }

    public void clickCountryButton() {
        countryButton.click();
    }

    public void clickClick() {
        clickClick.click();
    }

    public void clickCountryZoneButton() {
        countryZoneButton.click();
    }

    public void sendCompanyFill(String value) {
        companyNameFill.sendKeys(value);
    }

    public void clickBusinessTypeButton() {
        businessTypeButton.click();
    }

    public void clickClick2() {
        clickClick2.click();
    }

    public void clickHowHearButton() {
        howHearButton.click();
    }

    public void clickClick3() {
        clickClick3.click();
    }

    public void clickRegisterSubmitButton() {
        registerSubmitButton.click();
    }



















}
