package CriadoresConcretos.paes;


import Criadores.paes.FactoryPao;
import Criadores.paes.Pao;
import ProdutosConcretos.paes.Integral;

public class CriadorConcretoIntegral extends FactoryPao {
    @Override
    public Pao createPao(String nome) {
        return new Integral(nome);
    }
}
