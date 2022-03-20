package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args){

        Asteroide asteroide1 = new Asteroide("cleiton", "Grande");
        Asteroide asteroide2 = new Asteroide("42", "Pequeno");

        Nave nave1 = new Nave("top", 100, "Explosivo");
        Nave nave2 = new Nave("ota", 200, "Normal");

        nave1.atirar(asteroide1);
        nave1.atirar(asteroide2);
        nave2.atirar(asteroide2);
        nave2.atirar(asteroide1);
    }
}
