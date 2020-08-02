package org.metrocuadrado.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.metrocuadrado.steps.CalculadoraCreditoSteps;

public class CalculoDefinitions {

    @Steps
    CalculadoraCreditoSteps calculadoraCreditoSteps;

    @Given("Quiero simular cuanto me puede prestar un banco")
    public void givenQuieroSimularCuandoPuedePrestarBanco() {
        calculadoraCreditoSteps.selectCuandoTePrestanTab();
    }

    @Given("Quiero simular el valor de las cuotas un banco")
    public void givenQuieroSimularValorCuotaBanco() {
        calculadoraCreditoSteps.selectValorCuotaTab();
    }

    @When("Ingreso campo Ingresos mensuales <ingregos_mensuales>")
    public void ingresoIngresosMensuales(@Named("ingregos_mensuales") String ingresos_mensuales) {
        calculadoraCreditoSteps.typeIngresosMensuales(ingresos_mensuales);
    }

    @When("Selecciona plazo ano para calculo de <prestamo_cuota> <plazo>")
    public void seleccionaPlazoAno(@Named("prestamo_cuota") String prestamo_cuota, @Named("plazo") String plazo) {
        calculadoraCreditoSteps.seleccionaPlazoAnoCuota(prestamo_cuota, plazo);
    }

    @When("Click Calcular credito")
    public void clickCalcularCredito() {
        calculadoraCreditoSteps.clickCalcularCredito();
    }

    @When("Click Calcular cuota")
    public void clickCalcularCuota() {
        calculadoraCreditoSteps.clickCalcularCuota();
    }

    @When("Ingreso Valor del credito <valor_credito>")
    public void ingresoValorCredito(@Named("valor_credito") String valor_credito) {
        calculadoraCreditoSteps.typeValorDelCredito(valor_credito);
    }

    @Then("Deberia ver mensaje de validación: '$mensaje' en Ingresos mensuales")
    public void deberiaVerMensajeValidacionIngresosMensuales(String mensaje) {
        calculadoraCreditoSteps.deberiaVerMensajeValidacionIngresosMensuales(mensaje);
    }

    @Then("Deberia ver mensaje de validación: '$mensaje' en Valor del credito")
    public void deberiaVerMensajeValidacionValorCredito(String mensaje) {
        calculadoraCreditoSteps.deberiaVerMensajeValidacionValorCredito(mensaje);
    }

    @Then("Deberia verse el boton Calcular Credito <calcular_activo>")
    public void debeVerseBotonCalcularCredito(@Named("calcular_activo") boolean calcular_activo) {
        calculadoraCreditoSteps.deberiaHabilitarBotonCalcularCredito(calcular_activo);
    }

    @Then("Deberia verse el boton Calcular Cuotas <calcular_cuota_activo>")
    public void debeVerseBotonCalcularCuota(@Named("calcular_cuota_activo") boolean calcular_cuota_activo) {
        calculadoraCreditoSteps.deberiaHabilitarBotonCalcularCuota(calcular_cuota_activo);
    }

    @Then("Ingresos mensuales esta vacio")
    public void ingresosMensualesEstaVacio() {
        calculadoraCreditoSteps.campoIngresosMensualesEstaVacio();
    }

    @Then("Valor del credito esta vacio")
    public void valorDelCreditoEstaVacio() {
        calculadoraCreditoSteps.campoValorDelCreditoEstaVacio();
    }

    @Then("Deberia verse el resultado del calculo <prestamo_cuota>")
    public void deberiaVerseResultadoCalculoCredito(@Named("prestamo_cuota") String prestamo_cuota) {
        calculadoraCreditoSteps.deberiaVerResultadoCalculo(prestamo_cuota);
    }
}
