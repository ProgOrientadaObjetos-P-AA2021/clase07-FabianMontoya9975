/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.io.Serializable;

/**
 *
 * @author josef
 */
public class Hospital implements Serializable {

    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public Hospital(String name, int camas, double pres) {
        nombre = name;
        numeroCamas = camas;
        presupuesto = pres;
    }

    public void establecerNombre(String name) {
        nombre = name;
    }

    public void establecerNumeroCamas(int num) {
        numeroCamas = num;
    }

    public void establecerPresupuesto(double pres) {
        presupuesto = pres;
    }

    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerNumeroCamas() {
        return numeroCamas;
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
