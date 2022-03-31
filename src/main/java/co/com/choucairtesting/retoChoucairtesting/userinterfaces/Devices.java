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
    public static final Target UL_UBUNTU_VERSION_20_04_LTS = Target.the("version Ubuntu 20.04 LTS").
            locatedBy("(//div[@ng-bind-html=\"version.name | highlight: $select.search\"])[1]");

    //Language
    //Span
    public static final Target SPAN_LANGUAGE_DEVICE = Target.the("span languge device").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    //Span-div (Ubuntu-20.04LTS-English)
    public static final Target UL_UBUNTU_20_04_LTS_ENGLISH = Target.the("version Ubuntu 20.04 LTS").
            locatedBy("(//div[@ng-bind-html=\"language.name | highlight: $select.search\"])[11]");


    //Mobile Device
    //Span
    public static final Target SPAN_MOBILE_DEVICE = Target.the("span mobile device").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    //Span-div (Mobile Device Motorola)
    public static final Target UL_MOBILE_DEVICE_MOTOROLA = Target.the("mobile device Motorola").
            locatedBy("(//div[@ng-bind-html=\"device.name | highlight: $select.search\"])[24]");


    //Mobile Device Model
    //Span
    public static final Target SPAN_MOBILE_DEVICE_MOTOROLA_MODEL = Target.the("span mobile device").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    //Span-div (Mobile Device Motorola)
    public static final Target UL_MOBILE_DEVICE_MOTOROLA_W230 = Target.the("mobile device Motorola w230").
            locatedBy("(//div[@ng-bind-html=\"model.name | highlight: $select.search\"])[6]");


    //Mobile Device OS
    //Span
    public static final Target SPAN_MOBILE_DEVICE_OS = Target.the("span mobile operative system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
    //Span-div (Mobile Device Motorola)
    public static final Target UL_MOBILE_DEVICE_MOTOROLA_W230_JAVAME = Target.the("mobile device Motorola w230 JAVA_ME").
            locatedBy("(//div[@ng-bind-html=\"osVersion.name | highlight: $select.search\"])[1]");



    //Next Location
    public static final Target NEXTLOCATION = Target.the("nextlocation devices").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
