package co.com.choucairtesting.retoChoucairtesting.tasks;

import co.com.choucairtesting.retoChoucairtesting.userinterfaces.Address;
import co.com.choucairtesting.retoChoucairtesting.userinterfaces.Home;
import co.com.choucairtesting.retoChoucairtesting.userinterfaces.Personal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("John").into(Personal.FIRSNAME),
                SendKeys.of("Villamil").into(Personal.LASTNAME),
                SendKeys.of("j@villamil.com").into(Personal.EMAIL),

                SendKeys.of("April").into(Personal.BIRTHMOUNT),
                SendKeys.of("22").into(Personal.BIRTHDAY),
                SendKeys.of("1997").into(Personal.BIRTHYEAR),
                Click.on(Personal.LANGUAGE),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Address.NEXTLOCATION)
        );


    }

    public static RegisterUserReto makeinformation(){
        return instrumented(RegisterUserReto.class);
    }
}
