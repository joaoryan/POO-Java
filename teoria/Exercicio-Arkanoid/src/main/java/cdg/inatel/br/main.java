package cdg.inatel.br;

import cdg.inatel.br.bloco.Bloco;
import cdg.inatel.br.conversor.Conversor;
import cdg.inatel.br.jogador.Jogador;

public class main {

    public static void main(String[] args) {
        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        Bloco bloco5 = new Bloco();

        Jogador jogador1 = new Jogador();
        jogador1.destruirBloco(bloco1);
        jogador1.destruirBloco(bloco4);

        System.out.println("O número de blocos é: "+ Bloco.numBloco);
        Conversor.converter(jogador1.getPonto());


    }
}
