package com.incollect;

import com.incollect.Pages.HomePage;
import com.incollect.Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebdriverSettings {
    public static ChromeDriver driver;

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        homePage = new HomePage();
        registerPage=new RegisterPage();
    }

    @AfterMethod
    public void finish() {
        driver.quit();
    }
}

