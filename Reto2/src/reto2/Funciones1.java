package reto2;

import java.util.Scanner;

public class Funciones1 {

    
    //      LONGITUD
  

    public static double millasAkm(double millas) {
        return millas * 1.60934;
    }

    public static double kmAmillas(double km) {
        return km / 1.60934;
    }
    //VOID DE MILLAS
    public static void menuLongitud(Scanner sc) {
        int op;
        do {
            System.out.println("\n--- MENÚ LONGITUD ---");
            System.out.println("1. Millas → Kilómetros");
            System.out.println("2. Kilómetros → Millas");
            System.out.println("0. Volver al menú principal");

            op = Funciones.dimeEntero("Elige una opción:", sc);

            switch (op) {
                case 1 -> {
                    double m = Funciones.dimeDouble("Introduce millas:", sc);
                    System.out.println("Resultado: " + millasAkm(m) + " km");
                }
                case 2 -> {
                    double k = Funciones.dimeDouble("Introduce kilómetros:", sc);
                    System.out.println("Resultado: " + kmAmillas(k) + " millas");
                }
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println(" Opción no válida.");
            }

        } while (op != 0);
    }


    //          PESO
    
    public static double kgAlibras(double kg) {
        return kg * 2.20462;
    }

    public static double librasAkg(double lb) {
        return lb / 2.20462;
    }

    // VOID DE MENU PESO 
    public static void menuPeso(Scanner sc) {
        int op;
        do {
            System.out.println("\n--- MENÚ PESO ---");
            System.out.println("1. Kilogramos → Libras");
            System.out.println("2. Libras → Kilogramos");
            System.out.println("0. Volver al menú principal");

            op = Funciones.dimeEntero("Elige una opción:", sc);

            switch (op) {
                case 1 -> {
                    double k = Funciones.dimeDouble("Introduce kg:", sc);
                    System.out.println("Resultado: " + kgAlibras(k) + " lb");
                }
                case 2 -> {
                    double l = Funciones.dimeDouble("Introduce libras:", sc);
                    System.out.println("Resultado: " + librasAkg(l) + " kg");
                }
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println(" Opción no válida.");
            }

        } while (op != 0);
    }
}
