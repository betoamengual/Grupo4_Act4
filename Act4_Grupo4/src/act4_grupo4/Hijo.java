package act4_grupo4;

public class Hijo extends Padre implements Madre, Tio, Hermano {

    private String nombre;
    private Auto auto[];
    private Celular celular;
    private double billetera; //cambiar el tipo de dato a double en la base de datos

    public Hijo(String apellido, String nombre, Auto a, Celular celular) {
        super(apellido, a);
        this.nombre = nombre;
        this.celular = celular;
    }
    
    //Getters & Setters
    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Auto[] getAuto() {
        return auto;
    }

    public void setAuto(Auto[] auto) {
        this.auto = auto;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void cantar(String apellido) {
        super.cantar(apellido);
        System.out.println(" y asi canta " + this.nombre);
    }
    
    public void mostrarAuto() {//Agregar a diagrama
        System.out.println("Papa me dejo este auto modelo: " + getAutos());
    }

    public void conducirAuto(Auto tito) {
        System.out.println("Conduciendo un "+tito.getModelo()+" de un amigo!");

    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public void jugarLoteria() {
        int nrosuerte = (int) (Math.random() * 100) + 1;
        billetera = billetera + FORTUNA;
        System.out.println("Heredaste la Fortuna de 50000.0 de tu madre la ROSA!! Ahora tienes "+billetera+"U$S");
        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + nrosuerte);
    }

    @Override
    public void HeredarDinero(double money) {
        System.out.println("MSG de Tio Lucas: Disfruta la herencia Addams, sumas "+money+" dolaritos");
    }

    @Override
    public void hacerGoles() {
        System.out.println("Jugando al futbol, hoy haz echo 0 goles");
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public String toString() {
        return "Hijo{" + "nombre=" + nombre + ", auto=" + getAutos() + ", celular=" + celular + '}';
    }
    
}