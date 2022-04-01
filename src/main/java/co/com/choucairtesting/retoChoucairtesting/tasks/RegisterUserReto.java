package co.com.choucairtesting.retoChoucairtesting.tasks;

import co.com.choucairtesting.retoChoucairtesting.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.ClearBy;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import java.util.concurrent.TimeUnit;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class RegisterUserReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Seccion Personal
                Click.on(Home.REGISTER),
                SendKeys.of("John").into(Personal.FIRSNAME),
                SendKeys.of("Doe").into(Personal.LASTNAME),
                SendKeys.of("jdsvg26@villamil.com").into(Personal.EMAIL),
                SendKeys.of("April").into(Personal.BIRTHMOUNT),
                SendKeys.of("22").into(Personal.BIRTHDAY),
                SendKeys.of("1997").into(Personal.BIRTHYEAR),
                Click.on(Personal.LANGUAGE),
                Click.on(Personal.NEXTLOCATION),
                //Seccion Address
                Clear.field(Address.ZIP),
                SendKeys.of("111021").into(Address.ZIP),
                Click.on(Address.SPAN_COUNTRY),
                Click.on(Address.UL_COUNTRY_COLOMBIA),
                Click.on(Address.NEXTLOCATION),
                //Seccion Devices
                Click.on(Devices.SPAN_COMPUTER),
                Click.on(Devices.UL_COMPUTER_UBUNTU),
                Click.on(Devices.SPAN_VERSION_UBUNTU),
                Click.on(Devices.UL_UBUNTU_VERSION_20_04_LTS),
                Click.on(Devices.SPAN_LANGUAGE_DEVICE),
                Click.on(Devices.UL_UBUNTU_20_04_LTS_ENGLISH),
                Click.on(Devices.SPAN_MOBILE_DEVICE),
                Click.on(Devices.UL_MOBILE_DEVICE_MOTOROLA),
                Click.on(Devices.SPAN_MOBILE_DEVICE_MOTOROLA_MODEL),
                Click.on(Devices.UL_MOBILE_DEVICE_MOTOROLA_W230),
                Click.on(Devices.SPAN_MOBILE_DEVICE_OS),
                Click.on(Devices.UL_MOBILE_DEVICE_MOTOROLA_W230_JAVAME),

                Click.on(Devices.NEXTLOCATION),
                //Seccion Complete
                SendKeys.of("@unapassSegura968").into(Complete.PASSWORD),
                SendKeys.of("@unapassSegura968").into(Complete.CONFIRM_PASSWORD),
                Click.on(Complete.TERMS),
                Click.on(Complete.POLICY),
                Click.on(Complete.COMPLETE_BUTTON)


        );
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static RegisterUserReto makeinformation(String strFirstName, String strLastName, String strEmail, String strBirthmount, String strBirthday, String strBirthyear, String strZIP, String strPassword){
        return instrumented(RegisterUserReto.class, strFirstName, strLastName, strEmail, strBirthmount, strBirthday, strBirthyear, strZIP, strPassword);
    }

    public RegisterUserReto(String strFirstName, String strLastName, String strEmail, String strBirthmount, String strBirthday, String strBirthyear, String strZIP, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthmount = strBirthmount;
        this.strBirthday = strBirthday;
        this.strBirthyear = strBirthyear;
        this.strZIP = strZIP;
        this.strPassword = strPassword;

    }

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthmount;
    private String strBirthday;
    private String strBirthyear;
    private String strZIP;
    private String strPassword;

}
