package br.com.zup.Exercicio01;

public class Magos extends Heroi {
    private String magia;
    double poderMagico = 400;
    double aplicarMagia;

    public Magos(String nome, double vida, String magia) {
        super(nome, vida);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public double poderMagico() {
            return poderMagico;
    }
    public double aplicarMagia(){
        return aplicarMagia;
    }

}
