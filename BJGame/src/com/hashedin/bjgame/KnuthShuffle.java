package com.hashedin.bjgame;

import java.util.Random;

public class KnuthShuffle implements Shuffle {
	public int[] shuffle(int[] array) {
		Random generator = new Random();
		int size = array.length, index;
		for (int i = size - 1; i >= 1; i--) {
			index = generator.nextInt(i);
			int copy = array[index];
			array[index] = array[i];
			array[i] = copy;
		}
		return array;
	}

}
