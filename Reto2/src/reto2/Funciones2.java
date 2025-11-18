package reto2;

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

}
