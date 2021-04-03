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

public abstract class Tiquete extends Base {

    private int numTiquete;
    private int valor;
    private int tipo; //1. Directo, 2. Combinado

    public Tiquete(int tipo, int numTiquete, int valor, int numSorteo, boolean estado, int num1, int num2, int num3, Fecha fecha) {
        super(numSorteo, estado, num1, num2, num3, fecha);
        this.numTiquete = numTiquete;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNumTiquete() {
        return numTiquete;
    }

    public void setNumTiquete(int numTiquete) {
        this.numTiquete = numTiquete;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public abstract String determinarPremio();

}
