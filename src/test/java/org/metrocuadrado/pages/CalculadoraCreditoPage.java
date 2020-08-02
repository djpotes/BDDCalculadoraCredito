package org.metrocuadrado.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

@DefaultUrl("https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/")
public class CalculadoraCreditoPage extends PageObject {

    @FindBy(className="verprestamo")
    private WebElementFacade tagCuantoPrestan;

    @FindBy(className="vercuotas")
    private WebElementFacade tagValorCuotas;

    @FindBy(xpath="//div[@class='col-md-7 col-sm-8 col-xs-12 resultados cuotas']")
    private WebElementFacade panelResultadoCuotas;

    @FindBy(xpath="//div[@class='col-md-7 col-sm-8 col-xs-12 resultados credito']")
    private WebElementFacade panelResultadoPrestamo;

    @FindBy(xpath="//p[contains(text(),'Los ingresos deben ser mayores o iguales a $737,717.')]/following-sibling::p")
    private WebElementFacade labelValidacionIngresosTotalesObligatorio;

    @FindBy(xpath="//p[contains(text(),'El valor del crédito debe ser mayor o igual a $15,000,000.')]/following-sibling::p")
    private WebElementFacade labelValidacionValorCreditoObligatorio;

    @FindBy(xpath="//p[contains(text(),'Los ingresos deben ser mayores o iguales a $737,717.')]")
    private WebElementFacade labelValidacionIngresosTotalesRango;

    @FindBy(xpath="//p[contains(text(),'El valor del crédito debe ser mayor o igual a $15,000,000.')]")
    private WebElementFacade labelValidacionValorCreditoRango;

    @FindBy(id="ingresosMensuales")
    private WebElementFacade textIngresosMensuales;

    @FindBy(name="loadAmount")
    private WebElementFacade textValorCredito;

    @FindBy(xpath="//select[@ng-model='termInYears']")
    private WebElementFacade selectPlazoEnAnoPrestamo;

    @FindBy(xpath="//select[@ng-model='termInYearsByQuota']")
    private WebElementFacade selectPlazoEnAnoCuota;

    @FindBy(xpath="//h4[contains(text(),'Calcular Crédito')]/parent::button")
    private WebElementFacade btnCalcularCredito;

    @FindBy(xpath="//h4[contains(text(),'Calcular Cuotas')]/parent::button")
    private WebElementFacade btnCalcularCuota;

    public void clickCuandoTePrestanTab(){
        tagCuantoPrestan.click();
    }

    public void clickValorCuotaTab(){
        tagValorCuotas.click();
    }

    public boolean isVisibleValidacionIngresosTotalesObligatorio(){
        return labelValidacionIngresosTotalesObligatorio.isVisible();
    }

    public boolean isVisiblePanelResultadoCuota(){
        return panelResultadoCuotas.isVisible();
    }

    public boolean isVisiblePanelResultadoPrestamo(){
        return panelResultadoPrestamo.isVisible();
    }

    public boolean isVisibleValidacionIngresosTotalesRango(){
        return labelValidacionIngresosTotalesRango.isVisible();
    }

    public boolean isVisibleValidacionValorCreditoObligatorio(){
        return labelValidacionValorCreditoObligatorio.isVisible();
    }

    public boolean isVisibleValidacionValorCreditoRango(){
        return labelValidacionValorCreditoRango.isVisible();
    }

    public boolean isEnabledCalcularCreditoButton(){
        return btnCalcularCredito.isEnabled();
    }

    public boolean isDisabledCalcularCreditoButton(){
        return btnCalcularCredito.isDisabled();
    }

    public boolean isEnabledCalcularCuotaButton(){
        return btnCalcularCuota.isEnabled();
    }

    public boolean isDisabledCalcularCuotaButton(){
        return btnCalcularCuota.isDisabled();
    }

    public void ingresarIngresosMensuales(String value){
        if(value.isEmpty()){
            textIngresosMensuales.click();
            textIngresosMensuales.sendKeys(Keys.TAB);
        }else{
            textIngresosMensuales.type(value).sendKeys(Keys.TAB);
        }
    }

    public void ingresarValorDelCredito(String value){
        if(value.isEmpty()){
            textValorCredito.click();
            textValorCredito.sendKeys(Keys.TAB);
        }else{
            textValorCredito.type(value).sendKeys(Keys.TAB);
        }
    }

    public String obtenerIngresosMensuales(){
        return textIngresosMensuales.getText();
    }

    public String obtenerValorDelCredito(){
        return textValorCredito.getText();
    }

    public void selectPlazoEnAnoPrestamo(String text){
        selectPlazoEnAnoPrestamo.selectByVisibleText(text);
    }

    public void selectPlazoEnAnoCuota(String text){
        selectPlazoEnAnoCuota.selectByVisibleText(text);
    }

    public void clickCalcularCredito(){
        btnCalcularCredito.click();
    }

    public void clickCalcularCuota(){
        btnCalcularCuota.click();
    }
}