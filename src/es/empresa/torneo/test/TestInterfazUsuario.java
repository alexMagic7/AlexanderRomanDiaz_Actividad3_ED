package es.empresa.torneo.test;

import org.junit.Test;
import es.empresa.torneo.vista.InterfazUsuario;

public class TestInterfazUsuario {

    @Test
    public void testMostrarMenu() {
        InterfazUsuario interfaz = new InterfazUsuario();
        interfaz.mostrarMenu();
        // Aquí podrías verificar si se imprime el menú correctamente
    }
}
