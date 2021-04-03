
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
import java.util.Scanner;

public class Apuestas {

    private static void menu() {
        System.out.print("---Apuestas---\n"
                + "1. Registrar Sorteo\n"
                + "2. Asignar Ganadores Sorteo\n"
                + "3. Registrar Chance (1. Directo, 2. Combinado)\n"
                + "4. Consultar Numeros Ganadores de un Sorteo\n"
                + "5. Consultar Tiquete de Chance\n"
                + "6. Salir\n"
                + "Seleccione una opción: ");
    }

    public static void main(String[] args) {
        ControlSorteos CS = new ControlSorteos();
        int op;
        Scanner lectura = new Scanner(System.in);

        do {
            menu();
            op = lectura.nextInt();
            switch (op) {
                case 1: {
                    CS.RegistrarSorteo();
                    break;
                }
                case 2: {
                    CS.AsignarGanadoresSorteo();
                    break;
                }
                case 3: {
                    CS.registrarChance();
                    break;
                }
                case 4: {
                    CS.ConsultarGanadores();
                    break;
                }
                case 5: {
                    CS.consultarTiquete();
                    break;
                }
                case 6: {
                    System.out.println("Hasta Pronto...");
                    break;
                }
                default: {
                    System.out.println("Opción Incorrecta... Intente nuevamente...");
                }
            }

        } while (op != 6);
    }

}
