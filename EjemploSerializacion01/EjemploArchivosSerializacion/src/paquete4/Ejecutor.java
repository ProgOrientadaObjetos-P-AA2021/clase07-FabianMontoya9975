/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author josef
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "hospitales.data";

        Hospital h1 = new Hospital("IESS", 32, 3250000);
        Hospital h2 = new Hospital("San José", 41, 3690000);
        Hospital h3 = new Hospital("San Agustín", 25, 1250000);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(
                nombreArchivo);
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(
                nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
        
    }

}
