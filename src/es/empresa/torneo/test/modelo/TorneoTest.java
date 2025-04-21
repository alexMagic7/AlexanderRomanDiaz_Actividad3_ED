package es.empresa.torneo.test.modelo;


import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Torneo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TorneoTest {

    @Test
    void testCrearTorneo() {
        Torneo torneo = new Torneo("Summer Cup");
        assertEquals("Summer Cup", torneo.getNombre());
        assertTrue(torneo.getEquipos().isEmpty());
    }

    @Test
    void testAñadirEquipo() {
        Torneo torneo = new Torneo("Spring Clash");
        Equipo equipo = new Equipo("Winners");

        torneo.añadirEquipo(equipo);

        assertEquals(1, torneo.getEquipos().size());
        assertEquals("Winners", torneo.getEquipos().get(0).getNombre());
    }
}
