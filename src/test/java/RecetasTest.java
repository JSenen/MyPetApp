

import com.juansenen.mypetapp.domain.Recetas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RecetasTest {
    private String nomVete = "NomVETE";
    private String numColegiado = "A58676";
    private String descripcion = "Cirugia";
    private String fecha = "29/03/2022";
    private int numDias = 12;
    private String medicamento = "medicacion";
    private float dosis = 0.4f;

    @Test
    public void crearRecetasTest(){
        Recetas receta = new Recetas(nomVete, numColegiado, descripcion, fecha, numDias, medicamento, dosis);
        Recetas receta2 = new Recetas("Antonia", numColegiado, descripcion, fecha, numDias, medicamento, dosis);
        assertNotSame(receta2,receta); // Los 2 objetos creados deben ser diferentes
    }

    @Test
    public void listarRecetasTest(){
        Recetas receta = new Recetas(nomVete, numColegiado, descripcion, fecha, numDias, medicamento, dosis); //Creamos un objeto
        String toString = receta.toString(); //Lamamos al método toString() de la clase
            /* Con este test probamos que el String empieza en "DESCRIPCION="
            y no le sigue ningun número
             */
        assertFalse(toString.matches("NOMBRE VETERINARIO=[0-9]*?"));
    }
}
