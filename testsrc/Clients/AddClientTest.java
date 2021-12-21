package Clients;

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

        addClient.setLanguage("Spanish");


       /* addClient.setClientName("Sudhir");
        addClient.setClientSurname("Hingade");
        addClient.setClientAddress1("xyz");
        addClient.setClientAddress2("abc");
        addClient.setClientCity("Pune");
        addClient.clickSave();*/

    }


}
