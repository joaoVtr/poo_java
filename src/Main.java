import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        fcachorro();

    }

    public static void  fcachorro(){
//        Cachorro cachorro1 = new Cachorro();

        Cachorro cachorro1 = new Cachorro(
                "testeDog1","Azul", 1, 2, 2, "teste" );
        Cachorro cachorro2 = new Cachorro();

        Cachorro cachorro3 = new Cachorro(
                "testeDog1","Azul", 1, 2, 2, "teste" );
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro2.getNome());
        /*
        // Atributos privatizados
        cachorro1.nome = "TesteDog";
        cachorro1.cor = "Marrom";
        cachorro1.altura= 1;
        cachorro1.peso = 5.5;
        cachorro1.tamandoRabo = 1;*/

        cachorro1.setNome("testeDog");
        cachorro1.setCor("Azul");
        cachorro1.setAltura(1);
        cachorro1.setPeso(1);

        System.out.println(cachorro1.pegar());

        System.out.println(cachorro1.interagir("vai dormir"));
        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.interagir("aaaa"));
        System.out.println(" -- ");
        System.out.println(cachorro1.getNome());
        System.out.println(" -- ");
        System.out.println(cachorro1.getNumeroCachorros());
        System.out.println(cachorro2.getNumeroCachorros());

    }
}