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
public class Ejecutor {
    
    public static void main(String[] args) {
        String nombreArchivo = "hospitales.txt";
        
        Hospital hop1 = new Hospital("Hospital Isidro Ayora", 50, 2340000);
        Hospital hop2 = new Hospital("Hospital San Agustín", 42, 5600000);
        Hospital hop3 = new Hospital("Hospital Abendaño", 35, 1800000);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        // Escritura en el archivo del Hospital 1
        archivo.establecerRegistro(hop1);
        archivo.establecerSalida();
        // Escritura en el archivo del Hospital 2
        archivo.establecerRegistro(hop2);
        archivo.establecerSalida();
        // Escritura en el archivo del Hospital 3
        archivo.establecerRegistro(hop3);
        archivo.establecerSalida();
        // cerrar el archivo
        archivo.cerrarArchivo();
        
        // Lectura del archivo
        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

}
