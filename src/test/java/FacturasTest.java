import com.juansenen.mypetapp.domain.Facturas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class FacturasTest {
    private String concepto = "Prueba de prueba";
    private float iva = 0.21f;
    private boolean pagado = true;
    private float precio = 100;


    @Test
    public void crearFacturaTest(){
        Facturas factura = new Facturas(concepto, iva, precio, pagado);
        Facturas factura2= new Facturas(concepto, iva, precio, pagado);
        assertEquals(factura2.getIdFactura(),2); //Comparamos que se tienen que haber creado y ser la numero 2
    }

    @Test
    public void listarFacturasTest(){

    }
}
