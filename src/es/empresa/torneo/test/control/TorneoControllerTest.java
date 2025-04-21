package es.empresa.torneo.test.control;

import es.empresa.torneo.control.TorneoController;
import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Torneo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TorneoControllerTest {

    @Test
    void testCrearTorneo() {
        TorneoController controller = new TorneoController(null);
        controller.crearTorneo("League of Legends Cup");

        assertNotNull(controller.getTorneo());
        assertEquals("League of Legends Cup", controller.getTorneo().getNombre());
    }

    @Test
    void testInscribirEquipo() {
        Torneo torneo = new Torneo("Winter Clash");
        TorneoController controller = new TorneoController(torneo);

        Equipo equipo = new Equipo("Champions");
        controller.inscribirEquipo(equipo);

        assertEquals(1, torneo.getEquipos().size());
        assertEquals("Champions", torneo.getEquipos().get(0).getNombre());
    }
}
