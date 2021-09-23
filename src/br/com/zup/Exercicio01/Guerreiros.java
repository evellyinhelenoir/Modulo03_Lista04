package br.com.zup.Exercicio01;

public class Guerreiros extends Heroi{
    private double poderAtaque;
    private double aplicaDano;

    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double getAplicaDano() {
        return aplicaDano;
    }

    public void setAplicaDano(double aplicaDano) {
        this.aplicaDano = aplicaDano;
    }
    public double aplicarDano(){
        return poderAtaque;
    }
}
