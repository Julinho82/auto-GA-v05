package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Employee.Employee;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {


    private Employee employee;

    @Given("^'Loading' page$")
    public void loading() throws Throwable {
        employee = LoadPage.employee();
    }
    @And("^'Click' button employee$")
    public void clickButtonEmployee() {
        employee.clickAddEmployee();


    }
}
