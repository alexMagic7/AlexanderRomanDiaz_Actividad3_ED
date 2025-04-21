package es.empresa.torneo;

import es.empresa.torneo.vista.InterfazUsuario;

public class Main {

    public static void main(String[] args) {
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        interfazUsuario.mostrarMenu();
        interfazUsuario.crearTorneo("Torneo de eSports");
        interfazUsuario.registrarEquipo("Equipo A");
    }
}
