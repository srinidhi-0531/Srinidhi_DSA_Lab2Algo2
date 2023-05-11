package com.dsa.lab2main;

public class CountNotes {

	public void count(Integer[] currencyValues, int amount) {
		// TODO Auto-generated method stub

		int noteCount[] = new int[currencyValues.length];
		int sumOfNotes = 0;
		int i;
		for (i = 0; i < currencyValues.length; i++) {
			noteCount[i] = amount / currencyValues[i];
			amount %= currencyValues[i];
			sumOfNotes += noteCount[i];
		}
		for (i = 0; i < currencyValues.length; i++) {
			if (noteCount[i] != 0) {
				System.out.println(currencyValues[i] + ":" + noteCount[i] + " note");
			}
		}
		System.out.println("Total number of notes to be paid: " + sumOfNotes);
	}

}
