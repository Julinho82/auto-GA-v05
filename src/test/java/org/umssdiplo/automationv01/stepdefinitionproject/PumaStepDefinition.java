package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.puma.PumaPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class PumaStepDefinition {

   private Login login;

   private PumaPage pumaPage;


    @Given("^Load 'Puma'$")
    public void loadPuma() {

        login=LoadPage.loginPage();

    }

    @And("^click 'Hombre'$")
    public void clickHombre() {

        login.clickMenHombre();

    }
}
