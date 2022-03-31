package co.com.choucairtesting.retoChoucairtesting.stepdefinitions;
import co.com.choucairtesting.retoChoucairtesting.tasks.RegisterUserReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
//
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegisterUserStepDefinitions {
    //Instanciando Chrome como navegador
    @Managed(driver = "chrome")
    WebDriver driver;

    //Creando Actor
    @Before
    public void  setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("jdsvg");
    }

    //Paso 1: Ir a la pagina principal de Utest
    @Given("^user in the homepage$")
    public void userInTheHomepage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }


    @When("^user create and account filling all fields$")
    public void userCreateAndAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeinformation());
    }

    @Then("^user sees its username$")
    public void userSeesItsUsername() {

    }
}
