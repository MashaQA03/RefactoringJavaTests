package com.incollect;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;

public class SignUpDeccaTest extends WebdriverSettings {

    @Test
    public void SignUpDecca() {
        driver.get("https://www.deccaeurope.com/");
        driver.findElement(By.xpath("/html/body/header/div/div[2]/div/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hs-eu-confirmation-button\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/account-details/?a=register\"]")).click();
        driver.findElement(By.id("first_name")).sendKeys("Maria");
        driver.findElement(By.id("last_name")).sendKeys("Ivanova");
        driver.findElement(By.id("job_title")).sendKeys("Manager");

        Random random = new Random();
        int n = random.nextInt(36) + 1;
        String email = "Ivanova" + n + "@mail.ru";
        System.out.println(email);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys("123857hJa");
        driver.findElement(By.id("telephone")).sendKeys("+70000000000");
        driver.findElement(By.xpath("//*[@id=\"country-button\"]/span[2]")).click();
        driver.findElement(By.id("ui-id-185")).click();
        driver.findElement(By.xpath("//*[@id=\"country_zone-button\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"country_zone-button\"]/span[2]")).click();
        driver.findElement(By.id("company")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"business_type-button\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-id-458\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"how_hear-button\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"how_hear-button\"]/span[2]")).click();
        driver.findElement(By.xpath("/html/body/form/div[1]/div/div[13]/input[2]")).click();
        driver.findElement(By.id("registerSubmit")).click();
    }
    @Test
    public void SignUpDeccaExTest() {
        driver.get("https://www.deccaeurope.com/");
        homePage.waitForPage();
        homePage.clickHeader();
        homePage.clickConfirmation();
        homePage.clickRegisterButton();
        homePage.sendFirstName("Maria");
        homePage.sendLastName("Ivanova");
        homePage.sendJobName("Manager");
        registerPage.waitForPage();
        registerPage.sendPasswordFill("123857hJa");
        registerPage.sendTelephoneFill("+70000000000");
        registerPage.selectCountry ( "country-button");
        registerPage.clickCountry();
        registerPage.selectZone("//*[@id=\"country_zone-button\"]/span[2]");
        registerPage.clickCityButton();
        registerPage.sendCompanyFill("Test");
        registerPage.selectBusinessTypeButton("//*[@id=\"business_type-button\"]/span[2]");
        registerPage.clickBusinessTypeButton();
        registerPage.selectHowHearButton("//*[@id=\"how_hear-button\"]/span[2]");
        registerPage.clickHowHearButton();
        registerPage.clickRegisterSubmitButton();
    }
}
