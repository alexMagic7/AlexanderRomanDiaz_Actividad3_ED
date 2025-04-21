package es.empresa.torneo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String nombre;
    private List<Equipo> equipos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void añadirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    @Override
    public String toString() {
        return "Torneo: " + nombre + " | Equipos: " + equipos;
    }
}
