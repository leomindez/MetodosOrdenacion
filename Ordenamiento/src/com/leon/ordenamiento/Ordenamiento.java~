package com.leon.ordenamiento;

import java.util.Comparator;

/**
 * @author Leonel Mendez Jimenez/Andres Alvarez Olguin
 * 
 */
public class Ordenamiento {

	private Object[] misElementos;

	public Ordenamiento() {
	}

	public Ordenamiento(Object[] elements) {
		this.misElementos = elements;
	}

	public void burbuja(Comparator<Object> comparator) {
		for (int i = 0; i < misElementos.length - 1; i++) {
			for (int j = 0; j < misElementos.length - 1; j++) {
				if (comparator.compare(misElementos[j], misElementos[j + 1]) > 0) {
					Object object = misElementos[j];
					misElementos[j] = misElementos[j + 1];
					misElementos[j + 1] = object;

				}

			}
		}
		imprimir(misElementos);
	}

	public void burbuja(Object[] misElementos, Comparator<Object> comparator) {
		if (misElementos != null) {

			for (int i = 0; i < misElementos.length - 1; i++) {
				for (int j = 0; j < misElementos.length - 1; j++) {
					if (comparator
							.compare(misElementos[j], misElementos[j + 1]) > 0) {
						Object object = misElementos[j];
						misElementos[j] = misElementos[j + 1];
						misElementos[j + 1] = object;

					}

				}
			}
			imprimir(misElementos);
		}
	}

	public void seleccion(Comparator<Object> comparator) {

		for (int i = 0; i < misElementos.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < misElementos.length; j++) {
				if (comparator.compare(misElementos[j], misElementos[min]) < 0) {
					min = j;
				}
			}
			if (i != min) {
				Object object = misElementos[i];
				misElementos[i] = misElementos[min];
				misElementos[min] = object;

			}
		}
		imprimir(misElementos);
	}

	public void seleccion(Object[] misElementos, Comparator<Object> comparator) {
		for (int i = 0; i < misElementos.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < misElementos.length; j++) {
				if (comparator.compare(misElementos[j], misElementos[min]) < 0) {
					min = j;
				}
			}
			if (i != min) {
				Object object = misElementos[i];
				misElementos[i] = misElementos[min];
				misElementos[min] = object;

			}
		}
		imprimir(misElementos);
	}

	private void imprimir(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("" + array[i]);
		}
	}
}
