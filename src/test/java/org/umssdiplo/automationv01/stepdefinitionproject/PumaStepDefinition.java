package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Assigment.Assigment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.puma.PumaPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class PumaStepDefinition {

    private Login login;

    private PumaPage pumaPage;

    private WebElement webElement;
    private Actions action;
    private By driver;


    @Given("^Load 'Puma'$")
    public void loadPuma() {

        login = LoadPage.loginPage();

    }

    @And("^click 'Hombre'$")
    public void clickHombre() {

        login.clickMenHombre();

    }

    @And("^select 'futbol'$")
    public void selectFutbol() {

        login.clickFutMenu();

    }

    @And("^Find 'futbol onhover'$")
    public void findFutbolOnhover() {

        login.clickFindFut();

    }

    @And("^Find 'Searh'$")
    public void findSearh() {

    }

    @And("^fill 'Data'$")
    public void fillDataSearch() throws Throwable {

        fillData();


    }

    public void fillData(){

        login.fillSearch("CALZADO DE FÚTBOL X 18.3 TF");


        //action.sendKeys(Keys.ENTER);
        //action.sendKeys(driver.findElement((SearchContext) By.className("searchinput___3ump9")),Keys.ENTER).build().perform();

    }

    @And("^chose 'Sport'$")
    public void choseSport() {

        login.clickSportFut();

    }

    @And("^get 'Talla'$")
    public void getTalla() {

        login.clickListTalla();

    }

    @And("^select 'Talla'$")
    public void selectTalla() {

        login.clickSelectTalla();
    }

    @And("^quantity is \"([^\"]*)\" on 'bag'$")
    public void quantityIsOnBag(String cantidadEsperada) throws Throwable {
      String cantidadActual=login.verifyQuantity();
      Assert.assertEquals(cantidadActual,cantidadEsperada,"Cantidad: 1");
    }

    @Then("^price is \"([^\"]*)\"$")
    public void priceIs(String precioEsperado) throws Throwable {
        String precioActual=login.verifyPartialPrice();
        Assert.assertEquals(precioEsperado,precioActual,"$1,329");

    }

    @And("^final price is \"([^\"]*)\"$")
    public void finalPriceIs(String precioFinalEsperado) throws Throwable {

        String precioFinalActual=login.verifyFinalPrice();
        Assert.assertEquals(precioFinalEsperado,precioFinalActual,"$1,428");

    }

}
