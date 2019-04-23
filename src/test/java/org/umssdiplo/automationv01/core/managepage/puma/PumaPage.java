package org.umssdiplo.automationv01.core.managepage.puma;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;


public class PumaPage extends BasePage {



    @FindBy(css="//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement menHombre;

    public void clickMenHombre(){

        menHombre.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement fubtolChose;
    private  Login login;


    public void clickFutChose(){
        fubtolChose.click();
        login.mouseOver(fubtolChose);

    }







}
