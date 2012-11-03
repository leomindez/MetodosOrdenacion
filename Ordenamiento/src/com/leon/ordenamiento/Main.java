package com.leon.ordenamiento;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Archivo archivo = new Archivo("archivo.txt");
		Archivo archivo2 = new Archivo("cadenas.txt");
		Ordenamiento ordenamiento = new Ordenamiento();

		ordenamiento.burbuja(archivo.getArregloNumeros(), new Numeros());
		ordenamiento.seleccion(archivo.getArregloNumeros(), new Numeros());
		ordenamiento.burbuja(archivo2.getArregloCadenas(), new Cadenas());
		ordenamiento.seleccion(archivo2.getArregloCadenas(), new Cadenas());

	}

}
