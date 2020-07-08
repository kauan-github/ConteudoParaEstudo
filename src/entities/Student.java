package entities;

public class Student {
	
	public double nota1;
	public double nota2;
	public double nota3;
	public double somaNotas;
	
	public void verifica() {
		if(nota1 <= 30.00 && nota2 <= 35.00 && nota3 <= 35.00)
			somaNotas = nota1 + nota2 + nota3;
		else
			System.out.println("Notas invalidas");
	}
	
	public void pass() {
		double diferenca = (somaNotas - 60.00)*-1;
		
		System.out.println("Final grade = "+String.format("%.2f", somaNotas));
		System.out.println();
		
		if(somaNotas >= 60.00)
			System.out.println("PASS");
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",diferenca);
		}
	}
}
