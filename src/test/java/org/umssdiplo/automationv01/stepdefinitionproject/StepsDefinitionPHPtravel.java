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
        employee.fillFirstName("Julio");
        employee.fillLastName("Daviu");
        employee.fillCi("5242252");
        employee.fillGender("MALE");
        employee.fillAddress("Ruiz de Orellana");
        employee.fillDOB("31/07/1982");
        employee.fillPhone("70710023");
        employee.fillEmailField("julio@daviu.com");
        employee.fillEmployeeType("Employee");
        employee.fillSalaryField("85555555");
    }
}
