package com.github.temptatio.bubblesort;

public class Bubblesort {

	public static void sort(double[] array) {

		final int laenge = array.length;

		for (int i = 0; i < laenge; ++i) {
			for (int j = i; j < laenge; ++j) {
				if (array[i] > array[j]) {
					double tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}

	}

}
