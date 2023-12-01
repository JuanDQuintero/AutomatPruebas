package com.calidad.calidadautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject {
    public static final Target INPUT_SEARCH = Target.the("INPUT SEARCH").locatedBy("//*[@id=\"cb1-edit\"]");
    public static final Target BUTTON_SEARCH = Target.the("INPUT SEARCH").locatedBy("/html/body/header/div/div[2]/form/button");
    public static final Target BUTTON_PRODUCT = Target.the("INPUT SEARCH").locatedBy("//*[@id=\":Rl159b9:\"]/div[2]/div/div/div/a/img");

    public static final Target LOGO_VALIDATION_LOGO_MERCADOLIBRE = Target.the("LOGO MERCADOLIBRE").locatedBy("/html/body/footer/div[1]/div/div/small");

}