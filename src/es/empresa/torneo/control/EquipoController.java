package es.empresa.torneo.control;

import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Jugador;

public class EquipoController {
    private Equipo equipo;

    public EquipoController(Equipo equipo) {
        this.equipo = equipo;
    }

    public void registrarJugador(Jugador jugador) {
        equipo.añadirJugador(jugador);
    }
}
