package UITesting;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

import java.util.Locale;

public class LoginTest extends OpenUrl {

    Login login;

    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }

    @Test
    public void txtUsernameVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = false;

        try {
            actual = login.txtUsername.isDisplayed();
        }
        catch (Exception e) {
            }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"username textbox is not displayed");
    }

    @Test
    public void txtUsernameEnabilityCheck()
    {
        boolean expected = true;
        boolean actual = false;

        try {
            actual = login.txtUsername.isEnabled();
        }
        catch (Exception e) {
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"username textbox is not enabled");
    }

    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual="";
        try {
            actual = login.lblEmail.getText();
        }
        catch (Exception e) {
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect label name");

    }

    @Test
    public void txtUsernameWatermarkCheck()
    {
        String expected = "Email";
        String actual = "";

        try {
            actual = login.txtUsername.getAttribute("placeholder");
        }
        catch (Exception e) {
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect watermark");
    }

    @Test
    public void lblEmainFontSizeCheck()
    {
        String expected ="14px";

        String actual="";;

        try {
            actual = login.lblEmail.getCssValue("font-size");
        }
        catch (Exception e) {
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect font size ");
    }

    @Test
    public void lblEmainFontFamilyCheck()
    {
        String expected ="-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";

        String actual="";;

        try {
            actual = login.lblEmail.getCssValue("font-family");
        }
        catch (Exception e) {
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect font");
    }

    @Test
    public void lblEmainFontCheck()
    {
        String expected = "sans-serif";

        String actual="";;

        try {
            actual = login.lblEmail.getCssValue("font-family");
        }
        catch (Exception e) {
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"incorrect font");

      //  Assert.assertEquals(actual,expected,"incorrect font");
    }

    @Test
    public void btnLoginColorCheck()
    {
        String expected ="#2C8EDD";

        String actual="";;

        try {
            String rgb = login.btnLogin.getCssValue("background-color");

            actual = Color.fromString(rgb).asHex().toUpperCase();
        }
        catch (Exception e) {
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect color");
    }
}
