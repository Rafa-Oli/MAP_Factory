package ProdutosConcretos.queijos;


import produtos.Queijo;

public class Prato implements Queijo {
    String nome;
    public Prato(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
