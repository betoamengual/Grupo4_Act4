/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4_grupo4;

/**
 *
 * @author Francisco
 */

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
