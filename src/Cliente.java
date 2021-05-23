import CriadorConcreto.Sanduiche;

public class Cliente {
    public static void main(String[] args) {
        //sanduiche 1
        Sanduiche sanduicheBola = new Sanduiche("Sanduiche bola");
        sanduicheBola.createOvo();
        sanduicheBola.createTomate();
        sanduicheBola.createPao("b");
        sanduicheBola.createQueijo("p");
        sanduicheBola.createPresunto("p");
        System.out.println(sanduicheBola.toString());

        //sanduiche 2
        Sanduiche sanduicheSaudavel = new Sanduiche("Sanduiche saudável");
        sanduicheSaudavel.createOvo();
        sanduicheSaudavel.createTomate();
        sanduicheSaudavel.createPao("i");
        sanduicheSaudavel.createQueijo("m");
        sanduicheSaudavel.createPresunto("p");
        System.out.println(sanduicheSaudavel.toString());

        //sanduiche 3
        Sanduiche sanduicheTradicional = new Sanduiche("Sanduiche tradicional");
        sanduicheTradicional.createOvo();
        sanduicheTradicional.createTomate();
        sanduicheTradicional.createPao("f");
        sanduicheTradicional.createQueijo("m");
        sanduicheTradicional.createPresunto("f");
        System.out.println(sanduicheTradicional.toString());

    }
}
