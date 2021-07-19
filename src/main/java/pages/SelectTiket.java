package pages;
import org.openqa.selenium.By;

public class SelectTiket {

	private static By btnSelectVuelos = By.xpath("//button[@class='select-cabin-button']");
    private static By lblTipoViaje = By.xpath("//span[@class='ff-name ff-name-branded-fare']");
    private static By btnTipoViaje = By.xpath("//button[@class='ff-price-container']");
    private static By btnPrincipal = By.xpath("//img[@alt='Avianca logo']//ancestor::a");
    private static By btnVentanaEmergente = By.xpath("//button[@aria-label='Cerrar ventana']");

    public static By getBtnSelectVuelos() {
        return btnSelectVuelos;
    }

    public static By getLblTipoViaje() {
        return lblTipoViaje;
    }

    public static By getBtnTipoViaje() {
        return btnTipoViaje;
    }

    public static By getBtnPrincipal() {
        return btnPrincipal;
    }

    public static By getBtnVentanaEmergente() {
        return btnVentanaEmergente;
    }
}
