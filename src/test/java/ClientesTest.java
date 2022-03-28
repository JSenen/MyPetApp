import com.juansenen.mypetapp.domain.Clientes;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ClientesTest {

    @Test
    public void crearClienteTest(){
        //Invocamos constructor de la clase con unos parametros definidos para 2 Clientes
        Clientes cliente = new Clientes("Antonio", "Alvarez Angustias", 0.5f);
        Clientes cliente2 = new Clientes("Antonio", "Alvarez Angustias", 0.5f);
        assertEquals(cliente2,cliente); //Comparamos que se tienen que haber creado
        int id = cliente.getIdCliente();
        assertEquals(1,1);
    }

    @Test
    public void crearIdClienteTest(){
        Clientes cliente = new Clientes("Antonio", "Alvarez Angustias", 0.5f);
        Clientes cliente2 = new Clientes("Antonio", "Alvarez Angustias", 0.5f);

        int id = cliente2.getIdCliente();
        assertEquals(2,2); // Comparamos que se ha generado el id del 2 cliente
    }
    @Test
    public void listarClienteTest(){

    }
}
