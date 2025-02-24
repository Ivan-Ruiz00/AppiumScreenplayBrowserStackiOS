package com.sofkau.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName){
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    /*
    @After
    public void logOut(){

        OnStage.theActorInTheSpotlight().attemptsTo(
                LogOut.fromDemoApp()
        );

        String messageExpected = "You are successfully logged out.";
        OnStage.theActorInTheSpotlight().should(
                seeThat("LogOut message", TextQuestion.value(HomeUI.CONFIRM_LOGOUT_TXT),equalTo(messageExpected))
        );

    }

     */

}
