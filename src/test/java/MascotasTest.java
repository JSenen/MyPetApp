import com.juansenen.mypetapp.domain.Clientes;
import com.juansenen.mypetapp.domain.Mascotas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MascotasTest {

    @Test
    public void crearMascotasTest(){
//Invocamos constructor de la clase con unos parametros definidos
        Mascotas mascotas = new Mascotas("Rodolfo", 23.5f, 8, "lupus","masculino");
        /* Con este metodo comparamos que tras crear un objeto con unos parametros,
        el atributo nombre de la mascota es distinta a "Maximo" y tambien que si es igual a Rodolfo*/
        assertNotEquals(mascotas.getNombrePet(),"Maximo");
         assertEquals(mascotas.getNombrePet(),"Rodolfo");
    }


}
