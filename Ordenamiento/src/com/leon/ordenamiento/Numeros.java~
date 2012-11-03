package com.leon.ordenamiento;

import java.util.Comparator;

/**
 * @author Leonel Mendez Jimenez/Andres Alvarez Olguin
 * 
 */
public class Numeros implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Integer && o2 instanceof Integer) {

			Integer n1 = (Integer) o1;
			Integer n2 = (Integer) o2;

			if (n1 > n2)
				return 1;
			else if (n1 < n2)
				return -1;
			else
				return 0;
		}
		return 0;
	}

}
