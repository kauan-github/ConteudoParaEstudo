package Aula1;

import java.util.Locale;

public class SplitString {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String s = "potato apple lemon";
		//separa por espaço
		String[] vect = s.split(" ");
		/*
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		*/
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
