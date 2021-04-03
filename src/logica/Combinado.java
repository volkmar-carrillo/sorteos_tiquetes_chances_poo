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

public class Combinado extends Tiquete{
    
    Combinado(int numTiquete, int valor, int numSorteo, boolean estado, int num1, int num2, int num3, Fecha fecha){
        super(2, numTiquete, valor, numSorteo, estado, num1, num2, num3, fecha);
    }
    
    @Override
    public String determinarPremio(){
        return("El premio para el Tiquete Combinado es de: "+this.getValor() * 1000);
    }
}