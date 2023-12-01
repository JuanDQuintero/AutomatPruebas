package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.TEXT_VALIDATION_SIMULATION;

public class ValidationSimulation implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        String stringTemporal = Text.of(TEXT_VALIDATION_SIMULATION).viewedBy(actor).asString();
        return stringTemporal.contains("Te ofrecemos estas opciones para Crédito de Libre Inversión");

    }
    public static ValidationSimulation theSimulationOk(){return new ValidationSimulation();}
}
