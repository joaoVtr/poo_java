//import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        animais();
        fcachorro();

    }

    public static void gato() {

        Gato gato1 = new Gato( "gato1", "preto", 2);
        //Animal é abstrata
        //        Animal gato2 = new Gato( "gato2", "preto", 2);
//        Animal animal = new Animal( "gato3", "preto", 2);

        //Nao pode
//        Gato gato3 = new Animal( "gato1", "preto", 2);

    }

    public static void animais(){
        System.out.println(" -- animais -- ");
        Gato gato1 = new Gato( "gato1", "preto", 2);
        Cachorro cachorro1 = new Cachorro( "dog", "preto", 2, 2, 2, "feliz");
        Passaro passaro = new Passaro( "passaro", "preto", 2);
        System.out.println(gato1.toString());
        System.out.println(cachorro1.toString());
        gato1.soar();
        cachorro1.soar();
        passaro.soar();

        System.out.println(" -- - petShop -- ");

        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro1);
        petshop.darBanho(gato1);
        System.out.println(cachorro1.getEstadoEspirito());
        System.out.println(gato1.getEstadoEspirito());
        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());

        System.out.println(" -- - /petShop -- ");

        System.out.println(" -- /animais -- ");
    }

    public static void  fcachorro(){
        System.out.println(" -- fcachorro -- ");
//        Cachorro cachorro1 = new Cachorro();

        Cachorro cachorro1 = new Cachorro(
                "testeDog1","Azul", 1, 2, 2, "teste" );
        Cachorro cachorro2 = new Cachorro( "c", "preto", 2);;

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
        System.out.println(" -- /fcachorro -- ");
    }
}