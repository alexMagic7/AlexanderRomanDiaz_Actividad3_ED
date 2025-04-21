package es.empresa.torneo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>(); // 🔧 ¡Inicializamos la lista aquí!
    }

    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void añadirJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " | Jugadores: " + jugadores;
    }
}
