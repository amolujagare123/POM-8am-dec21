package regreesion.Clients;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.addClient.AddClient;

import java.io.IOException;

import static util.ConfigReader.*;

public class AddClientTest {
    WebDriver driver;

    @BeforeClass
    public void doLogin() throws IOException {
        WebDriverManager.chromedriver().setup();
         driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

       Login login = new Login(driver);

        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName("Rupali");
        addClient.setClientSurname("More");
        addClient.setLanguage("Spanish");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("pqr");
        addClient.setClientCity("Pune");
        addClient.setClientState("MH");
        addClient.setClientZip("898988");
        addClient.setCountry("Hungary");
        addClient.setGender("Female");
        addClient.setBirthDate("12/17/1984");
        addClient.setClientPhone("898998");
        addClient.setClientMobile("89898");
        addClient.setClientFax("8989");
        addClient.setClientEmail("a@b.com");
        addClient.setClientWeb("www.xyz.com");
        addClient.setClientVat("767676");
        addClient.setClientTax("6767");

        addClient.clickSave();

    }


}
