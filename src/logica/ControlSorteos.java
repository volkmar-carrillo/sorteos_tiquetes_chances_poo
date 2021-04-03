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

import java.util.ArrayList;
import java.util.Scanner;

public class ControlSorteos {

    private final ArrayList<Sorteo> sorteos;
    private int numSorteo;
    private final Scanner lectura;

    ControlSorteos() {
        sorteos = new ArrayList<>();
        numSorteo = 1001;
        lectura = new Scanner(System.in);
    }

    public ArrayList<Sorteo> getSorteos() {
        return sorteos;
    }

    public int getNumSorteo() {
        return numSorteo;
    }

    //Registrar un Sorteo
    public void RegistrarSorteo() {
        Fecha f = new Fecha();
        System.out.println(f.darFecha());
        System.out.println("Número de Sorteo: " + numSorteo);
        sorteos.add(new Sorteo(numSorteo, true, -1, -1, -1, f));
        numSorteo++;
        System.out.println("Se registró el sorteo...");
    }

    //Buscar Sorteo
    private int buscarSorteo(int n) {
        for (int i = 0; i < sorteos.size(); i++) {
            if (sorteos.get(i).getNumSorteo() == n) {
                return (i);
            }
        }
        return (-1);
    }

    //Asignar ganadores sorteo
    public void AsignarGanadoresSorteo() {
        System.out.println("Ingrese el número de Sorteo: ");
        int n = lectura.nextInt();
        int buscado = buscarSorteo(n);
        if (buscado == -1) {
            System.out.println("El sorteo no existe...");
            return;
        }
        sorteos.get(buscado).AsignarGanadores();
    }

    //Registrar Chance por Tipo
    public void registrarChance() {
        System.out.println("Ingrese el número de Sorteo: ");
        int n = lectura.nextInt();
        int buscado = buscarSorteo(n);
        if (buscado == -1) {
            System.out.println("El sorteo no existe...");
            return;
        }
        sorteos.get(buscado).RegistrarTiquete();
    }

    //Consultar numeros ganadores de un sorteo
    public void ConsultarGanadores() {
        System.out.println("Ingrese el número de Sorteo: ");
        int n = lectura.nextInt();
        int buscado = buscarSorteo(n);
        if (buscado == -1) {
            System.out.println("El sorteo no existe...");
            return;
        }
        int[] ganadores = sorteos.get(buscado).getNumeros();
        System.out.println("Los números ganadores son: "
                + ganadores[0] + "\t" + ganadores[1] + "\t" + ganadores[2]);
    }

    //Consultar Tiquete Chance
    public void consultarTiquete() {
        System.out.println("Ingrese el número de Sorteo: ");
        int n = lectura.nextInt();
        int buscado = buscarSorteo(n);
        if (buscado == -1) {
            System.out.println("El sorteo no existe...");
            return;
        }
        sorteos.get(buscado).ConsultarTiquete();
    }
}
