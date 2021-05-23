package CriadorConcreto;

import ProdutosConcretos.Ovo;
import ProdutosConcretos.Tomate;
import ProdutosConcretos.paes.Bola;
import ProdutosConcretos.paes.Frances;
import ProdutosConcretos.paes.Integral;
import ProdutosConcretos.presuntos.Frango;
import ProdutosConcretos.presuntos.Peru;
import ProdutosConcretos.queijos.Cheddar;
import ProdutosConcretos.queijos.Mussarela;
import ProdutosConcretos.queijos.Prato;
import criador.Criador;
import produtos.Pao;
import produtos.Presunto;
import produtos.Queijo;

public class Sanduiche implements Criador {
    String nome;
    Queijo queijo;
    Presunto presunto;
    Pao pao;
public Sanduiche(String nome){
    this.nome = nome;
}
    @Override
    public Queijo createQueijo(String tipo) {
        if(tipo.equals("c")){
            queijo = new Cheddar("cheddar");
        }else if(tipo.equals("m")){
            queijo = new Mussarela("mussarela");
        }else{
            queijo = new Prato("prato");
        };
        return queijo;
    }

    @Override
    public Presunto createPresunto(String tipo) {
        if(tipo.equals("f")){
            presunto = new Frango("frango");
        }else if(tipo.equals("p")){
            presunto = new Peru("peru");
        }
        return presunto;
    }

    @Override
    public Pao createPao(String tipo) {
        if(tipo.equals("b")){
            pao = new Bola("bola");
        }else if(tipo.equals("f")){
            pao = new Frances("frances");
        }else{
            pao = new Integral("integral");
        }
        return pao;
    }

    @Override
    public Tomate createTomate() {
        return new Tomate("tomate");
    }

    @Override
    public Ovo createOvo() {
        return new Ovo("ovo");
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "nome='" + nome + '\'' +
                ", queijo=" + queijo.getNome() +
                ", presunto=" + presunto.getNome() +
                ", pao=" + pao.getNome() +
                ", tomate e ovo"  +
                '}';
    }
}
