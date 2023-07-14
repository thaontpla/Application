package com.testfinal.tasks;

import com.testfinal.entity.UserAccount;
import com.testfinal.ui.RegistrationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registration implements Task {
    private UserAccount userAccount;

    public Registration(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public static Registration inputInfoRegister(UserAccount registration) {
        return instrumented(Registration.class, registration);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IconUser.choose(),
                Click.on(RegistrationUI.DANG_KI),
                Enter.theValue(userAccount.getName()).into(RegistrationUI.HO_TEN),
                Enter.theValue(userAccount.getEmail()).into(RegistrationUI.EMAIL),
                Enter.theValue(userAccount.getPhone()).into(RegistrationUI.PHONE),
                Enter.theValue(userAccount.getPass()).into(RegistrationUI.PASSWORD),
                Enter.theValue(userAccount.getRetypePass()).into(RegistrationUI.RETYPE_PASSWORD),
                Click.on(RegistrationUI.DANG_KI_BUTTON)
        );
    }
}
