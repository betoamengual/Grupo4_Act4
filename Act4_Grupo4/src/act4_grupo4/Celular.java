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
public class Celular {
    private String compania;
    private String numero;
    private double saldo;

    public Celular(String compania, String numero, double saldo) {
        this.compania = compania;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Celular{" + "compania=" + compania + ", numero=" + numero + '}';
    }
    
    
}
