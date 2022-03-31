package co.com.choucairtesting.retoChoucairtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Address {
    //Zip & Country
    //public static final Target CITY = Target.the("city").
    //        locatedBy("//input[@id=\"city\"]");
    public static final Target ZIP = Target.the("zip").
            locatedBy("//input[@id=\"zip\"]");
    //Span-Country
    public static final Target SPAN_COUNTRY = Target.the("span country").
            locatedBy("//span[@class=\"ui-select-match-text pull-left\"]");
    //Span-div (Colombia)
    public static final Target UL_COUNTRY_COLOMBIA = Target.the("address country Colombia").
            locatedBy("(//div[@ng-bind-html=\"country.name | highlight: $select.search\"])[52]");


    //Next Location
    public static final Target NEXTLOCATION = Target.the("nextlocation address").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");







}
