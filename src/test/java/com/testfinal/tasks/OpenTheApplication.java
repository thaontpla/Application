package com.testfinal.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.testfinal.ui.TechmasterPage;

public class OpenTheApplication implements Task {
    TechmasterPage techmasterPage;
    @Override
    @Step("Open the Techmaster page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(techmasterPage)
        );
    }
}
