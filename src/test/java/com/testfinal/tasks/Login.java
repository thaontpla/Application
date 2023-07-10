package com.testfinal.tasks;

import com.testfinal.entity.UserAccount;
import com.testfinal.ui.LoginUI;
import com.testfinal.ui.TechmasterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    UserAccount userAccount;
    public static Login inputAccount() {
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TechmasterPage.USER_ICON),
                Enter.theValue(userAccount.getName()).into(LoginUI.EMAIL),
                Enter.theValue(userAccount.getPass()).into(LoginUI.PASS),
                Click.on(LoginUI.DANG_NHAP)
        );
    }
}
