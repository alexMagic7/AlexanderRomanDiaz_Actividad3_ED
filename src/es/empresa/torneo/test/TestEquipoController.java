package es.empresa.torneo.test;


import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Jugador;
import es.empresa.torneo.control.EquipoController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestEquipoController {

    @Test
    public void testRegistrarJugador() {
        Equipo equipo = new Equipo("Equipo A");
        EquipoController controller = new EquipoController(equipo);
        Jugador jugador = new Jugador("Juan", 25);
        controller.registrarJugador(jugador);
        assertEquals(1, equipo.getJugadores().size());
    }
}
