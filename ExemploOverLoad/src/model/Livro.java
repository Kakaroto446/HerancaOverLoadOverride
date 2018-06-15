package model;

public class Livro extends Produto {
    private String autor, editora, edicao;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    //Metodos
    public void calcularPrecoVenda(boolean didatico){

    }
    /*
    public double inserirDadosLivro(){
        return ;
    }
    */
    public void apresentarLivro(){

    }

}
