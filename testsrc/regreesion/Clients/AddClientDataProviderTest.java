package regreesion.Clients;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.addClient.AddClient;
import util.DoLogin;

import java.io.IOException;

import static util.ConfigReader.*;
import static util.MyDataProvider.getMyData;

public class AddClientDataProviderTest extends DoLogin {

    @Test (dataProvider = "getData")
    public void addClientTest(String name,String surname,String language,String add1,
                              String add2,String city,String state,String zip,String country,
                              String gender,String birthdate,String phone,String mobile,
                              String fax,String email,String web,String vat,String tax
    , String expected ,String xpathActual)
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName(name);
        addClient.setClientSurname(surname);
        addClient.setLanguage(language);
        addClient.setClientAdd1(add1);
        addClient.setClientAdd2(add2);
        addClient.setClientCity(city);
        addClient.setClientState(state);
        addClient.setClientZip(zip);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthDate(birthdate);
        addClient.setClientPhone(phone);
        addClient.setClientMobile(mobile);
        addClient.setClientFax(fax);
        addClient.setClientEmail(email);
        addClient.setClientWeb(web);
        addClient.setClientVat(vat);
        addClient.setClientTax(tax);

        addClient.clickSave();


        String actual = "";

        try {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong output");
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return getMyData("Data/myData.xlsx","Sheet1");
    }


}
