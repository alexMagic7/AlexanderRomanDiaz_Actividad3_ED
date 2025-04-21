package es.empresa.torneo;

import es.empresa.torneo.vista.InterfazUsuario;

public class Main {
    public static void main(String[] args) {
        InterfazUsuario ui = new InterfazUsuario();

        ui.mostrarMenu();
        ui.crearTorneo("Torneo de eSports");
        ui.registrarEquipo("Los Invencibles");
        ui.mostrarTorneo();
    }
}
