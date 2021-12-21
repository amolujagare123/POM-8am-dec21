import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static util.ConfigReader.getUrl;

public class ForgotPassTest {

    @Test
    public void forgotPassTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("http://[::1]/ip-8am/index.php/sessions/login");
        driver.get(getUrl());

        Login login = new Login(driver);
        login.clickForgotPass();

        Forgotpass forgotpass  =new Forgotpass(driver);

        forgotpass.setTxtEmail("amol@gmail.com");
        forgotpass.clickReset();
    }

    }
