package es.empresa.torneo.vista;

import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Jugador;
import es.empresa.torneo.control.EquipoController;
import es.empresa.torneo.control.TorneoController;

public class InterfazUsuario {

    private TorneoController torneoController;

    public InterfazUsuario() {
        this.torneoController = new TorneoController(null);
    }

    public void mostrarMenu() {
        System.out.println("1. Crear torneo");
        System.out.println("2. Registrar equipo");
    }

    public void crearTorneo(String nombre) {
        torneoController.crearTorneo(nombre);
        System.out.println("Torneo creado: " + nombre);
    }

    public void registrarEquipo(String nombreEquipo) {
        Equipo equipo = new Equipo(nombreEquipo);
        EquipoController equipoController = new EquipoController(equipo);

        // Ejemplo: se añaden 2 jugadores por defecto
        equipoController.registrarJugador(new Jugador("Juan", 25));
        equipoController.registrarJugador(new Jugador("Lucía", 22));

        torneoController.inscribirEquipo(equipo);
        System.out.println("Equipo registrado: " + equipo);
    }

    public void mostrarTorneo() {
        System.out.println(torneoController.getTorneo());
    }
}
