package model;

public class Gerente extends Funcionario {
    private double gratificacao;

    public double getGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    //Metodos
    public void apresentarFuncionario(){
    	System.out.println();
    }
    @Override
    public void calcularSalarioFinal(double valorVendido){
    	
    }
}
