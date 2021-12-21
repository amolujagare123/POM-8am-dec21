package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

 /*
    WebDriver driver;
    WebElement txtUsername = driver.findElement(By.xpath(""));*/

    @FindBy (xpath = "//input[@id='email']")
    WebElement txtUsername;

    @FindBy (xpath = "//input[@id='password']")
    WebElement txtPassword;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy (xpath = "//a[normalize-space()='I forgot my password']")
    WebElement forgotPass;



    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickForgotPass()
    {
        forgotPass.click();
    }


    public void setTxtUsername(String name)
    {
        txtUsername.sendKeys(name);
    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }



}
