package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollar will be bought? ");
		double quantityMoney = sc.nextDouble();
		
		double valor = CurrencyConverter.convert(priceDollar, quantityMoney);
		
		System.out.printf("Amount to be paid in reais = %.2f",valor);
	}

}
