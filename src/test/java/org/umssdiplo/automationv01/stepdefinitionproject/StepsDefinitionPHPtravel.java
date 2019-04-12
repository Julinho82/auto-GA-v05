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
        employee.fillFirstName("Jose Miguel");
        employee.fillLastName("Velasquez");
        employee.fillCi("823664");
        employee.fillGender("MALE");
        employee.fillAddress("Sacaba");
        employee.fillDOB("31/07/1985");
        employee.fillPhone("65380106");
        employee.fillEmailField("jose@Miguel.com");
        employee.fillEmployeeType("Employee");
        employee.fillSalaryField("3500");
    }

    @And("^delete 'Employee' data$")
    public void deleteEmployeeData() {
        employee.clickDeleteEditButton(1,1);
        fillData();
        employee.clickDelEmployee();
    }
}
