package com.pruebasautomation.tasks;

import com.pruebasautomation.interactions.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoBuyNow implements Task {
    private final PageObject page;

    public GoBuyNow(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectBuyNow.go());
    }
    public static com.pruebasautomation.tasks.GoBuyNow onPage(PageObject page) {
        return Tasks.instrumented(GoBuyNow.class,page);
    }
}
