package br.com.zup.Exercicio01;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void trocarNome(String mudar){
        this.nome = mudar;
    }
    public void receberDano (double danoRecebido){
        this.vida = this.vida - danoRecebido;
    }
    public double exibirVida(){
        return this.vida;
    }
}
