package com.sofkau.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.LogInUI.LOGIN;

public class ElegirLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN)
        );
    }
    public static ElegirLogin elegirLogin(){
        return new ElegirLogin();
    }
}
