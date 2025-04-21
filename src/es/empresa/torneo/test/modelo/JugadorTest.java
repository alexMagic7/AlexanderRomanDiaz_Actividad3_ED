package es.empresa.torneo.test.modelo;

import es.empresa.torneo.modelo.Jugador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {

    @Test
    void testCrearJugador() {
        Jugador jugador = new Jugador("Carlos", 20);
        assertEquals("Carlos", jugador.getNombre());
        assertEquals(20, jugador.getEdad());
    }

    @Test
    void testToString() {
        Jugador jugador = new Jugador("Ana", 22);
        assertEquals("Ana (22 años)", jugador.toString());
    }
}
