package com.pruebasautomation.tasks;

import com.pruebasautomation.interactions.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class NavigatePageProducts implements Task {
    private final PageObject page;

    public NavigatePageProducts(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectProduct.go());
    }
    public static com.pruebasautomation.tasks.NavigatePageProducts onPage(PageObject page) {
        return Tasks.instrumented(NavigatePageProducts.class,page);
    }
}
