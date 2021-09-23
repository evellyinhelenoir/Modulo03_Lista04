package br.com.zup.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreio = new Guerreiros("Guerreiro", 200, 30);
        Voadores voador = new Voadores("Voador", 800, 30);

        double danoInimigo = voador.aplicarDano();
        double danoHeroi = guerreio.aplicarDano();

        System.out.println("Vida do "+guerreio.getNome()+" = "+guerreio.exibirVida());
        guerreio.receberDano(danoInimigo);
        guerreio.receberDano(danoInimigo);
        System.out.println("Vida do "+guerreio.getNome()+" = "+guerreio.exibirVida());
        System.out.println("Vida do "+voador.getNome()+" = "+voador.exibirVida());
        voador.receberDano(danoHeroi);
        System.out.println("Vida do "+voador.getNome()+" = "+voador.exibirVida());
    }
}
