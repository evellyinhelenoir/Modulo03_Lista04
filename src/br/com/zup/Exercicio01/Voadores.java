package br.com.zup.Exercicio01;

public class Voadores extends Inimigos{

    private double danoTiro;
    private double aplicarDano;

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public double getAplicarDano() {
        return aplicarDano;
    }

    public void setAplicarDano(double aplicarDano) {
        this.aplicarDano = aplicarDano;
    }

    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }
    public double aplicarDano(){
        return danoTiro;
    }

}
