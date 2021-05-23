package CriadoresConcretos.queijos;

import Criadores.queijos.FactoryQueijo;
import Criadores.queijos.Queijo;
import ProdutosConcretos.queijos.Mussarela;

public class CriadorConcretoMussarela extends FactoryQueijo {
    @Override
    public Queijo createQueijo(String nome) {
        return new Mussarela(nome);
    }
}
