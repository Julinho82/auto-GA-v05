package org.umssdiplo.automationv01.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Assigment.Assigment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

public static Assigment assigment(){

ManageDriver.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseUrl());
return new Assigment();
}
}
