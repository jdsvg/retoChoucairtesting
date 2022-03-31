package co.com.choucairtesting.retoChoucairtesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static RegisterUserReto makeinformation(){
        return instrumented(RegisterUserReto.class);
    }
}
