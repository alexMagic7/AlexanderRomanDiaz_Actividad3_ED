package es.empresa.torneo.test.vista;

import es.empresa.torneo.vista.InterfazUsuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InterfazUsuarioTest {

    private InterfazUsuario interfazUsuario;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        interfazUsuario = new InterfazUsuario();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testMostrarMenu() {
        interfazUsuario.mostrarMenu();
        String salida = outContent.toString();

        assertTrue(salida.contains("1. Crear torneo"));
        assertTrue(salida.contains("2. Registrar equipo"));
    }

    @Test
    void testCrearTorneo() {
        interfazUsuario.crearTorneo("Torneo Test");
        String salida = outContent.toString();

        assertTrue(salida.contains("Torneo creado: Torneo Test"));
    }
}
