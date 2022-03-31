package co.com.choucairtesting.retoChoucairtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Address {
    //City, Zio & Country
    public static final Target CITY = Target.the("city").
            locatedBy("//input[@id=\"city\"]");
    public static final Target ZIP = Target.the("zip").
            locatedBy("//input[@id=\"zip\"]");
    //Pre-Span
    public static final Target SPAN = Target.the("span country").
            locatedBy("//span[@class=\"ui-select-match-text pull-left\"]");
    public static final Target COUNTRY = Target.the("country").
            locatedBy("//input[@class=\"form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched\"]");


    //Next Location
    public static final Target NEXTLOCATION = Target.the("nextlocation address").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");







}
