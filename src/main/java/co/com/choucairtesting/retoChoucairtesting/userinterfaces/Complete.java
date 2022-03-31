package co.com.choucairtesting.retoChoucairtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {

    //Password & Confirm Password
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");
    public static final Target CONFIRM_PASSWORD = Target.the("confirm password").
            locatedBy("//input[@id=\"confirmPassword\"]");

    //Terms & Policy
    public static final Target TERMS = Target.the("Terms of Use").
            locatedBy("(//span[@ng-class=\"{error: userForm.termOfUse.$error.required}\"])");
    public static final Target POLICY = Target.the("Privacy & Security Policy").
            locatedBy("(//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"])");


    //Next Location
    public static final Target COMPLETE_BUTTON = Target.the("complete button").
            locatedBy("//a[@class=\"btn btn-blue\"]");

}
