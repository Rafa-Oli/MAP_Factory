package CriadoresConcretos.presuntos;

import Criadores.presuntos.FactoryPresunto;
import Criadores.presuntos.Presunto;
import ProdutosConcretos.presuntos.Peru;

public class CriadorConcretoPeru extends FactoryPresunto {
    @Override
    public Presunto createPresunto(String nome) {
        return new Peru(nome);
    }
}
