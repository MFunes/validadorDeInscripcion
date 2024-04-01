package domain;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;


    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }


}
