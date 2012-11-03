package com.leon.ordenamiento;

import java.util.Comparator;

/**
 * @author Leonel Mendez Jimenez/Andres Alvarez Olguin
 * 
 */
public class Cadenas implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof String && o2 instanceof String) {

			String uno = o1.toString();
			String dos = o2.toString();

			int comparar = uno.compareTo(dos);

			if (comparar == 0)
				return 0;
			else if (comparar < 0)
				return -1;
			else
				return 1;
		}
		return 0;
	}

}
