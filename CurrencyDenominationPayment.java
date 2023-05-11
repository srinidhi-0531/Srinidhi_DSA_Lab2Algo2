package com.dsa.lab2main;

import java.util.*;

public class CurrencyDenominationPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total number of currency denominations: ");
		int denomination = sc.nextInt();

		// Integer class used instead of int[] else Collections won't work
		Integer currencyValues[] = new Integer[denomination];
		System.out.println("Enter values of currency denominations: ");
		for (int i = 0; i < denomination; i++) {
			currencyValues[i] = sc.nextInt();
		}

		// Sort in reverse using Collections
		Arrays.sort(currencyValues, Collections.reverseOrder());

		System.out.println("Enter amount to be paid: ");
		int amount = sc.nextInt();

		CountNotes noteCount = new CountNotes();

		noteCount.count(currencyValues, amount);
		
		sc.close();
	}

}
