/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author josef
 */
public class Hospital {

    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public Hospital(String name, int num, double pres) {
        nombre = name;
        numeroCamas = num;
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
/*
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
 */
