package com.pruebasautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.pruebasautomation.userinterfaces.UserPage.TEXT_VALIDATION_SIMULATION;

public class ValidationSimulation implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        String stringTemporal = Text.of(TEXT_VALIDATION_SIMULATION).viewedBy(actor).asString();
        return stringTemporal.contains("¡Hola! Para comprar, ingresa a tu cuenta");

    }
    public static ValidationSimulation theSimulationOk(){return new ValidationSimulation();}
}
