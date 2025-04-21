package es.empresa.torneo.vista;

import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Jugador;
import es.empresa.torneo.control.EquipoController;
import es.empresa.torneo.control.TorneoController;

public class InterfazUsuario {

    public void mostrarMenu() {
        // Muestra opciones al usuario
        System.out.println("1. Crear torneo");
        System.out.println("2. Registrar equipo");
        // Otras opciones
    }

    public void crearTorneo(String nombre) {
        TorneoController torneoController = new TorneoController(null);
        torneoController.crearTorneo(nombre);
        System.out.println("Torneo creado: " + nombre);
    }

    public void registrarEquipo(String nombreEquipo) {
        Equipo equipo = new Equipo(nombreEquipo);
        EquipoController equipoController = new EquipoController(equipo);
        equipoController.registrarJugador(new Jugador("Juan", 25));
        System.out.println("Equipo registrado: " + nombreEquipo);
    }
}
