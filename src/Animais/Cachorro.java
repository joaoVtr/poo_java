package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamandoRabo;
    public String estadoEspirito;

    public void comer(){
        System.out.println("Comer");
    }

    public void latir(){
        System.out.println("Latir");

    }

    public String pegar(){
        return "Pegou a bolinha";
    }

    public String interagir(String acao){
        if(acao.equals("carinho")){
            this.estadoEspirito = "Feliz";
            return estadoEspirito;
        }if(acao.equals("vai dormir")){
            this.estadoEspirito = "bravo";
        }
        else{
            this.estadoEspirito = "neutro";
        }
        return estadoEspirito;
    }

}
