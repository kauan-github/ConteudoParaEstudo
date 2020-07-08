package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Employee funcionario = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Employee: "+funcionario);
		
		System.out.println("\n");
		System.out.print("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		
		funcionario.increaseSalary(percent);
		
		System.out.println();
		System.out.print("Updated data: "+funcionario);
		

	}

}
