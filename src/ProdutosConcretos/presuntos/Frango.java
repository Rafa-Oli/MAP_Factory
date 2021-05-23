package ProdutosConcretos.presuntos;


import produtos.Presunto;

public class Frango implements Presunto {
    String nome;
    public Frango(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
