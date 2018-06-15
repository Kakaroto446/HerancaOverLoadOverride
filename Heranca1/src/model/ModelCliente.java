package model;

public class ModelCliente extends ModelPessoa{
	private double limiteCredito, rendaMensal;
	private String rg, cpf;
	
	//Getters e Setters	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Metodos
	public void inserirDadosCliente() {
		System.out.println("Dados do cliente inseridos");
	}
	public void apresentarCliente() {
		System.out.println("Limite de crédito: "+limiteCredito);
		System.out.println("Renda Mensal: "+rendaMensal);
		System.out.println("RG: "+rg);
		System.out.println("CPF"+cpf);
	}
}
