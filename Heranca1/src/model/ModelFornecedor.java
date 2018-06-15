package model;

public class ModelFornecedor extends ModelPessoa{
	private String cnpj, ie, contato;
	
	//Getters e Setters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	//Metodos
	public void inserirDadosFornecedor() {
		System.out.println("Dados do fornecedor inseridos");
	}
	
	public void apresentarFornecedor() {
		System.out.println("CNPJ: "+cnpj);
		System.out.println("IE: "+ie);
		System.out.println("Contato: "+contato);
	}
}
