package aplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ProgramList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many emplyees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Funcionario obj = new Funcionario();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d: ",i+1);
			System.out.println();
			System.out.print("Id: ");
			obj.setId(sc.nextInt());
			sc.nextLine();
			
			System.out.print("Name: ");
			obj.setNome(sc.nextLine());
			
			System.out.print("Salary: ");
			obj.setSalary(sc.nextDouble());
			
			
			list.add(obj);
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will be have salary increase : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		
		double percentage;
		
		for (Funcionario funcionario : list) {
			if(funcionario.getId() == id) {
				System.out.print("Enter the percentage: ");
				percentage = sc.nextDouble();
				obj.increase(percentage);
			}else {
				System.out.println("This id does not exist!");
			}
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		//Fim
		for (Funcionario funcionario : list) {
			
			System.out.println(funcionario.toString());
		}
		
	}

}
