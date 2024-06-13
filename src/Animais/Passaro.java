package Animais;

public class Passaro extends Animal{
    static int numeroPassaros;


    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
    @Override
    public void soar(){
        System.out.println("piu pi u");
    }
}
