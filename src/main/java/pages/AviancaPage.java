package pages;

import org.openqa.selenium.By;

public class AviancaPage {

	private static By btnTipoVuelo = By.xpath("//a[contains(text(),'Solo ida')]");
	private static By txtCiudadOrigenIdaYVuelta = By
			.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbOrigen')]");
	private static By txtCiudadDestinoIdaYVuelta = By
			.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbDestino')]");
	private static By txtNumPasajeroIdaYVuelta = By
			.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbPasajeros')]");
	private static By btnPasajeroIdaYVuelta = By
			.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbPasajeros')]");
	private static By btnBuscarVueloIdaYVuelta = By
			.xpath("//div[contains(@id,'ida_regreso_1')]//button[contains(text(),'Buscar vuelos')]");
	private static By btnAdulostIdaYVuelta = By.xpath(
			"//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
	private static By btnNiñosIdaYVuelta = By.xpath(
			"//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
	private static By btnBebesIdaYVuelta = By.xpath(
			"//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
	private static By txtFechaOrigenIdaYVuelta = By
			.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_1')]");
	private static By txtFechaDestinoIdaYVuelta = By
			.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_2')]");
	private static By btnFechaCalendarioIdaYVuelta;

	private static By txtCiudadOrigenSoloIda = By
			.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbOrigen')]");
	private static By txtCiudadDestinoSoloIda = By
			.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbDestino')]");
	private static By txtNumdPasajeroSoloIda = By
			.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbPasajeros')]");
	private static By btnPasajeroSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbPasajeros')]");
	private static By btnBuscarVueloSoloIda = By
			.xpath("//div[contains(@id,'ida_1')]//button[contains(text(),'Buscar vuelos')]");
	private static By btnAdultosSoloIda = By.xpath(
			"//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
	private static By btnNiñosSoloIda = By.xpath(
			"//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
	private static By btnBebesSoloIda = By.xpath(
			"//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
	private static By txtFechaDestinoSoloIda = By
			.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbFechaIda_2') and @type='text']");
	private static By btnFechaCalendarioSoloIda;

	private static By btnCiudadSalidaAeropuerto = By
			.xpath("//div[contains(@data-source,'origin')]//ul[@role='list']//li");
	private static By btnCiudadDestinoAeropuerto = By
			.xpath("//div[contains(@data-source,'destination')]//ul[@role='list']//li");

	private static By btnCookies = By.xpath("//button[@name='cookies-confirm']");

	public static By getBtnCookies() {
		return btnCookies;
	}

	public static void setBtnCookies(By btnCookies) {
		AviancaPage.btnCookies = btnCookies;
	}

	public static By getBtnTipoVuelo() {
		return btnTipoVuelo;
	}

	public static By getTxtCiudadOrigenIdaYVuelta() {
		return txtCiudadOrigenIdaYVuelta;
	}

	public static By getTxtCiudadDestinoIdaYVuelta() {
		return txtCiudadDestinoIdaYVuelta;
	}

	public static By getTxtNumPasajeroIdaYVuelta() {
		return txtNumPasajeroIdaYVuelta;
	}

	public static By getBtnPasajeroIdaYVuelta() {
		return btnPasajeroIdaYVuelta;
	}

	public static By getBtnBuscarVueloIdaYVuelta() {
		return btnBuscarVueloIdaYVuelta;
	}

	public static By getBtnAdulostIdaYVuelta() {
		return btnAdulostIdaYVuelta;
	}

	public static By getBtnNiñosIdaYVuelta() {
		return btnNiñosIdaYVuelta;
	}

	public static By getBtnBebesIdaYVuelta() {
		return btnBebesIdaYVuelta;
	}

	public static By getTxtFechaOrigenIdaYVuelta() {
		return txtFechaOrigenIdaYVuelta;
	}

	public static By getTxtFechaDestinoIdaYVuelta() {
		return txtFechaDestinoIdaYVuelta;
	}

	public static By getBtnFechaCalendarioIdaYVuelta() {
		return btnFechaCalendarioIdaYVuelta;
	}

	public static By getTxtCiudadOrigenSoloIda() {
		return txtCiudadOrigenSoloIda;
	}

	public static By getTxtCiudadDestinoSoloIda() {
		return txtCiudadDestinoSoloIda;
	}

	public static By getTxtNumdPasajeroSoloIda() {
		return txtNumdPasajeroSoloIda;
	}

	public static By getBtnPasajeroSoloIda() {
		return btnPasajeroSoloIda;
	}

	public static By getBtnBuscarVueloSoloIda() {
		return btnBuscarVueloSoloIda;
	}

	public static By getBtnAdultosSoloIda() {
		return btnAdultosSoloIda;
	}

	public static By getBtnNiñosSoloIda() {
		return btnNiñosSoloIda;
	}

	public static By getBtnBebesSoloIda() {
		return btnBebesSoloIda;
	}

	public static By getTxtFechaDestinoSoloIda() {
		return txtFechaDestinoSoloIda;
	}

	public static By getBtnFechaCalendarioSoloIda() {
		return btnFechaCalendarioSoloIda;
	}

	public static By getBtnCiudadSalidaAeropuerto() {
		return btnCiudadSalidaAeropuerto;
	}

	public static By getBtnCiudadDestinoAeropuerto() {
		return btnCiudadDestinoAeropuerto;
	}

	public static void SetBtnTipoVuelo(String OpcionVuelo) {
		AviancaPage.btnTipoVuelo = By.xpath("//a[contains(text(),'" + OpcionVuelo + "')]");
	}

	public static void setBtnFechaCalendarioIdaYVuelta(String dia, String mes, String año) {
		AviancaPage.btnFechaCalendarioIdaYVuelta = By
				.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'" + año + "." + mes
						+ "')]//div[@class='month']//div[text()='" + dia + "']");
		System.out.println("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'" + año + "." + mes
				+ "')]//div[@class='month']//div[text()='" + dia + "']");
	}

	public static void setBtnFechaCalendarioSoloIda(String dia, String mes, String año) {
		AviancaPage.btnFechaCalendarioSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@data-month,'"
				+ año + "." + mes + "')]//div[@class='month']//div[text()='" + dia + "']");
		System.out.println("//div[contains(@id,'ida_1')]//div[contains(@data-month,'" + año + "." + mes
				+ "')]//div[@class='month']//div[text()='" + dia + "']");
	}

}
