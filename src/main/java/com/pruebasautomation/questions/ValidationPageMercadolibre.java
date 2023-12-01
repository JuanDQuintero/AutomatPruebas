package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UserPage.LOGO_VALIDATION_LOGO_MERCADOLIBRE;

public class ValidationPageMercadolibre implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String stringTemporal = Text.of(LOGO_VALIDATION_LOGO_MERCADOLIBRE).viewedBy(actor).asString();
        return stringTemporal.contains("Copyright © 1999-2023 MercadoLibre Colombia LTDA.");
    }

    public static ValidationPageMercadolibre theHomePage(){return new ValidationPageMercadolibre();}
}