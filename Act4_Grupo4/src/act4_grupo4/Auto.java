package act4_grupo4;

public class Auto {
    private final double tanque = 50;
    private String modelo;
    private String patente;
    private String combustible;

    public Auto(String modelo, String patente) {
        this.modelo = modelo;
        this.patente = patente;
    }

    public Auto() {
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return modelo;
    }
}