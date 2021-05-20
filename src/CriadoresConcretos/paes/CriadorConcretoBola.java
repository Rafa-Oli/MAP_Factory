package CriadoresConcretos.paes;

import Criadores.paes.FactoryPao;
import Criadores.paes.Pao;
import ProdutosConcretos.paes.Bola;

public class CriadorConcretoBola extends FactoryPao {
    @Override
    public Pao createPao(String nome) {
        return new Bola(nome);
    }
}
