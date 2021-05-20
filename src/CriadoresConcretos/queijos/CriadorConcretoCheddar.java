package CriadoresConcretos.queijos;

import Criadores.paes.FactoryPao;
import Criadores.queijos.FactoryQueijo;
import Criadores.queijos.Queijo;
import ProdutosConcretos.queijos.Cheddar;

public class CriadorConcretoCheddar extends FactoryQueijo {
    @Override
    public Queijo createQueijo() {
        return new Cheddar();
    }
}
