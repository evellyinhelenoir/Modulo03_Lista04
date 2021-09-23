package br.com.zup.Exercicio01;

public class Rasteiros extends Inimigos{
   private double danoEspinhos;
   private double aplicarDano;

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public double getAplicarDano() {
        return aplicarDano;
    }

    public void setAplicarDano(double aplicarDano) {
        this.aplicarDano = aplicarDano;
    }

    public Rasteiros(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }
    public double aplicarDano(){
        return danoEspinhos;
    }
}
