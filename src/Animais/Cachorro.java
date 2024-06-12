package Animais;

public class Cachorro {
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamandoRabo;
    private String estadoEspirito;

    public Cachorro(){};
    //Contrutures entre os atributos e os métodos
    public Cachorro(String nome, String cor, int altura, int tamandoRabo, double peso, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tamandoRabo = tamandoRabo;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamandoRabo() {
        return tamandoRabo;
    }

    public void setTamandoRabo(int tamandoRabo) {
        this.tamandoRabo = tamandoRabo;
    }

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
       /*
        if(acao.equals("carinho")){
            this.estadoEspirito = "Feliz";
            return estadoEspirito;
        }if(acao.equals("vai dormir")){
            this.estadoEspirito = "bravo";
        }
        else{
            this.estadoEspirito = "neutro";
        }
        */

        switch (acao){
            case "carinho": this.estadoEspirito = "Feliz"; break;
            case "vai dormir": this.estadoEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoEspirito = "triste"; break;
            default: this.estadoEspirito = "Neutro";
        }
        return this.estadoEspirito;
    }

}
