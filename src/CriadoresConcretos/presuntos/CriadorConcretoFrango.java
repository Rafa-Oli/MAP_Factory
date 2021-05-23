package CriadoresConcretos.presuntos;

import Criadores.presuntos.FactoryPresunto;
import Criadores.presuntos.Presunto;
import ProdutosConcretos.presuntos.Frango;

public class CriadorConcretoFrango extends FactoryPresunto {
    @Override
    public Presunto createPresunto(String nome) {
        return new Frango(nome);
    }
}
