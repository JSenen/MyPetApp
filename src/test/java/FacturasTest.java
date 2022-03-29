
import com.juansenen.mypetapp.domain.Facturas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacturasTest {
    private String concepto = "Prueba de prueba";
    private float iva = 0.21f;
    private boolean pagado = true;
    private float precio = 100;


    @Test
    public void crearFacturaTest(){
        Facturas factura = new Facturas(concepto, iva, precio, pagado);
        Facturas factura2= new Facturas(concepto, iva, precio, pagado);
        assertNotSame(factura2.getIdFactura(),factura.getIdFactura()); //Comparamos que se tienen que haber creado y ser la numero 2
    }

    @Test
    public void listarFacturasTest(){
        Facturas factura = new Facturas(concepto, iva, precio, pagado); //Creamos un objeto
        String toString = factura.toString(); //Lamamos al método toString() de la clase
            /* Con este test probamos que el String empieza en "ID FACTURA"
            y despues le sigue la id de la factura*/
        assertTrue(toString.contains("ID FACTURA=" + factura.getIdFactura()));
    }
}
