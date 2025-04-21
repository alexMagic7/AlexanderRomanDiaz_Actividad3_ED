package es.empresa.torneo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.empresa.torneo.modelo.Torneo;
import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.control.TorneoController;

public class TestTorneoController {

    @Test
    public void testInscribirEquipo() {
        Torneo torneo = new Torneo("Torneo 2025");
        TorneoController controller = new TorneoController(torneo);
        Equipo equipo = new Equipo("Equipo A");
        controller.inscribirEquipo(equipo);
        assertEquals(1, torneo.getEquipos().size());
    }
}
