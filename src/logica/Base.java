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

public class Base {

    private Fecha fecha;
    private int numSorteo;
    private boolean estado;
    private int[] numeros;

    public Base(int numSorteo, boolean estado, int num1, int num2, int num3, Fecha fecha) {
        this.numSorteo = numSorteo;
        this.estado = estado;
        this.numeros = new int[3];
        this.fecha = fecha;
        cargar(num1, num2, num3);
    }

    private void cargar(int num1, int num2, int num3) {
        this.numeros[0] = num1;
        this.numeros[1] = num2;
        this.numeros[2] = num3;
    }

    public String getFecha() {
        return fecha.darFecha();
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getNumSorteo() {
        return numSorteo;
    }

    public void setNumSorteo(int numSorteo) {
        this.numSorteo = numSorteo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}
