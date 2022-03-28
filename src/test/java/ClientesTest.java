import com.juansenen.mypetapp.domain.Clientes;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ClientesTest {

    @Test
    public void crearClienteTest(){
        //Invocamos constructor de la clase con unos parametros definidos
        Clientes cliente = new Clientes("Antonio", "Alvarez Angustias", 0.5f);
        Clientes cliente2 = new Clientes("Antonio", "Alvarez Angustias", 0.5f);
        assertEquals(cliente2,cliente);

    }
    @Test
    public void listarClienteTest(){

    }
}
