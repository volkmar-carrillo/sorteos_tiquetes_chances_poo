
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

public class Sorteo extends Base {

    private final ArrayList<Tiquete> tiquetes;
    private final Scanner lectura;
    private int numTiq;

    Sorteo(int numSorteo, boolean estado, int num1, int num2, int num3, Fecha fecha) {
        super(numSorteo, estado, num1, num2, num3, fecha);
        tiquetes = new ArrayList<>();
        lectura = new Scanner(System.in);
        numTiq = 1001;
    }

    //Asignar numeros ganadores
    public void AsignarGanadores() {
        System.out.print("Ingrese el número ganador 1: ");
        int n1 = lectura.nextInt();
        System.out.print("Ingrese el número ganador 2: ");
        int n2 = lectura.nextInt();
        System.out.print("Ingrese el número ganador 3: ");
        int n3 = lectura.nextInt();
        int[] aux = {n1, n2, n3};
        this.setNumeros(aux);
        System.out.println("Se registraron los números...");
    }

    //Validar que sea de un digito
    private boolean validar(int n) {
        return n < 10;
    }

    //Pedir numero
    private int pedir() {
        while (true) {
            System.out.print("Ingrese un numero  a apostar: ");
            int n1 = lectura.nextInt();
            if (validar(n1)) {
                return (n1);
            }
            System.out.println("Número incorrecto...");
        }
    }

    //Registrar chance segun tipo
    public void RegistrarTiquete() {
        System.out.print("Ingrese el tiquete a registrar\n1. Directo\n2. Combinado\nSeleccione una opción: ");
        int op = lectura.nextInt();
        if (op < 1 && op > 2) {
            System.out.println("No se registró el tiquete...");
            return;
        }
        System.out.println("Número de Tiquete: " + numTiq);
        Fecha f = new Fecha();
        System.out.println(f.darFecha());
        int n1 = pedir();
        int n2 = pedir();
        int n3 = pedir();
        System.out.println("Ingrese el valor a apostar: ");
        int valor = lectura.nextInt();
        if (op == 1) {
            tiquetes.add(new Directo((numTiq++), valor, this.getNumSorteo(), true, n1, n2, n3, f));
        } else {
            tiquetes.add(new Combinado((numTiq++), valor, this.getNumSorteo(), true, n1, n2, n3, f));
        }
    }

    //Buscar tiquete
    private int buscarTiquete(int n) {
        for (int i = 0; i < tiquetes.size(); i++) {
            if (tiquetes.get(i).getNumTiquete() == n) {
                return (i);
            }
        }
        return (-1);
    }

    //Números acertados por directo
    private void acertadosDirecto(Tiquete tiq) {
        int[] ganadores = this.getNumeros();
        int[] acertados = new int[3];
        int c = 0;
        for (int i = 0; i < 3; i++) {
            if (ganadores[i] == tiq.getNumeros()[i]) {
                acertados[c++] = tiq.getNumeros()[i];
            }
        }
        c = 0;
        for (int i = 0; i < 3; i++) {
            if (acertados[i] != 0) {
                c++;
            }
        }
        System.out.println("Acertó " + c + " números...");
        if (c == 3) {
            System.out.println(tiq.determinarPremio());
        }
    }

    //Numeros acertados por Combinado
    private void acertadosCombinado(Tiquete tiq) {
        int[] ganadores = this.getNumeros();
        int[] acertados = new int[3];
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    if (tiq.getNumeros()[i] == ganadores[j]) {
                        acertados[c++] = tiq.getNumeros()[i];
                    }
                }
            }
        }
        c = 0;
        for (int i = 0; i < 3; i++) {
            if (acertados[i] != 0) {
                c++;
            }
        }
        System.out.println("Acertó " + c + " números...");
        if (c == 3) {
            System.out.println(tiq.determinarPremio());
        }
    }

    //Consultar premio tiquete
    public void ConsultarTiquete() {
        System.out.print("Ingrese el número del Tiquete: ");
        int n = lectura.nextInt();
        int buscado = buscarTiquete(n);
        if (buscado == -1) {
            System.out.println("El tiquete no existe...");
            return;
        }
        int tipo = tiquetes.get(buscado).getTipo();
        if (tipo == 1) {
            acertadosDirecto(tiquetes.get(buscado));
        } else {
            acertadosCombinado(tiquetes.get(buscado));
        }
    }

}
