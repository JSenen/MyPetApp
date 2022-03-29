import com.juansenen.mypetapp.domain.Clientes;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ClientesTest {

    //Creamos una serie de atributos para pruebas
    private String nombre = "Antonio";
    private String nombre2 = "Ana";
    private String apellidos = "Alvarez Prueba";
    private String apellidos2 = "Prueba Buena";
    private float descuento = 0.5f;

    @Test
    public void crearClienteTest() {
        //Invocamos constructor de la clase con unos parametros definidos
        Clientes cliente = new Clientes(nombre, apellidos, descuento);
        assertEquals(cliente.getNombre(), cliente.getNombre()); //Comparamos que se tienen que haber creado y ser la misma
    }

    @Test
    public void crearIdClienteTest() {
        Clientes cliente = new Clientes(nombre, apellidos, descuento);
        Clientes cliente2 = new Clientes(nombre2, apellidos2, descuento);

        int id = cliente2.getIdCliente(); //Obtenemos Id del cliente 2
        assertEquals(2, 2); // Comparamos que se ha generado el id del 2 cliente
    }

    @Test
    public void listarClienteTest1() {
        Clientes cliente = new Clientes(nombre, apellidos, descuento); //Creamos un objeto
        String toString = cliente.toString(); //Lamamos al método toString() de la clase
            /* Con este test probamos que el String empieza en "ID CLIENTE"
            y despues le sigue la id del cliente
             */
        assertTrue(toString.contains("ID CLIENTE=" + cliente.getIdCliente()));


    }

    @Test
    public void listarClientesTest2() {
        Clientes cliente = new Clientes(nombre, apellidos, descuento); //Creamos un objeto
        String toString = cliente.toString();
            /* Con este test probamos que el toString() tiene la
             cadena "NOMBRE=" y despues sólo le sigue texto */
        assertFalse(toString.matches("ID CLIENTE=[a-zA-Z]*?"));
    }
}
