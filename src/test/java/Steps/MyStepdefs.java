package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static Constants.Constants.*;
import static Steps.Base.driver;

public class MyStepdefs {

    Actions actions = new Actions(driver);

    @Given("^Amazon sayfasinda login butonuna tiklama$")
    public void amazonSafasindaLoginButonunuBulma() throws InterruptedException {
        WebElement AcceptCookiesClick = driver.findElement(ACCEPTCOOKIES);
        Thread.sleep(1000);
        actions.moveToElement(AcceptCookiesClick).click().perform();
        Thread.sleep(2000);
        WebElement LoginClick = driver.findElement(LOGINBUTTON_CONTROL);
        Thread.sleep(1000);
        actions.moveToElement(LoginClick).click().perform();
        Thread.sleep(1000);

    }

    @When("^Login email bilgisini girme$")
    public void loginEmailBilgisiniGirme()  throws InterruptedException{
        WebElement sendText = driver.findElement(EMAİLTEXT);
        sendText.sendKeys(EMAIL);
        WebElement continebutton = driver.findElement(CONTINUEBUTTON);
        continebutton.click();
        Thread.sleep(1000);
    }

    @And("^Login password bilgisini girme$")
    public void loginPasswordBilgisiniGirme() throws InterruptedException {
        WebElement sendText = driver.findElement(PASSWORDTEXT);
        sendText.sendKeys(PASSWORD);
        WebElement signinbutton = driver.findElement(SIGNINBUTTON);
        signinbutton.click();
        Thread.sleep(1000);
    }

    @When("^Arama kutucuguna aranacak kelimeyi girme$")
    public void aramaKutucugunaAranacakKelimeyiGirme() throws InterruptedException {
        WebElement searchtextbox = driver.findElement(SEARCHTEXTBOX);
        searchtextbox.click();
        Thread.sleep(1000);
        WebElement text = driver.findElement(SEARCHTEXTBOX);
        text.sendKeys(SEARCHKEYWORD);
        WebElement searchtextboxnext = driver.findElement(SEARCHTEXTBOXNEXT);
        searchtextboxnext.click();
        Thread.sleep(2000);
    }

    @And("^Gelen urunlerden rastgele birini secme$")
    public void gelenUrunlerdenRastgeleBiriniSecme() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        List<WebElement> products= driver.findElements(PRODUCTS);
        int maxProducts = products.size();
        System.out.println(maxProducts);
        Thread.sleep(1000);
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        products.get(randomProduct).click();
        Thread.sleep(1000);
    }

    @And("^Secilen urun sepete eklenir$")
    public void secilenUrunSepeteEklenir() throws InterruptedException {
        Thread.sleep(5000);
        WebElement addcart = driver.findElement(ADDTOCARTBUTTON);
        addcart.click();
        Thread.sleep(1000);
        WebElement cart = driver.findElement(CART);
        cart.click();
        Thread.sleep(1000);
    }

    @Then("^Eklenen urun silinir$")
    public void eklenenUrunSilinir()  throws InterruptedException{
        WebElement Delete=driver.findElement(DELETE);
        actions.doubleClick(Delete).perform();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
}
