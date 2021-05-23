package ProdutosConcretos.queijos;


import produtos.Queijo;

public class Cheddar implements Queijo {
    String nome;
    public Cheddar(String nome){
        this.nome = nome;
    }
    @Override
    public String getNome() {
        return this.nome;
    }
}
