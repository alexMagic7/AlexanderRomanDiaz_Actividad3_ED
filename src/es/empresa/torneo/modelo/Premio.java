package es.empresa.torneo.modelo;

public class Premio {
    private String descripcion;
    private double valor;

    public Premio(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }
}
