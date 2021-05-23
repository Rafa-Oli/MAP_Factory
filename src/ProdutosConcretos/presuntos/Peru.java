package ProdutosConcretos.presuntos;


import produtos.Presunto;

public class Peru implements Presunto {
    String nome;
    public Peru(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
