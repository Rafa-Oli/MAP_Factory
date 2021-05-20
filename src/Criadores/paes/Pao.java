package Criadores.paes;

public abstract class Pao {

    private String nome;

    public Pao(String nome){
        this.nome = nome;
    }

    public String getName(){
        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }
}
