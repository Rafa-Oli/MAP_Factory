package CriadoresConcretos.paes;

import Criadores.paes.FactoryPao;
import Criadores.paes.Pao;
import ProdutosConcretos.paes.Frances;

public class CriadorConcretoFrances extends FactoryPao {
    @Override
    public Pao createPao(String nome) {
        return new Frances(nome);
    }
}
