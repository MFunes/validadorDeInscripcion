package domain;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;

public class InscripcionTest {

    @Test
    public void alumnoPuedeInscribirseAPdP() {
        Materia AyED = new Materia();
        Materia PdP = new Materia();


        // Inicializo las listas de correlativas
        PdP.setCorrelativas(Arrays.asList(AyED));

        //materias a inscribir PDP
        //materias aprobadas AyED

        Alumno unAlumno = new Alumno("Mercedes", "Funes", 1234, Arrays.asList(AyED));

        Inscripcion inscripcion = new Inscripcion(unAlumno,Arrays.asList(PdP));

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void alumnoPuedeInscribirseAAyED(){
        Materia AyED = new Materia();

        // Inicializo las listas de correlativas
        AyED.setCorrelativas(Arrays.asList());

        Alumno unAlumno = new Alumno("Mercedes", "Funes", 1234, Arrays.asList());

        Inscripcion inscripcion = new Inscripcion(unAlumno,Arrays.asList(AyED));

        assertTrue(inscripcion.aprobada());
    }
}