package com.azienda.esercizioRecap.utility;

import java.util.Scanner;

public class Input {

	public static boolean readBoolean (Scanner sc, String input) {
		do {
			System.out.println(input + "(true/false): ");
			String s=sc.nextLine().trim().toLowerCase();
			if(s.equals("true")) return true;
			if(s.equals("false")) return false;
			System.out.println("Input non valido deve essere o true o false");
		}while(true);
	}

	public static float readFloat (Scanner sc, String input) {
		do {
			System.out.println(input + ": ");
			String s=sc.nextLine().trim();
			try {
				return Float.parseFloat(s);
			} catch (NumberFormatException e) {
				System.out.println("Input non valido");
			}


		}while(true);
	}
	
	public static String readString (Scanner sc, String input) {
		System.out.println(input +": ");
		return sc.nextLine().trim();
	}
}
