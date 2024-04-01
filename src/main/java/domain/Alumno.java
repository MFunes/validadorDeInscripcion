package domain;

import java.util.List;
import java.util.stream.Collectors;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private List<Materia> materiasAprobadas;
    //  private List<Materia> materiasAInscribir; //PDP y Soc y Estado


    public Alumno(String nombre, String apellido, Integer legajo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }


    public boolean cumpleCorrelativas(List<Materia> materiasAInscribir) {
        for (Materia materia : materiasAInscribir) {
            List<Materia> correlativasPendientes = materia.getCorrelativas().stream()
                    .filter(correlativa -> !materiasAprobadas.contains(correlativa))
                    .collect(Collectors.toList());

            if (!correlativasPendientes.isEmpty()) {
                return false; //  hay correlativas pendientes, no cumple
            }
        }
        return true; // no hay correlativas pendientes para ninguna materia, cumple
    }
}