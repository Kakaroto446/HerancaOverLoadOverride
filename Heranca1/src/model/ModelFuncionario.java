package model;

public class ModelFuncionario extends ModelPessoa{
	private double salarioBase, salarioFinal;
	
	//Getters e Setters
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getSalarioFinal() {
		return salarioFinal;
	}
	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	//Metodos
	public void inserirDadosFuncionario(){
		System.out.println("Dados inseridos");
	}
	
	public void apresentarFuncionario() {
		System.out.println("Salario base: "+salarioBase);
		System.out.println("Salario final: "+salarioFinal);
	}
}
