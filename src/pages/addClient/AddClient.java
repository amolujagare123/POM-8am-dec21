package pages.addClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    @FindBy(xpath = "//input[@id='client_name']")
    WebElement clientName;

    @FindBy (xpath = "//input[@id='client_surname']")
    WebElement clientSurname;

    @FindBy (xpath = "//input[@id='client_address_1']")
    WebElement clientAddress1;

    @FindBy (xpath = "//input[@id='client_address_2']")
    WebElement clientAddress2;

    @FindBy (xpath = "//input[@id='client_city']")
    WebElement clientCity;

    public AddClient(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void setClientName(String name)
    {
        clientName.sendKeys(name);
    }
    public void setClientSurname(String surname)
    {
        clientSurname.sendKeys(surname);
    }

    public void setClientCity(String city)
    {
        clientCity.sendKeys(city);
    }

    public void setClientAddress1(String address1)
    {
        clientAddress1.sendKeys(address1);
    }

    public void setClientAddress2(String address2)
    {
        clientAddress2.sendKeys(address2);
    }

    @FindBy (xpath = "//button[@id='btn-submit']")
    WebElement btnSave;

    public void clickSave()
    {
        btnSave.click();
    }

    @FindBy (xpath = "//span[@id='select2-client_language-container']")
    WebElement containerlanguage;

    @FindBy (xpath = "//input[@role='searchbox']")
    WebElement searchBox;

    WebDriver driver;

    public void setLanguage(String language)
    {
        containerlanguage.click();
        searchBox.sendKeys(language);
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }




}
