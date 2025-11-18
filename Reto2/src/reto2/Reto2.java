package reto2;

import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==== MENÚ PRINCIPAL ====");
            System.out.println("1. Longitud");
            System.out.println("2. Peso");
            System.out.println("3. Temperatura");
            System.out.println("4. Volumen");
            System.out.println("0. Salir");

            opcion = Funciones.dimeEntero("Elige una opción:", sc);

            switch (opcion) {
                case 1 -> Funciones1.menuLongitud(sc);
                case 2 -> Funciones1.menuPeso(sc);
                case 3 -> Funciones2.MenuconverCaF(sc);
                case 4 -> Funciones2.MenuVolumen(sc);
                case 0 -> System.out.println("¡Hasta la próxima!");
                default -> System.out.println(" Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
