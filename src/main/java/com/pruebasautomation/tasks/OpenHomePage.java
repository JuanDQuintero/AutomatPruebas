package com.pruebasautomation.tasks;

import com.pruebasautomation.interactions.MercadolibreHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenHomePage implements Task {
    private PageObject page;

    public OpenHomePage(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenHomePage Browser(PageObject page){
        return Tasks.instrumented(OpenHomePage.class,page);
    }

}
