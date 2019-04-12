package org.umssdiplo.automationv01.core.managepage.Employee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Employee extends BasePage {

    @FindBy(css = ".btn-primary")
    private WebElement refreshButton;

    @FindBy(css = ".btn.btn-success")
    private WebElement addEmployeeButton;

    public void clickAddEmployee(){

        addEmployeeButton.click();


    }


}
