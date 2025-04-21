package es.empresa.torneo.test;

import es.empresa.torneo.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMainExecution() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        assertDoesNotThrow(() -> Main.main(null));

        String salida = outContent.toString();
        assertTrue(salida.contains("Torneo creado"));
        assertTrue(salida.contains("Equipo registrado"));
    }
}
