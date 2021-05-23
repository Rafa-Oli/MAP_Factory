package criador;

import ProdutosConcretos.Ovo;
import ProdutosConcretos.Tomate;
import produtos.Pao;
import produtos.Presunto;
import produtos.Queijo;

public interface Criador {
    public Queijo createQueijo(String tipo);
    public Presunto createPresunto(String tipo);
    public Pao createPao(String tipo);
    public Tomate createTomate();
    public Ovo createOvo();
}
