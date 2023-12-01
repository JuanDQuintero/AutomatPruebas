package com.pruebasautomation.tasks;

import com.pruebasautomation.interactions.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class NavigatePageMercadoLibre implements Task {
    private final PageObject page;

    public NavigatePageMercadoLibre(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MercadolibreHomePage.go());
    }
    public static com.pruebasautomation.tasks.NavigatePageMercadoLibre onPage(PageObject page) {
        return Tasks.instrumented(NavigatePageMercadoLibre.class,page);
    }
}
