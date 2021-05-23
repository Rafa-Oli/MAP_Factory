package CriadoresConcretos.queijos;

import Criadores.queijos.FactoryQueijo;
import Criadores.queijos.Queijo;
import ProdutosConcretos.queijos.Prato;

public class CriadorConcretoPrato extends FactoryQueijo {
    @Override
    public Queijo createQueijo(String nome) {
        return new Prato(nome);
    }
}
