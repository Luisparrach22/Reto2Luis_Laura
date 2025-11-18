package reto2;

import java.util.Scanner;

import reto2.Funciones;

public class Funciones2 {

	
	public static double converCaF (double a) {

		double fahrenheit = (a * 9/5) + 32;
		return fahrenheit;
}
	public static double converFaC (double a) {
		  double celsius = (a - 32) * 5/9;
		  return celsius;
}
	
	public static double conveLaG (double a) {
		double galones = a * 0.264172;
		return galones;
}
	public static double conveGaL (double a) {
		double litros = a * 3.78541;
		return litros;
}

	
	public static double converEaD (double a) {
		
		 double tipoCambio = 1.08;  // puedes cambiarlo
	     double dolares = a * tipoCambio;
	     return dolares;
	}
	public static double converDaE (double a) {
		
		 double tipoCambio = 1.08;  // 1 euro = 1.08 dólares (puedes modificarlo)
	     double euros = a / tipoCambio;
		 return euros;
		
	}
	
	public static double converRaG (double a) {
		double grados = a * 180 / Math.PI;
		return grados;
			
	} 
	
	public static double converGaR (double a) {
		double radiantes = a / 180 / Math.PI;
		return radiantes;
			
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	


//VOID DE MILLAS
public static void MenuconverCaF (Scanner sc) {
    int op;
    do {
        System.out.println("\n--- MENÚ Convertir ---");
        System.out.println("1. Celfis → Farerheit ");
        System.out.println("2. farenhet  → Celsiu");
        System.out.println("0. Volver al menú principal");

        op = Funciones.dimeEntero("Elige una opción:", sc);

        switch (op) {
            case 1 -> {
                double m = Funciones.dimeDouble("Introduce Celsios:", sc);
                System.out.println("Resultado: "  + converCaF(m) + " Celsius");
            }
            
            case 2 -> {
                double m = Funciones.dimeDouble("Introduce Farenhet:", sc);
                System.out.println("Resultado: "  + converFaC(m) + " Farenhet");
            }

            case 0 -> System.out.println("Volviendo...");
            default -> System.out.println(" Opción no válida.");
        }

    } while (op != 0);
}

public static void MenuVolumen (Scanner sc) {
	int op;
	 do {
	        System.out.println("\n--- MENÚ Volumen  ---");
	        System.out.println("1. listros → Galones ");
	        System.out.println("2. Galones  → litros");
	        System.out.println("0. Volver al menú principal");

	        op = Funciones.dimeEntero("Elige una opción:", sc);

	        switch (op) {
	            case 1 -> {
	                double m = Funciones.dimeDouble("Introduce litros:", sc);
	                System.out.println("Resultado: "  + conveLaG(m) + " Galones");
	            }
	            
	            case 2 -> {
	                double m = Funciones.dimeDouble("Introduce Galones:", sc);
	                System.out.println("Resultado: "  + conveGaL(m) + " Litros");
	            }

	            case 0 -> System.out.println("Volviendo...");
	            default -> System.out.println(" Opción no válida.");
	        }

	    } while (op != 0);
	
	
}
}

