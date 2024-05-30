package act4_grupo4;

import java.util.Arrays;

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

    public void Cantar() {
        super.cantar(apellido);
        System.out.println("Y asi canta tu hijo, " + this.nombre);
    }

    public void mostrarAuto() {//Agregar a diagrama
        System.out.println("Papa me dejo este auto: " + getAutos());
    }

    public void conducirAuto(Auto tito) {
        System.out.println("“conduciendo un auto de un amigo” :" + tito);

    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public void jugarLoteria() {
        int nrosuerte = (int) (Math.random() * 100) + 1;
        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + nrosuerte);
        billetera = billetera + FORTUNA;
        System.out.println("Heredaste la Fortuna de 50000.0 de tu madre la ROSA!!");
        System.out.println("Saldo actual de la billetera = $"+billetera);
    }

    @Override
    public void HeredarDinero(double money) {

    }

    @Override
    public int hacerGoles() {
        return 0;
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
