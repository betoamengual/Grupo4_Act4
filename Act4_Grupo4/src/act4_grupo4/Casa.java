package act4_grupo4;

//CAMBIAR EN EL DIAGRAMA DE CLASES
public class Casa {
    private String zona;

    public Casa(String zona) {
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
     @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + zona + '\'' +
                '}';
    }
    
}