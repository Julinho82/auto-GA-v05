package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Assigment.Assigment;
import org.umssdiplo.automationv01.core.managepage.Employee.Employee;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {


    private Employee employee;

    private Assigment assigment;

    @Given("^'Loading' page$")
    public void loading() throws Throwable {
        employee = LoadPage.employee();
    }
    @And("^'Click' button employee$")
    public void clickButtonEmployee() {
        employee.clickAddEmployee();


    }

    @And("^add 'Employee' data$")
    public void addNewEmployee() throws Throwable{
        employee.clickAddEmployee();
        fillData();
        employee.clickCreateButton();
    }

    @And("^edit 'Employee' data$")
    public void EditNewEmployee() throws Throwable{
        employee.clickDeleteEditButton(1,2);
        fillData();
        employee.clickCreateButton();
    }

    private void fillData(){
        employee.fillFirstName("Juan Miguel");
        employee.fillLastName("Flores");
        employee.fillCi("932685");
        employee.fillGender("MALE");
        employee.fillAddress("Cercado");
        employee.fillDOB("31/07/1985");
        employee.fillPhone("65380106");
        employee.fillEmailField("Juan@Miguel.com");
        employee.fillEmployeeType("Employee");
        employee.fillSalaryField("2500");
    }

    @And("^delete 'Employee' data$")
    public void deleteEmployeeData() {
        employee.clickDeleteEditButton(1,1);
        fillData();
        employee.clickDelEmployee();
    }

    @Given("^Load Assigment Report$")
    public void loadAssigmentReport() {
        assigment=LoadPage.assigment();

    }

    @And("^click 'Menu Assigment'$")
    public void clickMenuAssigment() {
        assigment.clickAssigment();
    }

    @And("^click 'Submenu Report'$")
    public void clickSubmenuReport() {
        assigment.clickAssigmentReport();
    }
}
