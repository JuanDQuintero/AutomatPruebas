package com.pruebasautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.pruebasautomation.userinterfaces.UserPage.VALIDATION_MERCADOLIBRE;

public class ValidationPageMercadolibre implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String stringTemporal = Text.of(VALIDATION_MERCADOLIBRE).viewedBy(actor).asString();
        return stringTemporal.contains("Copyright © 1999-2023 MercadoLibre Colombia LTDA.");
    }

    public static ValidationPageMercadolibre theHomePage(){return new ValidationPageMercadolibre();}
}