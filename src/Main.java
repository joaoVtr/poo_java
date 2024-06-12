import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "TesteDog";
        cachorro1.cor = "Marrom";
        cachorro1.altura= 1;
        cachorro1.peso = 5.5;
        cachorro1.tamandoRabo = 1;

        System.out.println(cachorro1.nome);
    }
}