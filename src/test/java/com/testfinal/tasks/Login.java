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
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    private UserAccount userAccount;

    public Login(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public static Login inputAccount(UserAccount userAccount) {
        return instrumented(Login.class, userAccount);
    }
    @Override
    @Step("User input the information of user name and password")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IconUser.choose(),
                Enter.theValue(userAccount.getName()).into(LoginUI.EMAIL),
                Enter.theValue(userAccount.getPass()).into(LoginUI.PASS),
                Click.on(LoginUI.DANG_NHAP)
        );
    }
}
