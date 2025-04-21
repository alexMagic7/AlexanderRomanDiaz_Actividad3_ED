package es.empresa.torneo.test.modelo;

import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Jugador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquipoTest {

    @Test
    void testCrearEquipo() {
        Equipo equipo = new Equipo("Alpha");
        assertEquals("Alpha", equipo.getNombre());
        assertTrue(equipo.getJugadores().isEmpty());
    }

    @Test
    void testAñadirJugador() {
        Equipo equipo = new Equipo("Beta");
        Jugador jugador = new Jugador("Luis", 23);
        equipo.añadirJugador(jugador);

        assertEquals(1, equipo.getJugadores().size());
        assertEquals("Luis", equipo.getJugadores().get(0).getNombre());
    }
}
