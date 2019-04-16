package org.umssdiplo.automationv01.core.managepage.Assigment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Assigment extends BasePage {

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(5) > a")
    private WebElement menuAssigment;


    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[5]/ul/li[3]/a")
    private WebElement subMenuAssigment;

    public void clickAssigment(){
        menuAssigment.click();
    }

    public void clickAssigmentReport(){
        subMenuAssigment.click();

    }

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(5) > a")
    private WebElement menuAssigmentEmployee;

    public void clickAssigmenteEmployee(){

        menuAssigmentEmployee.click();
    }

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[5]/ul/li[2]/a")
    private  WebElement subMenuAssigmentEmployee;

    public void clickAssigmentEmployee(){

        subMenuAssigmentEmployee.click();
    }




}
