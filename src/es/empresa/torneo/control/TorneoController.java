package es.empresa.torneo.control;

import es.empresa.torneo.modelo.Torneo;
import es.empresa.torneo.modelo.Equipo;

public class TorneoController {
    private Torneo torneo;

    public TorneoController(Torneo torneo) {
        this.torneo = torneo;
    }

    public void crearTorneo(String nombre) {
        this.torneo = new Torneo(nombre);
    }

    public void inscribirEquipo(Equipo equipo) {
        torneo.registrarEquipo(equipo);
    }
}
