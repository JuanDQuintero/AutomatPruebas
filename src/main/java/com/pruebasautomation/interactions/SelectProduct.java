package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.calidad.calidadautomation.userinterfaces.UserPage.*;

public class SelectProduct implements Interaction {
    String product = String.valueOf("play 5");

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_SEARCH)
        );

    }

    public static SelectProduct go(){
        return Tasks.instrumented(SelectProduct.class);
    }
}
