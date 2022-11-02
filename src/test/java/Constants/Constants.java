package Constants;

import org.openqa.selenium.By;

public class Constants {

    public static final By LOGINBUTTON_CONTROL = By.cssSelector("a[id=\"nav-link-accountList\"]");
    public static final By ACCEPTCOOKIES= By.cssSelector("input[id=\"sp-cc-accept\"]");

    public static final String EMAIL = "";
    public static final String PASSWORD = "";

    public static final By CONTINUEBUTTON = By.cssSelector("input[id=\"continue\"]");
    public static final By EMAİLTEXT = By.cssSelector("input[id=\"ap_email\"]");
    public static final By PASSWORDTEXT = By.cssSelector("input[id=\"ap_password\"]");
    public static final By SIGNINBUTTON = By.cssSelector("input[id=\"signInSubmit\"]");

    public static final String  SEARCHKEYWORD="Bilgisayar";

    public static final By SEARCHTEXTBOX = By.cssSelector("input[id=\"twotabsearchtextbox\"]");
    public static final By SEARCHTEXTBOXNEXT = By.cssSelector("input[id=\"nav-search-submit-button\"]");

    public static final By PRODUCTS = By.cssSelector("div[class=\"a-section a-spacing-base\"]");
    public static final By ADDTOCARTBUTTON = By.cssSelector("input[id=\"add-to-cart-button\"]");
    public static final By CART = By.cssSelector("A[id=\"nav-cart\"]");
    public static  By DELETE = By.cssSelector("input[value=\"Sil\"]");


}
