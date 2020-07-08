package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Escola {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		String nome;
		
		System.out.println("Nome: ");
		nome = sc.nextLine();
		
		
		System.out.printf("Informe nota 1: ");
		student.nota1 = sc.nextDouble();
		
		System.out.printf("Informe nota 2: ");
		student.nota2 = sc.nextDouble();
		
		System.out.printf("Informe nota 3: ");
		student.nota3 = sc.nextDouble();
		
		
		student.verifica();
			
		
		student.pass();
	}

}
