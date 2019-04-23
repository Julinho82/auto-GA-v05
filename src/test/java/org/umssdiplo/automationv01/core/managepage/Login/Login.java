package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.concurrent.TimeUnit;

import java.util.List;

public class Login extends BasePage {


    @FindBy(name = "email")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;
    private By driver;


    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        usernameInputField.clear();
        usernameInputField.sendKeys(username);
        CommonEvents.setInputField(usernameInputField, username);
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]")
    private WebElement menHombre;

    public void clickMenHombre() {

        menHombre.click();
    }

    @FindBy(css = ".main-menu___GkftT > div:nth-child(1) > a")
    private WebElement clickMenuFuT;

    public void clickFutMenu() {

        action.moveToElement(clickMenuFuT);
        clickMenuFuT.click();
    }

    @FindBy(css = "a[href='/calzado_de_futbol-hombre']")
    private WebElement findFutOnH;


    public void holdMen() {

        action.moveToElement(findFutOnH);
        findFutOnH.click();

    }

    public void clickFindFut() {

        findFutOnH.click();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.adidas.mx/hombre");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("\"a[href='/calzado_de_futbol-hombre']\"")).click();


    }

    public void mouseOver(WebElement webElement) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement).build().perform();
    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.adidas.mx/hombre");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("\"a[href='/calzado_de_futbol-hombre']\"")).click();

    }

    //find search bar
    @FindBy(className = "searchinput___3ump9")
    private WebElement searchBar;
    private Actions action;

    public void clickSearch() {

        searchBar.click();


    }

    public void fillSearch(String Data) {

        //workAoround
        searchBar.sendKeys(Data, Keys.ENTER);


    }


    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div/div[3]/a/div[2]")
    private WebElement sportFut;

    public void clickSportFut() {

        sportFut.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]")
    private WebElement listTalla;

    public void clickListTalla() {

        listTalla.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]/div/div/div/div/ul/li[9]")
    private WebElement selectTalla;

    public void clickSelectTalla() {

        selectTalla.click();
        addBagger.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[3]")
    private WebElement addBagger;

    @FindBy(xpath = "//*[@class='gl-body--s']/span[3]")
    private WebElement cantBag;

    public String verifyQuantity() {
        String cant = cantBag.getText();
        return cant;

    }

    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div[3]/div/div[2]/div[1]/div[2]/span")
    private WebElement pricePartial;

    public String verifyPartialPrice(){

        String price=pricePartial.getText();

        return price;
    }


    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div[3]/div/div[5]/div[1]/strong/div/span")
    private WebElement priceFinal;

    public String verifyFinalPrice(){

        String finalPrice=priceFinal.getText();

        return finalPrice;
    }
}
