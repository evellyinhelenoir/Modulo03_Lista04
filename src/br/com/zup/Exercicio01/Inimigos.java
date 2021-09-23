package br.com.zup.Exercicio01;

public class Inimigos {
    private String nome;
    private double vida;

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

    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;

    }
    public double exibirVida(){
        return this.vida;
    }
    public void trocarNome(String mudarNome) {
        this.nome = mudarNome;
    }

    public void receberDano(double dano) {
        this.vida = this.vida - dano;
    }
}