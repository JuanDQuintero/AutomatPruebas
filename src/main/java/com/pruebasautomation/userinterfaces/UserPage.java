package com.pruebasautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject {
    public static final Target INPUT_SEARCH = Target.the("INPUT SEARCH").locatedBy("//*[@id=\"cb1-edit\"]");
    public static final Target BUTTON_SEARCH = Target.the("BUTTON_SEARCH").locatedBy("/html/body/header/div/div[2]/form/button");
    public static final Target BUTTON_PRODUCT = Target.the("BUTTON_PRODUCT").locatedBy("//*[@id=\":R159b9:\"]/div[2]/div[2]/a");
    public static final Target BUTTON_SHOP_NOW = Target.the("BUTTON_SHOP_NOW").locatedBy("//*[@id=\":R15d5a6c4ui:\"]");

    public static final Target TEXT_VALIDATION_SIMULATION = Target.the("TEXT VALIDATION").locatedBy("//*[@id=\"root-app\"]/div/div[1]/div/div[2]/div[1]/h1");
    public static final Target VALIDATION_MERCADOLIBRE = Target.the("VALIDATION MERCADOLIBRE").locatedBy("/html/body/footer/div[1]/div/div/small");

}