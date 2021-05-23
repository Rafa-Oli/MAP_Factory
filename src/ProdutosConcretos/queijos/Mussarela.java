package ProdutosConcretos.queijos;


import produtos.Queijo;

public class Mussarela implements Queijo {
    String nome;
    public Mussarela(String nome){
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
