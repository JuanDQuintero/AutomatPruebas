package com.pruebasautomation.interactions;

import com.pruebasautomation.userinterfaces.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebasautomation.userinterfaces.UserPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectBuyNow implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(UserPage.BUTTON_SHOP_NOW, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(UserPage.BUTTON_SHOP_NOW)
        );

    }

    public static SelectBuyNow go(){
        return Tasks.instrumented(SelectBuyNow.class);
    }
}
