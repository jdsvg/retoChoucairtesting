package co.com.choucairtesting.retoChoucairtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {

    //Firsname, Lastname & Emial
    public static final Target FIRSNAME = Target.the("firsname").
            locatedBy("//input[@id=\"firstName\"]");
    public static final Target LASTNAME = Target.the("lastname").
            locatedBy("//input[@id=\"lastName\"]");
    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");


    //Birthmount, Birthday & BirthYear
    public static final Target BIRTHMOUNT = Target.the("birthmount").
            locatedBy("//select[@id=\"birthMonth\"]");
    public static final Target BIRTHDAY = Target.the("birthday").
            locatedBy("//select[@id=\"birthDay\"]");
    public static final Target BIRTHYEAR = Target.the("birthyear").
            locatedBy("//select[@id=\"birthYear\"]");


    //Language
    public static final Target LANGUAGE = Target.the("language").
            locatedBy("//span[@class=\"ui-select-match-item btn btn-default btn-xs\"]");


    //Next Location
    public static final Target NEXTLOCATION = Target.the("nextlocation devices").
            locatedBy("//a[@class=\"btn btn-blue\"]");

}
