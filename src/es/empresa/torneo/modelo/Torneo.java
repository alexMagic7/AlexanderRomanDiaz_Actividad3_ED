package es.empresa.torneo.modelo;

import java.util.List;

public class Torneo {
    private String nombre;
    private List<Equipo> equipos;

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }
}
