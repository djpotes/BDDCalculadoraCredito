package org.metrocuadrado.steps;

import org.metrocuadrado.Util;
import org.metrocuadrado.pages.CalculadoraCreditoPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculadoraCreditoSteps {
    CalculadoraCreditoPage calculadoraCreditoPage;

    public void selectCuandoTePrestanTab(){
        calculadoraCreditoPage.open();
        calculadoraCreditoPage.clickCuandoTePrestanTab();
    }

    public void selectValorCuotaTab(){
        calculadoraCreditoPage.open();
        calculadoraCreditoPage.clickValorCuotaTab();
    }

    public void typeIngresosMensuales(String value){
        calculadoraCreditoPage.ingresarIngresosMensuales(value);
    }

    public void typeValorDelCredito(String value){
        calculadoraCreditoPage.ingresarValorDelCredito(value);
    }

    public void deberiaVerMensajeValidacionIngresosMensuales(String validacion) {
        if(validacion.equals("Por favor ingresar campo")){
            assertThat(calculadoraCreditoPage.isVisibleValidacionIngresosTotalesObligatorio(), is(true));
        }

        if(validacion.equals("Los ingresos deben ser mayores o iguales a $737,717.")){
            assertThat(calculadoraCreditoPage.isVisibleValidacionIngresosTotalesRango(), is(true));
        }
    }

    public void deberiaVerMensajeValidacionValorCredito(String validacion) {
        if(validacion.equals("Por favor ingresar campo")){
            assertThat(calculadoraCreditoPage.isVisibleValidacionValorCreditoObligatorio(), is(true));
        }

        if(validacion.equals("El valor del crédito debe ser mayor o igual a $15,000,000.")){
            assertThat(calculadoraCreditoPage.isVisibleValidacionValorCreditoRango(), is(true));
        }
    }

    public void deberiaHabilitarBotonCalcularCredito(boolean enabled) {
        Util.threadWait(1000);
        if(enabled){
            assertThat(calculadoraCreditoPage.isEnabledCalcularCreditoButton(), is(true));
        }else{
            assertThat(calculadoraCreditoPage.isDisabledCalcularCreditoButton(), is(true));
        }
    }

    public void deberiaHabilitarBotonCalcularCuota(boolean enabled) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
        }
        if(enabled){
            assertThat(calculadoraCreditoPage.isEnabledCalcularCuotaButton(), is(true));
        }else{
            assertThat(calculadoraCreditoPage.isDisabledCalcularCuotaButton(), is(true));
        }
    }

    public void campoIngresosMensualesEstaVacio() {
        assertThat(calculadoraCreditoPage.obtenerIngresosMensuales().isEmpty(),is(true));
    }

    public void campoValorDelCreditoEstaVacio() {
        assertThat(calculadoraCreditoPage.obtenerValorDelCredito().isEmpty(),is(true));
    }

    public void deberiaVerResultadoCalculo(String prestamo_cuota) {
        Util.threadWait(1000);
        if(prestamo_cuota.equals("prestamo")){
            assertThat(calculadoraCreditoPage.isVisiblePanelResultadoPrestamo(), is(true));
        }
        if(prestamo_cuota.equals("cuota")){
            assertThat(calculadoraCreditoPage.isVisiblePanelResultadoCuota(), is(true));
        }
    }

    public void seleccionaPlazoAnoCuota(String prestamo_cuota, String plazoAno){
        if(prestamo_cuota.equals("prestamo")) {
            calculadoraCreditoPage.selectPlazoEnAnoPrestamo(plazoAno);
        }

        if(prestamo_cuota.equals("cuota")) {
            calculadoraCreditoPage.selectPlazoEnAnoCuota(plazoAno);
        }
    }

    public void clickCalcularCredito(){
        calculadoraCreditoPage.clickCalcularCredito();
    }

    public void clickCalcularCuota(){
        calculadoraCreditoPage.clickCalcularCuota();
    }
}
