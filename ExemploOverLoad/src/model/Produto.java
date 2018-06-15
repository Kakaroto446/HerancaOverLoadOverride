package model;

public class Produto {
    //diagrama de classe
    private int codigo, estoqueDisponivel;
    private String descricao, genero;
    private double precoCusto, precoVenda;

    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }
    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    //metodos
    public void calcularPrecoVenda(){

    }
    public void calcularPrecoVenda(double cotacaoDolar){

    }
    public void calcularPrecoVenda(String genero){

    }
}
