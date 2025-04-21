package es.empresa.torneo.modelo;

public class Partida {
    private Equipo equipo1;
    private Equipo equipo2;
    private String resultado;

    public Partida(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void registrarResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }
}
