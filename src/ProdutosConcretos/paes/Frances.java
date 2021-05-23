package ProdutosConcretos.paes;


import produtos.Pao;

public class Frances implements Pao {
    String nome;
    public Frances(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
