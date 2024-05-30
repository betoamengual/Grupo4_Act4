/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4_grupo4;

import java.util.ArrayList;
import java.util.List;

public class Padre {

    public String apellido;
    private List<Auto> autos; // La relacion de agregacion implica que Padre puede tener multiples autos
    private Casa casa;
    protected String nombre;

    public Padre(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.autos = new ArrayList<>();
        this.casa = construirCasa();
        //construirCasa(); //revisar..
        //comprarAuto();
    }
    public Padre(String apellido, String nombre, Auto auto) {
        this(apellido, nombre); // Call the primary constructor
        this.agregarAuto(auto); // Add the auto to the list
    }
    
     public Padre(String apellido, Auto auto) {
        this(apellido, ""); // 
        this.agregarAuto(auto); // Nuevo constructor solo con apellido
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void cantar(String apellido) {
        System.out.println("Asi canta tu padre , Don " + this.apellido);
    }

    public void agregarAuto(Auto auto) { //cambiar en el diagrama de clases
        this.autos.add(auto); // Add Auto to the list
    }

    public Casa construirCasa() {
        Casa casas = new Casa("Centro (2)pisos");

        return casas;
    }
    
    public void mostarCasa(){
        System.out.println("Papa me dejo esta casa en zona: "+casa.getZona());
    }

    public String getNombre() {
        return "papa";
    }

    public String getApellido() {
        return "Lopez ";
    }

    @Override
    public String toString() {
        return "Padre{"
                + "apellido='" + apellido + '\''
                + ", autos=" + autos
                + ", nombre='" + nombre + '\''
                + '}';
    }

}
