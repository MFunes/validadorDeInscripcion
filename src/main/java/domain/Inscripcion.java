package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribir) {
        this.alumno = alumno;
        this.materiasAInscribir = materiasAInscribir;
    }


    public Boolean aprobada(){
        return (alumno.cumpleCorrelativas(materiasAInscribir));
    }
}
