package entities;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salary;

	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, Double salary) {
		this.id = id;
		this.nome = nome;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increase(double percent) {
		setSalary(getSalary() +((getSalary()/100) * percent)); 
	}

	@Override
	public String toString() {
		return
				+ getId()
				+ ", "
				+ getNome()
				+ ", "
				+ getSalary();
	}
	
	
	
	
}
