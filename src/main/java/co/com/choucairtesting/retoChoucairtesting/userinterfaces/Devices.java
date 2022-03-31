package co.com.choucairtesting.retoChoucairtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {

    //Your Computer
    //Span
    public static final Target SPAN_COMPUTER = Target.the("span computer").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    //Span-div (Ubuntu)
    public static final Target UL_COMPUTER_UBUNTU = Target.the("device computer Ubuntu").
            locatedBy("(//div[@ng-bind-html=\"device.name | highlight: $select.search\"])[9]");

    //Version
    //Span
    public static final Target SPAN_VERSION_UBUNTU = Target.the("span version ubuntu").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    //Span-div (Ubuntu 20.014 LTS)
    public static final Target UL_UBUNTU_VERSION = Target.the("version Ubuntu 20.04 LTS").
            locatedBy("(//div[@ng-bind-html=\"version.name | highlight: $select.search\"])[1]");

    //Language
    //Span
    public static final Target SPAN_LANGUAGE_DEVICE = Target.the("span languge device").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    //Span-div (Ubuntu-language)
    public static final Target UL_UBUNTU_VERSION = Target.the("version Ubuntu 20.04 LTS").
            locatedBy("(//div[@ng-bind-html=\"version.name | highlight: $select.search\"])[1]");




    //Next Location
    public static final Target NEXTLOCATION = Target.the("nextlocation address").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
