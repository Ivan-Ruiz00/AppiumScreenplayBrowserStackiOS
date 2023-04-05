package com.sofkau.tasks.compra.primeraetapa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraUI.CANTIDAD;

public class CambiarCantidad implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CANTIDAD)
        );
    }
    public static CambiarCantidad cambiarCantidad(){return new CambiarCantidad();}
}