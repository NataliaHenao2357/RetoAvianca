package steps;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import driver.SeleniumWebDriver;
import pages.AviancaPage;
import pages.SelectTiket;
import util.Excel;

public class StepsAvianca {

    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String, String>>();
    private static String  IngresarTexto = "";
    private static String defaultContent;

    public void escribirEnTexto(By elemento, String texto) {
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                Thread.sleep(2000);
                SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public void clicEnElemento(By elemento) {
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                Thread.sleep(2000);
                SeleniumWebDriver.driver.findElement(elemento).click();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public String obtenerTextoDeElemento(By elemento) {
        boolean validarElemento = false;
        String textElemento = "";
        while (validarElemento == false) {
            try {
                Thread.sleep(2000);
                textElemento = SeleniumWebDriver.driver.findElement(elemento).getText();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
        return textElemento;
    }

    public void validarTextoEnPantalla(By elemento, String texto) {
        boolean validarTexto = false;
        if (obtenerTextoDeElemento(elemento).contains(texto)) {
            validarTexto = true;
        }
        assertEquals(true, validarTexto);
    }

    public void buscarVueloIdaYVuelta(int index) {
        IngresarTexto =  IngresarTexto + "\n";
        IngresarTexto =  IngresarTexto + "\n";
        IngresarTexto = IngresarTexto + ">>>>>>>>>>>>>>>>>>>" + "\n" ;

        Excel.escribirLog(IngresarTexto);
        AviancaPage.SetBtnTipoVuelo(lecturaExcel.get(index).get("Opcion"));
        clicEnElemento(AviancaPage.getBtnTipoVuelo());
        IngresarTexto = IngresarTexto + ">>>El vuelo es de tipo: " + lecturaExcel.get(index).get("Opcion")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getTxtCiudadOrigenIdaYVuelta());
        escribirEnTexto(AviancaPage.getTxtCiudadOrigenIdaYVuelta(), lecturaExcel.get(index).get("Desde"));
        clicEnElemento(AviancaPage.getBtnCiudadSalidaAeropuerto());
        IngresarTexto = IngresarTexto + ">>>El origen del vuelo es: " + lecturaExcel.get(index).get("Desde")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getTxtCiudadDestinoIdaYVuelta());
        escribirEnTexto(AviancaPage.getTxtCiudadDestinoIdaYVuelta(), lecturaExcel.get(index).get("Hacia"));
        clicEnElemento(AviancaPage.getBtnCiudadDestinoAeropuerto());
        IngresarTexto = IngresarTexto + ">>>El destino del vuelo es: " + lecturaExcel.get(index).get("Hacia")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getTxtFechaDestinoIdaYVuelta());
        AviancaPage.setBtnFechaCalendarioIdaYVuelta(lecturaExcel.get(index).get("FechaIda").split("-")[0].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[1].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[2]);
        clicEnElemento(AviancaPage.getBtnFechaCalendarioIdaYVuelta());
        IngresarTexto = IngresarTexto + ">>>La fecha de ida del vuelo es: " + lecturaExcel.get(index).get("FechaIda")+ "\n";
        Excel.escribirLog(IngresarTexto);
        try {
            Thread.sleep(3000);
        }
        catch(Exception e){
        }
        clicEnElemento(AviancaPage.getTxtFechaDestinoIdaYVuelta());
        AviancaPage.setBtnFechaCalendarioIdaYVuelta(lecturaExcel.get(index).get("FechaVuelta").split("-")[0].replaceAll("01", "1").replaceAll("02", "2").
        replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), 
        lecturaExcel.get(index).get("FechaVuelta").split("-")[1].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").
        replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaVuelta").split("-")[2]);

        clicEnElemento(AviancaPage.getBtnFechaCalendarioIdaYVuelta());
        IngresarTexto = IngresarTexto + ">>>La fecha de vuelta del vuelo es: " + lecturaExcel.get(index).get("FechaVuelta")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getBtnPasajeroIdaYVuelta());


        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_niño")); i++) {
            clicEnElemento(AviancaPage.getBtnNiñosIdaYVuelta());
        }

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto")); i++) {
            if (Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto")) > 1) {
                clicEnElemento(AviancaPage.getBtnAdulostIdaYVuelta());
            }
        }

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_bebe")); i++) {
            clicEnElemento(AviancaPage.getBtnBebesIdaYVuelta());
        }
        clicEnElemento(AviancaPage.getBtnPasajeroIdaYVuelta());
        clicEnElemento(AviancaPage.getBtnBuscarVueloIdaYVuelta());
        escogerVuelo();
        clicEnElemento(SelectTiket.getBtnPrincipal());

    }

    public void buscarVueloSoloIda(int index) {

        IngresarTexto =  IngresarTexto + "\n";
        IngresarTexto =  IngresarTexto + "\n";
        IngresarTexto  = IngresarTexto + ">>>>>>>>>>>>>>>>>>>" + "\n" ;

        AviancaPage.SetBtnTipoVuelo(lecturaExcel.get(index).get("Opcion"));
        clicEnElemento(AviancaPage.getBtnTipoVuelo());
        IngresarTexto = IngresarTexto + ">>>El vuelo es de tipo: " + lecturaExcel.get(index).get("Opcion")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getTxtCiudadOrigenSoloIda());
        escribirEnTexto(AviancaPage.getTxtCiudadOrigenSoloIda(), lecturaExcel.get(index).get("Desde"));
        clicEnElemento(AviancaPage.getBtnCiudadSalidaAeropuerto());
        IngresarTexto = IngresarTexto + ">>>El origen del vuelo es: " + lecturaExcel.get(index).get("Desde")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getTxtCiudadDestinoSoloIda());
        escribirEnTexto(AviancaPage.getTxtCiudadDestinoSoloIda(), lecturaExcel.get(index).get("Hacia"));
        clicEnElemento(AviancaPage.getBtnCiudadDestinoAeropuerto());
        IngresarTexto = IngresarTexto + ">>>El destino del vuelo es: " + lecturaExcel.get(index).get("Hacia")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getTxtFechaDestinoSoloIda()); 
        AviancaPage.setBtnFechaCalendarioSoloIda(lecturaExcel.get(index).get("FechaIda").split("-")[0].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[1].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[2]);
        
        clicEnElemento(AviancaPage.getBtnFechaCalendarioSoloIda());
        IngresarTexto = IngresarTexto + ">>>La fecha de ida del vuelo es: " + lecturaExcel.get(index).get("FechaIda")+ "\n";
        Excel.escribirLog(IngresarTexto);
        clicEnElemento(AviancaPage.getBtnPasajeroSoloIda());
        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_niño")); i++) {
            clicEnElemento(AviancaPage.getBtnNiñosSoloIda());
        }
        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto")); i++) {
            if (Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto")) > 1) {
                clicEnElemento(AviancaPage.getBtnAdultosSoloIda());
            }
        }

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_bebe")); i++) {
            clicEnElemento(AviancaPage.getBtnBebesSoloIda());
        }
        clicEnElemento(AviancaPage.getBtnPasajeroSoloIda());
        clicEnElemento(AviancaPage.getBtnBuscarVueloSoloIda());
        escogerVuelo();
        clicEnElemento(SelectTiket.getBtnPrincipal());

    }

    public void buscarVuelo() {
        try {
            lecturaExcel = Excel.readExcel("C:\\Users\\Juan Andres\\Desktop\\Natalia\\SQA\\RetoAvianca\\Avianca.xlsx", "Datos");
        } catch (IOException e) {
             e.printStackTrace();
        }

        for (int i = 0; i < lecturaExcel.size(); i++) {
            System.out.println(lecturaExcel.get(i).get("Opcion"));
            switch (lecturaExcel.get(i).get("Opcion")) {
                case "Ida y vuelta":
                    buscarVueloIdaYVuelta(i);
                    break;
                case "Solo ida":
                    buscarVueloSoloIda(i);
                    break;
            }
        }
    }

    public void escogerVuelo() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SeleniumWebDriver.driver.findElements(SelectTiket.getBtnSelectVuelos()).get(2).click();
        Random random = new Random();

        int numeroAleatorio = random.nextInt(SeleniumWebDriver.driver.findElements(SelectTiket.getLblTipoViaje()).size());
        IngresarTexto = IngresarTexto + ">>>Se selecciono la categoria " + SeleniumWebDriver.driver.findElements(SelectTiket.getLblTipoViaje()).get(numeroAleatorio).getText() + " del vuelo"+ "\n";
        Excel.escribirLog(IngresarTexto);
        SeleniumWebDriver.driver.findElements(SelectTiket.getBtnTipoViaje()).get(numeroAleatorio).click();
        cerrarVentanaEmergente();

    }
    public void cerrarVentanaEmergente() {
        defaultContent = SeleniumWebDriver.driver.getWindowHandle();
        Set<String> lista = SeleniumWebDriver.driver.getWindowHandles();
        Iterator<String> Il = lista.iterator();
        while(Il.hasNext()) {
            String child_windows = Il.next();
            if (!defaultContent.equals(child_windows)) {
                SeleniumWebDriver.driver.switchTo().window(child_windows);
            }
        }
        try {
            SeleniumWebDriver.driver.findElement(SelectTiket.getBtnVentanaEmergente()).click();
        } catch (Exception e) {

        }
        SeleniumWebDriver.driver.switchTo().window(defaultContent);
    }
}









