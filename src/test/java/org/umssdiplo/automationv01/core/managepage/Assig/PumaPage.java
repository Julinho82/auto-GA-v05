package org.umssdiplo.automationv01.core.managepage.Assig;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class PumaPage extends BasePage {

    @FindBy(css="//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement menHombre;

    public void clickMenHombre(){

        menHombre.click();

    }




}
