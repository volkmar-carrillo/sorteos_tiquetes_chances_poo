/**
 * Ejercicio de Aplicación a la Programación Orientada a Objetos
 * 
 * Manejo de estructuras swicth-case, arrylist, herencia, clases abstractas, sobreescritura y sobrecarga de métodos mediante poo
 * 
 * By: Volkmar A Carrillo P
 * e-mail: carrillo.ramklov@gmail.com
 * fecha-publicación: 03/04/2021
 */
package logica;

import java.util.Date;

public class Fecha {
    
    private final Date miFecha;
    
    Fecha(){
        miFecha = new Date();
    }
    
    private int getAnio(){
        return(miFecha.getYear() + 1900);
    }
    
    private int getMes(){
        return(miFecha.getMonth() + 1);
    }
    
    private int getDia(){
        return(miFecha.getDate());
    }
    
    public String darFecha(){
        return("Fecha: "+getAnio()+"/"+getMes()+"/"+getDia());
    }
    
}
