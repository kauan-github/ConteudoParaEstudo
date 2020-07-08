package arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be created? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Aluguel[] quartos = new Aluguel[n];
		
		System.out.println();
		
		for (int i = 0; i < quartos.length; i++) {
			System.out.printf("Rent #%d: ",i+1);
			
			System.out.println();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			quartos[i] = new Aluguel(name, email, room);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < quartos.length; i++) {
			
			if(quartos[i].getRoom() != 0) {
				System.out.println(i+1+": "+quartos[i].getName()+", "+quartos[i].getEmail());
				System.out.println();
			}
		}
		
		
		sc.close();
	}

}
