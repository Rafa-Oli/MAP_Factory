package ProdutosConcretos.paes;


import produtos.Pao;

public class Bola implements Pao {
    String nome;
    public Bola(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
