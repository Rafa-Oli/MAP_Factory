package ProdutosConcretos.paes;


import produtos.Pao;

public class Integral implements Pao {
    String nome;
    public Integral(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
