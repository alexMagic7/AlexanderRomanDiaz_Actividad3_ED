package es.empresa.torneo.test.control;

import es.empresa.torneo.control.EquipoController;
import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipoControllerTest {

    @Test
    void testRegistrarJugador() {
        Equipo equipo = new Equipo("Rockets");
        EquipoController controller = new EquipoController(equipo);

        controller.registrarJugador(new Jugador("Marta", 21));

        assertEquals(1, equipo.getJugadores().size());
        assertEquals("Marta", equipo.getJugadores().get(0).getNombre());
    }
}
