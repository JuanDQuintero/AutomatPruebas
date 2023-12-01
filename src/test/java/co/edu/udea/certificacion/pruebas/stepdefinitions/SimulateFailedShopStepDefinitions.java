package co.edu.udea.certificacion.pruebas.stepdefinitions;


import com.pruebasautomation.interactions.SelectBuyNow;
import com.pruebasautomation.questions.ValidationPageMercadolibre;
import com.pruebasautomation.questions.ValidationSimulation;
import com.pruebasautomation.tasks.GoBuyNow;
import com.pruebasautomation.tasks.NavigatePageMercadoLibre;
import com.pruebasautomation.tasks.NavigatePageProducts;
import com.pruebasautomation.tasks.OpenHomePage;
import com.pruebasautomation.userinterfaces.UserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
public class SimulateFailedShopStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor user = Actor.named("Carlitos");

    @Given("ingreso al navegador")
    public void ingresoAlNavegador(){
        driver.manage().window().maximize();
        user.can(BrowseTheWeb.with(driver));
    }

    @And("me dirijo a la pagina de mercadolibre")
    public void meDirijoMercadolibre(){
        user.attemptsTo(OpenHomePage.Browser(new UserPage()));
    }
    @When("digito play 5 y doy click en buscar")
    public void  digitoYBuscar(){
        user.attemptsTo(NavigatePageMercadoLibre.onPage(new UserPage()));
    }

    @And("doy click en el primer producto de \"play 5\"")
    public void clickPrimerProducto(){
        user.attemptsTo(NavigatePageProducts.onPage(new UserPage()));
    }
    @And("doy click en el boton de Comprar ahora")
    public void clickComprarAhora(){
        user.attemptsTo(GoBuyNow.onPage(new UserPage()));
    }

    @Then("puedo observar que me pide iniciar sesion")
    public void  puedoObservarAlertaInicioSesion(){
        user.should(seeThat(ValidationSimulation.theSimulationOk(),equalTo(true)));
    }

}
