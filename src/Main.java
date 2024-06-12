import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        fcachorro(); 

    }

    public static void  fcachorro(){
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "TesteDog";
        cachorro1.cor = "Marrom";
        cachorro1.altura= 1;
        cachorro1.peso = 5.5;
        cachorro1.tamandoRabo = 1;

        System.out.println(cachorro1.pegar());

        System.out.printf(cachorro1.interagir("vai dormir"));
        System.out.printf(cachorro1.interagir("carinho"));
    }
}