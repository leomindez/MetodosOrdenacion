package com.leon.ordenamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author Leonel Mendez Jimenez/Andres Alvarez Olguin
 * 
 */
public class Archivo {

	private String miTitulo;

	public Archivo() {
	}

	public Archivo(String titulo) {
		this.miTitulo = titulo;
	}

	public Integer[] getArregloNumeros() {

		String cadena = leerArchivo();

		int nTokens = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(cadena, ",");
		nTokens = stringTokenizer.countTokens();
		Integer[] numeros = new Integer[nTokens];
		int i = 0;
		while (stringTokenizer.hasMoreElements()) {
			String token = stringTokenizer.nextToken();
			numeros[i] = Integer.valueOf(token);
			++i;
		}
		return numeros;

	}

	public String[] getArregloCadenas() {

		String cadena = leerArchivo();

		int nTokens = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(cadena, " ");
		nTokens = stringTokenizer.countTokens();
		String[] cadenas = new String[nTokens];
		int i = 0;
		while (stringTokenizer.hasMoreElements()) {
			String token = stringTokenizer.nextToken();
			cadenas[i] = token;
			++i;
		}
		return cadenas;

	}

	private String leerArchivo() {

		File file = new File(miTitulo);
		FileReader reader;
		BufferedReader bufferedReader;
		String aux = null, cadena = null;
		try {

			reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			while ((aux = bufferedReader.readLine()) != null) {
				cadena = aux;
			}
			reader.close();
			bufferedReader.close();
		} catch (IOException e) {

			System.out.println("Archivo no existe");
		}

		return cadena;

	}

}
